
package pl.sigitarius.dorel.model.listaplac;

import pl.sigitarius.dorel.xml.CDATAAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_PRACOWNIK_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_PRACOWNIK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_WYDZIAL_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_WYDZIAL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_PROJEKT"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_PROCENT"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_BRUTTO"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_ZUSF"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_ZUSP"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_ZDROW"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_ZAL_FIS"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_PPKP"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPIS_PLAC_PPKF"/>
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
    "opisplacpracownikid",
    "opisplacpracownik",
    "opisplacwydzialid",
    "opisplacwydzial",
    "opisplacprojekt",
    "opisplacprocent",
    "opisplacbrutto",
    "opisplaczusf",
    "opisplaczusp",
    "opisplaczdrow",
    "opisplaczalfis",
    "opisplacppkp",
    "opisplacppkf"
})
@XmlRootElement(name = "OPIS", namespace = "http://www.comarch.pl/cdn/optima/offline")
public class OPIS {

    @XmlElement(name = "OPIS_PLAC_PRACOWNIK_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String opisplacpracownikid;
    @XmlElement(name = "OPIS_PLAC_PRACOWNIK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String opisplacpracownik;
    @XmlElement(name = "OPIS_PLAC_WYDZIAL_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String opisplacwydzialid;
    @XmlElement(name = "OPIS_PLAC_WYDZIAL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String opisplacwydzial;
    @XmlElement(name = "OPIS_PLAC_PROJEKT", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String opisplacprojekt;
    @XmlElement(name = "OPIS_PLAC_PROCENT", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String opisplacprocent;
    @XmlElement(name = "OPIS_PLAC_BRUTTO", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String opisplacbrutto;
    @XmlElement(name = "OPIS_PLAC_ZUSF", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String opisplaczusf;
    @XmlElement(name = "OPIS_PLAC_ZUSP", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String opisplaczusp;
    @XmlElement(name = "OPIS_PLAC_ZDROW", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String opisplaczdrow;
    @XmlElement(name = "OPIS_PLAC_ZAL_FIS", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String opisplaczalfis;
    @XmlElement(name = "OPIS_PLAC_PPKP", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String opisplacppkp;
    @XmlElement(name = "OPIS_PLAC_PPKF", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String opisplacppkf;

    /**
     * Gets the value of the opisplacpracownikid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACPRACOWNIKID() {
        return opisplacpracownikid;
    }

    /**
     * Sets the value of the opisplacpracownikid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACPRACOWNIKID(String value) {
        this.opisplacpracownikid = value;
    }

    /**
     * Gets the value of the opisplacpracownik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACPRACOWNIK() {
        return opisplacpracownik;
    }

    /**
     * Sets the value of the opisplacpracownik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACPRACOWNIK(String value) {
        this.opisplacpracownik = value;
    }

    /**
     * Gets the value of the opisplacwydzialid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACWYDZIALID() {
        return opisplacwydzialid;
    }

    /**
     * Sets the value of the opisplacwydzialid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACWYDZIALID(String value) {
        this.opisplacwydzialid = value;
    }

    /**
     * Gets the value of the opisplacwydzial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACWYDZIAL() {
        return opisplacwydzial;
    }

    /**
     * Sets the value of the opisplacwydzial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACWYDZIAL(String value) {
        this.opisplacwydzial = value;
    }

    /**
     * Gets the value of the opisplacprojekt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACPROJEKT() {
        return opisplacprojekt;
    }

    /**
     * Sets the value of the opisplacprojekt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACPROJEKT(String value) {
        this.opisplacprojekt = value;
    }

    /**
     * Gets the value of the opisplacprocent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACPROCENT() {
        return opisplacprocent;
    }

    /**
     * Sets the value of the opisplacprocent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACPROCENT(String value) {
        this.opisplacprocent = value;
    }

    /**
     * Gets the value of the opisplacbrutto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACBRUTTO() {
        return opisplacbrutto;
    }

    /**
     * Sets the value of the opisplacbrutto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACBRUTTO(String value) {
        this.opisplacbrutto = value;
    }

    /**
     * Gets the value of the opisplaczusf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACZUSF() {
        return opisplaczusf;
    }

    /**
     * Sets the value of the opisplaczusf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACZUSF(String value) {
        this.opisplaczusf = value;
    }

    /**
     * Gets the value of the opisplaczusp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACZUSP() {
        return opisplaczusp;
    }

    /**
     * Sets the value of the opisplaczusp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACZUSP(String value) {
        this.opisplaczusp = value;
    }

    /**
     * Gets the value of the opisplaczdrow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACZDROW() {
        return opisplaczdrow;
    }

    /**
     * Sets the value of the opisplaczdrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACZDROW(String value) {
        this.opisplaczdrow = value;
    }

    /**
     * Gets the value of the opisplaczalfis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACZALFIS() {
        return opisplaczalfis;
    }

    /**
     * Sets the value of the opisplaczalfis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACZALFIS(String value) {
        this.opisplaczalfis = value;
    }

    /**
     * Gets the value of the opisplacppkp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACPPKP() {
        return opisplacppkp;
    }

    /**
     * Sets the value of the opisplacppkp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACPPKP(String value) {
        this.opisplacppkp = value;
    }

    /**
     * Gets the value of the opisplacppkf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPISPLACPPKF() {
        return opisplacppkf;
    }

    /**
     * Sets the value of the opisplacppkf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPISPLACPPKF(String value) {
        this.opisplacppkf = value;
    }

}
