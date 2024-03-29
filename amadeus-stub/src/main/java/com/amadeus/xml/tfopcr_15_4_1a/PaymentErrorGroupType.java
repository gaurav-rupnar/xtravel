
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the error occuring during the transaction
 * 
 * <p>Java class for PaymentErrorGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentErrorGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorOrWarningCodeDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ApplicationErrorInformationType_154709S"/>
 *         &lt;element name="errorWarningDescription" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FreeTextInformationType_154688S" minOccurs="0"/>
 *         &lt;element name="errorSupplementaryData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errorSupplementaryMessages" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AttributeType_154711S"/>
 *                   &lt;element name="expirationDate" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StructuredDateTimeInformationType_154712S" minOccurs="0"/>
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
@XmlType(name = "PaymentErrorGroupType", propOrder = {
    "errorOrWarningCodeDetails",
    "errorWarningDescription",
    "errorSupplementaryData"
})
public class PaymentErrorGroupType {

    @XmlElement(required = true)
    protected ApplicationErrorInformationType154709S errorOrWarningCodeDetails;
    protected FreeTextInformationType154688S errorWarningDescription;
    protected PaymentErrorGroupType.ErrorSupplementaryData errorSupplementaryData;

    /**
     * Gets the value of the errorOrWarningCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationType154709S }
     *     
     */
    public ApplicationErrorInformationType154709S getErrorOrWarningCodeDetails() {
        return errorOrWarningCodeDetails;
    }

    /**
     * Sets the value of the errorOrWarningCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationType154709S }
     *     
     */
    public void setErrorOrWarningCodeDetails(ApplicationErrorInformationType154709S value) {
        this.errorOrWarningCodeDetails = value;
    }

    /**
     * Gets the value of the errorWarningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType154688S }
     *     
     */
    public FreeTextInformationType154688S getErrorWarningDescription() {
        return errorWarningDescription;
    }

    /**
     * Sets the value of the errorWarningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType154688S }
     *     
     */
    public void setErrorWarningDescription(FreeTextInformationType154688S value) {
        this.errorWarningDescription = value;
    }

    /**
     * Gets the value of the errorSupplementaryData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentErrorGroupType.ErrorSupplementaryData }
     *     
     */
    public PaymentErrorGroupType.ErrorSupplementaryData getErrorSupplementaryData() {
        return errorSupplementaryData;
    }

    /**
     * Sets the value of the errorSupplementaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentErrorGroupType.ErrorSupplementaryData }
     *     
     */
    public void setErrorSupplementaryData(PaymentErrorGroupType.ErrorSupplementaryData value) {
        this.errorSupplementaryData = value;
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
     *         &lt;element name="errorSupplementaryMessages" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AttributeType_154711S"/>
     *         &lt;element name="expirationDate" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}StructuredDateTimeInformationType_154712S" minOccurs="0"/>
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
        "errorSupplementaryMessages",
        "expirationDate"
    })
    public static class ErrorSupplementaryData {

        @XmlElement(required = true)
        protected AttributeType154711S errorSupplementaryMessages;
        protected StructuredDateTimeInformationType154712S expirationDate;

        /**
         * Gets the value of the errorSupplementaryMessages property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeType154711S }
         *     
         */
        public AttributeType154711S getErrorSupplementaryMessages() {
            return errorSupplementaryMessages;
        }

        /**
         * Sets the value of the errorSupplementaryMessages property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeType154711S }
         *     
         */
        public void setErrorSupplementaryMessages(AttributeType154711S value) {
            this.errorSupplementaryMessages = value;
        }

        /**
         * Gets the value of the expirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType154712S }
         *     
         */
        public StructuredDateTimeInformationType154712S getExpirationDate() {
            return expirationDate;
        }

        /**
         * Sets the value of the expirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType154712S }
         *     
         */
        public void setExpirationDate(StructuredDateTimeInformationType154712S value) {
            this.expirationDate = value;
        }

    }

}
