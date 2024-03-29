
package com.amadeus.xml.tibnrq_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of source.
 * 
 * <p>Java class for SourceTypeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceTypeDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceQualifier1" type="{http://xml.amadeus.com/TIBNRQ_15_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="sourceQualifier2" type="{http://xml.amadeus.com/TIBNRQ_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceTypeDetailsTypeI", propOrder = {
    "sourceQualifier1",
    "sourceQualifier2"
})
public class SourceTypeDetailsTypeI {

    @XmlElement(required = true)
    protected String sourceQualifier1;
    protected String sourceQualifier2;

    /**
     * Gets the value of the sourceQualifier1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceQualifier1() {
        return sourceQualifier1;
    }

    /**
     * Sets the value of the sourceQualifier1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceQualifier1(String value) {
        this.sourceQualifier1 = value;
    }

    /**
     * Gets the value of the sourceQualifier2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceQualifier2() {
        return sourceQualifier2;
    }

    /**
     * Sets the value of the sourceQualifier2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceQualifier2(String value) {
        this.sourceQualifier2 = value;
    }

}
