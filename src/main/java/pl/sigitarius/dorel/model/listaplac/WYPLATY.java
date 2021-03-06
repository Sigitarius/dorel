
package pl.sigitarius.dorel.model.listaplac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wyplata"
})
@XmlRootElement(name = "WYPLATY", namespace = "http://www.comarch.pl/cdn/optima/offline")
public class WYPLATY {

    @XmlElement(name = "WYPLATA", namespace = "http://www.comarch.pl/cdn/optima/offline")
    protected List<WYPLATA> wyplata;

    /**
     * Gets the value of the wyplata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wyplata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWYPLATA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WYPLATA }
     * 
     * 
     */
    public List<WYPLATA> getWYPLATA() {
        if (wyplata == null) {
            wyplata = new ArrayList<WYPLATA>();
        }
        return this.wyplata;
    }

}
