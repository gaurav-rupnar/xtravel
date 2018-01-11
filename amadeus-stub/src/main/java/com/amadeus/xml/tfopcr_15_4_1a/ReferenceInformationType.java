
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to convey the passenger references.
 * 
 * <p>Java class for ReferenceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerReference" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ReferencingDetailsType_260700C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformationType", propOrder = {
    "passengerReference"
})
public class ReferenceInformationType {

    @XmlElement(required = true)
    protected ReferencingDetailsType260700C passengerReference;

    /**
     * Gets the value of the passengerReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsType260700C }
     *     
     */
    public ReferencingDetailsType260700C getPassengerReference() {
        return passengerReference;
    }

    /**
     * Sets the value of the passengerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsType260700C }
     *     
     */
    public void setPassengerReference(ReferencingDetailsType260700C value) {
        this.passengerReference = value;
    }

}
