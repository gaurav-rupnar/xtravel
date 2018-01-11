
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of application error within a message.
 * 
 * <p>Java class for ApplicationErrorInformationType_154709S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformationType_154709S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ApplicationErrorDetailType_220911C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformationType_154709S", propOrder = {
    "errorDetails"
})
public class ApplicationErrorInformationType154709S {

    @XmlElement(required = true)
    protected ApplicationErrorDetailType220911C errorDetails;

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailType220911C }
     *     
     */
    public ApplicationErrorDetailType220911C getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailType220911C }
     *     
     */
    public void setErrorDetails(ApplicationErrorDetailType220911C value) {
        this.errorDetails = value;
    }

}
