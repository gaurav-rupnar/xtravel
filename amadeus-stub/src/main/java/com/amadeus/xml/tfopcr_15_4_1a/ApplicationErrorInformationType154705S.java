
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of application error within a message.
 * 
 * <p>Java class for ApplicationErrorInformationType_154705S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformationType_154705S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ApplicationErrorDetailType_220909C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformationType_154705S", propOrder = {
    "errorDetails"
})
public class ApplicationErrorInformationType154705S {

    @XmlElement(required = true)
    protected ApplicationErrorDetailType220909C errorDetails;

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailType220909C }
     *     
     */
    public ApplicationErrorDetailType220909C getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailType220909C }
     *     
     */
    public void setErrorDetails(ApplicationErrorDetailType220909C value) {
        this.errorDetails = value;
    }

}
