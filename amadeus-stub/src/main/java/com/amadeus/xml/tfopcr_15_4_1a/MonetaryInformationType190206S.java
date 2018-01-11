
package com.amadeus.xml.tfopcr_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amounts, rates and percentages.
 * 
 * <p>Java class for MonetaryInformationType_190206S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationType_190206S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monetaryDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationDetailsType_266075C"/>
 *         &lt;element name="otherMonetaryDetails" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MonetaryInformationDetailsType_266075C" maxOccurs="19" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationType_190206S", propOrder = {
    "monetaryDetails",
    "otherMonetaryDetails"
})
public class MonetaryInformationType190206S {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsType266075C monetaryDetails;
    protected List<MonetaryInformationDetailsType266075C> otherMonetaryDetails;

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsType266075C }
     *     
     */
    public MonetaryInformationDetailsType266075C getMonetaryDetails() {
        return monetaryDetails;
    }

    /**
     * Sets the value of the monetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsType266075C }
     *     
     */
    public void setMonetaryDetails(MonetaryInformationDetailsType266075C value) {
        this.monetaryDetails = value;
    }

    /**
     * Gets the value of the otherMonetaryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherMonetaryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherMonetaryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsType266075C }
     * 
     * 
     */
    public List<MonetaryInformationDetailsType266075C> getOtherMonetaryDetails() {
        if (otherMonetaryDetails == null) {
            otherMonetaryDetails = new ArrayList<MonetaryInformationDetailsType266075C>();
        }
        return this.otherMonetaryDetails;
    }

}
