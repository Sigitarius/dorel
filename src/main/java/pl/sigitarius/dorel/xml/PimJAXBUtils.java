package pl.sigitarius.dorel.xml;

import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.pim.Data;
import pl.sigitarius.dorel.model.pim.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

@Slf4j
public class PimJAXBUtils {


	public static Data getDataFromFile(File file) throws RuntimeException {
		Data data;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			data = (Data) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			log.error("Błąd podczas parsowania pliku XML na obiekty", e);
			throw new RuntimeException(e);
		}
		return data;
	}

	public static void saveDataToFile(Data jaxbElement, File file) throws RuntimeException {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"))){
			
			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(CharacterEscapeHandler.class.getName(), (CharacterEscapeHandler) (ch, start, length, isAttVal, writer1) -> writer1.write(ch, start, length));
			jaxbMarshaller.marshal(jaxbElement, writer);
		} catch (UnsupportedEncodingException ue) {
			log.error("Błąd podczas parsowania pliku XML na obiekty", ue);
			throw new RuntimeException(ue);
		} catch (FileNotFoundException fe) {
			log.error("Błąd podczas parsowania pliku XML na obiekty", fe);
			throw new RuntimeException(fe);
		} catch (JAXBException je) {
			log.error("Błąd podczas parsowania pliku XML na obiekty", je);
			throw new RuntimeException(je);
		} catch (IOException e) {
			log.error("Błąd podczas parsowania pliku XML na obiekty", e);
			throw new RuntimeException(e);
		}
	}

}
