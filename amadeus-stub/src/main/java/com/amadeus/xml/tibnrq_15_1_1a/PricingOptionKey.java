
package com.amadeus.xml.tibnrq_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingOptionKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingOptionKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingOptionKey" type="{http://xml.amadeus.com/TIBNRQ_15_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingOptionKey", propOrder = {
    "pricingOptionKey"
})
public class PricingOptionKey {

    @XmlElement(required = true)
    protected String pricingOptionKey;

    /**
     * Gets the value of the pricingOptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingOptionKey() {
        return pricingOptionKey;
    }

    /**
     * Sets the value of the pricingOptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingOptionKey(String value) {
        this.pricingOptionKey = value;
    }

}
