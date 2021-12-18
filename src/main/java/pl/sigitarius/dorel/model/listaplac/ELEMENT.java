
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
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PRACOWNIK_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PRACOWNIK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_TYP_WYPLATY_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_TYP_WYPLATY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_NAZWA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_WARTOSC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_WARTOSC_WAL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_NETTO"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_NETTO_WAL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_BRUTTO_50"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_KOSZTY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_KOSZTY_50"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PRZYCHOD_50"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_WALUTA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_ULGA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_ZAL_FIS"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_NAL_FIS"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_TY_UB"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_NR_ZUS"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_EMER"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_RENT"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_CHOR"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_WYPAD"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_ZDROW"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_FP"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_FGSP"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_FEP"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_PPK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_EMER_PRAC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_EMER_FIRMA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_RENT_PRAC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_RENT_FIRMA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_CHOR_PRAC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_CHOR_FIRMA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_WYPAD_PRAC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_WYPAD_FIRMA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_ZDROW_PRAC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_ZDROW_FIRMA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_ZDROW_SUMA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_FP"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_FGSP"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_FEP"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_PPK_PRAC1"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_PPK_PRAC2"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_PPK_FIRMA1"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_PPK_FIRMA2"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_KATEGORIA_OPIS"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_ARCHIWALNY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_TEMP"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_ZAL_FIS_ZWOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_FIS_ZWOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_EMER_ZWOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_RENT_ZWOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_CHOR_ZWOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_PODST_ZDROW_ZWOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_EMER_PRAC_ZWOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_RENT_PRAC_ZWOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_CHOR_PRAC_ZWOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENT_SKL_ZDROW_PRAC_ZWOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SKLADNIKI"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}OPISY"/>
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
    "elementpracownikid",
    "elementpracownik",
    "elementtypwyplatyid",
    "elementtypwyplaty",
    "elementnazwa",
    "elementwartosc",
    "elementwartoscwal",
    "elementnetto",
    "elementnettowal",
    "elementbrutto50",
    "elementkoszty",
    "elementkoszty50",
    "elementprzychod50",
    "elementwaluta",
    "elementulga",
    "elementzalfis",
    "elementnalfis",
    "elementtyub",
    "elementnrzus",
    "elementpodstemer",
    "elementpodstrent",
    "elementpodstchor",
    "elementpodstwypad",
    "elementpodstzdrow",
    "elementpodstfp",
    "elementpodstfgsp",
    "elementpodstfep",
    "elementpodstppk",
    "elementsklemerprac",
    "elementsklemerfirma",
    "elementsklrentprac",
    "elementsklrentfirma",
    "elementsklchorprac",
    "elementsklchorfirma",
    "elementsklwypadprac",
    "elementsklwypadfirma",
    "elementsklzdrowprac",
    "elementsklzdrowfirma",
    "elementsklzdrowsuma",
    "elementsklfp",
    "elementsklfgsp",
    "elementsklfep",
    "elementsklppkprac1",
    "elementsklppkprac2",
    "elementsklppkfirma1",
    "elementsklppkfirma2",
    "elementkategoriaopis",
    "elementarchiwalny",
    "elementtemp",
    "elementzalfiszwol",
    "elementpodstfiszwol",
    "elementpodstemerzwol",
    "elementpodstrentzwol",
    "elementpodstchorzwol",
    "elementpodstzdrowzwol",
    "elementsklemerpraczwol",
    "elementsklrentpraczwol",
    "elementsklchorpraczwol",
    "elementsklzdrowpraczwol",
    "skladniki",
    "opisy"
})
@XmlRootElement(name = "ELEMENT", namespace = "http://www.comarch.pl/cdn/optima/offline")
public class ELEMENT {

    @XmlElement(name = "ELEMENT_PRACOWNIK_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String elementpracownikid;
    @XmlElement(name = "ELEMENT_PRACOWNIK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String elementpracownik;
    @XmlElement(name = "ELEMENT_TYP_WYPLATY_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String elementtypwyplatyid;
    @XmlElement(name = "ELEMENT_TYP_WYPLATY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String elementtypwyplaty;
    @XmlElement(name = "ELEMENT_NAZWA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String elementnazwa;
    @XmlElement(name = "ELEMENT_WARTOSC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementwartosc;
    @XmlElement(name = "ELEMENT_WARTOSC_WAL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementwartoscwal;
    @XmlElement(name = "ELEMENT_NETTO", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementnetto;
    @XmlElement(name = "ELEMENT_NETTO_WAL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementnettowal;
    @XmlElement(name = "ELEMENT_BRUTTO_50", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementbrutto50;
    @XmlElement(name = "ELEMENT_KOSZTY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementkoszty;
    @XmlElement(name = "ELEMENT_KOSZTY_50", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementkoszty50;
    @XmlElement(name = "ELEMENT_PRZYCHOD_50", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementprzychod50;
    @XmlElement(name = "ELEMENT_WALUTA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String elementwaluta;
    @XmlElement(name = "ELEMENT_ULGA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementulga;
    @XmlElement(name = "ELEMENT_ZAL_FIS", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementzalfis;
    @XmlElement(name = "ELEMENT_NAL_FIS", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementnalfis;
    @XmlElement(name = "ELEMENT_TY_UB", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementtyub;
    @XmlElement(name = "ELEMENT_NR_ZUS", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementnrzus;
    @XmlElement(name = "ELEMENT_PODST_EMER", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstemer;
    @XmlElement(name = "ELEMENT_PODST_RENT", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstrent;
    @XmlElement(name = "ELEMENT_PODST_CHOR", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstchor;
    @XmlElement(name = "ELEMENT_PODST_WYPAD", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstwypad;
    @XmlElement(name = "ELEMENT_PODST_ZDROW", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstzdrow;
    @XmlElement(name = "ELEMENT_PODST_FP", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstfp;
    @XmlElement(name = "ELEMENT_PODST_FGSP", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstfgsp;
    @XmlElement(name = "ELEMENT_PODST_FEP", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstfep;
    @XmlElement(name = "ELEMENT_PODST_PPK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstppk;
    @XmlElement(name = "ELEMENT_SKL_EMER_PRAC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklemerprac;
    @XmlElement(name = "ELEMENT_SKL_EMER_FIRMA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklemerfirma;
    @XmlElement(name = "ELEMENT_SKL_RENT_PRAC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklrentprac;
    @XmlElement(name = "ELEMENT_SKL_RENT_FIRMA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklrentfirma;
    @XmlElement(name = "ELEMENT_SKL_CHOR_PRAC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklchorprac;
    @XmlElement(name = "ELEMENT_SKL_CHOR_FIRMA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklchorfirma;
    @XmlElement(name = "ELEMENT_SKL_WYPAD_PRAC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklwypadprac;
    @XmlElement(name = "ELEMENT_SKL_WYPAD_FIRMA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklwypadfirma;
    @XmlElement(name = "ELEMENT_SKL_ZDROW_PRAC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklzdrowprac;
    @XmlElement(name = "ELEMENT_SKL_ZDROW_FIRMA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklzdrowfirma;
    @XmlElement(name = "ELEMENT_SKL_ZDROW_SUMA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklzdrowsuma;
    @XmlElement(name = "ELEMENT_SKL_FP", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklfp;
    @XmlElement(name = "ELEMENT_SKL_FGSP", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklfgsp;
    @XmlElement(name = "ELEMENT_SKL_FEP", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklfep;
    @XmlElement(name = "ELEMENT_SKL_PPK_PRAC1", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklppkprac1;
    @XmlElement(name = "ELEMENT_SKL_PPK_PRAC2", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklppkprac2;
    @XmlElement(name = "ELEMENT_SKL_PPK_FIRMA1", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklppkfirma1;
    @XmlElement(name = "ELEMENT_SKL_PPK_FIRMA2", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklppkfirma2;
    @XmlElement(name = "ELEMENT_KATEGORIA_OPIS", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String elementkategoriaopis;
    @XmlElement(name = "ELEMENT_ARCHIWALNY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementarchiwalny;
    @XmlElement(name = "ELEMENT_TEMP", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementtemp;
    @XmlElement(name = "ELEMENT_ZAL_FIS_ZWOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementzalfiszwol;
    @XmlElement(name = "ELEMENT_PODST_FIS_ZWOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstfiszwol;
    @XmlElement(name = "ELEMENT_PODST_EMER_ZWOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstemerzwol;
    @XmlElement(name = "ELEMENT_PODST_RENT_ZWOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstrentzwol;
    @XmlElement(name = "ELEMENT_PODST_CHOR_ZWOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstchorzwol;
    @XmlElement(name = "ELEMENT_PODST_ZDROW_ZWOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementpodstzdrowzwol;
    @XmlElement(name = "ELEMENT_SKL_EMER_PRAC_ZWOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklemerpraczwol;
    @XmlElement(name = "ELEMENT_SKL_RENT_PRAC_ZWOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklrentpraczwol;
    @XmlElement(name = "ELEMENT_SKL_CHOR_PRAC_ZWOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklchorpraczwol;
    @XmlElement(name = "ELEMENT_SKL_ZDROW_PRAC_ZWOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String elementsklzdrowpraczwol;
    @XmlElement(name = "SKLADNIKI", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected SKLADNIKI skladniki;
    @XmlElement(name = "OPISY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected OPISY opisy;

    /**
     * Gets the value of the elementpracownikid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPRACOWNIKID() {
        return elementpracownikid;
    }

    /**
     * Sets the value of the elementpracownikid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPRACOWNIKID(String value) {
        this.elementpracownikid = value;
    }

    /**
     * Gets the value of the elementpracownik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPRACOWNIK() {
        return elementpracownik;
    }

    /**
     * Sets the value of the elementpracownik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPRACOWNIK(String value) {
        this.elementpracownik = value;
    }

    /**
     * Gets the value of the elementtypwyplatyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTTYPWYPLATYID() {
        return elementtypwyplatyid;
    }

    /**
     * Sets the value of the elementtypwyplatyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTTYPWYPLATYID(String value) {
        this.elementtypwyplatyid = value;
    }

    /**
     * Gets the value of the elementtypwyplaty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTTYPWYPLATY() {
        return elementtypwyplaty;
    }

    /**
     * Sets the value of the elementtypwyplaty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTTYPWYPLATY(String value) {
        this.elementtypwyplaty = value;
    }

    /**
     * Gets the value of the elementnazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTNAZWA() {
        return elementnazwa;
    }

    /**
     * Sets the value of the elementnazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTNAZWA(String value) {
        this.elementnazwa = value;
    }

    /**
     * Gets the value of the elementwartosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTWARTOSC() {
        return elementwartosc;
    }

    /**
     * Sets the value of the elementwartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTWARTOSC(String value) {
        this.elementwartosc = value;
    }

    /**
     * Gets the value of the elementwartoscwal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTWARTOSCWAL() {
        return elementwartoscwal;
    }

    /**
     * Sets the value of the elementwartoscwal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTWARTOSCWAL(String value) {
        this.elementwartoscwal = value;
    }

    /**
     * Gets the value of the elementnetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTNETTO() {
        return elementnetto;
    }

    /**
     * Sets the value of the elementnetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTNETTO(String value) {
        this.elementnetto = value;
    }

    /**
     * Gets the value of the elementnettowal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTNETTOWAL() {
        return elementnettowal;
    }

    /**
     * Sets the value of the elementnettowal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTNETTOWAL(String value) {
        this.elementnettowal = value;
    }

    /**
     * Gets the value of the elementbrutto50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTBRUTTO50() {
        return elementbrutto50;
    }

    /**
     * Sets the value of the elementbrutto50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTBRUTTO50(String value) {
        this.elementbrutto50 = value;
    }

    /**
     * Gets the value of the elementkoszty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTKOSZTY() {
        return elementkoszty;
    }

    /**
     * Sets the value of the elementkoszty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTKOSZTY(String value) {
        this.elementkoszty = value;
    }

    /**
     * Gets the value of the elementkoszty50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTKOSZTY50() {
        return elementkoszty50;
    }

    /**
     * Sets the value of the elementkoszty50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTKOSZTY50(String value) {
        this.elementkoszty50 = value;
    }

    /**
     * Gets the value of the elementprzychod50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPRZYCHOD50() {
        return elementprzychod50;
    }

    /**
     * Sets the value of the elementprzychod50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPRZYCHOD50(String value) {
        this.elementprzychod50 = value;
    }

    /**
     * Gets the value of the elementwaluta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTWALUTA() {
        return elementwaluta;
    }

    /**
     * Sets the value of the elementwaluta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTWALUTA(String value) {
        this.elementwaluta = value;
    }

    /**
     * Gets the value of the elementulga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTULGA() {
        return elementulga;
    }

    /**
     * Sets the value of the elementulga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTULGA(String value) {
        this.elementulga = value;
    }

    /**
     * Gets the value of the elementzalfis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTZALFIS() {
        return elementzalfis;
    }

    /**
     * Sets the value of the elementzalfis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTZALFIS(String value) {
        this.elementzalfis = value;
    }

    /**
     * Gets the value of the elementnalfis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTNALFIS() {
        return elementnalfis;
    }

    /**
     * Sets the value of the elementnalfis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTNALFIS(String value) {
        this.elementnalfis = value;
    }

    /**
     * Gets the value of the elementtyub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTTYUB() {
        return elementtyub;
    }

    /**
     * Sets the value of the elementtyub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTTYUB(String value) {
        this.elementtyub = value;
    }

    /**
     * Gets the value of the elementnrzus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTNRZUS() {
        return elementnrzus;
    }

    /**
     * Sets the value of the elementnrzus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTNRZUS(String value) {
        this.elementnrzus = value;
    }

    /**
     * Gets the value of the elementpodstemer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTEMER() {
        return elementpodstemer;
    }

    /**
     * Sets the value of the elementpodstemer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTEMER(String value) {
        this.elementpodstemer = value;
    }

    /**
     * Gets the value of the elementpodstrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTRENT() {
        return elementpodstrent;
    }

    /**
     * Sets the value of the elementpodstrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTRENT(String value) {
        this.elementpodstrent = value;
    }

    /**
     * Gets the value of the elementpodstchor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTCHOR() {
        return elementpodstchor;
    }

    /**
     * Sets the value of the elementpodstchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTCHOR(String value) {
        this.elementpodstchor = value;
    }

    /**
     * Gets the value of the elementpodstwypad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTWYPAD() {
        return elementpodstwypad;
    }

    /**
     * Sets the value of the elementpodstwypad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTWYPAD(String value) {
        this.elementpodstwypad = value;
    }

    /**
     * Gets the value of the elementpodstzdrow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTZDROW() {
        return elementpodstzdrow;
    }

    /**
     * Sets the value of the elementpodstzdrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTZDROW(String value) {
        this.elementpodstzdrow = value;
    }

    /**
     * Gets the value of the elementpodstfp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTFP() {
        return elementpodstfp;
    }

    /**
     * Sets the value of the elementpodstfp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTFP(String value) {
        this.elementpodstfp = value;
    }

    /**
     * Gets the value of the elementpodstfgsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTFGSP() {
        return elementpodstfgsp;
    }

    /**
     * Sets the value of the elementpodstfgsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTFGSP(String value) {
        this.elementpodstfgsp = value;
    }

    /**
     * Gets the value of the elementpodstfep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTFEP() {
        return elementpodstfep;
    }

    /**
     * Sets the value of the elementpodstfep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTFEP(String value) {
        this.elementpodstfep = value;
    }

    /**
     * Gets the value of the elementpodstppk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTPPK() {
        return elementpodstppk;
    }

    /**
     * Sets the value of the elementpodstppk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTPPK(String value) {
        this.elementpodstppk = value;
    }

    /**
     * Gets the value of the elementsklemerprac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLEMERPRAC() {
        return elementsklemerprac;
    }

    /**
     * Sets the value of the elementsklemerprac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLEMERPRAC(String value) {
        this.elementsklemerprac = value;
    }

    /**
     * Gets the value of the elementsklemerfirma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLEMERFIRMA() {
        return elementsklemerfirma;
    }

    /**
     * Sets the value of the elementsklemerfirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLEMERFIRMA(String value) {
        this.elementsklemerfirma = value;
    }

    /**
     * Gets the value of the elementsklrentprac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLRENTPRAC() {
        return elementsklrentprac;
    }

    /**
     * Sets the value of the elementsklrentprac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLRENTPRAC(String value) {
        this.elementsklrentprac = value;
    }

    /**
     * Gets the value of the elementsklrentfirma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLRENTFIRMA() {
        return elementsklrentfirma;
    }

    /**
     * Sets the value of the elementsklrentfirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLRENTFIRMA(String value) {
        this.elementsklrentfirma = value;
    }

    /**
     * Gets the value of the elementsklchorprac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLCHORPRAC() {
        return elementsklchorprac;
    }

    /**
     * Sets the value of the elementsklchorprac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLCHORPRAC(String value) {
        this.elementsklchorprac = value;
    }

    /**
     * Gets the value of the elementsklchorfirma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLCHORFIRMA() {
        return elementsklchorfirma;
    }

    /**
     * Sets the value of the elementsklchorfirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLCHORFIRMA(String value) {
        this.elementsklchorfirma = value;
    }

    /**
     * Gets the value of the elementsklwypadprac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLWYPADPRAC() {
        return elementsklwypadprac;
    }

    /**
     * Sets the value of the elementsklwypadprac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLWYPADPRAC(String value) {
        this.elementsklwypadprac = value;
    }

    /**
     * Gets the value of the elementsklwypadfirma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLWYPADFIRMA() {
        return elementsklwypadfirma;
    }

    /**
     * Sets the value of the elementsklwypadfirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLWYPADFIRMA(String value) {
        this.elementsklwypadfirma = value;
    }

    /**
     * Gets the value of the elementsklzdrowprac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLZDROWPRAC() {
        return elementsklzdrowprac;
    }

    /**
     * Sets the value of the elementsklzdrowprac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLZDROWPRAC(String value) {
        this.elementsklzdrowprac = value;
    }

    /**
     * Gets the value of the elementsklzdrowfirma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLZDROWFIRMA() {
        return elementsklzdrowfirma;
    }

    /**
     * Sets the value of the elementsklzdrowfirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLZDROWFIRMA(String value) {
        this.elementsklzdrowfirma = value;
    }

    /**
     * Gets the value of the elementsklzdrowsuma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLZDROWSUMA() {
        return elementsklzdrowsuma;
    }

    /**
     * Sets the value of the elementsklzdrowsuma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLZDROWSUMA(String value) {
        this.elementsklzdrowsuma = value;
    }

    /**
     * Gets the value of the elementsklfp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLFP() {
        return elementsklfp;
    }

    /**
     * Sets the value of the elementsklfp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLFP(String value) {
        this.elementsklfp = value;
    }

    /**
     * Gets the value of the elementsklfgsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLFGSP() {
        return elementsklfgsp;
    }

    /**
     * Sets the value of the elementsklfgsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLFGSP(String value) {
        this.elementsklfgsp = value;
    }

    /**
     * Gets the value of the elementsklfep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLFEP() {
        return elementsklfep;
    }

    /**
     * Sets the value of the elementsklfep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLFEP(String value) {
        this.elementsklfep = value;
    }

    /**
     * Gets the value of the elementsklppkprac1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLPPKPRAC1() {
        return elementsklppkprac1;
    }

    /**
     * Sets the value of the elementsklppkprac1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLPPKPRAC1(String value) {
        this.elementsklppkprac1 = value;
    }

    /**
     * Gets the value of the elementsklppkprac2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLPPKPRAC2() {
        return elementsklppkprac2;
    }

    /**
     * Sets the value of the elementsklppkprac2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLPPKPRAC2(String value) {
        this.elementsklppkprac2 = value;
    }

    /**
     * Gets the value of the elementsklppkfirma1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLPPKFIRMA1() {
        return elementsklppkfirma1;
    }

    /**
     * Sets the value of the elementsklppkfirma1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLPPKFIRMA1(String value) {
        this.elementsklppkfirma1 = value;
    }

    /**
     * Gets the value of the elementsklppkfirma2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLPPKFIRMA2() {
        return elementsklppkfirma2;
    }

    /**
     * Sets the value of the elementsklppkfirma2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLPPKFIRMA2(String value) {
        this.elementsklppkfirma2 = value;
    }

    /**
     * Gets the value of the elementkategoriaopis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTKATEGORIAOPIS() {
        return elementkategoriaopis;
    }

    /**
     * Sets the value of the elementkategoriaopis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTKATEGORIAOPIS(String value) {
        this.elementkategoriaopis = value;
    }

    /**
     * Gets the value of the elementarchiwalny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTARCHIWALNY() {
        return elementarchiwalny;
    }

    /**
     * Sets the value of the elementarchiwalny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTARCHIWALNY(String value) {
        this.elementarchiwalny = value;
    }

    /**
     * Gets the value of the elementtemp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTTEMP() {
        return elementtemp;
    }

    /**
     * Sets the value of the elementtemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTTEMP(String value) {
        this.elementtemp = value;
    }

    /**
     * Gets the value of the elementzalfiszwol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTZALFISZWOL() {
        return elementzalfiszwol;
    }

    /**
     * Sets the value of the elementzalfiszwol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTZALFISZWOL(String value) {
        this.elementzalfiszwol = value;
    }

    /**
     * Gets the value of the elementpodstfiszwol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTFISZWOL() {
        return elementpodstfiszwol;
    }

    /**
     * Sets the value of the elementpodstfiszwol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTFISZWOL(String value) {
        this.elementpodstfiszwol = value;
    }

    /**
     * Gets the value of the elementpodstemerzwol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTEMERZWOL() {
        return elementpodstemerzwol;
    }

    /**
     * Sets the value of the elementpodstemerzwol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTEMERZWOL(String value) {
        this.elementpodstemerzwol = value;
    }

    /**
     * Gets the value of the elementpodstrentzwol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTRENTZWOL() {
        return elementpodstrentzwol;
    }

    /**
     * Sets the value of the elementpodstrentzwol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTRENTZWOL(String value) {
        this.elementpodstrentzwol = value;
    }

    /**
     * Gets the value of the elementpodstchorzwol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTCHORZWOL() {
        return elementpodstchorzwol;
    }

    /**
     * Sets the value of the elementpodstchorzwol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTCHORZWOL(String value) {
        this.elementpodstchorzwol = value;
    }

    /**
     * Gets the value of the elementpodstzdrowzwol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTPODSTZDROWZWOL() {
        return elementpodstzdrowzwol;
    }

    /**
     * Sets the value of the elementpodstzdrowzwol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTPODSTZDROWZWOL(String value) {
        this.elementpodstzdrowzwol = value;
    }

    /**
     * Gets the value of the elementsklemerpraczwol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLEMERPRACZWOL() {
        return elementsklemerpraczwol;
    }

    /**
     * Sets the value of the elementsklemerpraczwol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLEMERPRACZWOL(String value) {
        this.elementsklemerpraczwol = value;
    }

    /**
     * Gets the value of the elementsklrentpraczwol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLRENTPRACZWOL() {
        return elementsklrentpraczwol;
    }

    /**
     * Sets the value of the elementsklrentpraczwol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLRENTPRACZWOL(String value) {
        this.elementsklrentpraczwol = value;
    }

    /**
     * Gets the value of the elementsklchorpraczwol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLCHORPRACZWOL() {
        return elementsklchorpraczwol;
    }

    /**
     * Sets the value of the elementsklchorpraczwol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLCHORPRACZWOL(String value) {
        this.elementsklchorpraczwol = value;
    }

    /**
     * Gets the value of the elementsklzdrowpraczwol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELEMENTSKLZDROWPRACZWOL() {
        return elementsklzdrowpraczwol;
    }

    /**
     * Sets the value of the elementsklzdrowpraczwol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELEMENTSKLZDROWPRACZWOL(String value) {
        this.elementsklzdrowpraczwol = value;
    }

    /**
     * Gets the value of the skladniki property.
     * 
     * @return
     *     possible object is
     *     {@link SKLADNIKI }
     *     
     */
    public SKLADNIKI getSKLADNIKI() {
        return skladniki;
    }

    /**
     * Sets the value of the skladniki property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKLADNIKI }
     *     
     */
    public void setSKLADNIKI(SKLADNIKI value) {
        this.skladniki = value;
    }

    /**
     * Gets the value of the opisy property.
     * 
     * @return
     *     possible object is
     *     {@link OPISY }
     *     
     */
    public OPISY getOPISY() {
        return opisy;
    }

    /**
     * Sets the value of the opisy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPISY }
     *     
     */
    public void setOPISY(OPISY value) {
        this.opisy = value;
    }

}
