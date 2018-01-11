
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all MOP specific data for Web Fund Transfer
 * 
 * <p>Java class for WebFundTransferGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebFundTransferGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issuerId" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ReferenceInfoType_154679S"/>
 *         &lt;element name="paymentProvider" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}CompanyInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFundTransferGroupType", propOrder = {
    "issuerId",
    "paymentProvider"
})
public class WebFundTransferGroupType {

    @XmlElement(required = true)
    protected ReferenceInfoType154679S issuerId;
    @XmlElement(required = true)
    protected CompanyInformationType paymentProvider;

    /**
     * Gets the value of the issuerId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType154679S }
     *     
     */
    public ReferenceInfoType154679S getIssuerId() {
        return issuerId;
    }

    /**
     * Sets the value of the issuerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType154679S }
     *     
     */
    public void setIssuerId(ReferenceInfoType154679S value) {
        this.issuerId = value;
    }

    /**
     * Gets the value of the paymentProvider property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType }
     *     
     */
    public CompanyInformationType getPaymentProvider() {
        return paymentProvider;
    }

    /**
     * Sets the value of the paymentProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType }
     *     
     */
    public void setPaymentProvider(CompanyInformationType value) {
        this.paymentProvider = value;
    }

}
