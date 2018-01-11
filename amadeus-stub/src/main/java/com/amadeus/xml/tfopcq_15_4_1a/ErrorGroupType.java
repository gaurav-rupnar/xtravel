
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys a potential error.
 * 
 * <p>Java class for ErrorGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorOrWarningCodeDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ApplicationErrorInformationType"/>
 *         &lt;element name="errorWarningDescription" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}FreeTextInformationType_154688S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorGroupType", propOrder = {
    "errorOrWarningCodeDetails",
    "errorWarningDescription"
})
public class ErrorGroupType {

    @XmlElement(required = true)
    protected ApplicationErrorInformationType errorOrWarningCodeDetails;
    protected FreeTextInformationType154688S errorWarningDescription;

    /**
     * Gets the value of the errorOrWarningCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationType }
     *     
     */
    public ApplicationErrorInformationType getErrorOrWarningCodeDetails() {
        return errorOrWarningCodeDetails;
    }

    /**
     * Sets the value of the errorOrWarningCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationType }
     *     
     */
    public void setErrorOrWarningCodeDetails(ApplicationErrorInformationType value) {
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

}
