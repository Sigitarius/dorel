
package pl.sigitarius.dorel.model.pim;

import pl.sigitarius.dorel.xml.LocalDateTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;


/**
 * <p>Java class for item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Changed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PdmarticleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Brand" type="{}Brand" minOccurs="0"/>
 *         &lt;element name="Approximate-Age-Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commercial-product-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First-collection-year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEO-product-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEO-Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Article-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product-weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Approximate-Age-Text-ext" type="{}Approximate-Age-Text-ext" minOccurs="0"/>
 *         &lt;element name="Length-class-ext" type="{}Length-class-ext" minOccurs="0"/>
 *         &lt;element name="Intro-text-Consumer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Long-description-2nd-part" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAN13-barcode-Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERP-full-product-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Family" type="{}Family" minOccurs="0"/>
 *         &lt;element name="Line" type="{}Line" minOccurs="0"/>
 *         &lt;element name="Range" type="{}Range" minOccurs="0"/>
 *         &lt;element name="Feature-images-Website" type="{}Feature-images-Website" minOccurs="0"/>
 *         &lt;element name="Technical-drawings-Website" type="{}Technical-drawings-Website" minOccurs="0"/>
 *         &lt;element name="Gross-weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Net-weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Features-overview-short-text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Features-overview-long-text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USPs-overview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USP" type="{}USP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "id",
    "created",
    "changed",
    "parentID",
    "pdmarticleID",
    "label",
    "brand",
    "approximateAgeText",
    "commercialProductName",
    "firstCollectionYear",
    "seoProductName",
    "seoDescription",
    "articleNumber",
    "externalKey",
    "sku",
    "productWeight",
    "approximateAgeTextExt",
    "lengthClassExt",
    "introTextConsumer",
    "longDescription2NdPart",
    "ean13BarcodeText",
    "erpFullProductName",
    "family",
    "line",
    "range",
    "featureImagesWebsite",
    "mainCollectionImageWebsite",
    "mainProductImageWebsite",
    "technicalDrawingsWebsite",
    "grossWeight",
    "netWeight",
    "volume",
    "featuresOverviewShortText",
    "featuresOverviewLongText",
    "usPsOverview",
    "usp"
})
public class Item {

    @XmlElement(name = "ID", required = true)
    protected int id;
    @XmlElement(name = "Created")
    @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
    protected LocalDateTime created;
    @XmlElement(name = "Changed")
    @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
    protected LocalDateTime changed;
    @XmlElement(name = "ParentID")
    protected long parentID;
    @XmlElement(name = "PdmarticleID")
    protected long pdmarticleID;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "Brand")
    protected Brand brand;
    @XmlElement(name = "Approximate-Age-Text")
    protected String approximateAgeText;
    @XmlElement(name = "Commercial-product-name")
    protected String commercialProductName;
    @XmlElement(name = "First-collection-year")
    protected String firstCollectionYear;
    @XmlElement(name = "SEO-product-name")
    protected String seoProductName;
    @XmlElement(name = "SEO-Description")
    protected String seoDescription;
    @XmlElement(name = "Article-number")
    protected long articleNumber;
    @XmlElement(name = "ExternalKey")
    protected String externalKey;
    protected String sku;
    @XmlElement(name = "Product-weight")
    protected String productWeight;
    @XmlElement(name = "Approximate-Age-Text-ext")
    protected ApproximateAgeTextExt approximateAgeTextExt;
    @XmlElement(name = "Length-class-ext")
    protected LengthClassExt lengthClassExt;
    @XmlElement(name = "Intro-text-Consumer")
    protected String introTextConsumer;
    @XmlElement(name = "Long-description-2nd-part")
    protected String longDescription2NdPart;
    @XmlElement(name = "EAN13-barcode-Text")
    protected String ean13BarcodeText;
    @XmlElement(name = "ERP-full-product-name")
    protected String erpFullProductName;
    @XmlElement(name = "Family")
    protected Family family;
    @XmlElement(name = "Line")
    protected Line line;
    @XmlElement(name = "Range")
    protected Range range;
    @XmlElement(name = "Feature-images-Website")
    protected FeatureImagesWebsite featureImagesWebsite;
    @XmlElement(name = "Main-collection-image-website")
    protected String mainCollectionImageWebsite;
    @XmlElement(name = "Main-product-image-website")
    protected String mainProductImageWebsite;
    @XmlElement(name = "Technical-drawings-Website")
    protected TechnicalDrawingsWebsite technicalDrawingsWebsite;
    @XmlElement(name = "Gross-weight")
    protected String grossWeight;
    @XmlElement(name = "Net-weight")
    protected String netWeight;
    @XmlElement(name = "Volume")
    protected String volume;
    @XmlElement(name = "Features-overview-short-text")
    protected String featuresOverviewShortText;
    @XmlElement(name = "Features-overview-long-text")
    protected String featuresOverviewLongText;
    @XmlElement(name = "USPs-overview")
    protected String usPsOverview;
    @XmlElement(name = "USP")
    protected USP usp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(LocalDateTime value) {
        this.created = value;
    }

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanged(LocalDateTime value) {
        this.changed = value;
    }

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public long getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentID(long value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the pdmarticleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public long getPdmarticleID() {
        return pdmarticleID;
    }

    /**
     * Sets the value of the pdmarticleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdmarticleID(long value) {
        this.pdmarticleID = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link Brand }
     *     
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Brand }
     *     
     */
    public void setBrand(Brand value) {
        this.brand = value;
    }

    /**
     * Gets the value of the approximateAgeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateAgeText() {
        return approximateAgeText;
    }

    /**
     * Sets the value of the approximateAgeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateAgeText(String value) {
        this.approximateAgeText = value;
    }

    /**
     * Gets the value of the commercialProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialProductName() {
        return commercialProductName;
    }

    /**
     * Sets the value of the commercialProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialProductName(String value) {
        this.commercialProductName = value;
    }

    /**
     * Gets the value of the firstCollectionYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstCollectionYear() {
        return firstCollectionYear;
    }

    /**
     * Sets the value of the firstCollectionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstCollectionYear(String value) {
        this.firstCollectionYear = value;
    }

    /**
     * Gets the value of the seoProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEOProductName() {
        return seoProductName;
    }

    /**
     * Sets the value of the seoProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEOProductName(String value) {
        this.seoProductName = value;
    }

    /**
     * Gets the value of the seoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEODescription() {
        return seoDescription;
    }

    /**
     * Sets the value of the seoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEODescription(String value) {
        this.seoDescription = value;
    }

    /**
     * Gets the value of the articleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public long getArticleNumber() {
        return articleNumber;
    }

    /**
     * Sets the value of the articleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleNumber(long value) {
        this.articleNumber = value;
    }

    /**
     * Gets the value of the externalKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalKey() {
        return externalKey;
    }

    /**
     * Sets the value of the externalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalKey(String value) {
        this.externalKey = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the productWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductWeight() {
        return productWeight;
    }

    /**
     * Sets the value of the productWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductWeight(String value) {
        this.productWeight = value;
    }

    /**
     * Gets the value of the approximateAgeTextExt property.
     * 
     * @return
     *     possible object is
     *     {@link ApproximateAgeTextExt }
     *     
     */
    public ApproximateAgeTextExt getApproximateAgeTextExt() {
        return approximateAgeTextExt;
    }

    /**
     * Sets the value of the approximateAgeTextExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproximateAgeTextExt }
     *     
     */
    public void setApproximateAgeTextExt(ApproximateAgeTextExt value) {
        this.approximateAgeTextExt = value;
    }

    /**
     * Gets the value of the lengthClassExt property.
     * 
     * @return
     *     possible object is
     *     {@link LengthClassExt }
     *     
     */
    public LengthClassExt getLengthClassExt() {
        return lengthClassExt;
    }

    /**
     * Sets the value of the lengthClassExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthClassExt }
     *     
     */
    public void setLengthClassExt(LengthClassExt value) {
        this.lengthClassExt = value;
    }

    /**
     * Gets the value of the introTextConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroTextConsumer() {
        return introTextConsumer;
    }

    /**
     * Sets the value of the introTextConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroTextConsumer(String value) {
        this.introTextConsumer = value;
    }

    /**
     * Gets the value of the longDescription2NdPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription2NdPart() {
        return longDescription2NdPart;
    }

    /**
     * Sets the value of the longDescription2NdPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription2NdPart(String value) {
        this.longDescription2NdPart = value;
    }

    /**
     * Gets the value of the ean13BarcodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN13BarcodeText() {
        return ean13BarcodeText;
    }

    /**
     * Sets the value of the ean13BarcodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN13BarcodeText(String value) {
        this.ean13BarcodeText = value;
    }

    /**
     * Gets the value of the erpFullProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERPFullProductName() {
        return erpFullProductName;
    }

    /**
     * Sets the value of the erpFullProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERPFullProductName(String value) {
        this.erpFullProductName = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link Family }
     *     
     */
    public Family getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link Family }
     *     
     */
    public void setFamily(Family value) {
        this.family = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setLine(Line value) {
        this.line = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setRange(Range value) {
        this.range = value;
    }

    /**
     * Gets the value of the featureImagesWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureImagesWebsite }
     *     
     */
    public FeatureImagesWebsite getFeatureImagesWebsite() {
        return featureImagesWebsite;
    }

    /**
     * Sets the value of the featureImagesWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureImagesWebsite }
     *     
     */
    public void setFeatureImagesWebsite(FeatureImagesWebsite value) {
        this.featureImagesWebsite = value;
    }


    /**
     * Gets the value of the mainCollectionImageWebsite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMainCollectionImageWebsite() {
        return mainCollectionImageWebsite;
    }

    /**
     * Sets the value of the mainCollectionImageWebsite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMainCollectionImageWebsite(String value) {
        this.mainCollectionImageWebsite = value;
    }


    /**
     * Gets the value of the mainProductImageWebsite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMainProductImageWebsite() {
        return mainProductImageWebsite;
    }

    /**
     * Sets the value of the mainProductImageWebsite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMainProductImageWebsite(String value) {
        this.mainProductImageWebsite = value;
    }


    /**
     * Gets the value of the technicalDrawingsWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalDrawingsWebsite }
     *     
     */
    public TechnicalDrawingsWebsite getTechnicalDrawingsWebsite() {
        return technicalDrawingsWebsite;
    }

    /**
     * Sets the value of the technicalDrawingsWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalDrawingsWebsite }
     *     
     */
    public void setTechnicalDrawingsWebsite(TechnicalDrawingsWebsite value) {
        this.technicalDrawingsWebsite = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossWeight(String value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the netWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetWeight() {
        return netWeight;
    }

    /**
     * Sets the value of the netWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetWeight(String value) {
        this.netWeight = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the featuresOverviewShortText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturesOverviewShortText() {
        return featuresOverviewShortText;
    }

    /**
     * Sets the value of the featuresOverviewShortText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturesOverviewShortText(String value) {
        this.featuresOverviewShortText = value;
    }

    /**
     * Gets the value of the featuresOverviewLongText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturesOverviewLongText() {
        return featuresOverviewLongText;
    }

    /**
     * Sets the value of the featuresOverviewLongText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturesOverviewLongText(String value) {
        this.featuresOverviewLongText = value;
    }

    /**
     * Gets the value of the usPsOverview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPsOverview() {
        return usPsOverview;
    }

    /**
     * Sets the value of the usPsOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPsOverview(String value) {
        this.usPsOverview = value;
    }

    /**
     * Gets the value of the usp property.
     * 
     * @return
     *     possible object is
     *     {@link USP }
     *     
     */
    public USP getUSP() {
        return usp;
    }

    /**
     * Sets the value of the usp property.
     * 
     * @param value
     *     allowed object is
     *     {@link USP }
     *     
     */
    public void setUSP(USP value) {
        this.usp = value;
    }

}
