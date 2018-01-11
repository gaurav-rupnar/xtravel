
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all web account related MOP data
 * 
 * <p>Java class for WebAccountGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebAccountGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="webAccountSign" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}PhoneAndEmailAddressType"/>
 *         &lt;element name="paymentProvider" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CompanyInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebAccountGroupType", propOrder = {
    "webAccountSign",
    "paymentProvider"
})
public class WebAccountGroupType {

    @XmlElement(required = true)
    protected PhoneAndEmailAddressType webAccountSign;
    @XmlElement(required = true)
    protected CompanyInformationType paymentProvider;

    /**
     * Gets the value of the webAccountSign property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneAndEmailAddressType }
     *     
     */
    public PhoneAndEmailAddressType getWebAccountSign() {
        return webAccountSign;
    }

    /**
     * Sets the value of the webAccountSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneAndEmailAddressType }
     *     
     */
    public void setWebAccountSign(PhoneAndEmailAddressType value) {
        this.webAccountSign = value;
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
