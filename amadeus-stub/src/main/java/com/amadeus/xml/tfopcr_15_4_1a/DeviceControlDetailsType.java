
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify control details for a device.
 * 
 * <p>Java class for DeviceControlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceControlDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceIdentification" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}IdentificationNumberTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceControlDetailsType", propOrder = {
    "deviceIdentification"
})
public class DeviceControlDetailsType {

    protected IdentificationNumberTypeI deviceIdentification;

    /**
     * Gets the value of the deviceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationNumberTypeI }
     *     
     */
    public IdentificationNumberTypeI getDeviceIdentification() {
        return deviceIdentification;
    }

    /**
     * Sets the value of the deviceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationNumberTypeI }
     *     
     */
    public void setDeviceIdentification(IdentificationNumberTypeI value) {
        this.deviceIdentification = value;
    }

}
