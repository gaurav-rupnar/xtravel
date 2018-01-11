
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey the approval data of the transaction
 * 
 * <p>Java class for GenericAuthorisationResultType_154683S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericAuthorisationResultType_154683S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalCodeData" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AuthorizationApprovalDataType_220892C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericAuthorisationResultType_154683S", propOrder = {
    "approvalCodeData"
})
public class GenericAuthorisationResultType154683S {

    @XmlElement(required = true)
    protected AuthorizationApprovalDataType220892C approvalCodeData;

    /**
     * Gets the value of the approvalCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationApprovalDataType220892C }
     *     
     */
    public AuthorizationApprovalDataType220892C getApprovalCodeData() {
        return approvalCodeData;
    }

    /**
     * Sets the value of the approvalCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationApprovalDataType220892C }
     *     
     */
    public void setApprovalCodeData(AuthorizationApprovalDataType220892C value) {
        this.approvalCodeData = value;
    }

}
