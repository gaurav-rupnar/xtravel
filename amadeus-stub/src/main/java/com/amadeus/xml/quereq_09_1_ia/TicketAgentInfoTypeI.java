
package com.amadeus.xml.quereq_09_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey travel agent and system identification.
 * 
 * <p>Java class for TicketAgentInfoTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketAgentInfoTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internalIdDetails" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}InternalIDDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketAgentInfoTypeI", propOrder = {
    "internalIdDetails"
})
public class TicketAgentInfoTypeI {

    protected InternalIDDetailsTypeI internalIdDetails;

    /**
     * Gets the value of the internalIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InternalIDDetailsTypeI }
     *     
     */
    public InternalIDDetailsTypeI getInternalIdDetails() {
        return internalIdDetails;
    }

    /**
     * Sets the value of the internalIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalIDDetailsTypeI }
     *     
     */
    public void setInternalIdDetails(InternalIDDetailsTypeI value) {
        this.internalIdDetails = value;
    }

}
