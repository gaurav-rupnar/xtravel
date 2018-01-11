
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey date/time in a structured way.
 * 
 * <p>Java class for StructuredDateTimeInformationType_154712S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeInformationType_154712S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}StructuredDateTimeType_220913C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeInformationType_154712S", propOrder = {
    "dateTime"
})
public class StructuredDateTimeInformationType154712S {

    @XmlElement(required = true)
    protected StructuredDateTimeType220913C dateTime;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType220913C }
     *     
     */
    public StructuredDateTimeType220913C getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType220913C }
     *     
     */
    public void setDateTime(StructuredDateTimeType220913C value) {
        this.dateTime = value;
    }

}
