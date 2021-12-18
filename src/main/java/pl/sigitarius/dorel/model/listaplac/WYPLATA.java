
package pl.sigitarius.dorel.model.listaplac;

import pl.sigitarius.dorel.xml.CDATAAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;


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
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_PRACOWNIK_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_PRACOWNIK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_WYDZIAL_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_WYDZIAL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_NAZWA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_DEFINICJA_DOKUMENTU_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_DEFINICJA_DOKUMENTU_SYMBOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_DEFINICJA_DOKUMENTU_NUMERACJA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_NUMER_STRING"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_NUMER_NR"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_NUMER_PELNY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_DATA_DOK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_ROK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_MIESIAC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_DATA_OD"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_DATA_DO"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_WARTOSC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_BRUTTO"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_TRYB"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_KATEGORIA_OPIS"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_KOREKTA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_KOREKTA_POLA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_KOREKTA_POLA2"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_KOREKTA_PLATNOSCI"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_ARCHIWALNA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_ZAMKNIETA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_UMOWA_DOD_ZAS"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_OBNIZSKLPPK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_PODSTAWAPODAT1"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_PODSTAWAPODAT2"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_PROCENTPODAT1"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATA_PROCENTPODAT2"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ELEMENTY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSCI"/>
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
    "wyplatapracownikid",
    "wyplatapracownik",
    "wyplatawydzialid",
    "wyplatawydzial",
    "wyplatanazwa",
    "wyplatadefinicjadokumentuid",
    "wyplatadefinicjadokumentusymbol",
    "wyplatadefinicjadokumentunumeracja",
    "wyplatanumerstring",
    "wyplatanumernr",
    "wyplatanumerpelny",
    "wyplatadatadok",
    "wyplatarok",
    "wyplatamiesiac",
    "wyplatadataod",
    "wyplatadatado",
    "wyplatawartosc",
    "wyplatabrutto",
    "wyplatatryb",
    "wyplatakategoriaopis",
    "wyplatakorekta",
    "wyplatakorektapola",
    "wyplatakorektapola2",
    "wyplatakorektaplatnosci",
    "wyplataarchiwalna",
    "wyplatazamknieta",
    "wyplataumowadodzas",
    "wyplataobnizsklppk",
    "wyplatapodstawapodat1",
    "wyplatapodstawapodat2",
    "wyplataprocentpodat1",
    "wyplataprocentpodat2",
    "elementy",
    "platnosci"
})
@XmlRootElement(name = "WYPLATA", namespace = "http://www.comarch.pl/cdn/optima/offline")
public class WYPLATA {

    @XmlElement(name = "WYPLATA_PRACOWNIK_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatapracownikid;
    @XmlElement(name = "WYPLATA_PRACOWNIK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatapracownik;
    @XmlElement(name = "WYPLATA_WYDZIAL_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatawydzialid;
    @XmlElement(name = "WYPLATA_WYDZIAL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatawydzial;
    @XmlElement(name = "WYPLATA_NAZWA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatanazwa;
    @XmlElement(name = "WYPLATA_DEFINICJA_DOKUMENTU_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatadefinicjadokumentuid;
    @XmlElement(name = "WYPLATA_DEFINICJA_DOKUMENTU_SYMBOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatadefinicjadokumentusymbol;
    @XmlElement(name = "WYPLATA_DEFINICJA_DOKUMENTU_NUMERACJA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatadefinicjadokumentunumeracja;
    @XmlElement(name = "WYPLATA_NUMER_STRING", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatanumerstring;
    @XmlElement(name = "WYPLATA_NUMER_NR", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplatanumernr;
    @XmlElement(name = "WYPLATA_NUMER_PELNY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatanumerpelny;
    @XmlElement(name = "WYPLATA_DATA_DOK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatadatadok;
    @XmlElement(name = "WYPLATA_ROK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplatarok;
    @XmlElement(name = "WYPLATA_MIESIAC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplatamiesiac;
    @XmlElement(name = "WYPLATA_DATA_OD", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatadataod;
    @XmlElement(name = "WYPLATA_DATA_DO", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatadatado;
    @XmlElement(name = "WYPLATA_WARTOSC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected BigDecimal wyplatawartosc;
    @XmlElement(name = "WYPLATA_BRUTTO", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected BigDecimal wyplatabrutto;
    @XmlElement(name = "WYPLATA_TRYB", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplatatryb;
    @XmlElement(name = "WYPLATA_KATEGORIA_OPIS", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String wyplatakategoriaopis;
    @XmlElement(name = "WYPLATA_KOREKTA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplatakorekta;
    @XmlElement(name = "WYPLATA_KOREKTA_POLA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplatakorektapola;
    @XmlElement(name = "WYPLATA_KOREKTA_POLA2", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplatakorektapola2;
    @XmlElement(name = "WYPLATA_KOREKTA_PLATNOSCI", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplatakorektaplatnosci;
    @XmlElement(name = "WYPLATA_ARCHIWALNA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplataarchiwalna;
    @XmlElement(name = "WYPLATA_ZAMKNIETA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplatazamknieta;
    @XmlElement(name = "WYPLATA_UMOWA_DOD_ZAS", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplataumowadodzas;
    @XmlElement(name = "WYPLATA_OBNIZSKLPPK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplataobnizsklppk;
    @XmlElement(name = "WYPLATA_PODSTAWAPODAT1", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected BigDecimal wyplatapodstawapodat1;
    @XmlElement(name = "WYPLATA_PODSTAWAPODAT2", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplatapodstawapodat2;
    @XmlElement(name = "WYPLATA_PROCENTPODAT1", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplataprocentpodat1;
    @XmlElement(name = "WYPLATA_PROCENTPODAT2", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String wyplataprocentpodat2;
    @XmlElement(name = "ELEMENTY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected ELEMENTY elementy;
    @XmlElement(name = "PLATNOSCI", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected PLATNOSCI platnosci;

    /**
     * Gets the value of the wyplatapracownikid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAPRACOWNIKID() {
        return wyplatapracownikid;
    }

    /**
     * Sets the value of the wyplatapracownikid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAPRACOWNIKID(String value) {
        this.wyplatapracownikid = value;
    }

    /**
     * Gets the value of the wyplatapracownik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAPRACOWNIK() {
        return wyplatapracownik;
    }

    /**
     * Sets the value of the wyplatapracownik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAPRACOWNIK(String value) {
        this.wyplatapracownik = value;
    }

    /**
     * Gets the value of the wyplatawydzialid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAWYDZIALID() {
        return wyplatawydzialid;
    }

    /**
     * Sets the value of the wyplatawydzialid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAWYDZIALID(String value) {
        this.wyplatawydzialid = value;
    }

    /**
     * Gets the value of the wyplatawydzial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAWYDZIAL() {
        return wyplatawydzial;
    }

    /**
     * Sets the value of the wyplatawydzial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAWYDZIAL(String value) {
        this.wyplatawydzial = value;
    }

    /**
     * Gets the value of the wyplatanazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATANAZWA() {
        return wyplatanazwa;
    }

    /**
     * Sets the value of the wyplatanazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATANAZWA(String value) {
        this.wyplatanazwa = value;
    }

    /**
     * Gets the value of the wyplatadefinicjadokumentuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATADEFINICJADOKUMENTUID() {
        return wyplatadefinicjadokumentuid;
    }

    /**
     * Sets the value of the wyplatadefinicjadokumentuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATADEFINICJADOKUMENTUID(String value) {
        this.wyplatadefinicjadokumentuid = value;
    }

    /**
     * Gets the value of the wyplatadefinicjadokumentusymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATADEFINICJADOKUMENTUSYMBOL() {
        return wyplatadefinicjadokumentusymbol;
    }

    /**
     * Sets the value of the wyplatadefinicjadokumentusymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATADEFINICJADOKUMENTUSYMBOL(String value) {
        this.wyplatadefinicjadokumentusymbol = value;
    }

    /**
     * Gets the value of the wyplatadefinicjadokumentunumeracja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATADEFINICJADOKUMENTUNUMERACJA() {
        return wyplatadefinicjadokumentunumeracja;
    }

    /**
     * Sets the value of the wyplatadefinicjadokumentunumeracja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATADEFINICJADOKUMENTUNUMERACJA(String value) {
        this.wyplatadefinicjadokumentunumeracja = value;
    }

    /**
     * Gets the value of the wyplatanumerstring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATANUMERSTRING() {
        return wyplatanumerstring;
    }

    /**
     * Sets the value of the wyplatanumerstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATANUMERSTRING(String value) {
        this.wyplatanumerstring = value;
    }

    /**
     * Gets the value of the wyplatanumernr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATANUMERNR() {
        return wyplatanumernr;
    }

    /**
     * Sets the value of the wyplatanumernr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATANUMERNR(String value) {
        this.wyplatanumernr = value;
    }

    /**
     * Gets the value of the wyplatanumerpelny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATANUMERPELNY() {
        return wyplatanumerpelny;
    }

    /**
     * Sets the value of the wyplatanumerpelny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATANUMERPELNY(String value) {
        this.wyplatanumerpelny = value;
    }

    /**
     * Gets the value of the wyplatadatadok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATADATADOK() {
        return wyplatadatadok;
    }

    /**
     * Sets the value of the wyplatadatadok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATADATADOK(String value) {
        this.wyplatadatadok = value;
    }

    /**
     * Gets the value of the wyplatarok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAROK() {
        return wyplatarok;
    }

    /**
     * Sets the value of the wyplatarok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAROK(String value) {
        this.wyplatarok = value;
    }

    /**
     * Gets the value of the wyplatamiesiac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAMIESIAC() {
        return wyplatamiesiac;
    }

    /**
     * Sets the value of the wyplatamiesiac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAMIESIAC(String value) {
        this.wyplatamiesiac = value;
    }

    /**
     * Gets the value of the wyplatadataod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATADATAOD() {
        return wyplatadataod;
    }

    /**
     * Sets the value of the wyplatadataod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATADATAOD(String value) {
        this.wyplatadataod = value;
    }

    /**
     * Gets the value of the wyplatadatado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATADATADO() {
        return wyplatadatado;
    }

    /**
     * Sets the value of the wyplatadatado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATADATADO(String value) {
        this.wyplatadatado = value;
    }

    /**
     * Gets the value of the wyplatawartosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getWYPLATAWARTOSC() {
        return wyplatawartosc;
    }

    /**
     * Sets the value of the wyplatawartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAWARTOSC(BigDecimal value) {
        this.wyplatawartosc = value;
    }

    /**
     * Gets the value of the wyplatabrutto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getWYPLATABRUTTO() {
        return wyplatabrutto;
    }

    /**
     * Sets the value of the wyplatabrutto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATABRUTTO(BigDecimal value) {
        this.wyplatabrutto = value;
    }

    /**
     * Gets the value of the wyplatatryb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATATRYB() {
        return wyplatatryb;
    }

    /**
     * Sets the value of the wyplatatryb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATATRYB(String value) {
        this.wyplatatryb = value;
    }

    /**
     * Gets the value of the wyplatakategoriaopis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAKATEGORIAOPIS() {
        return wyplatakategoriaopis;
    }

    /**
     * Sets the value of the wyplatakategoriaopis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAKATEGORIAOPIS(String value) {
        this.wyplatakategoriaopis = value;
    }

    /**
     * Gets the value of the wyplatakorekta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAKOREKTA() {
        return wyplatakorekta;
    }

    /**
     * Sets the value of the wyplatakorekta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAKOREKTA(String value) {
        this.wyplatakorekta = value;
    }

    /**
     * Gets the value of the wyplatakorektapola property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAKOREKTAPOLA() {
        return wyplatakorektapola;
    }

    /**
     * Sets the value of the wyplatakorektapola property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAKOREKTAPOLA(String value) {
        this.wyplatakorektapola = value;
    }

    /**
     * Gets the value of the wyplatakorektapola2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAKOREKTAPOLA2() {
        return wyplatakorektapola2;
    }

    /**
     * Sets the value of the wyplatakorektapola2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAKOREKTAPOLA2(String value) {
        this.wyplatakorektapola2 = value;
    }

    /**
     * Gets the value of the wyplatakorektaplatnosci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAKOREKTAPLATNOSCI() {
        return wyplatakorektaplatnosci;
    }

    /**
     * Sets the value of the wyplatakorektaplatnosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAKOREKTAPLATNOSCI(String value) {
        this.wyplatakorektaplatnosci = value;
    }

    /**
     * Gets the value of the wyplataarchiwalna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAARCHIWALNA() {
        return wyplataarchiwalna;
    }

    /**
     * Sets the value of the wyplataarchiwalna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAARCHIWALNA(String value) {
        this.wyplataarchiwalna = value;
    }

    /**
     * Gets the value of the wyplatazamknieta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAZAMKNIETA() {
        return wyplatazamknieta;
    }

    /**
     * Sets the value of the wyplatazamknieta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAZAMKNIETA(String value) {
        this.wyplatazamknieta = value;
    }

    /**
     * Gets the value of the wyplataumowadodzas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAUMOWADODZAS() {
        return wyplataumowadodzas;
    }

    /**
     * Sets the value of the wyplataumowadodzas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAUMOWADODZAS(String value) {
        this.wyplataumowadodzas = value;
    }

    /**
     * Gets the value of the wyplataobnizsklppk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAOBNIZSKLPPK() {
        return wyplataobnizsklppk;
    }

    /**
     * Sets the value of the wyplataobnizsklppk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAOBNIZSKLPPK(String value) {
        this.wyplataobnizsklppk = value;
    }

    /**
     * Gets the value of the wyplatapodstawapodat1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public BigDecimal getWYPLATAPODSTAWAPODAT1() {
        return wyplatapodstawapodat1;
    }

    /**
     * Sets the value of the wyplatapodstawapodat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAPODSTAWAPODAT1(BigDecimal value) {
        this.wyplatapodstawapodat1 = value;
    }

    /**
     * Gets the value of the wyplatapodstawapodat2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAPODSTAWAPODAT2() {
        return wyplatapodstawapodat2;
    }

    /**
     * Sets the value of the wyplatapodstawapodat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAPODSTAWAPODAT2(String value) {
        this.wyplatapodstawapodat2 = value;
    }

    /**
     * Gets the value of the wyplataprocentpodat1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAPROCENTPODAT1() {
        return wyplataprocentpodat1;
    }

    /**
     * Sets the value of the wyplataprocentpodat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAPROCENTPODAT1(String value) {
        this.wyplataprocentpodat1 = value;
    }

    /**
     * Gets the value of the wyplataprocentpodat2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWYPLATAPROCENTPODAT2() {
        return wyplataprocentpodat2;
    }

    /**
     * Sets the value of the wyplataprocentpodat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWYPLATAPROCENTPODAT2(String value) {
        this.wyplataprocentpodat2 = value;
    }

    /**
     * Gets the value of the elementy property.
     * 
     * @return
     *     possible object is
     *     {@link ELEMENTY }
     *     
     */
    public ELEMENTY getELEMENTY() {
        return elementy;
    }

    /**
     * Sets the value of the elementy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELEMENTY }
     *     
     */
    public void setELEMENTY(ELEMENTY value) {
        this.elementy = value;
    }

    /**
     * Gets the value of the platnosci property.
     * 
     * @return
     *     possible object is
     *     {@link PLATNOSCI }
     *     
     */
    public PLATNOSCI getPLATNOSCI() {
        return platnosci;
    }

    /**
     * Sets the value of the platnosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLATNOSCI }
     *     
     */
    public void setPLATNOSCI(PLATNOSCI value) {
        this.platnosci = value;
    }

}
