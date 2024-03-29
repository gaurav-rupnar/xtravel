
package com.amadeus.xml.tibnrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the message type and business function.
 * 
 * <p>Java class for MessageActionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageActionDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageFunctionDetails" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}MessageFunctionBusinessDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="responseType" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageActionDetailsTypeI", propOrder = {
    "messageFunctionDetails",
    "responseType"
})
public class MessageActionDetailsTypeI {

    protected MessageFunctionBusinessDetailsTypeI messageFunctionDetails;
    protected String responseType;

    /**
     * Gets the value of the messageFunctionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunctionBusinessDetailsTypeI }
     *     
     */
    public MessageFunctionBusinessDetailsTypeI getMessageFunctionDetails() {
        return messageFunctionDetails;
    }

    /**
     * Sets the value of the messageFunctionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunctionBusinessDetailsTypeI }
     *     
     */
    public void setMessageFunctionDetails(MessageFunctionBusinessDetailsTypeI value) {
        this.messageFunctionDetails = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

}
