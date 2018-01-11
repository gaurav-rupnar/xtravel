
package com.amadeus.xml.quereq_09_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the Queue details
 * 
 * <p>Java class for QueueInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queueDetails" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}QueueInformationDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueInformationTypeI", propOrder = {
    "queueDetails"
})
public class QueueInformationTypeI {

    protected QueueInformationDetailsTypeI queueDetails;

    /**
     * Gets the value of the queueDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QueueInformationDetailsTypeI }
     *     
     */
    public QueueInformationDetailsTypeI getQueueDetails() {
        return queueDetails;
    }

    /**
     * Sets the value of the queueDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueInformationDetailsTypeI }
     *     
     */
    public void setQueueDetails(QueueInformationDetailsTypeI value) {
        this.queueDetails = value;
    }

}
