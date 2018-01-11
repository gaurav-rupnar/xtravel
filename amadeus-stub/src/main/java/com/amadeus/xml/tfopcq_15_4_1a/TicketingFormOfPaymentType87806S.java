
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing the form of payment and not found in the FOP segment
 * 
 * <p>Java class for TicketingFormOfPaymentType_87806S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingFormOfPaymentType_87806S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}FormOfPaymentInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingFormOfPaymentType_87806S", propOrder = {
    "fopDetails"
})
public class TicketingFormOfPaymentType87806S {

    protected FormOfPaymentInformationType fopDetails;

    /**
     * Gets the value of the fopDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentInformationType }
     *     
     */
    public FormOfPaymentInformationType getFopDetails() {
        return fopDetails;
    }

    /**
     * Sets the value of the fopDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentInformationType }
     *     
     */
    public void setFopDetails(FormOfPaymentInformationType value) {
        this.fopDetails = value;
    }

}
