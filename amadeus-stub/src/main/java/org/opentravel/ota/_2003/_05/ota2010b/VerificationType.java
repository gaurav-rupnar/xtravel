
package org.opentravel.ota._2003._05.ota2010b;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Collection of data used to ensure the correct reservation is canceled or modified (e.g. in the case of a hotel reservation modification, a CustLoyalty/ MembershipID would be verified as part of the reservation that you plan to modify to ensure the correct reservation is being modified).
 * 
 * <p>Java class for VerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}PersonNameType">
 *                 &lt;attribute name="PartialName" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}EmailType" minOccurs="0"/>
 *         &lt;element name="TelephoneInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}TelephoneInfoGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentCard" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}PaymentCardType" minOccurs="0"/>
 *         &lt;element name="AddressInfo" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}AddressInfoType" minOccurs="0"/>
 *         &lt;element name="CustLoyalty" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CustomerLoyaltyGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CompanyNameType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ReservationTimeSpan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}DateTimeSpanGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AssociatedQuantity" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeListGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StartLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B>LocationType">
 *                 &lt;attribute name="AssociatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EndLocation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B>LocationType">
 *                 &lt;attribute name="AssociatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationType", propOrder = {
    "personName",
    "email",
    "telephoneInfo",
    "paymentCard",
    "addressInfo",
    "custLoyalty",
    "vendor",
    "reservationTimeSpan",
    "associatedQuantity",
    "startLocation",
    "endLocation",
    "tpaExtensions"
})
public class VerificationType {

    @XmlElement(name = "PersonName")
    protected VerificationType.PersonName personName;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlElement(name = "TelephoneInfo")
    protected VerificationType.TelephoneInfo telephoneInfo;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "AddressInfo")
    protected AddressInfoType addressInfo;
    @XmlElement(name = "CustLoyalty")
    protected List<VerificationType.CustLoyalty> custLoyalty;
    @XmlElement(name = "Vendor")
    protected List<CompanyNameType> vendor;
    @XmlElement(name = "ReservationTimeSpan")
    protected VerificationType.ReservationTimeSpan reservationTimeSpan;
    @XmlElement(name = "AssociatedQuantity")
    protected List<VerificationType.AssociatedQuantity> associatedQuantity;
    @XmlElement(name = "StartLocation")
    protected VerificationType.StartLocation startLocation;
    @XmlElement(name = "EndLocation")
    protected VerificationType.EndLocation endLocation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationType.PersonName }
     *     
     */
    public VerificationType.PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationType.PersonName }
     *     
     */
    public void setPersonName(VerificationType.PersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmail(EmailType value) {
        this.email = value;
    }

    /**
     * Gets the value of the telephoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationType.TelephoneInfo }
     *     
     */
    public VerificationType.TelephoneInfo getTelephoneInfo() {
        return telephoneInfo;
    }

    /**
     * Sets the value of the telephoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationType.TelephoneInfo }
     *     
     */
    public void setTelephoneInfo(VerificationType.TelephoneInfo value) {
        this.telephoneInfo = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddressInfo(AddressInfoType value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationType.CustLoyalty }
     * 
     * 
     */
    public List<VerificationType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<VerificationType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNameType }
     * 
     * 
     */
    public List<CompanyNameType> getVendor() {
        if (vendor == null) {
            vendor = new ArrayList<CompanyNameType>();
        }
        return this.vendor;
    }

    /**
     * Gets the value of the reservationTimeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationType.ReservationTimeSpan }
     *     
     */
    public VerificationType.ReservationTimeSpan getReservationTimeSpan() {
        return reservationTimeSpan;
    }

    /**
     * Sets the value of the reservationTimeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationType.ReservationTimeSpan }
     *     
     */
    public void setReservationTimeSpan(VerificationType.ReservationTimeSpan value) {
        this.reservationTimeSpan = value;
    }

    /**
     * Gets the value of the associatedQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationType.AssociatedQuantity }
     * 
     * 
     */
    public List<VerificationType.AssociatedQuantity> getAssociatedQuantity() {
        if (associatedQuantity == null) {
            associatedQuantity = new ArrayList<VerificationType.AssociatedQuantity>();
        }
        return this.associatedQuantity;
    }

    /**
     * Gets the value of the startLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationType.StartLocation }
     *     
     */
    public VerificationType.StartLocation getStartLocation() {
        return startLocation;
    }

    /**
     * Sets the value of the startLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationType.StartLocation }
     *     
     */
    public void setStartLocation(VerificationType.StartLocation value) {
        this.startLocation = value;
    }

    /**
     * Gets the value of the endLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationType.EndLocation }
     *     
     */
    public VerificationType.EndLocation getEndLocation() {
        return endLocation;
    }

    /**
     * Sets the value of the endLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationType.EndLocation }
     *     
     */
    public void setEndLocation(VerificationType.EndLocation value) {
        this.endLocation = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CodeListGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AssociatedQuantity {

        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}CustomerLoyaltyGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CustLoyalty {

        @XmlAttribute(name = "ProgramID")
        protected String programID;
        @XmlAttribute(name = "MembershipID")
        protected String membershipID;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "VendorCode")
        protected List<String> vendorCode;
        @XmlAttribute(name = "PrimaryLoyaltyIndicator")
        protected Boolean primaryLoyaltyIndicator;
        @XmlAttribute(name = "AllianceLoyaltyLevelName")
        protected String allianceLoyaltyLevelName;
        @XmlAttribute(name = "CustomerType")
        protected String customerType;
        @XmlAttribute(name = "CustomerValue")
        protected String customerValue;
        @XmlAttribute(name = "Password")
        protected String password;
        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;
        @XmlAttribute(name = "SignupDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signupDate;
        @XmlAttribute(name = "LoyalLevel")
        protected String loyalLevel;
        @XmlAttribute(name = "LoyalLevelCode")
        protected Integer loyalLevelCode;
        @XmlAttribute(name = "SingleVendorInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String singleVendorInd;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;

        /**
         * Gets the value of the programID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * Sets the value of the programID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * Gets the value of the membershipID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * Sets the value of the membershipID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
        }

        /**
         * Gets the value of the travelSector property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Sets the value of the travelSector property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the vendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * Gets the value of the primaryLoyaltyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryLoyaltyIndicator() {
            return primaryLoyaltyIndicator;
        }

        /**
         * Sets the value of the primaryLoyaltyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryLoyaltyIndicator(Boolean value) {
            this.primaryLoyaltyIndicator = value;
        }

        /**
         * Gets the value of the allianceLoyaltyLevelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllianceLoyaltyLevelName() {
            return allianceLoyaltyLevelName;
        }

        /**
         * Sets the value of the allianceLoyaltyLevelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllianceLoyaltyLevelName(String value) {
            this.allianceLoyaltyLevelName = value;
        }

        /**
         * Gets the value of the customerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerType() {
            return customerType;
        }

        /**
         * Sets the value of the customerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerType(String value) {
            this.customerType = value;
        }

        /**
         * Gets the value of the customerValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerValue() {
            return customerValue;
        }

        /**
         * Sets the value of the customerValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerValue(String value) {
            this.customerValue = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * Gets the value of the signupDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSignupDate() {
            return signupDate;
        }

        /**
         * Sets the value of the signupDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSignupDate(XMLGregorianCalendar value) {
            this.signupDate = value;
        }

        /**
         * Gets the value of the loyalLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyalLevel() {
            return loyalLevel;
        }

        /**
         * Sets the value of the loyalLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyalLevel(String value) {
            this.loyalLevel = value;
        }

        /**
         * Gets the value of the loyalLevelCode property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLoyalLevelCode() {
            return loyalLevelCode;
        }

        /**
         * Sets the value of the loyalLevelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLoyalLevelCode(Integer value) {
            this.loyalLevelCode = value;
        }

        /**
         * Gets the value of the singleVendorInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * Sets the value of the singleVendorInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleVendorInd(String value) {
            this.singleVendorInd = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the expireDateExclusiveIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExpireDateExclusiveIndicator() {
            return expireDateExclusiveIndicator;
        }

        /**
         * Sets the value of the expireDateExclusiveIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExpireDateExclusiveIndicator(Boolean value) {
            this.expireDateExclusiveIndicator = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B>LocationType">
     *       &lt;attribute name="AssociatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EndLocation
        extends LocationType
    {

        @XmlAttribute(name = "AssociatedDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar associatedDateTime;

        /**
         * Gets the value of the associatedDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAssociatedDateTime() {
            return associatedDateTime;
        }

        /**
         * Sets the value of the associatedDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAssociatedDateTime(XMLGregorianCalendar value) {
            this.associatedDateTime = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}PersonNameType">
     *       &lt;attribute name="PartialName" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PersonName
        extends PersonNameType
    {

        @XmlAttribute(name = "PartialName")
        protected Boolean partialName;

        /**
         * Gets the value of the partialName property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPartialName() {
            return partialName;
        }

        /**
         * Sets the value of the partialName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPartialName(Boolean value) {
            this.partialName = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}DateTimeSpanGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReservationTimeSpan {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B>LocationType">
     *       &lt;attribute name="AssociatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StartLocation
        extends LocationType
    {

        @XmlAttribute(name = "AssociatedDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar associatedDateTime;

        /**
         * Gets the value of the associatedDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAssociatedDateTime() {
            return associatedDateTime;
        }

        /**
         * Sets the value of the associatedDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAssociatedDateTime(XMLGregorianCalendar value) {
            this.associatedDateTime = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}TelephoneInfoGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TelephoneInfo {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;
        @XmlAttribute(name = "FormattedInd")
        protected Boolean formattedInd;
        @XmlAttribute(name = "PhoneLocationType")
        protected String phoneLocationType;
        @XmlAttribute(name = "PhoneTechType")
        protected String phoneTechType;
        @XmlAttribute(name = "PhoneUseType")
        protected String phoneUseType;
        @XmlAttribute(name = "CountryAccessCode")
        protected String countryAccessCode;
        @XmlAttribute(name = "AreaCityCode")
        protected String areaCityCode;
        @XmlAttribute(name = "PhoneNumber", required = true)
        protected String phoneNumber;
        @XmlAttribute(name = "Extension")
        protected String extension;
        @XmlAttribute(name = "PIN")
        protected String pin;
        @XmlAttribute(name = "Remark")
        protected String remark;
        @XmlAttribute(name = "DefaultInd")
        protected Boolean defaultInd;

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * Gets the value of the formattedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFormattedInd() {
            return formattedInd;
        }

        /**
         * Sets the value of the formattedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFormattedInd(Boolean value) {
            this.formattedInd = value;
        }

        /**
         * Gets the value of the phoneLocationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneLocationType() {
            return phoneLocationType;
        }

        /**
         * Sets the value of the phoneLocationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneLocationType(String value) {
            this.phoneLocationType = value;
        }

        /**
         * Gets the value of the phoneTechType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneTechType() {
            return phoneTechType;
        }

        /**
         * Sets the value of the phoneTechType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneTechType(String value) {
            this.phoneTechType = value;
        }

        /**
         * Gets the value of the phoneUseType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneUseType() {
            return phoneUseType;
        }

        /**
         * Sets the value of the phoneUseType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneUseType(String value) {
            this.phoneUseType = value;
        }

        /**
         * Gets the value of the countryAccessCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryAccessCode() {
            return countryAccessCode;
        }

        /**
         * Sets the value of the countryAccessCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryAccessCode(String value) {
            this.countryAccessCode = value;
        }

        /**
         * Gets the value of the areaCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCityCode() {
            return areaCityCode;
        }

        /**
         * Sets the value of the areaCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCityCode(String value) {
            this.areaCityCode = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

        /**
         * Gets the value of the pin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPIN() {
            return pin;
        }

        /**
         * Sets the value of the pin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPIN(String value) {
            this.pin = value;
        }

        /**
         * Gets the value of the remark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemark() {
            return remark;
        }

        /**
         * Sets the value of the remark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemark(String value) {
            this.remark = value;
        }

        /**
         * Gets the value of the defaultInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefaultInd() {
            return defaultInd;
        }

        /**
         * Sets the value of the defaultInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefaultInd(Boolean value) {
            this.defaultInd = value;
        }

    }

}