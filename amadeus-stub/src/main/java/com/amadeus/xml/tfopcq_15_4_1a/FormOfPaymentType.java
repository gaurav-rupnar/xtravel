
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing the form of payment.
 * 
 * <p>Java class for FormOfPaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formOfPayment" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}FormOfPaymentDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentType", propOrder = {
    "formOfPayment"
})
public class FormOfPaymentType {

    protected FormOfPaymentDetailsType formOfPayment;

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentDetailsType }
     *     
     */
    public FormOfPaymentDetailsType getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentDetailsType }
     *     
     */
    public void setFormOfPayment(FormOfPaymentDetailsType value) {
        this.formOfPayment = value;
    }

}
