
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler and personal details relating to the traveler
 * 
 * <p>Java class for TravellerInformationType_154716S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationType_154716S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paxDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}TravellerSurnameInformationType_220914C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationType_154716S", propOrder = {
    "paxDetails"
})
public class TravellerInformationType154716S {

    @XmlElement(required = true)
    protected TravellerSurnameInformationType220914C paxDetails;

    /**
     * Gets the value of the paxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationType220914C }
     *     
     */
    public TravellerSurnameInformationType220914C getPaxDetails() {
        return paxDetails;
    }

    /**
     * Sets the value of the paxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationType220914C }
     *     
     */
    public void setPaxDetails(TravellerSurnameInformationType220914C value) {
        this.paxDetails = value;
    }

}
