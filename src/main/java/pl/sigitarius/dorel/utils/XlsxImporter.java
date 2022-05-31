package pl.sigitarius.dorel.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pl.sigitarius.dorel.model.db.MainCollectionImageWebsite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class XlsxImporter {

    public static Logger log = LogManager.getLogger();

    public static Set<String> parseEan(File file) {

        XSSFSheet sheet = getFirstSheet(file);
        Set<String> spis = new HashSet<>();
        for (Row row : sheet) {
            try {
                spis.add(getStringCellValue(row, 0));
            } catch (Exception ex) {
                String message = "Wystąpił błąd podczas przetwarzania rekordu " + (row.getRowNum() + 1);
                log.error(message, ex);
                throw new RuntimeException(message, ex);
            }
        }
        return spis;
    }

    public static List<MainCollectionImageWebsite> parseMainCollectionImage(File file) {

        XSSFSheet sheet = getFirstSheet(file);
        List<MainCollectionImageWebsite> mainCollectionImageWebsites = new ArrayList<>();
        for (Row row : sheet) {
            try {
                if (row.getRowNum() == 0) {
                    continue;
                }

                mainCollectionImageWebsites.add(new MainCollectionImageWebsite(Long.parseLong(getStringCellValue(row, 1)), getStringCellValue(row, 0)));
            } catch (Exception ex) {
                String message = "Wystąpił błąd podczas przetwarzania rekordu " + (row.getRowNum() + 1);
                log.error(message, ex);
                throw new RuntimeException(message, ex);
            }
        }
        return mainCollectionImageWebsites;
    }


    public static XSSFSheet getFirstSheet(File file) {
        XSSFWorkbook workbook = null;
        XSSFSheet sheet;
        try (InputStream is = new FileInputStream(file)) {
            workbook = new XSSFWorkbook(is);
            sheet = workbook.getSheetAt(0);
        } catch (FileNotFoundException e) {
            log.error("Nie odnaleziono pliku " + file.getAbsolutePath(), e);
            throw new RuntimeException();
        } catch (IOException e) {
            log.error("Nie można odczytać pliku " + file.getAbsolutePath(), e);
            throw new RuntimeException();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return sheet;
    }

    public static XSSFWorkbook getWorkbookFromFile(File file) {
        XSSFWorkbook workbook;
        try (InputStream is = new FileInputStream(file)) {
            workbook = new XSSFWorkbook(is);
        } catch (FileNotFoundException e) {
            log.error("Nie odnaleziono pliku " + file.getAbsolutePath(), e);
            throw new RuntimeException();
        } catch (IOException e) {
            log.error("Nie można odczytać pliku " + file.getAbsolutePath(), e);
            throw new RuntimeException();
        }
        return workbook;
    }

    private static String getStringCellValue(Row row, int nrCol) {
        Cell cell = row.getCell(nrCol);
        String cellValue = "";
        if (cell == null) {
            return cellValue;
        }
        switch (cell.getCellType()) {
            case BOOLEAN:
                cellValue = "" + cell.getBooleanCellValue();
                break;
            case NUMERIC:
                double d = cell.getNumericCellValue();
                if (d == (long) d)
                    cellValue = String.format("%d", (long) d);
                else
                    cellValue = String.format("%s", d);
                break;
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            default:
                break;
        }
        return cellValue;
    }
}
