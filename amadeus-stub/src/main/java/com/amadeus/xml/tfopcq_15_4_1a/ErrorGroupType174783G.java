
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys a potential error.
 * 
 * <p>Java class for ErrorGroupType_174783G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorGroupType_174783G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorOrWarningCodeDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ApplicationErrorInformationType_154697S"/>
 *         &lt;element name="errorWarningDescription" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}FreeTextInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorGroupType_174783G", propOrder = {
    "errorOrWarningCodeDetails",
    "errorWarningDescription"
})
public class ErrorGroupType174783G {

    @XmlElement(required = true)
    protected ApplicationErrorInformationType154697S errorOrWarningCodeDetails;
    protected FreeTextInformationType errorWarningDescription;

    /**
     * Gets the value of the errorOrWarningCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationType154697S }
     *     
     */
    public ApplicationErrorInformationType154697S getErrorOrWarningCodeDetails() {
        return errorOrWarningCodeDetails;
    }

    /**
     * Sets the value of the errorOrWarningCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationType154697S }
     *     
     */
    public void setErrorOrWarningCodeDetails(ApplicationErrorInformationType154697S value) {
        this.errorOrWarningCodeDetails = value;
    }

    /**
     * Gets the value of the errorWarningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType }
     *     
     */
    public FreeTextInformationType getErrorWarningDescription() {
        return errorWarningDescription;
    }

    /**
     * Sets the value of the errorWarningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType }
     *     
     */
    public void setErrorWarningDescription(FreeTextInformationType value) {
        this.errorWarningDescription = value;
    }

}
