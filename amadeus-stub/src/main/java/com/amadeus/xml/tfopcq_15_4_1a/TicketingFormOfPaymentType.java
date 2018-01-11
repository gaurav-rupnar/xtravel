
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing the form of payment and not found in the FOP segment
 * 
 * <p>Java class for TicketingFormOfPaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingFormOfPaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}FormOfPaymentInformationType_220881C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingFormOfPaymentType", propOrder = {
    "fopDetails"
})
public class TicketingFormOfPaymentType {

    protected FormOfPaymentInformationType220881C fopDetails;

    /**
     * Gets the value of the fopDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentInformationType220881C }
     *     
     */
    public FormOfPaymentInformationType220881C getFopDetails() {
        return fopDetails;
    }

    /**
     * Sets the value of the fopDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentInformationType220881C }
     *     
     */
    public void setFopDetails(FormOfPaymentInformationType220881C value) {
        this.fopDetails = value;
    }

}
