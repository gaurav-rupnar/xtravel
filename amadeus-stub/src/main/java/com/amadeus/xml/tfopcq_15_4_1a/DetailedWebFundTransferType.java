
package com.amadeus.xml.tfopcq_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all detailed payment data for web fund transfer
 * 
 * <p>Java class for DetailedWebFundTransferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedWebFundTransferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantSiteLanguage" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}LanguageBatchTypeU"/>
 *         &lt;element name="returnURL" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}CommunicationContactType_154707S" minOccurs="0"/>
 *         &lt;element name="redirectionData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="acquirerId" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ReferenceInfoType_154714S"/>
 *                   &lt;element name="issuerURLData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}CommunicationContactType_154713S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="consumerData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="consumerName" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}TravellerInformationType_154716S"/>
 *                   &lt;element name="consumerAccount" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ReferenceInfoType_154692S"/>
 *                   &lt;element name="consumerAddress" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AddressType_68661S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="transferStatus" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ResponseAnalysisDetailsType_154708S" minOccurs="0"/>
 *         &lt;element name="errorGroup" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}PaymentErrorGroupType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedWebFundTransferType", propOrder = {
    "merchantSiteLanguage",
    "returnURL",
    "redirectionData",
    "consumerData",
    "transferStatus",
    "errorGroup"
})
public class DetailedWebFundTransferType {

    @XmlElement(required = true)
    protected LanguageBatchTypeU merchantSiteLanguage;
    protected CommunicationContactType154707S returnURL;
    protected DetailedWebFundTransferType.RedirectionData redirectionData;
    protected DetailedWebFundTransferType.ConsumerData consumerData;
    protected ResponseAnalysisDetailsType154708S transferStatus;
    protected List<PaymentErrorGroupType> errorGroup;

    /**
     * Gets the value of the merchantSiteLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageBatchTypeU }
     *     
     */
    public LanguageBatchTypeU getMerchantSiteLanguage() {
        return merchantSiteLanguage;
    }

    /**
     * Sets the value of the merchantSiteLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageBatchTypeU }
     *     
     */
    public void setMerchantSiteLanguage(LanguageBatchTypeU value) {
        this.merchantSiteLanguage = value;
    }

    /**
     * Gets the value of the returnURL property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactType154707S }
     *     
     */
    public CommunicationContactType154707S getReturnURL() {
        return returnURL;
    }

    /**
     * Sets the value of the returnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactType154707S }
     *     
     */
    public void setReturnURL(CommunicationContactType154707S value) {
        this.returnURL = value;
    }

    /**
     * Gets the value of the redirectionData property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedWebFundTransferType.RedirectionData }
     *     
     */
    public DetailedWebFundTransferType.RedirectionData getRedirectionData() {
        return redirectionData;
    }

    /**
     * Sets the value of the redirectionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedWebFundTransferType.RedirectionData }
     *     
     */
    public void setRedirectionData(DetailedWebFundTransferType.RedirectionData value) {
        this.redirectionData = value;
    }

    /**
     * Gets the value of the consumerData property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedWebFundTransferType.ConsumerData }
     *     
     */
    public DetailedWebFundTransferType.ConsumerData getConsumerData() {
        return consumerData;
    }

    /**
     * Sets the value of the consumerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedWebFundTransferType.ConsumerData }
     *     
     */
    public void setConsumerData(DetailedWebFundTransferType.ConsumerData value) {
        this.consumerData = value;
    }

    /**
     * Gets the value of the transferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAnalysisDetailsType154708S }
     *     
     */
    public ResponseAnalysisDetailsType154708S getTransferStatus() {
        return transferStatus;
    }

    /**
     * Sets the value of the transferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAnalysisDetailsType154708S }
     *     
     */
    public void setTransferStatus(ResponseAnalysisDetailsType154708S value) {
        this.transferStatus = value;
    }

    /**
     * Gets the value of the errorGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentErrorGroupType }
     * 
     * 
     */
    public List<PaymentErrorGroupType> getErrorGroup() {
        if (errorGroup == null) {
            errorGroup = new ArrayList<PaymentErrorGroupType>();
        }
        return this.errorGroup;
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
     *         &lt;element name="consumerName" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}TravellerInformationType_154716S"/>
     *         &lt;element name="consumerAccount" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ReferenceInfoType_154692S"/>
     *         &lt;element name="consumerAddress" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AddressType_68661S"/>
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
        "consumerName",
        "consumerAccount",
        "consumerAddress"
    })
    public static class ConsumerData {

        @XmlElement(required = true)
        protected TravellerInformationType154716S consumerName;
        @XmlElement(required = true)
        protected ReferenceInfoType154692S consumerAccount;
        @XmlElement(required = true)
        protected AddressType68661S consumerAddress;

        /**
         * Gets the value of the consumerName property.
         * 
         * @return
         *     possible object is
         *     {@link TravellerInformationType154716S }
         *     
         */
        public TravellerInformationType154716S getConsumerName() {
            return consumerName;
        }

        /**
         * Sets the value of the consumerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravellerInformationType154716S }
         *     
         */
        public void setConsumerName(TravellerInformationType154716S value) {
            this.consumerName = value;
        }

        /**
         * Gets the value of the consumerAccount property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType154692S }
         *     
         */
        public ReferenceInfoType154692S getConsumerAccount() {
            return consumerAccount;
        }

        /**
         * Sets the value of the consumerAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType154692S }
         *     
         */
        public void setConsumerAccount(ReferenceInfoType154692S value) {
            this.consumerAccount = value;
        }

        /**
         * Gets the value of the consumerAddress property.
         * 
         * @return
         *     possible object is
         *     {@link AddressType68661S }
         *     
         */
        public AddressType68661S getConsumerAddress() {
            return consumerAddress;
        }

        /**
         * Sets the value of the consumerAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType68661S }
         *     
         */
        public void setConsumerAddress(AddressType68661S value) {
            this.consumerAddress = value;
        }

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
     *         &lt;element name="acquirerId" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ReferenceInfoType_154714S"/>
     *         &lt;element name="issuerURLData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}CommunicationContactType_154713S" minOccurs="0"/>
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
        "acquirerId",
        "issuerURLData"
    })
    public static class RedirectionData {

        @XmlElement(required = true)
        protected ReferenceInfoType154714S acquirerId;
        protected CommunicationContactType154713S issuerURLData;

        /**
         * Gets the value of the acquirerId property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType154714S }
         *     
         */
        public ReferenceInfoType154714S getAcquirerId() {
            return acquirerId;
        }

        /**
         * Sets the value of the acquirerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType154714S }
         *     
         */
        public void setAcquirerId(ReferenceInfoType154714S value) {
            this.acquirerId = value;
        }

        /**
         * Gets the value of the issuerURLData property.
         * 
         * @return
         *     possible object is
         *     {@link CommunicationContactType154713S }
         *     
         */
        public CommunicationContactType154713S getIssuerURLData() {
            return issuerURLData;
        }

        /**
         * Sets the value of the issuerURLData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommunicationContactType154713S }
         *     
         */
        public void setIssuerURLData(CommunicationContactType154713S value) {
            this.issuerURLData = value;
        }

    }

}
