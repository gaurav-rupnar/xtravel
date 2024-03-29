
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the point of sale details.
 * 
 * <p>Java class for OriginatorOfRequestDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorOfRequestDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveringSystem" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}SystemDetailsTypeI_2502C"/>
 *         &lt;element name="originIdentification" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}OriginatorIdentificationDetailsTypeI"/>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}LocationTypeI" minOccurs="0"/>
 *         &lt;element name="cascadingSystem" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}SystemDetailsTypeI_2502C" minOccurs="0"/>
 *         &lt;element name="originatorTypeCode" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="originDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}OriginatorDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="originator" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *         &lt;element name="communicationNumber" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="partyIdentification" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorOfRequestDetailsTypeI", propOrder = {
    "deliveringSystem",
    "originIdentification",
    "locationDetails",
    "cascadingSystem",
    "originatorTypeCode",
    "originDetails",
    "originator",
    "communicationNumber",
    "partyIdentification"
})
public class OriginatorOfRequestDetailsTypeI {

    @XmlElement(required = true)
    protected SystemDetailsTypeI2502C deliveringSystem;
    @XmlElement(required = true)
    protected OriginatorIdentificationDetailsTypeI originIdentification;
    protected LocationTypeI locationDetails;
    protected SystemDetailsTypeI2502C cascadingSystem;
    protected String originatorTypeCode;
    protected OriginatorDetailsTypeI originDetails;
    protected String originator;
    protected String communicationNumber;
    protected String partyIdentification;

    /**
     * Gets the value of the deliveringSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsTypeI2502C }
     *     
     */
    public SystemDetailsTypeI2502C getDeliveringSystem() {
        return deliveringSystem;
    }

    /**
     * Sets the value of the deliveringSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsTypeI2502C }
     *     
     */
    public void setDeliveringSystem(SystemDetailsTypeI2502C value) {
        this.deliveringSystem = value;
    }

    /**
     * Gets the value of the originIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public OriginatorIdentificationDetailsTypeI getOriginIdentification() {
        return originIdentification;
    }

    /**
     * Sets the value of the originIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public void setOriginIdentification(OriginatorIdentificationDetailsTypeI value) {
        this.originIdentification = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setLocationDetails(LocationTypeI value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the cascadingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsTypeI2502C }
     *     
     */
    public SystemDetailsTypeI2502C getCascadingSystem() {
        return cascadingSystem;
    }

    /**
     * Sets the value of the cascadingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsTypeI2502C }
     *     
     */
    public void setCascadingSystem(SystemDetailsTypeI2502C value) {
        this.cascadingSystem = value;
    }

    /**
     * Gets the value of the originatorTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorTypeCode() {
        return originatorTypeCode;
    }

    /**
     * Sets the value of the originatorTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorTypeCode(String value) {
        this.originatorTypeCode = value;
    }

    /**
     * Gets the value of the originDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorDetailsTypeI }
     *     
     */
    public OriginatorDetailsTypeI getOriginDetails() {
        return originDetails;
    }

    /**
     * Sets the value of the originDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorDetailsTypeI }
     *     
     */
    public void setOriginDetails(OriginatorDetailsTypeI value) {
        this.originDetails = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the communicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationNumber() {
        return communicationNumber;
    }

    /**
     * Sets the value of the communicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationNumber(String value) {
        this.communicationNumber = value;
    }

    /**
     * Gets the value of the partyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIdentification() {
        return partyIdentification;
    }

    /**
     * Sets the value of the partyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIdentification(String value) {
        this.partyIdentification = value;
    }

}
