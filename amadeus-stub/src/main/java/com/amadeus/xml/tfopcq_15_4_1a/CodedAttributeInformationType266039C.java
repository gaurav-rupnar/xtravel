
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey coded key and corresponding value
 * 
 * <p>Java class for CodedAttributeInformationType_266039C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttributeInformationType_266039C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeType" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To5"/>
 *         &lt;element name="attributeDescription" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttributeInformationType_266039C", propOrder = {
    "attributeType",
    "attributeDescription"
})
public class CodedAttributeInformationType266039C {

    @XmlElement(required = true)
    protected String attributeType;
    protected String attributeDescription;

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }

    /**
     * Gets the value of the attributeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeDescription() {
        return attributeDescription;
    }

    /**
     * Sets the value of the attributeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeDescription(String value) {
        this.attributeDescription = value;
    }

}
