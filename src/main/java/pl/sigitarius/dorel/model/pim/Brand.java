
package pl.sigitarius.dorel.model.pim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Brand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Brand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{}labelItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Brand", propOrder = {
    "item"
})
public class Brand {

    @XmlElement(required = true)
    protected LabelItem item;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link LabelItem }
     *     
     */
    public LabelItem getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelItem }
     *     
     */
    public void setItem(LabelItem value) {
        this.item = value;
    }

}
