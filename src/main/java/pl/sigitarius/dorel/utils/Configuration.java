package pl.sigitarius.dorel.utils;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.EncryptableProperties;
import org.jasypt.properties.PropertyValueEncryptionUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

@Slf4j
public class Configuration {

	private Properties props;

	private final StandardPBEStringEncryptor encryptor;

	private static final String CONFIG_PATH = System.getProperty("user.dir") + "\\" + "config.properties";


	public Configuration() {
		encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("Sigitarius");
		props = new EncryptableProperties(encryptor);
	}

	public String get(String key) {
		load();
		String value = props.getProperty(key);
		if (value == null) {
			log.error("Nie znaleziono właściwości " + key + " w pliku");
		}
		return value;
	}

	public void save(String key, String value) {
		props = new Properties();
		load();
		try (OutputStream output = new FileOutputStream("\\" + CONFIG_PATH)) {
			props.setProperty(key, value);
			props.store(output, null);
		} catch (IOException io) {
			log.error("Błąd odczytu pliku właściwości", io);
			throw new RuntimeException();
		}
	}

	public void savePassword(String key, String value) {
		props = new Properties();
		load();
		try (OutputStream output = new FileOutputStream("\\" + CONFIG_PATH)) {
			props.setProperty(key, PropertyValueEncryptionUtils.encrypt(value, encryptor));
			props.store(output, null);
		} catch (IOException io) {
			log.error("Błąd odczytu pliku właściwości", io);
			throw new RuntimeException();
		}
	}

	private Properties load() {
		try (FileInputStream is = new FileInputStream(CONFIG_PATH)) {
			props.load(is);
		} catch (IOException e) {
			log.error("Nie można odczytać pliku " + CONFIG_PATH, e);
			throw new RuntimeException();
		}
		return props;
	}

}
