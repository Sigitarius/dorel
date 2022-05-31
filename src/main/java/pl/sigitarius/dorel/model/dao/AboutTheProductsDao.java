package pl.sigitarius.dorel.model.dao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.db.AboutTheProducts;
import pl.sigitarius.dorel.model.db.Pim;
import pl.sigitarius.dorel.model.pim.Item;
import pl.sigitarius.dorel.utils.MsSqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class AboutTheProductsDao {

    private static final String SELECT_FROM_ABOUT_THE_PRODUCTS = "SELECT * FROM About_the_products";
    private static final String INSERT_INTO_ABOUT_THE_PRODUCTS = "INSERT INTO About_the_products VALUES(?, ?, ?)";
    private static final String DELETE_ABOUT_THE_PRODUCTS = "DELETE About_the_products WHERE article_number = ?";

    private final MsSqlConnection connection;

    public List<AboutTheProducts> getAboutTheProductsItems() {

        List<Pim> pimItems = new PimDao(connection).getPimItems();

        List<AboutTheProducts> items = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(connection.getURL())) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SELECT_FROM_ABOUT_THE_PRODUCTS);
            while (rs.next()) {
                long articleNumber = rs.getLong("article_number");
                items.add(new AboutTheProducts(
                        articleNumber,
                        getEanFromPim(pimItems, articleNumber),
                        rs.getString("intro_text_consumer"),
                        rs.getString("long_description_2nd_part")
                ));
            }
        } catch (SQLException e) {
            log.error("Failed to retrieve AboutTheProducts items from the database", e);
            throw new RuntimeException(e);
        }
        return items;
    }

    public void insertAboutTheProducts(Item item) {
        try (Connection con = DriverManager.getConnection(connection.getURL())) {
            PreparedStatement pstmt = con.prepareStatement(INSERT_INTO_ABOUT_THE_PRODUCTS);

            pstmt.setLong(1, item.getArticleNumber());
            pstmt.setString(2, item.getIntroTextConsumer());
            pstmt.setString(3, item.getLongDescription2NdPart());
            log.info("Adding About the products for " + item.getArticleNumber());

			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			log.error("Failed to save AboutTheProducts to DB", e);
			throw new RuntimeException(e);
		}
	}


	public void deleteByArticleNumber(long articleNumber) {
        try (Connection con = DriverManager.getConnection(connection.getURL())) {
            PreparedStatement pstmt = con.prepareStatement(DELETE_ABOUT_THE_PRODUCTS);
            pstmt.setLong(1, articleNumber);
            int deleted = pstmt.executeUpdate();
            if (deleted > 0) {
                log.info("Remove AboutTheProducts - article_number " + articleNumber);
            }
            pstmt.close();
        } catch (SQLException e) {
            log.error("Failed to delete AboutTheProducts from DB", e);
            throw new RuntimeException(e);
        }
    }

    private String getEanFromPim(List<Pim> pimItems, Long articleNumber) {
        Pim pim = pimItems.stream().filter(e -> articleNumber.equals(e.getArticleNumber())).findAny().orElseThrow();
        return pim.getEan13BarcodeText();
    }

}
