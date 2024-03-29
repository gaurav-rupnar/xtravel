
package com.amadeus.xml.tibnrr_15_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a pertinent quantity.
 * 
 * <p>Java class for QuantityTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityDetails" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}QuantityDetailsTypeI"/>
 *         &lt;element name="otherquantityDetails" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}QuantityDetailsTypeI" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityTypeI", propOrder = {
    "quantityDetails",
    "otherquantityDetails"
})
public class QuantityTypeI {

    @XmlElement(required = true)
    protected QuantityDetailsTypeI quantityDetails;
    protected List<QuantityDetailsTypeI> otherquantityDetails;

    /**
     * Gets the value of the quantityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDetailsTypeI }
     *     
     */
    public QuantityDetailsTypeI getQuantityDetails() {
        return quantityDetails;
    }

    /**
     * Sets the value of the quantityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDetailsTypeI }
     *     
     */
    public void setQuantityDetails(QuantityDetailsTypeI value) {
        this.quantityDetails = value;
    }

    /**
     * Gets the value of the otherquantityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherquantityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherquantityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityDetailsTypeI }
     * 
     * 
     */
    public List<QuantityDetailsTypeI> getOtherquantityDetails() {
        if (otherquantityDetails == null) {
            otherquantityDetails = new ArrayList<QuantityDetailsTypeI>();
        }
        return this.otherquantityDetails;
    }

}
