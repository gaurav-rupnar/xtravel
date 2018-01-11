
package com.amadeus.xml.ffareq_04_1_1a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pnrInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reservation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="controlNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fqtvGroup" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;sequence>
 *                     &lt;element name="fqtvData">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="actionRequest">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;minLength value="1"/>
 *                                     &lt;maxLength value="3"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="companyDetails">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="marketingCompany">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="3"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="operatingCompany" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="3"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="accountDetails">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="frequentTravellerId">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="27"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="accountHolderDetails" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="givenName">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="56"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="paxInfoGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="paxInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="paxDetails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="surname">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="otherPaxDetails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="givenName">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="56"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="uniqueCustomerIdentifier">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fqtvGroup" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;sequence>
 *                               &lt;element name="fqtvData">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="actionRequest">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="3"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="companyDetails">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="marketingCompany">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;minLength value="1"/>
 *                                                         &lt;maxLength value="3"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="operatingCompany" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;minLength value="1"/>
 *                                                         &lt;maxLength value="3"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="accountDetails">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="frequentTravellerId">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;minLength value="1"/>
 *                                                         &lt;maxLength value="27"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="accountHolderDetails" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="givenName">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;minLength value="1"/>
 *                                                         &lt;maxLength value="56"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pnrInfo",
    "fqtvGroup",
    "paxInfoGroup"
})
@XmlRootElement(name = "PNR_AddFrequentFlyer")
public class PNRAddFrequentFlyer {

    protected PNRAddFrequentFlyer.PnrInfo pnrInfo;
    protected List<PNRAddFrequentFlyer.FqtvGroup> fqtvGroup;
    protected PNRAddFrequentFlyer.PaxInfoGroup paxInfoGroup;

    /**
     * Gets the value of the pnrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PNRAddFrequentFlyer.PnrInfo }
     *     
     */
    public PNRAddFrequentFlyer.PnrInfo getPnrInfo() {
        return pnrInfo;
    }

    /**
     * Sets the value of the pnrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRAddFrequentFlyer.PnrInfo }
     *     
     */
    public void setPnrInfo(PNRAddFrequentFlyer.PnrInfo value) {
        this.pnrInfo = value;
    }

    /**
     * Gets the value of the fqtvGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fqtvGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFqtvGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRAddFrequentFlyer.FqtvGroup }
     * 
     * 
     */
    public List<PNRAddFrequentFlyer.FqtvGroup> getFqtvGroup() {
        if (fqtvGroup == null) {
            fqtvGroup = new ArrayList<PNRAddFrequentFlyer.FqtvGroup>();
        }
        return this.fqtvGroup;
    }

    /**
     * Gets the value of the paxInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PNRAddFrequentFlyer.PaxInfoGroup }
     *     
     */
    public PNRAddFrequentFlyer.PaxInfoGroup getPaxInfoGroup() {
        return paxInfoGroup;
    }

    /**
     * Sets the value of the paxInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRAddFrequentFlyer.PaxInfoGroup }
     *     
     */
    public void setPaxInfoGroup(PNRAddFrequentFlyer.PaxInfoGroup value) {
        this.paxInfoGroup = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;sequence>
     *           &lt;element name="fqtvData">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="actionRequest">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;minLength value="1"/>
     *                           &lt;maxLength value="3"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="companyDetails">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="marketingCompany">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="3"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="operatingCompany" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="3"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="accountDetails">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="frequentTravellerId">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="27"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="accountHolderDetails" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="givenName">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="56"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fqtvData"
    })
    public static class FqtvGroup {

        @XmlElement(required = true)
        protected PNRAddFrequentFlyer.FqtvGroup.FqtvData fqtvData;

        /**
         * Gets the value of the fqtvData property.
         * 
         * @return
         *     possible object is
         *     {@link PNRAddFrequentFlyer.FqtvGroup.FqtvData }
         *     
         */
        public PNRAddFrequentFlyer.FqtvGroup.FqtvData getFqtvData() {
            return fqtvData;
        }

        /**
         * Sets the value of the fqtvData property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRAddFrequentFlyer.FqtvGroup.FqtvData }
         *     
         */
        public void setFqtvData(PNRAddFrequentFlyer.FqtvGroup.FqtvData value) {
            this.fqtvData = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="actionRequest">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="companyDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="marketingCompany">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="operatingCompany" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="accountDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="frequentTravellerId">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="27"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="accountHolderDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="givenName">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="56"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "actionRequest",
            "companyDetails",
            "accountDetails",
            "accountHolderDetails"
        })
        public static class FqtvData {

            @XmlElement(required = true)
            protected String actionRequest;
            @XmlElement(required = true)
            protected PNRAddFrequentFlyer.FqtvGroup.FqtvData.CompanyDetails companyDetails;
            @XmlElement(required = true)
            protected PNRAddFrequentFlyer.FqtvGroup.FqtvData.AccountDetails accountDetails;
            protected PNRAddFrequentFlyer.FqtvGroup.FqtvData.AccountHolderDetails accountHolderDetails;

            /**
             * Gets the value of the actionRequest property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActionRequest() {
                return actionRequest;
            }

            /**
             * Sets the value of the actionRequest property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActionRequest(String value) {
                this.actionRequest = value;
            }

            /**
             * Gets the value of the companyDetails property.
             * 
             * @return
             *     possible object is
             *     {@link PNRAddFrequentFlyer.FqtvGroup.FqtvData.CompanyDetails }
             *     
             */
            public PNRAddFrequentFlyer.FqtvGroup.FqtvData.CompanyDetails getCompanyDetails() {
                return companyDetails;
            }

            /**
             * Sets the value of the companyDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRAddFrequentFlyer.FqtvGroup.FqtvData.CompanyDetails }
             *     
             */
            public void setCompanyDetails(PNRAddFrequentFlyer.FqtvGroup.FqtvData.CompanyDetails value) {
                this.companyDetails = value;
            }

            /**
             * Gets the value of the accountDetails property.
             * 
             * @return
             *     possible object is
             *     {@link PNRAddFrequentFlyer.FqtvGroup.FqtvData.AccountDetails }
             *     
             */
            public PNRAddFrequentFlyer.FqtvGroup.FqtvData.AccountDetails getAccountDetails() {
                return accountDetails;
            }

            /**
             * Sets the value of the accountDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRAddFrequentFlyer.FqtvGroup.FqtvData.AccountDetails }
             *     
             */
            public void setAccountDetails(PNRAddFrequentFlyer.FqtvGroup.FqtvData.AccountDetails value) {
                this.accountDetails = value;
            }

            /**
             * Gets the value of the accountHolderDetails property.
             * 
             * @return
             *     possible object is
             *     {@link PNRAddFrequentFlyer.FqtvGroup.FqtvData.AccountHolderDetails }
             *     
             */
            public PNRAddFrequentFlyer.FqtvGroup.FqtvData.AccountHolderDetails getAccountHolderDetails() {
                return accountHolderDetails;
            }

            /**
             * Sets the value of the accountHolderDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRAddFrequentFlyer.FqtvGroup.FqtvData.AccountHolderDetails }
             *     
             */
            public void setAccountHolderDetails(PNRAddFrequentFlyer.FqtvGroup.FqtvData.AccountHolderDetails value) {
                this.accountHolderDetails = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="frequentTravellerId">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="27"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "frequentTravellerId"
            })
            public static class AccountDetails {

                @XmlElement(required = true)
                protected String frequentTravellerId;

                /**
                 * Gets the value of the frequentTravellerId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrequentTravellerId() {
                    return frequentTravellerId;
                }

                /**
                 * Sets the value of the frequentTravellerId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrequentTravellerId(String value) {
                    this.frequentTravellerId = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="givenName">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="56"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "givenName"
            })
            public static class AccountHolderDetails {

                @XmlElement(required = true)
                protected String givenName;

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

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="marketingCompany">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="operatingCompany" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "marketingCompany",
                "operatingCompany"
            })
            public static class CompanyDetails {

                @XmlElement(required = true)
                protected String marketingCompany;
                protected String operatingCompany;

                /**
                 * Gets the value of the marketingCompany property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMarketingCompany() {
                    return marketingCompany;
                }

                /**
                 * Sets the value of the marketingCompany property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMarketingCompany(String value) {
                    this.marketingCompany = value;
                }

                /**
                 * Gets the value of the operatingCompany property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOperatingCompany() {
                    return operatingCompany;
                }

                /**
                 * Sets the value of the operatingCompany property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOperatingCompany(String value) {
                    this.operatingCompany = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="paxInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="paxDetails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="surname">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="otherPaxDetails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="givenName">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="56"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="uniqueCustomerIdentifier">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fqtvGroup" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;sequence>
     *                     &lt;element name="fqtvData">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="actionRequest">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="3"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="companyDetails">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="marketingCompany">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;minLength value="1"/>
     *                                               &lt;maxLength value="3"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="operatingCompany" minOccurs="0">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;minLength value="1"/>
     *                                               &lt;maxLength value="3"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="accountDetails">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="frequentTravellerId">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;minLength value="1"/>
     *                                               &lt;maxLength value="27"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="accountHolderDetails" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="givenName">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;minLength value="1"/>
     *                                               &lt;maxLength value="56"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paxInfo",
        "fqtvGroup"
    })
    public static class PaxInfoGroup {

        @XmlElement(required = true)
        protected PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo paxInfo;
        protected List<PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup> fqtvGroup;

        /**
         * Gets the value of the paxInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo }
         *     
         */
        public PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo getPaxInfo() {
            return paxInfo;
        }

        /**
         * Sets the value of the paxInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo }
         *     
         */
        public void setPaxInfo(PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo value) {
            this.paxInfo = value;
        }

        /**
         * Gets the value of the fqtvGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fqtvGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFqtvGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup }
         * 
         * 
         */
        public List<PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup> getFqtvGroup() {
            if (fqtvGroup == null) {
                fqtvGroup = new ArrayList<PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup>();
            }
            return this.fqtvGroup;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;sequence>
         *           &lt;element name="fqtvData">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="actionRequest">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="3"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="companyDetails">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="marketingCompany">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="3"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="operatingCompany" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="3"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="accountDetails">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="frequentTravellerId">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="27"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="accountHolderDetails" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="givenName">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;minLength value="1"/>
         *                                     &lt;maxLength value="56"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/sequence>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fqtvData"
        })
        public static class FqtvGroup {

            @XmlElement(required = true)
            protected PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData fqtvData;

            /**
             * Gets the value of the fqtvData property.
             * 
             * @return
             *     possible object is
             *     {@link PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData }
             *     
             */
            public PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData getFqtvData() {
                return fqtvData;
            }

            /**
             * Sets the value of the fqtvData property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData }
             *     
             */
            public void setFqtvData(PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData value) {
                this.fqtvData = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="actionRequest">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="companyDetails">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="marketingCompany">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="operatingCompany" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="3"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="accountDetails">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="frequentTravellerId">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="27"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="accountHolderDetails" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="givenName">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="56"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "actionRequest",
                "companyDetails",
                "accountDetails",
                "accountHolderDetails"
            })
            public static class FqtvData {

                @XmlElement(required = true)
                protected String actionRequest;
                @XmlElement(required = true)
                protected PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.CompanyDetails companyDetails;
                @XmlElement(required = true)
                protected PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.AccountDetails accountDetails;
                protected PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.AccountHolderDetails accountHolderDetails;

                /**
                 * Gets the value of the actionRequest property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getActionRequest() {
                    return actionRequest;
                }

                /**
                 * Sets the value of the actionRequest property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setActionRequest(String value) {
                    this.actionRequest = value;
                }

                /**
                 * Gets the value of the companyDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.CompanyDetails }
                 *     
                 */
                public PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.CompanyDetails getCompanyDetails() {
                    return companyDetails;
                }

                /**
                 * Sets the value of the companyDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.CompanyDetails }
                 *     
                 */
                public void setCompanyDetails(PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.CompanyDetails value) {
                    this.companyDetails = value;
                }

                /**
                 * Gets the value of the accountDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.AccountDetails }
                 *     
                 */
                public PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.AccountDetails getAccountDetails() {
                    return accountDetails;
                }

                /**
                 * Sets the value of the accountDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.AccountDetails }
                 *     
                 */
                public void setAccountDetails(PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.AccountDetails value) {
                    this.accountDetails = value;
                }

                /**
                 * Gets the value of the accountHolderDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.AccountHolderDetails }
                 *     
                 */
                public PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.AccountHolderDetails getAccountHolderDetails() {
                    return accountHolderDetails;
                }

                /**
                 * Sets the value of the accountHolderDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.AccountHolderDetails }
                 *     
                 */
                public void setAccountHolderDetails(PNRAddFrequentFlyer.PaxInfoGroup.FqtvGroup.FqtvData.AccountHolderDetails value) {
                    this.accountHolderDetails = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="frequentTravellerId">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="27"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "frequentTravellerId"
                })
                public static class AccountDetails {

                    @XmlElement(required = true)
                    protected String frequentTravellerId;

                    /**
                     * Gets the value of the frequentTravellerId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFrequentTravellerId() {
                        return frequentTravellerId;
                    }

                    /**
                     * Sets the value of the frequentTravellerId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFrequentTravellerId(String value) {
                        this.frequentTravellerId = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="givenName">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="56"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "givenName"
                })
                public static class AccountHolderDetails {

                    @XmlElement(required = true)
                    protected String givenName;

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

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="marketingCompany">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="operatingCompany" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "marketingCompany",
                    "operatingCompany"
                })
                public static class CompanyDetails {

                    @XmlElement(required = true)
                    protected String marketingCompany;
                    protected String operatingCompany;

                    /**
                     * Gets the value of the marketingCompany property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMarketingCompany() {
                        return marketingCompany;
                    }

                    /**
                     * Sets the value of the marketingCompany property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMarketingCompany(String value) {
                        this.marketingCompany = value;
                    }

                    /**
                     * Gets the value of the operatingCompany property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOperatingCompany() {
                        return operatingCompany;
                    }

                    /**
                     * Sets the value of the operatingCompany property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOperatingCompany(String value) {
                        this.operatingCompany = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="paxDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="surname">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="otherPaxDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="givenName">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="56"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="uniqueCustomerIdentifier">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paxDetails",
            "otherPaxDetails"
        })
        public static class PaxInfo {

            @XmlElement(required = true)
            protected PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo.PaxDetails paxDetails;
            @XmlElement(required = true)
            protected PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo.OtherPaxDetails otherPaxDetails;

            /**
             * Gets the value of the paxDetails property.
             * 
             * @return
             *     possible object is
             *     {@link PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo.PaxDetails }
             *     
             */
            public PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo.PaxDetails getPaxDetails() {
                return paxDetails;
            }

            /**
             * Sets the value of the paxDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo.PaxDetails }
             *     
             */
            public void setPaxDetails(PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo.PaxDetails value) {
                this.paxDetails = value;
            }

            /**
             * Gets the value of the otherPaxDetails property.
             * 
             * @return
             *     possible object is
             *     {@link PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo.OtherPaxDetails }
             *     
             */
            public PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo.OtherPaxDetails getOtherPaxDetails() {
                return otherPaxDetails;
            }

            /**
             * Sets the value of the otherPaxDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo.OtherPaxDetails }
             *     
             */
            public void setOtherPaxDetails(PNRAddFrequentFlyer.PaxInfoGroup.PaxInfo.OtherPaxDetails value) {
                this.otherPaxDetails = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="givenName">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="56"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="uniqueCustomerIdentifier">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "givenName",
                "uniqueCustomerIdentifier"
            })
            public static class OtherPaxDetails {

                @XmlElement(required = true)
                protected String givenName;
                @XmlElement(required = true)
                protected BigDecimal uniqueCustomerIdentifier;

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
                 * Gets the value of the uniqueCustomerIdentifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUniqueCustomerIdentifier() {
                    return uniqueCustomerIdentifier;
                }

                /**
                 * Sets the value of the uniqueCustomerIdentifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUniqueCustomerIdentifier(BigDecimal value) {
                    this.uniqueCustomerIdentifier = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="surname">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="70"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "surname"
            })
            public static class PaxDetails {

                @XmlElement(required = true)
                protected String surname;

                /**
                 * Gets the value of the surname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSurname() {
                    return surname;
                }

                /**
                 * Sets the value of the surname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSurname(String value) {
                    this.surname = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="reservation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="controlNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reservation"
    })
    public static class PnrInfo {

        @XmlElement(required = true)
        protected PNRAddFrequentFlyer.PnrInfo.Reservation reservation;

        /**
         * Gets the value of the reservation property.
         * 
         * @return
         *     possible object is
         *     {@link PNRAddFrequentFlyer.PnrInfo.Reservation }
         *     
         */
        public PNRAddFrequentFlyer.PnrInfo.Reservation getReservation() {
            return reservation;
        }

        /**
         * Sets the value of the reservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRAddFrequentFlyer.PnrInfo.Reservation }
         *     
         */
        public void setReservation(PNRAddFrequentFlyer.PnrInfo.Reservation value) {
            this.reservation = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="controlNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "controlNumber"
        })
        public static class Reservation {

            @XmlElement(required = true)
            protected String controlNumber;

            /**
             * Gets the value of the controlNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getControlNumber() {
                return controlNumber;
            }

            /**
             * Sets the value of the controlNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setControlNumber(String value) {
                this.controlNumber = value;
            }

        }

    }

}
