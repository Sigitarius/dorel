package pl.sigitarius.dorel.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XmlDateAdapter extends XmlAdapter<String, Date> {

	@Override
	public String marshal(Date date) throws Exception {
		String data =  new SimpleDateFormat("yyyy-MM-dd").format(date);
		return "<![CDATA[" + data + "]]>";
	}

	@Override
	public Date unmarshal(String xmlDate) throws Exception {
		if (xmlDate == null) {
			return null;
		} else {
			
			return new SimpleDateFormat("yyyy-MM-dd").parse(xmlDate);
		}
	}
}