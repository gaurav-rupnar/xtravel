
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler and personal details relating to the traveler
 * 
 * <p>Java class for TravellerInformationType_154732S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationType_154732S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccHolderNameDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravellerSurnameInformationType_220914C"/>
 *         &lt;element name="otherNameDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravellerDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationType_154732S", propOrder = {
    "ccHolderNameDetails",
    "otherNameDetails"
})
public class TravellerInformationType154732S {

    @XmlElement(required = true)
    protected TravellerSurnameInformationType220914C ccHolderNameDetails;
    protected TravellerDetailsTypeI otherNameDetails;

    /**
     * Gets the value of the ccHolderNameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationType220914C }
     *     
     */
    public TravellerSurnameInformationType220914C getCcHolderNameDetails() {
        return ccHolderNameDetails;
    }

    /**
     * Sets the value of the ccHolderNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationType220914C }
     *     
     */
    public void setCcHolderNameDetails(TravellerSurnameInformationType220914C value) {
        this.ccHolderNameDetails = value;
    }

    /**
     * Gets the value of the otherNameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerDetailsTypeI }
     *     
     */
    public TravellerDetailsTypeI getOtherNameDetails() {
        return otherNameDetails;
    }

    /**
     * Sets the value of the otherNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerDetailsTypeI }
     *     
     */
    public void setOtherNameDetails(TravellerDetailsTypeI value) {
        this.otherNameDetails = value;
    }

}
