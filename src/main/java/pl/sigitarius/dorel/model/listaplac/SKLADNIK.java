
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
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_PRACOWNIK_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_PRACOWNIK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_WYDZIAL_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_WYDZIAL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_TYP_WYPLATY_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_TYP_WYPLATY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_NAZWA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_PODSTAWA" minOccurs="0"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_WARTOSC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_WARTOSC_WAL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_WARTOSC1"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_WARTOSC2"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_DATA_OD"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_DATA_DO"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_DATA_DANYCH"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_OKRES_DNI"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_OKRES_CZAS"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_GODZINY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_EKWIWALENT_ILOSC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_PROCENT"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_SPLACONO"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_SPLACONO_ALL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIK_ARCHIWALNY"/>
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
    "skladnikpracownikid",
    "skladnikpracownik",
    "skladnikwydzialid",
    "skladnikwydzial",
    "skladniktypwyplatyid",
    "skladniktypwyplaty",
    "skladniknazwa",
    "skladnikpodstawa",
    "skladnikwartosc",
    "skladnikwartoscwal",
    "skladnikwartosc1",
    "skladnikwartosc2",
    "skladnikdataod",
    "skladnikdatado",
    "skladnikdatadanych",
    "skladnikokresdni",
    "skladnikokresczas",
    "skladnikgodziny",
    "skladnikekwiwalentilosc",
    "skladnikprocent",
    "skladniksplacono",
    "skladniksplaconoall",
    "skladnikarchiwalny"
})
@XmlRootElement(name = "SKLADNIK", namespace = "http://www.comarch.pl/cdn/optima/offline")
public class SKLADNIK {

    @XmlElement(name = "SKLADNIK_PRACOWNIK_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String skladnikpracownikid;
    @XmlElement(name = "SKLADNIK_PRACOWNIK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String skladnikpracownik;
    @XmlElement(name = "SKLADNIK_WYDZIAL_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String skladnikwydzialid;
    @XmlElement(name = "SKLADNIK_WYDZIAL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String skladnikwydzial;
    @XmlElement(name = "SKLADNIK_TYP_WYPLATY_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String skladniktypwyplatyid;
    @XmlElement(name = "SKLADNIK_TYP_WYPLATY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String skladniktypwyplaty;
    @XmlElement(name = "SKLADNIK_NAZWA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String skladniknazwa;
    @XmlElement(name = "SKLADNIK_PODSTAWA", namespace = "http://www.comarch.pl/cdn/optima/offline")
    protected String skladnikpodstawa;
    @XmlElement(name = "SKLADNIK_WARTOSC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladnikwartosc;
    @XmlElement(name = "SKLADNIK_WARTOSC_WAL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladnikwartoscwal;
    @XmlElement(name = "SKLADNIK_WARTOSC1", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladnikwartosc1;
    @XmlElement(name = "SKLADNIK_WARTOSC2", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladnikwartosc2;
    @XmlElement(name = "SKLADNIK_DATA_OD", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String skladnikdataod;
    @XmlElement(name = "SKLADNIK_DATA_DO", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String skladnikdatado;
    @XmlElement(name = "SKLADNIK_DATA_DANYCH", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String skladnikdatadanych;
    @XmlElement(name = "SKLADNIK_OKRES_DNI", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladnikokresdni;
    @XmlElement(name = "SKLADNIK_OKRES_CZAS", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladnikokresczas;
    @XmlElement(name = "SKLADNIK_GODZINY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladnikgodziny;
    @XmlElement(name = "SKLADNIK_EKWIWALENT_ILOSC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladnikekwiwalentilosc;
    @XmlElement(name = "SKLADNIK_PROCENT", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladnikprocent;
    @XmlElement(name = "SKLADNIK_SPLACONO", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladniksplacono;
    @XmlElement(name = "SKLADNIK_SPLACONO_ALL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladniksplaconoall;
    @XmlElement(name = "SKLADNIK_ARCHIWALNY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String skladnikarchiwalny;

    /**
     * Gets the value of the skladnikpracownikid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKPRACOWNIKID() {
        return skladnikpracownikid;
    }

    /**
     * Sets the value of the skladnikpracownikid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKPRACOWNIKID(String value) {
        this.skladnikpracownikid = value;
    }

    /**
     * Gets the value of the skladnikpracownik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKPRACOWNIK() {
        return skladnikpracownik;
    }

    /**
     * Sets the value of the skladnikpracownik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKPRACOWNIK(String value) {
        this.skladnikpracownik = value;
    }

    /**
     * Gets the value of the skladnikwydzialid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKWYDZIALID() {
        return skladnikwydzialid;
    }

    /**
     * Sets the value of the skladnikwydzialid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKWYDZIALID(String value) {
        this.skladnikwydzialid = value;
    }

    /**
     * Gets the value of the skladnikwydzial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKWYDZIAL() {
        return skladnikwydzial;
    }

    /**
     * Sets the value of the skladnikwydzial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKWYDZIAL(String value) {
        this.skladnikwydzial = value;
    }

    /**
     * Gets the value of the skladniktypwyplatyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKTYPWYPLATYID() {
        return skladniktypwyplatyid;
    }

    /**
     * Sets the value of the skladniktypwyplatyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKTYPWYPLATYID(String value) {
        this.skladniktypwyplatyid = value;
    }

    /**
     * Gets the value of the skladniktypwyplaty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKTYPWYPLATY() {
        return skladniktypwyplaty;
    }

    /**
     * Sets the value of the skladniktypwyplaty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKTYPWYPLATY(String value) {
        this.skladniktypwyplaty = value;
    }

    /**
     * Gets the value of the skladniknazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKNAZWA() {
        return skladniknazwa;
    }

    /**
     * Sets the value of the skladniknazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKNAZWA(String value) {
        this.skladniknazwa = value;
    }

    /**
     * Gets the value of the skladnikpodstawa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKPODSTAWA() {
        return skladnikpodstawa;
    }

    /**
     * Sets the value of the skladnikpodstawa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKPODSTAWA(String value) {
        this.skladnikpodstawa = value;
    }

    /**
     * Gets the value of the skladnikwartosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKWARTOSC() {
        return skladnikwartosc;
    }

    /**
     * Sets the value of the skladnikwartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKWARTOSC(String value) {
        this.skladnikwartosc = value;
    }

    /**
     * Gets the value of the skladnikwartoscwal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKWARTOSCWAL() {
        return skladnikwartoscwal;
    }

    /**
     * Sets the value of the skladnikwartoscwal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKWARTOSCWAL(String value) {
        this.skladnikwartoscwal = value;
    }

    /**
     * Gets the value of the skladnikwartosc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKWARTOSC1() {
        return skladnikwartosc1;
    }

    /**
     * Sets the value of the skladnikwartosc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKWARTOSC1(String value) {
        this.skladnikwartosc1 = value;
    }

    /**
     * Gets the value of the skladnikwartosc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKWARTOSC2() {
        return skladnikwartosc2;
    }

    /**
     * Sets the value of the skladnikwartosc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKWARTOSC2(String value) {
        this.skladnikwartosc2 = value;
    }

    /**
     * Gets the value of the skladnikdataod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKDATAOD() {
        return skladnikdataod;
    }

    /**
     * Sets the value of the skladnikdataod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKDATAOD(String value) {
        this.skladnikdataod = value;
    }

    /**
     * Gets the value of the skladnikdatado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKDATADO() {
        return skladnikdatado;
    }

    /**
     * Sets the value of the skladnikdatado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKDATADO(String value) {
        this.skladnikdatado = value;
    }

    /**
     * Gets the value of the skladnikdatadanych property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKDATADANYCH() {
        return skladnikdatadanych;
    }

    /**
     * Sets the value of the skladnikdatadanych property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKDATADANYCH(String value) {
        this.skladnikdatadanych = value;
    }

    /**
     * Gets the value of the skladnikokresdni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKOKRESDNI() {
        return skladnikokresdni;
    }

    /**
     * Sets the value of the skladnikokresdni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKOKRESDNI(String value) {
        this.skladnikokresdni = value;
    }

    /**
     * Gets the value of the skladnikokresczas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKOKRESCZAS() {
        return skladnikokresczas;
    }

    /**
     * Sets the value of the skladnikokresczas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKOKRESCZAS(String value) {
        this.skladnikokresczas = value;
    }

    /**
     * Gets the value of the skladnikgodziny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKGODZINY() {
        return skladnikgodziny;
    }

    /**
     * Sets the value of the skladnikgodziny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKGODZINY(String value) {
        this.skladnikgodziny = value;
    }

    /**
     * Gets the value of the skladnikekwiwalentilosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKEKWIWALENTILOSC() {
        return skladnikekwiwalentilosc;
    }

    /**
     * Sets the value of the skladnikekwiwalentilosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKEKWIWALENTILOSC(String value) {
        this.skladnikekwiwalentilosc = value;
    }

    /**
     * Gets the value of the skladnikprocent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKPROCENT() {
        return skladnikprocent;
    }

    /**
     * Sets the value of the skladnikprocent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKPROCENT(String value) {
        this.skladnikprocent = value;
    }

    /**
     * Gets the value of the skladniksplacono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKSPLACONO() {
        return skladniksplacono;
    }

    /**
     * Sets the value of the skladniksplacono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKSPLACONO(String value) {
        this.skladniksplacono = value;
    }

    /**
     * Gets the value of the skladniksplaconoall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKSPLACONOALL() {
        return skladniksplaconoall;
    }

    /**
     * Sets the value of the skladniksplaconoall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKSPLACONOALL(String value) {
        this.skladniksplaconoall = value;
    }

    /**
     * Gets the value of the skladnikarchiwalny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKLADNIKARCHIWALNY() {
        return skladnikarchiwalny;
    }

    /**
     * Sets the value of the skladnikarchiwalny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKLADNIKARCHIWALNY(String value) {
        this.skladnikarchiwalny = value;
    }

}
