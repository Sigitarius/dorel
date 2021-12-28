package pl.sigitarius.dorel.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

    public static final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    public LocalDateTime unmarshal(String v) throws Exception {
        return LocalDateTime.parse(v, DateTimeFormatter.ofPattern(PATTERN));
    }

    public String marshal(LocalDateTime v) throws Exception {
        return v.format(DateTimeFormatter.ofPattern(PATTERN));
    }
}
