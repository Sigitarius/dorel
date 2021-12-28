
package pl.sigitarius.dorel.model.pim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uspItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uspItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USP-Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USP-Long-Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USP-Image-Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uspItem", propOrder = {
    "id",
    "uspTitle",
    "uspLongText",
    "uspImageWebsite"
})
public class UspItem {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "USP-Title")
    protected String uspTitle;
    @XmlElement(name = "USP-Long-Text")
    protected String uspLongText;
    @XmlElement(name = "USP-Image-Website")
    protected String uspImageWebsite;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the uspTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPTitle() {
        return uspTitle;
    }

    /**
     * Sets the value of the uspTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPTitle(String value) {
        this.uspTitle = value;
    }

    /**
     * Gets the value of the uspLongText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPLongText() {
        return uspLongText;
    }

    /**
     * Sets the value of the uspLongText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPLongText(String value) {
        this.uspLongText = value;
    }

    /**
     * Gets the value of the uspImageWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSPImageWebsite() {
        return uspImageWebsite;
    }

    /**
     * Sets the value of the uspImageWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSPImageWebsite(String value) {
        this.uspImageWebsite = value;
    }

}
