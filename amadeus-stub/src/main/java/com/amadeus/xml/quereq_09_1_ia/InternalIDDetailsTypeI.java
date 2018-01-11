
package com.amadeus.xml.quereq_09_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an internal identification and the type of identification.
 * 
 * <p>Java class for InternalIDDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalIDDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inhouseId" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}AlphaNumericString_Length1To9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalIDDetailsTypeI", propOrder = {
    "inhouseId"
})
public class InternalIDDetailsTypeI {

    @XmlElement(required = true)
    protected String inhouseId;

    /**
     * Gets the value of the inhouseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhouseId() {
        return inhouseId;
    }

    /**
     * Sets the value of the inhouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhouseId(String value) {
        this.inhouseId = value;
    }

}
