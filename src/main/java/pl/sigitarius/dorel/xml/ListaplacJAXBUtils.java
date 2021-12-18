package pl.sigitarius.dorel.xml;

import com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler;
import lombok.extern.slf4j.Slf4j;
import pl.sigitarius.dorel.model.listaplac.ObjectFactory;
import pl.sigitarius.dorel.model.listaplac.ROOT;

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
public class ListaplacJAXBUtils {


	public static ROOT getRootFromFile(File file) throws RuntimeException {
		ROOT root;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ROOT.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			root = (ROOT) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			log.error("Błąd podczas parsowania pliku XML na obiekty", e);
			throw new RuntimeException(e);
		}
		return root;
	}

	public static void saveRootToFile(ROOT jaxbElement, File file) throws RuntimeException {
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
