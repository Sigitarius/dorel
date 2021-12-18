
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
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}SYMBOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}NAZWA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}LISTA_PLAC_WYDZIAL_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}LISTA_PLAC_WYDZIAL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}DEFINICJA_DOKUMENTU_ID"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}DEFINICJA_DOKUMENTU_SYMBOL"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}DEFINICJA_DOKUMENTU_NUMERACJA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}NUMER_STRING"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}NUMER_NR"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}NUMER_PELNY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}DATA_DOKUMENTU"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ROK"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}MIESIAC"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}DATA_OD"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}DATA_DO"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}DATA_DANYCH"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}TRYB"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}KATEGORIA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}MIESIECY_WSTECZ"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ODDELEGOWANI"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}TYMCZASOWI"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WALUTA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}KURS_WALUTY"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}NOTOWANIE_WALUTY_ILE"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}NOTOWANIE_WALUTY_ZA_ILE"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}DATA_KURSU"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ZAKSIEGOWANA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ZAMKNIETA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WALUTADIETA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}ODDELEGOWANIKRAJ"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}KURS_WALUTYDIETA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}NOTOWANIE_WALUTY_ILE_DIETA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}NOTOWANIE_WALUTY_ZA_ILE_DIETA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}DATA_KURSU_DIETA"/>
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}WYPLATY"/>
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
    "symbol",
    "nazwa",
    "listaplacwydzialid",
    "listaplacwydzial",
    "definicjadokumentuid",
    "definicjadokumentusymbol",
    "definicjadokumentunumeracja",
    "numerstring",
    "numernr",
    "numerpelny",
    "datadokumentu",
    "rok",
    "miesiac",
    "dataod",
    "datado",
    "datadanych",
    "tryb",
    "kategoria",
    "miesiecywstecz",
    "oddelegowani",
    "tymczasowi",
    "waluta",
    "kurswaluty",
    "notowaniewalutyile",
    "notowaniewalutyzaile",
    "datakursu",
    "zaksiegowana",
    "zamknieta",
    "walutadieta",
    "oddelegowanikraj",
    "kurswalutydieta",
    "notowaniewalutyiledieta",
    "notowaniewalutyzailedieta",
    "datakursudieta",
    "wyplaty"
})
@XmlRootElement(name = "LISTA_PLAC", namespace = "http://www.comarch.pl/cdn/optima/offline")
public class LISTAPLAC {

    @XmlElement(name = "ID_ZRODLA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String idzrodla;
    @XmlElement(name = "SYMBOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String symbol;
    @XmlElement(name = "NAZWA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String nazwa;
    @XmlElement(name = "LISTA_PLAC_WYDZIAL_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String listaplacwydzialid;
    @XmlElement(name = "LISTA_PLAC_WYDZIAL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String listaplacwydzial;
    @XmlElement(name = "DEFINICJA_DOKUMENTU_ID", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String definicjadokumentuid;
    @XmlElement(name = "DEFINICJA_DOKUMENTU_SYMBOL", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String definicjadokumentusymbol;
    @XmlElement(name = "DEFINICJA_DOKUMENTU_NUMERACJA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String definicjadokumentunumeracja;
    @XmlElement(name = "NUMER_STRING", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String numerstring;
    @XmlElement(name = "NUMER_NR", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String numernr;
    @XmlElement(name = "NUMER_PELNY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String numerpelny;
    @XmlElement(name = "DATA_DOKUMENTU", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String datadokumentu;
    @XmlElement(name = "ROK", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String rok;
    @XmlElement(name = "MIESIAC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String miesiac;
    @XmlElement(name = "DATA_OD", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String dataod;
    @XmlElement(name = "DATA_DO", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String datado;
    @XmlElement(name = "DATA_DANYCH", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String datadanych;
    @XmlElement(name = "TRYB", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String tryb;
    @XmlElement(name = "KATEGORIA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String kategoria;
    @XmlElement(name = "MIESIECY_WSTECZ", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String miesiecywstecz;
    @XmlElement(name = "ODDELEGOWANI", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String oddelegowani;
    @XmlElement(name = "TYMCZASOWI", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String tymczasowi;
    @XmlElement(name = "WALUTA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String waluta;
    @XmlElement(name = "KURS_WALUTY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String kurswaluty;
    @XmlElement(name = "NOTOWANIE_WALUTY_ILE", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String notowaniewalutyile;
    @XmlElement(name = "NOTOWANIE_WALUTY_ZA_ILE", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String notowaniewalutyzaile;
    @XmlElement(name = "DATA_KURSU", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String datakursu;
    @XmlElement(name = "ZAKSIEGOWANA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String zaksiegowana;
    @XmlElement(name = "ZAMKNIETA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String zamknieta;
    @XmlElement(name = "WALUTADIETA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String walutadieta;
    @XmlElement(name = "ODDELEGOWANIKRAJ", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String oddelegowanikraj;
    @XmlElement(name = "KURS_WALUTYDIETA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String kurswalutydieta;
    @XmlElement(name = "NOTOWANIE_WALUTY_ILE_DIETA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String notowaniewalutyiledieta;
    @XmlElement(name = "NOTOWANIE_WALUTY_ZA_ILE_DIETA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected String notowaniewalutyzailedieta;
    @XmlElement(name = "DATA_KURSU_DIETA", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    protected String datakursudieta;
    @XmlElement(name = "WYPLATY", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected WYPLATY wyplaty;

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
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYMBOL() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYMBOL(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the nazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAZWA() {
        return nazwa;
    }

    /**
     * Sets the value of the nazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAZWA(String value) {
        this.nazwa = value;
    }

    /**
     * Gets the value of the listaplacwydzialid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLISTAPLACWYDZIALID() {
        return listaplacwydzialid;
    }

    /**
     * Sets the value of the listaplacwydzialid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLISTAPLACWYDZIALID(String value) {
        this.listaplacwydzialid = value;
    }

    /**
     * Gets the value of the listaplacwydzial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLISTAPLACWYDZIAL() {
        return listaplacwydzial;
    }

    /**
     * Sets the value of the listaplacwydzial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLISTAPLACWYDZIAL(String value) {
        this.listaplacwydzial = value;
    }

    /**
     * Gets the value of the definicjadokumentuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFINICJADOKUMENTUID() {
        return definicjadokumentuid;
    }

    /**
     * Sets the value of the definicjadokumentuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFINICJADOKUMENTUID(String value) {
        this.definicjadokumentuid = value;
    }

    /**
     * Gets the value of the definicjadokumentusymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFINICJADOKUMENTUSYMBOL() {
        return definicjadokumentusymbol;
    }

    /**
     * Sets the value of the definicjadokumentusymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFINICJADOKUMENTUSYMBOL(String value) {
        this.definicjadokumentusymbol = value;
    }

    /**
     * Gets the value of the definicjadokumentunumeracja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFINICJADOKUMENTUNUMERACJA() {
        return definicjadokumentunumeracja;
    }

    /**
     * Sets the value of the definicjadokumentunumeracja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFINICJADOKUMENTUNUMERACJA(String value) {
        this.definicjadokumentunumeracja = value;
    }

    /**
     * Gets the value of the numerstring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERSTRING() {
        return numerstring;
    }

    /**
     * Sets the value of the numerstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERSTRING(String value) {
        this.numerstring = value;
    }

    /**
     * Gets the value of the numernr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERNR() {
        return numernr;
    }

    /**
     * Sets the value of the numernr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERNR(String value) {
        this.numernr = value;
    }

    /**
     * Gets the value of the numerpelny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERPELNY() {
        return numerpelny;
    }

    /**
     * Sets the value of the numerpelny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERPELNY(String value) {
        this.numerpelny = value;
    }

    /**
     * Gets the value of the datadokumentu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADOKUMENTU() {
        return datadokumentu;
    }

    /**
     * Sets the value of the datadokumentu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADOKUMENTU(String value) {
        this.datadokumentu = value;
    }

    /**
     * Gets the value of the rok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROK() {
        return rok;
    }

    /**
     * Sets the value of the rok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROK(String value) {
        this.rok = value;
    }

    /**
     * Gets the value of the miesiac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIESIAC() {
        return miesiac;
    }

    /**
     * Sets the value of the miesiac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIESIAC(String value) {
        this.miesiac = value;
    }

    /**
     * Gets the value of the dataod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAOD() {
        return dataod;
    }

    /**
     * Sets the value of the dataod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAOD(String value) {
        this.dataod = value;
    }

    /**
     * Gets the value of the datado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADO() {
        return datado;
    }

    /**
     * Sets the value of the datado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADO(String value) {
        this.datado = value;
    }

    /**
     * Gets the value of the datadanych property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADANYCH() {
        return datadanych;
    }

    /**
     * Sets the value of the datadanych property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADANYCH(String value) {
        this.datadanych = value;
    }

    /**
     * Gets the value of the tryb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRYB() {
        return tryb;
    }

    /**
     * Sets the value of the tryb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRYB(String value) {
        this.tryb = value;
    }

    /**
     * Gets the value of the kategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKATEGORIA() {
        return kategoria;
    }

    /**
     * Sets the value of the kategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKATEGORIA(String value) {
        this.kategoria = value;
    }

    /**
     * Gets the value of the miesiecywstecz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIESIECYWSTECZ() {
        return miesiecywstecz;
    }

    /**
     * Sets the value of the miesiecywstecz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIESIECYWSTECZ(String value) {
        this.miesiecywstecz = value;
    }

    /**
     * Gets the value of the oddelegowani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODDELEGOWANI() {
        return oddelegowani;
    }

    /**
     * Sets the value of the oddelegowani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODDELEGOWANI(String value) {
        this.oddelegowani = value;
    }

    /**
     * Gets the value of the tymczasowi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYMCZASOWI() {
        return tymczasowi;
    }

    /**
     * Sets the value of the tymczasowi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYMCZASOWI(String value) {
        this.tymczasowi = value;
    }

    /**
     * Gets the value of the waluta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWALUTA() {
        return waluta;
    }

    /**
     * Sets the value of the waluta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWALUTA(String value) {
        this.waluta = value;
    }

    /**
     * Gets the value of the kurswaluty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKURSWALUTY() {
        return kurswaluty;
    }

    /**
     * Sets the value of the kurswaluty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKURSWALUTY(String value) {
        this.kurswaluty = value;
    }

    /**
     * Gets the value of the notowaniewalutyile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTOWANIEWALUTYILE() {
        return notowaniewalutyile;
    }

    /**
     * Sets the value of the notowaniewalutyile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTOWANIEWALUTYILE(String value) {
        this.notowaniewalutyile = value;
    }

    /**
     * Gets the value of the notowaniewalutyzaile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTOWANIEWALUTYZAILE() {
        return notowaniewalutyzaile;
    }

    /**
     * Sets the value of the notowaniewalutyzaile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTOWANIEWALUTYZAILE(String value) {
        this.notowaniewalutyzaile = value;
    }

    /**
     * Gets the value of the datakursu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAKURSU() {
        return datakursu;
    }

    /**
     * Sets the value of the datakursu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAKURSU(String value) {
        this.datakursu = value;
    }

    /**
     * Gets the value of the zaksiegowana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZAKSIEGOWANA() {
        return zaksiegowana;
    }

    /**
     * Sets the value of the zaksiegowana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZAKSIEGOWANA(String value) {
        this.zaksiegowana = value;
    }

    /**
     * Gets the value of the zamknieta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZAMKNIETA() {
        return zamknieta;
    }

    /**
     * Sets the value of the zamknieta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZAMKNIETA(String value) {
        this.zamknieta = value;
    }

    /**
     * Gets the value of the walutadieta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWALUTADIETA() {
        return walutadieta;
    }

    /**
     * Sets the value of the walutadieta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWALUTADIETA(String value) {
        this.walutadieta = value;
    }

    /**
     * Gets the value of the oddelegowanikraj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODDELEGOWANIKRAJ() {
        return oddelegowanikraj;
    }

    /**
     * Sets the value of the oddelegowanikraj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODDELEGOWANIKRAJ(String value) {
        this.oddelegowanikraj = value;
    }

    /**
     * Gets the value of the kurswalutydieta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKURSWALUTYDIETA() {
        return kurswalutydieta;
    }

    /**
     * Sets the value of the kurswalutydieta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKURSWALUTYDIETA(String value) {
        this.kurswalutydieta = value;
    }

    /**
     * Gets the value of the notowaniewalutyiledieta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTOWANIEWALUTYILEDIETA() {
        return notowaniewalutyiledieta;
    }

    /**
     * Sets the value of the notowaniewalutyiledieta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTOWANIEWALUTYILEDIETA(String value) {
        this.notowaniewalutyiledieta = value;
    }

    /**
     * Gets the value of the notowaniewalutyzailedieta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTOWANIEWALUTYZAILEDIETA() {
        return notowaniewalutyzailedieta;
    }

    /**
     * Sets the value of the notowaniewalutyzailedieta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTOWANIEWALUTYZAILEDIETA(String value) {
        this.notowaniewalutyzailedieta = value;
    }

    /**
     * Gets the value of the datakursudieta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAKURSUDIETA() {
        return datakursudieta;
    }

    /**
     * Sets the value of the datakursudieta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAKURSUDIETA(String value) {
        this.datakursudieta = value;
    }

    /**
     * Gets the value of the wyplaty property.
     * 
     * @return
     *     possible object is
     *     {@link WYPLATY }
     *     
     */
    public WYPLATY getWYPLATY() {
        return wyplaty;
    }

    /**
     * Sets the value of the wyplaty property.
     * 
     * @param value
     *     allowed object is
     *     {@link WYPLATY }
     *     
     */
    public void setWYPLATY(WYPLATY value) {
        this.wyplaty = value;
    }

}
