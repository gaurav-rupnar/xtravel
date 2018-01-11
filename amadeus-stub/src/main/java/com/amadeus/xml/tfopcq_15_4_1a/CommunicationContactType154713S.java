
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes communication channel
 * 
 * <p>Java class for CommunicationContactType_154713S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationContactType_154713S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="communication" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}CommunicationContactDetailsTypeU_107110C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationContactType_154713S", propOrder = {
    "communication"
})
public class CommunicationContactType154713S {

    @XmlElement(required = true)
    protected CommunicationContactDetailsTypeU107110C communication;

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactDetailsTypeU107110C }
     *     
     */
    public CommunicationContactDetailsTypeU107110C getCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactDetailsTypeU107110C }
     *     
     */
    public void setCommunication(CommunicationContactDetailsTypeU107110C value) {
        this.communication = value;
    }

}
