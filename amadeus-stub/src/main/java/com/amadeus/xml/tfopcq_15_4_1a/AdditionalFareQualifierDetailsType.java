
package com.amadeus.xml.tfopcq_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the fare basis and ticket designator codes.
 * 
 * <p>Java class for AdditionalFareQualifierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalFareQualifierDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateClass" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="commodityCategory" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To18" minOccurs="0"/>
 *         &lt;element name="pricingGroup" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="secondRateClass" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To35" maxOccurs="29" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFareQualifierDetailsType", propOrder = {
    "rateClass",
    "commodityCategory",
    "pricingGroup",
    "secondRateClass"
})
public class AdditionalFareQualifierDetailsType {

    protected String rateClass;
    protected String commodityCategory;
    protected String pricingGroup;
    protected List<String> secondRateClass;

    /**
     * Gets the value of the rateClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateClass() {
        return rateClass;
    }

    /**
     * Sets the value of the rateClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateClass(String value) {
        this.rateClass = value;
    }

    /**
     * Gets the value of the commodityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCategory() {
        return commodityCategory;
    }

    /**
     * Sets the value of the commodityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCategory(String value) {
        this.commodityCategory = value;
    }

    /**
     * Gets the value of the pricingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingGroup() {
        return pricingGroup;
    }

    /**
     * Sets the value of the pricingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingGroup(String value) {
        this.pricingGroup = value;
    }

    /**
     * Gets the value of the secondRateClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondRateClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondRateClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSecondRateClass() {
        if (secondRateClass == null) {
            secondRateClass = new ArrayList<String>();
        }
        return this.secondRateClass;
    }

}
