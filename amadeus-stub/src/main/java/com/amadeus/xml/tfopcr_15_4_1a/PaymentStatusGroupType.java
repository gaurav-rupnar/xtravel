
package com.amadeus.xml.tfopcr_15_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the status of the payment
 * 
 * <p>Java class for PaymentStatusGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentStatusGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentStatusInformation" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ResponseAnalysisDetailsType_180157S"/>
 *         &lt;element name="paymentStatusHistory" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ResponseAnalysisDetailsType_180157S" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="paymentStatusError" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}ErrorGroupType_87970G" minOccurs="0"/>
 *         &lt;element name="fraudScreeningResult" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}MeasurementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusGroupType", propOrder = {
    "paymentStatusInformation",
    "paymentStatusHistory",
    "paymentStatusError",
    "fraudScreeningResult"
})
public class PaymentStatusGroupType {

    @XmlElement(required = true)
    protected ResponseAnalysisDetailsType180157S paymentStatusInformation;
    protected List<ResponseAnalysisDetailsType180157S> paymentStatusHistory;
    protected ErrorGroupType87970G paymentStatusError;
    protected MeasurementsType fraudScreeningResult;

    /**
     * Gets the value of the paymentStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAnalysisDetailsType180157S }
     *     
     */
    public ResponseAnalysisDetailsType180157S getPaymentStatusInformation() {
        return paymentStatusInformation;
    }

    /**
     * Sets the value of the paymentStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAnalysisDetailsType180157S }
     *     
     */
    public void setPaymentStatusInformation(ResponseAnalysisDetailsType180157S value) {
        this.paymentStatusInformation = value;
    }

    /**
     * Gets the value of the paymentStatusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentStatusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseAnalysisDetailsType180157S }
     * 
     * 
     */
    public List<ResponseAnalysisDetailsType180157S> getPaymentStatusHistory() {
        if (paymentStatusHistory == null) {
            paymentStatusHistory = new ArrayList<ResponseAnalysisDetailsType180157S>();
        }
        return this.paymentStatusHistory;
    }

    /**
     * Gets the value of the paymentStatusError property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorGroupType87970G }
     *     
     */
    public ErrorGroupType87970G getPaymentStatusError() {
        return paymentStatusError;
    }

    /**
     * Sets the value of the paymentStatusError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorGroupType87970G }
     *     
     */
    public void setPaymentStatusError(ErrorGroupType87970G value) {
        this.paymentStatusError = value;
    }

    /**
     * Gets the value of the fraudScreeningResult property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementsType }
     *     
     */
    public MeasurementsType getFraudScreeningResult() {
        return fraudScreeningResult;
    }

    /**
     * Sets the value of the fraudScreeningResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementsType }
     *     
     */
    public void setFraudScreeningResult(MeasurementsType value) {
        this.fraudScreeningResult = value;
    }

}
