
package com.amadeus.xml.quereq_09_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate the type and function of a message or part of a message.
 * 
 * <p>Java class for MessageFunctionBusinessDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageFunctionBusinessDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageFunction" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageFunctionBusinessDetailsTypeI", propOrder = {
    "messageFunction"
})
public class MessageFunctionBusinessDetailsTypeI {

    @XmlElement(required = true)
    protected String messageFunction;

    /**
     * Gets the value of the messageFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageFunction() {
        return messageFunction;
    }

    /**
     * Sets the value of the messageFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageFunction(String value) {
        this.messageFunction = value;
    }

}
