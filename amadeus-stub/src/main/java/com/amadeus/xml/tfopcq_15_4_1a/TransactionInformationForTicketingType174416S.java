
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * to specify details relating to the transaction
 * 
 * <p>Java class for TransactionInformationForTicketingType_174416S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInformationForTicketingType_174416S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}TransactionInformationsType_245700C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInformationForTicketingType_174416S", propOrder = {
    "transactionDetails"
})
public class TransactionInformationForTicketingType174416S {

    @XmlElement(required = true)
    protected TransactionInformationsType245700C transactionDetails;

    /**
     * Gets the value of the transactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationsType245700C }
     *     
     */
    public TransactionInformationsType245700C getTransactionDetails() {
        return transactionDetails;
    }

    /**
     * Sets the value of the transactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationsType245700C }
     *     
     */
    public void setTransactionDetails(TransactionInformationsType245700C value) {
        this.transactionDetails = value;
    }

}
