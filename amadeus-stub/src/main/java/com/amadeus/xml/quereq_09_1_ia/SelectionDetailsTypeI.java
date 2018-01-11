
package com.amadeus.xml.quereq_09_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details for making a selection
 * 
 * <p>Java class for SelectionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectionDetails" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}SelectionDetailsInformationTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionDetailsTypeI", propOrder = {
    "selectionDetails"
})
public class SelectionDetailsTypeI {

    @XmlElement(required = true)
    protected SelectionDetailsInformationTypeI selectionDetails;

    /**
     * Gets the value of the selectionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsInformationTypeI }
     *     
     */
    public SelectionDetailsInformationTypeI getSelectionDetails() {
        return selectionDetails;
    }

    /**
     * Sets the value of the selectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsInformationTypeI }
     *     
     */
    public void setSelectionDetails(SelectionDetailsInformationTypeI value) {
        this.selectionDetails = value;
    }

}
