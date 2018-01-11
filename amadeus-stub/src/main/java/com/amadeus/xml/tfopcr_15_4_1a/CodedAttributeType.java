
package com.amadeus.xml.tfopcr_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for CodedAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeFunction" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}CodedAttributeInformationType_220870C" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttributeType", propOrder = {
    "attributeFunction",
    "attributeDetails"
})
public class CodedAttributeType {

    @XmlElement(required = true)
    protected String attributeFunction;
    @XmlElement(required = true)
    protected List<CodedAttributeInformationType220870C> attributeDetails;

    /**
     * Gets the value of the attributeFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeFunction() {
        return attributeFunction;
    }

    /**
     * Sets the value of the attributeFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeFunction(String value) {
        this.attributeFunction = value;
    }

    /**
     * Gets the value of the attributeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeInformationType220870C }
     * 
     * 
     */
    public List<CodedAttributeInformationType220870C> getAttributeDetails() {
        if (attributeDetails == null) {
            attributeDetails = new ArrayList<CodedAttributeInformationType220870C>();
        }
        return this.attributeDetails;
    }

}
