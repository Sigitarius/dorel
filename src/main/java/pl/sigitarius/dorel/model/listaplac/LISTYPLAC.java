
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
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WERSJA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}BAZA_ZRD_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}BAZA_DOC_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}LISTA_PLAC" maxOccurs="unbounded" minOccurs="0"/>
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
    "wersja",
    "bazazrdid",
    "bazadocid",
    "listaplac"
})
@XmlRootElement(name = "LISTY_PLAC", namespace = "http://www.comarch.pl/cdn/optima/offline")
public class LISTYPLAC {

    @XmlElement(name = "WERSJA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wersja;
    @XmlElement(name = "BAZA_ZRD_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String bazazrdid;
    @XmlElement(name = "BAZA_DOC_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String bazadocid;
    @XmlElement(name = "LISTA_PLAC", namespace = "http://www.comarch.pl/cdn/optima/offline")
    protected List<LISTAPLAC> listaplac;

    /**
     * Gets the value of the wersja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERSJA() {
        return wersja;
    }

    /**
     * Sets the value of the wersja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERSJA(String value) {
        this.wersja = value;
    }

    /**
     * Gets the value of the bazazrdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAZAZRDID() {
        return bazazrdid;
    }

    /**
     * Sets the value of the bazazrdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAZAZRDID(String value) {
        this.bazazrdid = value;
    }

    /**
     * Gets the value of the bazadocid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAZADOCID() {
        return bazadocid;
    }

    /**
     * Sets the value of the bazadocid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAZADOCID(String value) {
        this.bazadocid = value;
    }

    /**
     * Gets the value of the listaplac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaplac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLISTAPLAC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISTAPLAC }
     * 
     * 
     */
    public List<LISTAPLAC> getLISTAPLAC() {
        if (listaplac == null) {
            listaplac = new ArrayList<LISTAPLAC>();
        }
        return this.listaplac;
    }

}
