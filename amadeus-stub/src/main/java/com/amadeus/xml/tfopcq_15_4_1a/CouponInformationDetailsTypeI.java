
package com.amadeus.xml.tfopcq_15_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the coupon number, status, value, and other related information.
 * 
 * <p>Java class for CouponInformationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponInformationDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpnNumber" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}NumericInteger_Length1To6"/>
 *         &lt;element name="cpnStatus" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="cpnSequenceNumber" type="{http://xml.amadeus.com/TFOPCQ_15_4_1A}NumericInteger_Length1To6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInformationDetailsTypeI", propOrder = {
    "cpnNumber",
    "cpnStatus",
    "cpnSequenceNumber"
})
public class CouponInformationDetailsTypeI {

    @XmlElement(required = true)
    protected BigInteger cpnNumber;
    protected String cpnStatus;
    @XmlElement(required = true)
    protected BigInteger cpnSequenceNumber;

    /**
     * Gets the value of the cpnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCpnNumber() {
        return cpnNumber;
    }

    /**
     * Sets the value of the cpnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCpnNumber(BigInteger value) {
        this.cpnNumber = value;
    }

    /**
     * Gets the value of the cpnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnStatus() {
        return cpnStatus;
    }

    /**
     * Sets the value of the cpnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnStatus(String value) {
        this.cpnStatus = value;
    }

    /**
     * Gets the value of the cpnSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCpnSequenceNumber() {
        return cpnSequenceNumber;
    }

    /**
     * Sets the value of the cpnSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCpnSequenceNumber(BigInteger value) {
        this.cpnSequenceNumber = value;
    }

}
