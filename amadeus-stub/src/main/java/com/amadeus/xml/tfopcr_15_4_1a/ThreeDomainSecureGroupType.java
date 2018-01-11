
package com.amadeus.xml.tfopcr_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey various 3DS data
 * 
 * <p>Java class for ThreeDomainSecureGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThreeDomainSecureGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationData" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CreditCardSecurityType"/>
 *         &lt;element name="acsURL" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CommunicationContactType_154690S" minOccurs="0"/>
 *         &lt;element name="tdsBlobData" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tdsBlbIdentifier" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ReferenceInfoType_154692S"/>
 *                   &lt;element name="tdsBlbData" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}BinaryDataType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreeDomainSecureGroupType", propOrder = {
    "authenticationData",
    "acsURL",
    "tdsBlobData"
})
public class ThreeDomainSecureGroupType {

    @XmlElement(required = true)
    protected CreditCardSecurityType authenticationData;
    protected CommunicationContactType154690S acsURL;
    protected List<ThreeDomainSecureGroupType.TdsBlobData> tdsBlobData;

    /**
     * Gets the value of the authenticationData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardSecurityType }
     *     
     */
    public CreditCardSecurityType getAuthenticationData() {
        return authenticationData;
    }

    /**
     * Sets the value of the authenticationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardSecurityType }
     *     
     */
    public void setAuthenticationData(CreditCardSecurityType value) {
        this.authenticationData = value;
    }

    /**
     * Gets the value of the acsURL property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactType154690S }
     *     
     */
    public CommunicationContactType154690S getAcsURL() {
        return acsURL;
    }

    /**
     * Sets the value of the acsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactType154690S }
     *     
     */
    public void setAcsURL(CommunicationContactType154690S value) {
        this.acsURL = value;
    }

    /**
     * Gets the value of the tdsBlobData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdsBlobData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTdsBlobData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThreeDomainSecureGroupType.TdsBlobData }
     * 
     * 
     */
    public List<ThreeDomainSecureGroupType.TdsBlobData> getTdsBlobData() {
        if (tdsBlobData == null) {
            tdsBlobData = new ArrayList<ThreeDomainSecureGroupType.TdsBlobData>();
        }
        return this.tdsBlobData;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tdsBlbIdentifier" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ReferenceInfoType_154692S"/>
     *         &lt;element name="tdsBlbData" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}BinaryDataType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tdsBlbIdentifier",
        "tdsBlbData"
    })
    public static class TdsBlobData {

        @XmlElement(required = true)
        protected ReferenceInfoType154692S tdsBlbIdentifier;
        @XmlElement(required = true)
        protected BinaryDataType tdsBlbData;

        /**
         * Gets the value of the tdsBlbIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType154692S }
         *     
         */
        public ReferenceInfoType154692S getTdsBlbIdentifier() {
            return tdsBlbIdentifier;
        }

        /**
         * Sets the value of the tdsBlbIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType154692S }
         *     
         */
        public void setTdsBlbIdentifier(ReferenceInfoType154692S value) {
            this.tdsBlbIdentifier = value;
        }

        /**
         * Gets the value of the tdsBlbData property.
         * 
         * @return
         *     possible object is
         *     {@link BinaryDataType }
         *     
         */
        public BinaryDataType getTdsBlbData() {
            return tdsBlbData;
        }

        /**
         * Sets the value of the tdsBlbData property.
         * 
         * @param value
         *     allowed object is
         *     {@link BinaryDataType }
         *     
         */
        public void setTdsBlbData(BinaryDataType value) {
            this.tdsBlbData = value;
        }

    }

}
