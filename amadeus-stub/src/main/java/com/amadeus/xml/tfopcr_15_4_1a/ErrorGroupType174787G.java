
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys a potential error.
 * 
 * <p>Java class for ErrorGroupType_174787G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorGroupType_174787G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorOrWarningCodeDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ApplicationErrorInformationType_154705S"/>
 *         &lt;element name="errorWarningDescription" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}FreeTextInformationType_154706S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorGroupType_174787G", propOrder = {
    "errorOrWarningCodeDetails",
    "errorWarningDescription"
})
public class ErrorGroupType174787G {

    @XmlElement(required = true)
    protected ApplicationErrorInformationType154705S errorOrWarningCodeDetails;
    protected FreeTextInformationType154706S errorWarningDescription;

    /**
     * Gets the value of the errorOrWarningCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationType154705S }
     *     
     */
    public ApplicationErrorInformationType154705S getErrorOrWarningCodeDetails() {
        return errorOrWarningCodeDetails;
    }

    /**
     * Sets the value of the errorOrWarningCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationType154705S }
     *     
     */
    public void setErrorOrWarningCodeDetails(ApplicationErrorInformationType154705S value) {
        this.errorOrWarningCodeDetails = value;
    }

    /**
     * Gets the value of the errorWarningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType154706S }
     *     
     */
    public FreeTextInformationType154706S getErrorWarningDescription() {
        return errorWarningDescription;
    }

    /**
     * Sets the value of the errorWarningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType154706S }
     *     
     */
    public void setErrorWarningDescription(FreeTextInformationType154706S value) {
        this.errorWarningDescription = value;
    }

}
