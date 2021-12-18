
package pl.sigitarius.dorel.model.listaplac;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.comarch.pl/cdn/optima/offline}LISTY_PLAC"/>
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
    "listyplac"
})
@XmlRootElement(name = "ROOT", namespace = "http://www.comarch.pl/cdn/optima/offline")
public class ROOT {

    @XmlElement(name = "LISTY_PLAC", namespace = "http://www.comarch.pl/cdn/optima/offline", required = true)
    protected LISTYPLAC listyplac;

    /**
     * Gets the value of the listyplac property.
     * 
     * @return
     *     possible object is
     *     {@link LISTYPLAC }
     *     
     */
    public LISTYPLAC getLISTYPLAC() {
        return listyplac;
    }

    /**
     * Sets the value of the listyplac property.
     * 
     * @param value
     *     allowed object is
     *     {@link LISTYPLAC }
     *     
     */
    public void setLISTYPLAC(LISTYPLAC value) {
        this.listyplac = value;
    }

}
