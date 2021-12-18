
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
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ID_ZRODLA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_TYP_PODMIOTU"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_PODMIOT"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_PODMIOT_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_PODMIOT_NIP"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_PODMIOT_RACHUNEK_NR" minOccurs="0"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_DEFINICJA_DOKUMENTU_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_DEFINICJA_DOKUMENTU_SYMBOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_DEFINICJA_DOKUMENTU_NUMERACJA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_NUMER_PELNY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_NUMER_OBCY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_KIERUNEK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_KWOTA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_KWOTA_PLN"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_WALUTA_DOK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_WALUTA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_KURS_WALUTY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_NOTOWANIE_WALUTY_ILE"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_NOTOWANIE_WALUTY_ZA_ILE"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_NOTOWANIE_DATA_KURSU"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_DATA_DOK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_TERMIN"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_DATA_REAL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_ZWLOKA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_FORMA_PLATNOSCI_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_FORMA_PLATNOSCI"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_BANK_ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_BANK" minOccurs="0"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_RACHUNEK_NR"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_IBAN"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_PODLEGA_ROZLICZENIU"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_NIE_NALICZAJ_ODSETEK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PRZELEW_SEPA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_KONTO"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_ELIXIR_O1"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_ELIXIR_O2"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_ELIXIR_O3"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_ELIXIR_O4"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_OPIS"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}PLATNOSC_KOMORNIK_ZAJECIE_WYNAGR"/>
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
    "idzrodla",
    "platnosctyppodmiotu",
    "platnoscpodmiot",
    "platnoscpodmiotid",
    "platnoscpodmiotnip",
    "platnoscpodmiotrachuneknr",
    "platnoscdefinicjadokumentuid",
    "platnoscdefinicjadokumentusymbol",
    "platnoscdefinicjadokumentunumeracja",
    "platnoscnumerpelny",
    "platnoscnumerobcy",
    "platnosckierunek",
    "platnosckwota",
    "platnosckwotapln",
    "platnoscwalutadok",
    "platnoscwaluta",
    "platnosckurswaluty",
    "platnoscnotowaniewalutyile",
    "platnoscnotowaniewalutyzaile",
    "platnoscnotowaniedatakursu",
    "platnoscdatadok",
    "platnosctermin",
    "platnoscdatareal",
    "platnosczwloka",
    "platnoscformaplatnosciid",
    "platnoscformaplatnosci",
    "platnoscbankid",
    "platnoscbank",
    "platnoscrachuneknr",
    "platnosciban",
    "platnoscpodlegarozliczeniu",
    "platnoscnienaliczajodsetek",
    "przelewsepa",
    "platnosckonto",
    "platnoscelixiro1",
    "platnoscelixiro2",
    "platnoscelixiro3",
    "platnoscelixiro4",
    "platnoscopis",
    "platnosckomornikzajeciewynagr"
})
@XmlRootElement(name = "PLATNOSC", namespace = "http://www.comarch.pl/cdn/optima/offline")
public class PLATNOSC {

    @XmlElement(name = "ID_ZRODLA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String idzrodla;
    @XmlElement(name = "PLATNOSC_TYP_PODMIOTU", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnosctyppodmiotu;
    @XmlElement(name = "PLATNOSC_PODMIOT", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscpodmiot;
    @XmlElement(name = "PLATNOSC_PODMIOT_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscpodmiotid;
    @XmlElement(name = "PLATNOSC_PODMIOT_NIP", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscpodmiotnip;
    @XmlElement(name = "PLATNOSC_PODMIOT_RACHUNEK_NR", namespace = "http://www.comarch.pl/cdn/optima/offline")
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscpodmiotrachuneknr;
    @XmlElement(name = "PLATNOSC_DEFINICJA_DOKUMENTU_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscdefinicjadokumentuid;
    @XmlElement(name = "PLATNOSC_DEFINICJA_DOKUMENTU_SYMBOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscdefinicjadokumentusymbol;
    @XmlElement(name = "PLATNOSC_DEFINICJA_DOKUMENTU_NUMERACJA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscdefinicjadokumentunumeracja;
    @XmlElement(name = "PLATNOSC_NUMER_PELNY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscnumerpelny;
    @XmlElement(name = "PLATNOSC_NUMER_OBCY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscnumerobcy;
    @XmlElement(name = "PLATNOSC_KIERUNEK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String platnosckierunek;
    @XmlElement(name = "PLATNOSC_KWOTA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String platnosckwota;
    @XmlElement(name = "PLATNOSC_KWOTA_PLN", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String platnosckwotapln;
    @XmlElement(name = "PLATNOSC_WALUTA_DOK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscwalutadok;
    @XmlElement(name = "PLATNOSC_WALUTA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscwaluta;
    @XmlElement(name = "PLATNOSC_KURS_WALUTY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnosckurswaluty;
    @XmlElement(name = "PLATNOSC_NOTOWANIE_WALUTY_ILE", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String platnoscnotowaniewalutyile;
    @XmlElement(name = "PLATNOSC_NOTOWANIE_WALUTY_ZA_ILE", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String platnoscnotowaniewalutyzaile;
    @XmlElement(name = "PLATNOSC_NOTOWANIE_DATA_KURSU", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscnotowaniedatakursu;
    @XmlElement(name = "PLATNOSC_DATA_DOK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscdatadok;
    @XmlElement(name = "PLATNOSC_TERMIN", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnosctermin;
    @XmlElement(name = "PLATNOSC_DATA_REAL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscdatareal;
    @XmlElement(name = "PLATNOSC_ZWLOKA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnosczwloka;
    @XmlElement(name = "PLATNOSC_FORMA_PLATNOSCI_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscformaplatnosciid;
    @XmlElement(name = "PLATNOSC_FORMA_PLATNOSCI", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscformaplatnosci;
    @XmlElement(name = "PLATNOSC_BANK_ID", namespace = "http://www.comarch.pl/cdn/optima/offline")
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscbankid;
    @XmlElement(name = "PLATNOSC_BANK", namespace = "http://www.comarch.pl/cdn/optima/offline")
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscbank;
    @XmlElement(name = "PLATNOSC_RACHUNEK_NR", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscrachuneknr;
    @XmlElement(name = "PLATNOSC_IBAN", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String platnosciban;
    @XmlElement(name = "PLATNOSC_PODLEGA_ROZLICZENIU", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String platnoscpodlegarozliczeniu;
    @XmlElement(name = "PLATNOSC_NIE_NALICZAJ_ODSETEK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String platnoscnienaliczajodsetek;
    @XmlElement(name = "PRZELEW_SEPA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String przelewsepa;
    @XmlElement(name = "PLATNOSC_KONTO", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnosckonto;
    @XmlElement(name = "PLATNOSC_ELIXIR_O1", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscelixiro1;
    @XmlElement(name = "PLATNOSC_ELIXIR_O2", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscelixiro2;
    @XmlElement(name = "PLATNOSC_ELIXIR_O3", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscelixiro3;
    @XmlElement(name = "PLATNOSC_ELIXIR_O4", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscelixiro4;
    @XmlElement(name = "PLATNOSC_OPIS", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String platnoscopis;
    @XmlElement(name = "PLATNOSC_KOMORNIK_ZAJECIE_WYNAGR", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String platnosckomornikzajeciewynagr;

    /**
     * Gets the value of the idzrodla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDZRODLA() {
        return idzrodla;
    }

    /**
     * Sets the value of the idzrodla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDZRODLA(String value) {
        this.idzrodla = value;
    }

    /**
     * Gets the value of the platnosctyppodmiotu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCTYPPODMIOTU() {
        return platnosctyppodmiotu;
    }

    /**
     * Sets the value of the platnosctyppodmiotu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCTYPPODMIOTU(String value) {
        this.platnosctyppodmiotu = value;
    }

    /**
     * Gets the value of the platnoscpodmiot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCPODMIOT() {
        return platnoscpodmiot;
    }

    /**
     * Sets the value of the platnoscpodmiot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCPODMIOT(String value) {
        this.platnoscpodmiot = value;
    }

    /**
     * Gets the value of the platnoscpodmiotid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCPODMIOTID() {
        return platnoscpodmiotid;
    }

    /**
     * Sets the value of the platnoscpodmiotid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCPODMIOTID(String value) {
        this.platnoscpodmiotid = value;
    }

    /**
     * Gets the value of the platnoscpodmiotnip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCPODMIOTNIP() {
        return platnoscpodmiotnip;
    }

    /**
     * Sets the value of the platnoscpodmiotnip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCPODMIOTNIP(String value) {
        this.platnoscpodmiotnip = value;
    }

    /**
     * Gets the value of the platnoscpodmiotrachuneknr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCPODMIOTRACHUNEKNR() {
        return platnoscpodmiotrachuneknr;
    }

    /**
     * Sets the value of the platnoscpodmiotrachuneknr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCPODMIOTRACHUNEKNR(String value) {
        this.platnoscpodmiotrachuneknr = value;
    }

    /**
     * Gets the value of the platnoscdefinicjadokumentuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCDEFINICJADOKUMENTUID() {
        return platnoscdefinicjadokumentuid;
    }

    /**
     * Sets the value of the platnoscdefinicjadokumentuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCDEFINICJADOKUMENTUID(String value) {
        this.platnoscdefinicjadokumentuid = value;
    }

    /**
     * Gets the value of the platnoscdefinicjadokumentusymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCDEFINICJADOKUMENTUSYMBOL() {
        return platnoscdefinicjadokumentusymbol;
    }

    /**
     * Sets the value of the platnoscdefinicjadokumentusymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCDEFINICJADOKUMENTUSYMBOL(String value) {
        this.platnoscdefinicjadokumentusymbol = value;
    }

    /**
     * Gets the value of the platnoscdefinicjadokumentunumeracja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCDEFINICJADOKUMENTUNUMERACJA() {
        return platnoscdefinicjadokumentunumeracja;
    }

    /**
     * Sets the value of the platnoscdefinicjadokumentunumeracja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCDEFINICJADOKUMENTUNUMERACJA(String value) {
        this.platnoscdefinicjadokumentunumeracja = value;
    }

    /**
     * Gets the value of the platnoscnumerpelny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCNUMERPELNY() {
        return platnoscnumerpelny;
    }

    /**
     * Sets the value of the platnoscnumerpelny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCNUMERPELNY(String value) {
        this.platnoscnumerpelny = value;
    }

    /**
     * Gets the value of the platnoscnumerobcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCNUMEROBCY() {
        return platnoscnumerobcy;
    }

    /**
     * Sets the value of the platnoscnumerobcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCNUMEROBCY(String value) {
        this.platnoscnumerobcy = value;
    }

    /**
     * Gets the value of the platnosckierunek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCKIERUNEK() {
        return platnosckierunek;
    }

    /**
     * Sets the value of the platnosckierunek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCKIERUNEK(String value) {
        this.platnosckierunek = value;
    }

    /**
     * Gets the value of the platnosckwota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCKWOTA() {
        return platnosckwota;
    }

    /**
     * Sets the value of the platnosckwota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCKWOTA(String value) {
        this.platnosckwota = value;
    }

    /**
     * Gets the value of the platnosckwotapln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCKWOTAPLN() {
        return platnosckwotapln;
    }

    /**
     * Sets the value of the platnosckwotapln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCKWOTAPLN(String value) {
        this.platnosckwotapln = value;
    }

    /**
     * Gets the value of the platnoscwalutadok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCWALUTADOK() {
        return platnoscwalutadok;
    }

    /**
     * Sets the value of the platnoscwalutadok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCWALUTADOK(String value) {
        this.platnoscwalutadok = value;
    }

    /**
     * Gets the value of the platnoscwaluta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCWALUTA() {
        return platnoscwaluta;
    }

    /**
     * Sets the value of the platnoscwaluta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCWALUTA(String value) {
        this.platnoscwaluta = value;
    }

    /**
     * Gets the value of the platnosckurswaluty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCKURSWALUTY() {
        return platnosckurswaluty;
    }

    /**
     * Sets the value of the platnosckurswaluty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCKURSWALUTY(String value) {
        this.platnosckurswaluty = value;
    }

    /**
     * Gets the value of the platnoscnotowaniewalutyile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCNOTOWANIEWALUTYILE() {
        return platnoscnotowaniewalutyile;
    }

    /**
     * Sets the value of the platnoscnotowaniewalutyile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCNOTOWANIEWALUTYILE(String value) {
        this.platnoscnotowaniewalutyile = value;
    }

    /**
     * Gets the value of the platnoscnotowaniewalutyzaile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCNOTOWANIEWALUTYZAILE() {
        return platnoscnotowaniewalutyzaile;
    }

    /**
     * Sets the value of the platnoscnotowaniewalutyzaile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCNOTOWANIEWALUTYZAILE(String value) {
        this.platnoscnotowaniewalutyzaile = value;
    }

    /**
     * Gets the value of the platnoscnotowaniedatakursu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCNOTOWANIEDATAKURSU() {
        return platnoscnotowaniedatakursu;
    }

    /**
     * Sets the value of the platnoscnotowaniedatakursu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCNOTOWANIEDATAKURSU(String value) {
        this.platnoscnotowaniedatakursu = value;
    }

    /**
     * Gets the value of the platnoscdatadok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCDATADOK() {
        return platnoscdatadok;
    }

    /**
     * Sets the value of the platnoscdatadok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCDATADOK(String value) {
        this.platnoscdatadok = value;
    }

    /**
     * Gets the value of the platnosctermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCTERMIN() {
        return platnosctermin;
    }

    /**
     * Sets the value of the platnosctermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCTERMIN(String value) {
        this.platnosctermin = value;
    }

    /**
     * Gets the value of the platnoscdatareal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCDATAREAL() {
        return platnoscdatareal;
    }

    /**
     * Sets the value of the platnoscdatareal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCDATAREAL(String value) {
        this.platnoscdatareal = value;
    }

    /**
     * Gets the value of the platnosczwloka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCZWLOKA() {
        return platnosczwloka;
    }

    /**
     * Sets the value of the platnosczwloka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCZWLOKA(String value) {
        this.platnosczwloka = value;
    }

    /**
     * Gets the value of the platnoscformaplatnosciid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCFORMAPLATNOSCIID() {
        return platnoscformaplatnosciid;
    }

    /**
     * Sets the value of the platnoscformaplatnosciid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCFORMAPLATNOSCIID(String value) {
        this.platnoscformaplatnosciid = value;
    }

    /**
     * Gets the value of the platnoscformaplatnosci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCFORMAPLATNOSCI() {
        return platnoscformaplatnosci;
    }

    /**
     * Sets the value of the platnoscformaplatnosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCFORMAPLATNOSCI(String value) {
        this.platnoscformaplatnosci = value;
    }

    /**
     * Gets the value of the platnoscbankid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCBANKID() {
        return platnoscbankid;
    }

    /**
     * Sets the value of the platnoscbankid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCBANKID(String value) {
        this.platnoscbankid = value;
    }

    /**
     * Gets the value of the platnoscbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCBANK() {
        return platnoscbank;
    }

    /**
     * Sets the value of the platnoscbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCBANK(String value) {
        this.platnoscbank = value;
    }

    /**
     * Gets the value of the platnoscrachuneknr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCRACHUNEKNR() {
        return platnoscrachuneknr;
    }

    /**
     * Sets the value of the platnoscrachuneknr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCRACHUNEKNR(String value) {
        this.platnoscrachuneknr = value;
    }

    /**
     * Gets the value of the platnosciban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCIBAN() {
        return platnosciban;
    }

    /**
     * Sets the value of the platnosciban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCIBAN(String value) {
        this.platnosciban = value;
    }

    /**
     * Gets the value of the platnoscpodlegarozliczeniu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCPODLEGAROZLICZENIU() {
        return platnoscpodlegarozliczeniu;
    }

    /**
     * Sets the value of the platnoscpodlegarozliczeniu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCPODLEGAROZLICZENIU(String value) {
        this.platnoscpodlegarozliczeniu = value;
    }

    /**
     * Gets the value of the platnoscnienaliczajodsetek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCNIENALICZAJODSETEK() {
        return platnoscnienaliczajodsetek;
    }

    /**
     * Sets the value of the platnoscnienaliczajodsetek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCNIENALICZAJODSETEK(String value) {
        this.platnoscnienaliczajodsetek = value;
    }

    /**
     * Gets the value of the przelewsepa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRZELEWSEPA() {
        return przelewsepa;
    }

    /**
     * Sets the value of the przelewsepa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRZELEWSEPA(String value) {
        this.przelewsepa = value;
    }

    /**
     * Gets the value of the platnosckonto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCKONTO() {
        return platnosckonto;
    }

    /**
     * Sets the value of the platnosckonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCKONTO(String value) {
        this.platnosckonto = value;
    }

    /**
     * Gets the value of the platnoscelixiro1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCELIXIRO1() {
        return platnoscelixiro1;
    }

    /**
     * Sets the value of the platnoscelixiro1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCELIXIRO1(String value) {
        this.platnoscelixiro1 = value;
    }

    /**
     * Gets the value of the platnoscelixiro2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCELIXIRO2() {
        return platnoscelixiro2;
    }

    /**
     * Sets the value of the platnoscelixiro2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCELIXIRO2(String value) {
        this.platnoscelixiro2 = value;
    }

    /**
     * Gets the value of the platnoscelixiro3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCELIXIRO3() {
        return platnoscelixiro3;
    }

    /**
     * Sets the value of the platnoscelixiro3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCELIXIRO3(String value) {
        this.platnoscelixiro3 = value;
    }

    /**
     * Gets the value of the platnoscelixiro4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCELIXIRO4() {
        return platnoscelixiro4;
    }

    /**
     * Sets the value of the platnoscelixiro4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCELIXIRO4(String value) {
        this.platnoscelixiro4 = value;
    }

    /**
     * Gets the value of the platnoscopis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCOPIS() {
        return platnoscopis;
    }

    /**
     * Sets the value of the platnoscopis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCOPIS(String value) {
        this.platnoscopis = value;
    }

    /**
     * Gets the value of the platnosckomornikzajeciewynagr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATNOSCKOMORNIKZAJECIEWYNAGR() {
        return platnosckomornikzajeciewynagr;
    }

    /**
     * Sets the value of the platnosckomornikzajeciewynagr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATNOSCKOMORNIKZAJECIEWYNAGR(String value) {
        this.platnosckomornikzajeciewynagr = value;
    }

}
