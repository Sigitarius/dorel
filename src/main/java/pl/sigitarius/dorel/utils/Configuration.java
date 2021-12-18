package pl.sigitarius.dorel.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.EncryptableProperties;
import org.jasypt.properties.PropertyValueEncryptionUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Configuration {

	private Properties props;
	
	private StandardPBEStringEncryptor encryptor;

	private static final String CONFIG_PATH = System.getProperty("user.dir") + "\\" + "config.properties";

	private static final Logger logger = LogManager.getLogger();

	public Configuration() {
		encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("Optima");
		props = new EncryptableProperties(encryptor);
	}

	public Properties load() {
		try (FileInputStream is = new FileInputStream(CONFIG_PATH)) {
			props.load(is);
		} catch (IOException e) {
			logger.error("Nie można odczytać pliku " + CONFIG_PATH, e);
			throw new RuntimeException();
		}
		return props;
	}

	public String get(String key) {
		if (props.size() == 0) {
			load();
		}
		try (FileInputStream inStream = new FileInputStream(CONFIG_PATH)) {

			props.load(inStream);

		} catch (IOException e) {
			logger.error("Nie można odczytać pliku " + CONFIG_PATH, e);
			throw new RuntimeException();
		}
		String value = props.getProperty(key);
		if (value == null) {
			logger.error("Nie znaleziono właściwości " + key + " w pliku");
		}
		return value;
	}

	public void save(String key, String value) {
		load();
		try (OutputStream output = new FileOutputStream("\\" + CONFIG_PATH)) {
			props.setProperty(key, value);
			props.store(output, null);
		} catch (IOException io) {
			logger.error("Błąd odczytu pliku właściwości", io);
			throw new RuntimeException();
		}
	}

	
	public void encryptPasswords(){
		props = new Properties();
		load();

		try (OutputStream output = new FileOutputStream("\\" + CONFIG_PATH)) {
		    Enumeration<?> e = props.propertyNames();
		    while (e.hasMoreElements()) {
		      String key = (String) e.nextElement();
		      if(key.contains("password")){
		    	  props.setProperty(key, PropertyValueEncryptionUtils.encrypt(props.getProperty(key), encryptor));
		      }
		    }
		    props.store(output, null);
		} catch (IOException io) {
			logger.error("Błąd odczytu pliku właściwości", io);
			throw new RuntimeException();
		}
		
	}

}
