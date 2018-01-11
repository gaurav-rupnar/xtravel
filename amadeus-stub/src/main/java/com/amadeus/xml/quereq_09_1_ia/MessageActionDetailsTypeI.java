
package com.amadeus.xml.quereq_09_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="messageFunctionDetails" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}MessageFunctionBusinessDetailsTypeI"/>
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
    "messageFunctionDetails"
})
public class MessageActionDetailsTypeI {

    @XmlElement(required = true)
    protected MessageFunctionBusinessDetailsTypeI messageFunctionDetails;

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

}
