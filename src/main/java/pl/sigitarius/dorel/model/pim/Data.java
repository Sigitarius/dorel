
package pl.sigitarius.dorel.model.pim;

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
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Changed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PdmarticleID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Brand">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Approximate-Age-Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Commercial-product-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="First-collection-year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SEO-product-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SEO-Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Article-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExternalKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Product-weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Approximate-Age-Text-ext">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Length-class-ext">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Intro-text-Consumer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Long-description-2nd-part" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EAN13-barcode-Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ERP-full-product-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Family">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Line">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Range">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Feature-images-Website">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Technical-drawings-Website">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Gross-weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Net-weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Features-overview-short-text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Features-overview-long-text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="USPs-overview" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="USP">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="USP-Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="USP-Long-Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="USP-Image-Website" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "item"
})
@XmlRootElement(name = "data")
public class Data {

    protected List<Data.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Data.Item }
     * 
     * 
     */
    public List<Data.Item> getItem() {
        if (item == null) {
            item = new ArrayList<>();
        }
        return this.item;
    }


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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Changed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PdmarticleID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Brand">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Approximate-Age-Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Commercial-product-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="First-collection-year" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SEO-product-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SEO-Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Article-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ExternalKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Product-weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Approximate-Age-Text-ext">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Length-class-ext">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Intro-text-Consumer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Long-description-2nd-part" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EAN13-barcode-Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ERP-full-product-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Family">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Line">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Range">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Feature-images-Website">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Technical-drawings-Website">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Gross-weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Net-weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Features-overview-short-text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Features-overview-long-text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="USPs-overview" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="USP">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="USP-Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="USP-Long-Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="USP-Image-Website" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "technicalDrawingsWebsite",
        "grossWeight",
        "netWeight",
        "volume",
        "featuresOverviewShortText",
        "featuresOverviewLongText",
        "usPsOverview",
        "usp"
    })
    public static class Item {

        @XmlElement(name = "ID", required = true)
        protected String id;
        @XmlElement(name = "Created", required = true)
        protected String created;
        @XmlElement(name = "Changed", required = true)
        protected String changed;
        @XmlElement(name = "ParentID", required = true)
        protected String parentID;
        @XmlElement(name = "PdmarticleID", required = true)
        protected String pdmarticleID;
        @XmlElement(name = "Label", required = true)
        protected String label;
        @XmlElement(name = "Brand", required = true)
        protected Data.Item.Brand brand;
        @XmlElement(name = "Approximate-Age-Text", required = true)
        protected String approximateAgeText;
        @XmlElement(name = "Commercial-product-name", required = true)
        protected String commercialProductName;
        @XmlElement(name = "First-collection-year", required = true)
        protected String firstCollectionYear;
        @XmlElement(name = "SEO-product-name", required = true)
        protected String seoProductName;
        @XmlElement(name = "SEO-Description", required = true)
        protected String seoDescription;
        @XmlElement(name = "Article-number", required = true)
        protected String articleNumber;
        @XmlElement(name = "ExternalKey", required = true)
        protected String externalKey;
        @XmlElement(required = true)
        protected String sku;
        @XmlElement(name = "Product-weight", required = true)
        protected String productWeight;
        @XmlElement(name = "Approximate-Age-Text-ext", required = true)
        protected Data.Item.ApproximateAgeTextExt approximateAgeTextExt;
        @XmlElement(name = "Length-class-ext", required = true)
        protected Data.Item.LengthClassExt lengthClassExt;
        @XmlElement(name = "Intro-text-Consumer", required = true)
        protected String introTextConsumer;
        @XmlElement(name = "Long-description-2nd-part", required = true)
        protected String longDescription2NdPart;
        @XmlElement(name = "EAN13-barcode-Text", required = true)
        protected String ean13BarcodeText;
        @XmlElement(name = "ERP-full-product-name", required = true)
        protected String erpFullProductName;
        @XmlElement(name = "Family", required = true)
        protected Data.Item.Family family;
        @XmlElement(name = "Line", required = true)
        protected Data.Item.Line line;
        @XmlElement(name = "Range", required = true)
        protected Data.Item.Range range;
        @XmlElement(name = "Feature-images-Website", required = true)
        protected Data.Item.FeatureImagesWebsite featureImagesWebsite;
        @XmlElement(name = "Technical-drawings-Website", required = true)
        protected Data.Item.TechnicalDrawingsWebsite technicalDrawingsWebsite;
        @XmlElement(name = "Gross-weight", required = true)
        protected String grossWeight;
        @XmlElement(name = "Net-weight", required = true)
        protected String netWeight;
        @XmlElement(name = "Volume", required = true)
        protected String volume;
        @XmlElement(name = "Features-overview-short-text", required = true)
        protected String featuresOverviewShortText;
        @XmlElement(name = "Features-overview-long-text", required = true)
        protected String featuresOverviewLongText;
        @XmlElement(name = "USPs-overview", required = true)
        protected String usPsOverview;
        @XmlElement(name = "USP", required = true)
        protected Data.Item.USP usp;

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
         * Gets the value of the created property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreated() {
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
        public void setCreated(String value) {
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
        public String getChanged() {
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
        public void setChanged(String value) {
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
        public String getParentID() {
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
        public void setParentID(String value) {
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
        public String getPdmarticleID() {
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
        public void setPdmarticleID(String value) {
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
         *     {@link Data.Item.Brand }
         *     
         */
        public Data.Item.Brand getBrand() {
            return brand;
        }

        /**
         * Sets the value of the brand property.
         * 
         * @param value
         *     allowed object is
         *     {@link Data.Item.Brand }
         *     
         */
        public void setBrand(Data.Item.Brand value) {
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
        public String getArticleNumber() {
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
        public void setArticleNumber(String value) {
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
         *     {@link Data.Item.ApproximateAgeTextExt }
         *     
         */
        public Data.Item.ApproximateAgeTextExt getApproximateAgeTextExt() {
            return approximateAgeTextExt;
        }

        /**
         * Sets the value of the approximateAgeTextExt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Data.Item.ApproximateAgeTextExt }
         *     
         */
        public void setApproximateAgeTextExt(Data.Item.ApproximateAgeTextExt value) {
            this.approximateAgeTextExt = value;
        }

        /**
         * Gets the value of the lengthClassExt property.
         * 
         * @return
         *     possible object is
         *     {@link Data.Item.LengthClassExt }
         *     
         */
        public Data.Item.LengthClassExt getLengthClassExt() {
            return lengthClassExt;
        }

        /**
         * Sets the value of the lengthClassExt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Data.Item.LengthClassExt }
         *     
         */
        public void setLengthClassExt(Data.Item.LengthClassExt value) {
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
         *     {@link Data.Item.Family }
         *     
         */
        public Data.Item.Family getFamily() {
            return family;
        }

        /**
         * Sets the value of the family property.
         * 
         * @param value
         *     allowed object is
         *     {@link Data.Item.Family }
         *     
         */
        public void setFamily(Data.Item.Family value) {
            this.family = value;
        }

        /**
         * Gets the value of the line property.
         * 
         * @return
         *     possible object is
         *     {@link Data.Item.Line }
         *     
         */
        public Data.Item.Line getLine() {
            return line;
        }

        /**
         * Sets the value of the line property.
         * 
         * @param value
         *     allowed object is
         *     {@link Data.Item.Line }
         *     
         */
        public void setLine(Data.Item.Line value) {
            this.line = value;
        }

        /**
         * Gets the value of the range property.
         * 
         * @return
         *     possible object is
         *     {@link Data.Item.Range }
         *     
         */
        public Data.Item.Range getRange() {
            return range;
        }

        /**
         * Sets the value of the range property.
         * 
         * @param value
         *     allowed object is
         *     {@link Data.Item.Range }
         *     
         */
        public void setRange(Data.Item.Range value) {
            this.range = value;
        }

        /**
         * Gets the value of the featureImagesWebsite property.
         * 
         * @return
         *     possible object is
         *     {@link Data.Item.FeatureImagesWebsite }
         *     
         */
        public Data.Item.FeatureImagesWebsite getFeatureImagesWebsite() {
            return featureImagesWebsite;
        }

        /**
         * Sets the value of the featureImagesWebsite property.
         * 
         * @param value
         *     allowed object is
         *     {@link Data.Item.FeatureImagesWebsite }
         *     
         */
        public void setFeatureImagesWebsite(Data.Item.FeatureImagesWebsite value) {
            this.featureImagesWebsite = value;
        }

        /**
         * Gets the value of the technicalDrawingsWebsite property.
         * 
         * @return
         *     possible object is
         *     {@link Data.Item.TechnicalDrawingsWebsite }
         *     
         */
        public Data.Item.TechnicalDrawingsWebsite getTechnicalDrawingsWebsite() {
            return technicalDrawingsWebsite;
        }

        /**
         * Sets the value of the technicalDrawingsWebsite property.
         * 
         * @param value
         *     allowed object is
         *     {@link Data.Item.TechnicalDrawingsWebsite }
         *     
         */
        public void setTechnicalDrawingsWebsite(Data.Item.TechnicalDrawingsWebsite value) {
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
         *     {@link Data.Item.USP }
         *     
         */
        public Data.Item.USP getUSP() {
            return usp;
        }

        /**
         * Sets the value of the usp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Data.Item.USP }
         *     
         */
        public void setUSP(Data.Item.USP value) {
            this.usp = value;
        }


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
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
                "approximateAgeTextExtItem"
        })
        public static class ApproximateAgeTextExt {

            @XmlElement(required = true)
            protected ApproximateAgeTextExtItem approximateAgeTextExtItem;

            /**
             * Gets the value of the item property.
             * 
             * @return
             *     possible object is
             *     {@link ApproximateAgeTextExtItem }
             *     
             */
            public ApproximateAgeTextExtItem getItem() {
                return approximateAgeTextExtItem;
            }

            /**
             * Sets the value of the item property.
             * 
             * @param value
             *     allowed object is
             *     {@link ApproximateAgeTextExtItem }
             *     
             */
            public void setItem(ApproximateAgeTextExtItem value) {
                this.approximateAgeTextExtItem = value;
            }


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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id",
                "label"
            })
            public static class ApproximateAgeTextExtItem {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "LABEL", required = true)
                protected String label;

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
                 * Gets the value of the label property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLABEL() {
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
                public void setLABEL(String value) {
                    this.label = value;
                }

            }

        }


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
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
                "brandItem"
        })
        public static class Brand {

            @XmlElement(required = true)
            protected BrandItem brandItem;

            /**
             * Gets the value of the item property.
             * 
             * @return
             *     possible object is
             *     {@link BrandItem }
             *     
             */
            public BrandItem getItem() {
                return brandItem;
            }

            /**
             * Sets the value of the item property.
             * 
             * @param value
             *     allowed object is
             *     {@link BrandItem }
             *     
             */
            public void setItem(BrandItem value) {
                this.brandItem = value;
            }


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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id",
                "label"
            })
            public static class BrandItem {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "LABEL", required = true)
                protected String label;

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
                 * Gets the value of the label property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLABEL() {
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
                public void setLABEL(String value) {
                    this.label = value;
                }

            }

        }


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
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
                "familyItem"
        })
        public static class Family {

            @XmlElement(required = true)
            protected FamilyItem familyItem;

            /**
             * Gets the value of the item property.
             * 
             * @return
             *     possible object is
             *     {@link FamilyItem }
             *     
             */
            public FamilyItem getItem() {
                return familyItem;
            }

            /**
             * Sets the value of the item property.
             * 
             * @param value
             *     allowed object is
             *     {@link FamilyItem }
             *     
             */
            public void setItem(FamilyItem value) {
                this.familyItem = value;
            }


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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id",
                "label"
            })
            public static class FamilyItem {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "LABEL", required = true)
                protected String label;

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
                 * Gets the value of the label property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLABEL() {
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
                public void setLABEL(String value) {
                    this.label = value;
                }

            }

        }


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
         *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
                "featureImagesWebsiteItem"
        })
        public static class FeatureImagesWebsite {

            protected List<FeatureImagesWebsiteItem> featureImagesWebsiteItem;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FeatureImagesWebsiteItem }
             * 
             * 
             */
            public List<FeatureImagesWebsiteItem> getItem() {
                if (featureImagesWebsiteItem == null) {
                    featureImagesWebsiteItem = new ArrayList<FeatureImagesWebsiteItem>();
                }
                return this.featureImagesWebsiteItem;
            }


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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id",
                "path"
            })
            public static class FeatureImagesWebsiteItem {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "PATH", required = true)
                protected String path;

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
                 * Gets the value of the path property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPATH() {
                    return path;
                }

                /**
                 * Sets the value of the path property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPATH(String value) {
                    this.path = value;
                }

            }

        }


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
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
                "lengthClassExtItem"
        })
        public static class LengthClassExt {

            @XmlElement(required = true)
            protected LengthClassExtItem lengthClassExtItem;

            /**
             * Gets the value of the item property.
             * 
             * @return
             *     possible object is
             *     {@link LengthClassExtItem }
             *     
             */
            public LengthClassExtItem getItem() {
                return lengthClassExtItem;
            }

            /**
             * Sets the value of the item property.
             * 
             * @param value
             *     allowed object is
             *     {@link LengthClassExtItem }
             *     
             */
            public void setItem(LengthClassExtItem value) {
                this.lengthClassExtItem = value;
            }


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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id",
                "label"
            })
            public static class LengthClassExtItem {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "LABEL", required = true)
                protected String label;

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
                 * Gets the value of the label property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLABEL() {
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
                public void setLABEL(String value) {
                    this.label = value;
                }

            }

        }


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
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
                "lineItem"
        })
        public static class Line {

            @XmlElement(required = true)
            protected LineItem lineItem;

            /**
             * Gets the value of the item property.
             * 
             * @return
             *     possible object is
             *     {@link LineItem }
             *     
             */
            public LineItem getItem() {
                return lineItem;
            }

            /**
             * Sets the value of the item property.
             * 
             * @param value
             *     allowed object is
             *     {@link LineItem }
             *     
             */
            public void setItem(LineItem value) {
                this.lineItem = value;
            }


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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id",
                "label"
            })
            public static class LineItem {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "LABEL", required = true)
                protected String label;

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
                 * Gets the value of the label property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLABEL() {
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
                public void setLABEL(String value) {
                    this.label = value;
                }

            }

        }


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
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
                "rangeItem"
        })
        public static class Range {

            @XmlElement(required = true)
            protected RangeItem rangeItem;

            /**
             * Gets the value of the item property.
             * 
             * @return
             *     possible object is
             *     {@link RangeItem }
             *     
             */
            public RangeItem getItem() {
                return rangeItem;
            }

            /**
             * Sets the value of the item property.
             * 
             * @param value
             *     allowed object is
             *     {@link RangeItem }
             *     
             */
            public void setItem(RangeItem value) {
                this.rangeItem = value;
            }


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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id",
                "label"
            })
            public static class RangeItem {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "LABEL", required = true)
                protected String label;

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
                 * Gets the value of the label property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLABEL() {
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
                public void setLABEL(String value) {
                    this.label = value;
                }

            }

        }


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
         *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
                "technicalDrawingsWebsiteItem"
        })
        public static class TechnicalDrawingsWebsite {

            protected List<TechnicalDrawingsWebsiteItem> technicalDrawingsWebsiteItem;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TechnicalDrawingsWebsiteItem }
             * 
             * 
             */
            public List<TechnicalDrawingsWebsiteItem> getItem() {
                if (technicalDrawingsWebsiteItem == null) {
                    technicalDrawingsWebsiteItem = new ArrayList<TechnicalDrawingsWebsiteItem>();
                }
                return this.technicalDrawingsWebsiteItem;
            }


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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id",
                "path"
            })
            public static class TechnicalDrawingsWebsiteItem {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "PATH", required = true)
                protected String path;

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
                 * Gets the value of the path property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPATH() {
                    return path;
                }

                /**
                 * Sets the value of the path property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPATH(String value) {
                    this.path = value;
                }

            }

        }


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
         *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="USP-Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="USP-Long-Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="USP-Image-Website" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
                "USPItem"
        })
        public static class USP {

            protected List<USPItem> USPItem;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link USPItem }
             * 
             * 
             */
            public List<USPItem> getItem() {
                if (USPItem == null) {
                    USPItem = new ArrayList<USPItem>();
                }
                return this.USPItem;
            }


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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="USP-Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="USP-Long-Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="USP-Image-Website" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "id",
                "uspTitle",
                "uspLongText",
                "uspImageWebsite"
            })
            public static class USPItem {

                @XmlElement(name = "ID", required = true)
                protected String id;
                @XmlElement(name = "USP-Title", required = true)
                protected String uspTitle;
                @XmlElement(name = "USP-Long-Text", required = true)
                protected String uspLongText;
                @XmlElement(name = "USP-Image-Website", required = true)
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

        }

    }

}
