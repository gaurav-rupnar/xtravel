
package com.amadeus.xml.tibnrr_15_1_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey pricing and date information related to a ticket.
 * 
 * <p>Java class for PricingTicketingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceTicketDetails" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}PricingTicketingInformationTypeI" minOccurs="0"/>
 *         &lt;element name="priceTariffType" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="productDateTimeDetails" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}ProductDateTimeTypeI" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}CompanyIdentificationTypeI_58119C" minOccurs="0"/>
 *         &lt;element name="companyNumberDetails" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}CompanyIdentificationNumbersTypeI" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}LocationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="otherLocationDetails" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}LocationDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="idNumber" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="monetaryAmount" type="{http://xml.amadeus.com/TIBNRR_15_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingDetailsType", propOrder = {
    "priceTicketDetails",
    "priceTariffType",
    "productDateTimeDetails",
    "companyDetails",
    "companyNumberDetails",
    "locationDetails",
    "otherLocationDetails",
    "idNumber",
    "monetaryAmount"
})
public class PricingTicketingDetailsType {

    protected PricingTicketingInformationTypeI priceTicketDetails;
    protected String priceTariffType;
    protected ProductDateTimeTypeI productDateTimeDetails;
    protected CompanyIdentificationTypeI58119C companyDetails;
    protected CompanyIdentificationNumbersTypeI companyNumberDetails;
    protected LocationDetailsTypeI locationDetails;
    protected LocationDetailsTypeI otherLocationDetails;
    protected String idNumber;
    protected BigDecimal monetaryAmount;

    /**
     * Gets the value of the priceTicketDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingInformationTypeI }
     *     
     */
    public PricingTicketingInformationTypeI getPriceTicketDetails() {
        return priceTicketDetails;
    }

    /**
     * Sets the value of the priceTicketDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingInformationTypeI }
     *     
     */
    public void setPriceTicketDetails(PricingTicketingInformationTypeI value) {
        this.priceTicketDetails = value;
    }

    /**
     * Gets the value of the priceTariffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceTariffType() {
        return priceTariffType;
    }

    /**
     * Sets the value of the priceTariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceTariffType(String value) {
        this.priceTariffType = value;
    }

    /**
     * Gets the value of the productDateTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public ProductDateTimeTypeI getProductDateTimeDetails() {
        return productDateTimeDetails;
    }

    /**
     * Sets the value of the productDateTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public void setProductDateTimeDetails(ProductDateTimeTypeI value) {
        this.productDateTimeDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI58119C }
     *     
     */
    public CompanyIdentificationTypeI58119C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI58119C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI58119C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the companyNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationNumbersTypeI }
     *     
     */
    public CompanyIdentificationNumbersTypeI getCompanyNumberDetails() {
        return companyNumberDetails;
    }

    /**
     * Sets the value of the companyNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationNumbersTypeI }
     *     
     */
    public void setCompanyNumberDetails(CompanyIdentificationNumbersTypeI value) {
        this.companyNumberDetails = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public LocationDetailsTypeI getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public void setLocationDetails(LocationDetailsTypeI value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the otherLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public LocationDetailsTypeI getOtherLocationDetails() {
        return otherLocationDetails;
    }

    /**
     * Sets the value of the otherLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsTypeI }
     *     
     */
    public void setOtherLocationDetails(LocationDetailsTypeI value) {
        this.otherLocationDetails = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the monetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonetaryAmount(BigDecimal value) {
        this.monetaryAmount = value;
    }

}