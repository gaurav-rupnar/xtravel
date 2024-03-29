
package com.amadeus.xml.tfopcr_15_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the given/first name and the title of a traveller and the traveller type.
 * 
 * <p>Java class for TravellerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="givenName" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="uniqueCustomerIdentifier" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="infantIndicator" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="title" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="age" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerDetailsType", propOrder = {
    "givenName",
    "type",
    "uniqueCustomerIdentifier",
    "infantIndicator",
    "title",
    "age"
})
public class TravellerDetailsType {

    protected String givenName;
    protected String type;
    protected String uniqueCustomerIdentifier;
    protected String infantIndicator;
    protected String title;
    protected BigInteger age;

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the uniqueCustomerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueCustomerIdentifier() {
        return uniqueCustomerIdentifier;
    }

    /**
     * Sets the value of the uniqueCustomerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueCustomerIdentifier(String value) {
        this.uniqueCustomerIdentifier = value;
    }

    /**
     * Gets the value of the infantIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /**
     * Sets the value of the infantIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantIndicator(String value) {
        this.infantIndicator = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

}
