
package com.amadeus.xml.tfopcq_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * References validation data of a INV Fop
 * 
 * <p>Java class for InvoiceValidationGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceValidationGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalCodeDetails" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}GenericAuthorisationResultType_154696S"/>
 *         &lt;element name="documentInformation" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}DocumentInformationDetailsType" minOccurs="0"/>
 *         &lt;element name="transactionStatus" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}ErrorGroupType_174783G" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceValidationGroupType", propOrder = {
    "approvalCodeDetails",
    "documentInformation",
    "transactionStatus"
})
public class InvoiceValidationGroupType {

    @XmlElement(required = true)
    protected GenericAuthorisationResultType154696S approvalCodeDetails;
    protected DocumentInformationDetailsType documentInformation;
    protected ErrorGroupType174783G transactionStatus;

    /**
     * Gets the value of the approvalCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GenericAuthorisationResultType154696S }
     *     
     */
    public GenericAuthorisationResultType154696S getApprovalCodeDetails() {
        return approvalCodeDetails;
    }

    /**
     * Sets the value of the approvalCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericAuthorisationResultType154696S }
     *     
     */
    public void setApprovalCodeDetails(GenericAuthorisationResultType154696S value) {
        this.approvalCodeDetails = value;
    }

    /**
     * Gets the value of the documentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInformationDetailsType }
     *     
     */
    public DocumentInformationDetailsType getDocumentInformation() {
        return documentInformation;
    }

    /**
     * Sets the value of the documentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInformationDetailsType }
     *     
     */
    public void setDocumentInformation(DocumentInformationDetailsType value) {
        this.documentInformation = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorGroupType174783G }
     *     
     */
    public ErrorGroupType174783G getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorGroupType174783G }
     *     
     */
    public void setTransactionStatus(ErrorGroupType174783G value) {
        this.transactionStatus = value;
    }

}
