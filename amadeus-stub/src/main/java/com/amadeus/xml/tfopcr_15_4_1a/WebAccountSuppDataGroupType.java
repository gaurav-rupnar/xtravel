
package com.amadeus.xml.tfopcr_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey Web Account detailed payment data
 * 
 * <p>Java class for WebAccountSuppDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebAccountSuppDataGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pspIndicator" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StatusType_68646S"/>
 *         &lt;element name="uatpCard" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CreditCardDataType" minOccurs="0"/>
 *         &lt;element name="paypalParameters" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StatusType_84988S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="pspUrl" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CommunicationContactType_154699S" minOccurs="0"/>
 *         &lt;element name="shippingAddress" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AddressType_68644S" minOccurs="0"/>
 *         &lt;element name="payerName" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}TravellerInformationType_154701S" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ReferenceInfoType_154700S" minOccurs="0"/>
 *         &lt;element name="merchantSiteDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countryData" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CountryInformationTypeU"/>
 *                   &lt;element name="cppPspColor" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FreeTextInformationType_154703S" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="urls" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CommunicationContactType_154699S" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="errorDescription" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="severityCodeType" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ResponseAnalysisDetailsType"/>
 *                   &lt;element name="paymentError" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ErrorGroupType_174787G" maxOccurs="2" minOccurs="0"/>
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
@XmlType(name = "WebAccountSuppDataGroupType", propOrder = {
    "pspIndicator",
    "uatpCard",
    "paypalParameters",
    "pspUrl",
    "shippingAddress",
    "payerName",
    "accountNumber",
    "merchantSiteDetails",
    "errorDescription"
})
public class WebAccountSuppDataGroupType {

    @XmlElement(required = true)
    protected StatusType68646S pspIndicator;
    protected CreditCardDataType uatpCard;
    protected List<StatusType84988S> paypalParameters;
    protected CommunicationContactType154699S pspUrl;
    protected AddressType68644S shippingAddress;
    protected TravellerInformationType154701S payerName;
    protected ReferenceInfoType154700S accountNumber;
    protected WebAccountSuppDataGroupType.MerchantSiteDetails merchantSiteDetails;
    protected List<WebAccountSuppDataGroupType.ErrorDescription> errorDescription;

    /**
     * Gets the value of the pspIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType68646S }
     *     
     */
    public StatusType68646S getPspIndicator() {
        return pspIndicator;
    }

    /**
     * Sets the value of the pspIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType68646S }
     *     
     */
    public void setPspIndicator(StatusType68646S value) {
        this.pspIndicator = value;
    }

    /**
     * Gets the value of the uatpCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDataType }
     *     
     */
    public CreditCardDataType getUatpCard() {
        return uatpCard;
    }

    /**
     * Sets the value of the uatpCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDataType }
     *     
     */
    public void setUatpCard(CreditCardDataType value) {
        this.uatpCard = value;
    }

    /**
     * Gets the value of the paypalParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paypalParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaypalParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType84988S }
     * 
     * 
     */
    public List<StatusType84988S> getPaypalParameters() {
        if (paypalParameters == null) {
            paypalParameters = new ArrayList<StatusType84988S>();
        }
        return this.paypalParameters;
    }

    /**
     * Gets the value of the pspUrl property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactType154699S }
     *     
     */
    public CommunicationContactType154699S getPspUrl() {
        return pspUrl;
    }

    /**
     * Sets the value of the pspUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactType154699S }
     *     
     */
    public void setPspUrl(CommunicationContactType154699S value) {
        this.pspUrl = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType68644S }
     *     
     */
    public AddressType68644S getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType68644S }
     *     
     */
    public void setShippingAddress(AddressType68644S value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInformationType154701S }
     *     
     */
    public TravellerInformationType154701S getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInformationType154701S }
     *     
     */
    public void setPayerName(TravellerInformationType154701S value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType154700S }
     *     
     */
    public ReferenceInfoType154700S getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType154700S }
     *     
     */
    public void setAccountNumber(ReferenceInfoType154700S value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the merchantSiteDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WebAccountSuppDataGroupType.MerchantSiteDetails }
     *     
     */
    public WebAccountSuppDataGroupType.MerchantSiteDetails getMerchantSiteDetails() {
        return merchantSiteDetails;
    }

    /**
     * Sets the value of the merchantSiteDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAccountSuppDataGroupType.MerchantSiteDetails }
     *     
     */
    public void setMerchantSiteDetails(WebAccountSuppDataGroupType.MerchantSiteDetails value) {
        this.merchantSiteDetails = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebAccountSuppDataGroupType.ErrorDescription }
     * 
     * 
     */
    public List<WebAccountSuppDataGroupType.ErrorDescription> getErrorDescription() {
        if (errorDescription == null) {
            errorDescription = new ArrayList<WebAccountSuppDataGroupType.ErrorDescription>();
        }
        return this.errorDescription;
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
     *         &lt;element name="severityCodeType" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ResponseAnalysisDetailsType"/>
     *         &lt;element name="paymentError" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ErrorGroupType_174787G" maxOccurs="2" minOccurs="0"/>
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
        "severityCodeType",
        "paymentError"
    })
    public static class ErrorDescription {

        @XmlElement(required = true)
        protected ResponseAnalysisDetailsType severityCodeType;
        protected List<ErrorGroupType174787G> paymentError;

        /**
         * Gets the value of the severityCodeType property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseAnalysisDetailsType }
         *     
         */
        public ResponseAnalysisDetailsType getSeverityCodeType() {
            return severityCodeType;
        }

        /**
         * Sets the value of the severityCodeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseAnalysisDetailsType }
         *     
         */
        public void setSeverityCodeType(ResponseAnalysisDetailsType value) {
            this.severityCodeType = value;
        }

        /**
         * Gets the value of the paymentError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ErrorGroupType174787G }
         * 
         * 
         */
        public List<ErrorGroupType174787G> getPaymentError() {
            if (paymentError == null) {
                paymentError = new ArrayList<ErrorGroupType174787G>();
            }
            return this.paymentError;
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
     *         &lt;element name="countryData" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CountryInformationTypeU"/>
     *         &lt;element name="cppPspColor" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FreeTextInformationType_154703S" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="urls" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CommunicationContactType_154699S" maxOccurs="3" minOccurs="0"/>
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
        "countryData",
        "cppPspColor",
        "urls"
    })
    public static class MerchantSiteDetails {

        @XmlElement(required = true)
        protected CountryInformationTypeU countryData;
        protected List<FreeTextInformationType154703S> cppPspColor;
        protected List<CommunicationContactType154699S> urls;

        /**
         * Gets the value of the countryData property.
         * 
         * @return
         *     possible object is
         *     {@link CountryInformationTypeU }
         *     
         */
        public CountryInformationTypeU getCountryData() {
            return countryData;
        }

        /**
         * Sets the value of the countryData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryInformationTypeU }
         *     
         */
        public void setCountryData(CountryInformationTypeU value) {
            this.countryData = value;
        }

        /**
         * Gets the value of the cppPspColor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cppPspColor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCppPspColor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeTextInformationType154703S }
         * 
         * 
         */
        public List<FreeTextInformationType154703S> getCppPspColor() {
            if (cppPspColor == null) {
                cppPspColor = new ArrayList<FreeTextInformationType154703S>();
            }
            return this.cppPspColor;
        }

        /**
         * Gets the value of the urls property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the urls property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUrls().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommunicationContactType154699S }
         * 
         * 
         */
        public List<CommunicationContactType154699S> getUrls() {
            if (urls == null) {
                urls = new ArrayList<CommunicationContactType154699S>();
            }
            return this.urls;
        }

    }

}
