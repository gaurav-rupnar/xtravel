
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationErrorDetailType_220911C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorDetailType_220911C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To6"/>
 *         &lt;element name="errorCodeOwner" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorDetailType_220911C", propOrder = {
    "errorCode",
    "errorCodeOwner"
})
public class ApplicationErrorDetailType220911C {

    @XmlElement(required = true)
    protected String errorCode;
    @XmlElement(required = true)
    protected String errorCodeOwner;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorCodeOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCodeOwner() {
        return errorCodeOwner;
    }

    /**
     * Sets the value of the errorCodeOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCodeOwner(String value) {
        this.errorCodeOwner = value;
    }

}
