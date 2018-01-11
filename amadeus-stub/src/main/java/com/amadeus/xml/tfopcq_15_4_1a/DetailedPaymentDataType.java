
package com.amadeus.xml.tfopcq_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the Detailed Payment Data associated to a MOP
 * 
 * <p>Java class for DetailedPaymentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedPaymentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}FormOfPaymentTypeI_68621S"/>
 *         &lt;element name="fundTransferDetailledData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}DetailedWebFundTransferType" minOccurs="0"/>
 *         &lt;element name="asyncDetailledDataGroup" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AsynchPaymentStatusGroupType" minOccurs="0"/>
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}DummySegmentTypeI"/>
 *         &lt;element name="invoiceDetailedDataGroup" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}InvoiceValidationGroupType" minOccurs="0"/>
 *         &lt;element name="creditCardDetailedData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}CreditCardStatusGroupType" minOccurs="0"/>
 *         &lt;element name="webAccountDetailledData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}WebAccountSuppDataGroupType" minOccurs="0"/>
 *         &lt;element name="virtualCreditCardStatusGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="virtualCreditCardParameters" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}VirtualCardParametersType_175504S"/>
 *                   &lt;element name="virtualCreditCardData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}CreditCardDataType" minOccurs="0"/>
 *                   &lt;element name="fortknoxIds" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ReferenceInfoType_190166S" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="vCCAssociatedAdress" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AddressType" minOccurs="0"/>
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
@XmlType(name = "DetailedPaymentDataType", propOrder = {
    "fopInformation",
    "fundTransferDetailledData",
    "asyncDetailledDataGroup",
    "dummy",
    "invoiceDetailedDataGroup",
    "creditCardDetailedData",
    "webAccountDetailledData",
    "virtualCreditCardStatusGroup"
})
public class DetailedPaymentDataType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI68621S fopInformation;
    protected DetailedWebFundTransferType fundTransferDetailledData;
    protected AsynchPaymentStatusGroupType asyncDetailledDataGroup;
    @XmlElement(required = true)
    protected DummySegmentTypeI dummy;
    protected InvoiceValidationGroupType invoiceDetailedDataGroup;
    protected CreditCardStatusGroupType creditCardDetailedData;
    protected WebAccountSuppDataGroupType webAccountDetailledData;
    protected DetailedPaymentDataType.VirtualCreditCardStatusGroup virtualCreditCardStatusGroup;

    /**
     * Gets the value of the fopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI68621S }
     *     
     */
    public FormOfPaymentTypeI68621S getFopInformation() {
        return fopInformation;
    }

    /**
     * Sets the value of the fopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI68621S }
     *     
     */
    public void setFopInformation(FormOfPaymentTypeI68621S value) {
        this.fopInformation = value;
    }

    /**
     * Gets the value of the fundTransferDetailledData property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedWebFundTransferType }
     *     
     */
    public DetailedWebFundTransferType getFundTransferDetailledData() {
        return fundTransferDetailledData;
    }

    /**
     * Sets the value of the fundTransferDetailledData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedWebFundTransferType }
     *     
     */
    public void setFundTransferDetailledData(DetailedWebFundTransferType value) {
        this.fundTransferDetailledData = value;
    }

    /**
     * Gets the value of the asyncDetailledDataGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AsynchPaymentStatusGroupType }
     *     
     */
    public AsynchPaymentStatusGroupType getAsyncDetailledDataGroup() {
        return asyncDetailledDataGroup;
    }

    /**
     * Sets the value of the asyncDetailledDataGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsynchPaymentStatusGroupType }
     *     
     */
    public void setAsyncDetailledDataGroup(AsynchPaymentStatusGroupType value) {
        this.asyncDetailledDataGroup = value;
    }

    /**
     * Gets the value of the dummy property.
     * 
     * @return
     *     possible object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public DummySegmentTypeI getDummy() {
        return dummy;
    }

    /**
     * Sets the value of the dummy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public void setDummy(DummySegmentTypeI value) {
        this.dummy = value;
    }

    /**
     * Gets the value of the invoiceDetailedDataGroup property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceValidationGroupType }
     *     
     */
    public InvoiceValidationGroupType getInvoiceDetailedDataGroup() {
        return invoiceDetailedDataGroup;
    }

    /**
     * Sets the value of the invoiceDetailedDataGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceValidationGroupType }
     *     
     */
    public void setInvoiceDetailedDataGroup(InvoiceValidationGroupType value) {
        this.invoiceDetailedDataGroup = value;
    }

    /**
     * Gets the value of the creditCardDetailedData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardStatusGroupType }
     *     
     */
    public CreditCardStatusGroupType getCreditCardDetailedData() {
        return creditCardDetailedData;
    }

    /**
     * Sets the value of the creditCardDetailedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardStatusGroupType }
     *     
     */
    public void setCreditCardDetailedData(CreditCardStatusGroupType value) {
        this.creditCardDetailedData = value;
    }

    /**
     * Gets the value of the webAccountDetailledData property.
     * 
     * @return
     *     possible object is
     *     {@link WebAccountSuppDataGroupType }
     *     
     */
    public WebAccountSuppDataGroupType getWebAccountDetailledData() {
        return webAccountDetailledData;
    }

    /**
     * Sets the value of the webAccountDetailledData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAccountSuppDataGroupType }
     *     
     */
    public void setWebAccountDetailledData(WebAccountSuppDataGroupType value) {
        this.webAccountDetailledData = value;
    }

    /**
     * Gets the value of the virtualCreditCardStatusGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPaymentDataType.VirtualCreditCardStatusGroup }
     *     
     */
    public DetailedPaymentDataType.VirtualCreditCardStatusGroup getVirtualCreditCardStatusGroup() {
        return virtualCreditCardStatusGroup;
    }

    /**
     * Sets the value of the virtualCreditCardStatusGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPaymentDataType.VirtualCreditCardStatusGroup }
     *     
     */
    public void setVirtualCreditCardStatusGroup(DetailedPaymentDataType.VirtualCreditCardStatusGroup value) {
        this.virtualCreditCardStatusGroup = value;
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
     *         &lt;element name="virtualCreditCardParameters" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}VirtualCardParametersType_175504S"/>
     *         &lt;element name="virtualCreditCardData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}CreditCardDataType" minOccurs="0"/>
     *         &lt;element name="fortknoxIds" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ReferenceInfoType_190166S" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="vCCAssociatedAdress" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AddressType" minOccurs="0"/>
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
        "virtualCreditCardParameters",
        "virtualCreditCardData",
        "fortknoxIds",
        "vccAssociatedAdress"
    })
    public static class VirtualCreditCardStatusGroup {

        @XmlElement(required = true)
        protected VirtualCardParametersType175504S virtualCreditCardParameters;
        protected CreditCardDataType virtualCreditCardData;
        protected List<ReferenceInfoType190166S> fortknoxIds;
        @XmlElement(name = "vCCAssociatedAdress")
        protected AddressType vccAssociatedAdress;

        /**
         * Gets the value of the virtualCreditCardParameters property.
         * 
         * @return
         *     possible object is
         *     {@link VirtualCardParametersType175504S }
         *     
         */
        public VirtualCardParametersType175504S getVirtualCreditCardParameters() {
            return virtualCreditCardParameters;
        }

        /**
         * Sets the value of the virtualCreditCardParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link VirtualCardParametersType175504S }
         *     
         */
        public void setVirtualCreditCardParameters(VirtualCardParametersType175504S value) {
            this.virtualCreditCardParameters = value;
        }

        /**
         * Gets the value of the virtualCreditCardData property.
         * 
         * @return
         *     possible object is
         *     {@link CreditCardDataType }
         *     
         */
        public CreditCardDataType getVirtualCreditCardData() {
            return virtualCreditCardData;
        }

        /**
         * Sets the value of the virtualCreditCardData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreditCardDataType }
         *     
         */
        public void setVirtualCreditCardData(CreditCardDataType value) {
            this.virtualCreditCardData = value;
        }

        /**
         * Gets the value of the fortknoxIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fortknoxIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFortknoxIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceInfoType190166S }
         * 
         * 
         */
        public List<ReferenceInfoType190166S> getFortknoxIds() {
            if (fortknoxIds == null) {
                fortknoxIds = new ArrayList<ReferenceInfoType190166S>();
            }
            return this.fortknoxIds;
        }

        /**
         * Gets the value of the vccAssociatedAdress property.
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getVCCAssociatedAdress() {
            return vccAssociatedAdress;
        }

        /**
         * Sets the value of the vccAssociatedAdress property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         */
        public void setVCCAssociatedAdress(AddressType value) {
            this.vccAssociatedAdress = value;
        }

    }

}
