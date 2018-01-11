
package com.amadeus.xml.queres_09_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a pertinent quantity.
 * 
 * <p>Java class for QuantityTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityDetails" type="{http://xml.amadeus.com/QUERES_09_1_IA}QuantityDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityTypeI", propOrder = {
    "quantityDetails"
})
public class QuantityTypeI {

    @XmlElement(required = true)
    protected QuantityDetailsTypeI quantityDetails;

    /**
     * Gets the value of the quantityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDetailsTypeI }
     *     
     */
    public QuantityDetailsTypeI getQuantityDetails() {
        return quantityDetails;
    }

    /**
     * Sets the value of the quantityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDetailsTypeI }
     *     
     */
    public void setQuantityDetails(QuantityDetailsTypeI value) {
        this.quantityDetails = value;
    }

}
