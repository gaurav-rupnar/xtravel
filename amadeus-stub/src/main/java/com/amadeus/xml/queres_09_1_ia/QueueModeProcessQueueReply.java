
package com.amadeus.xml.queres_09_1_ia;

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
 *         &lt;element name="messageAction" type="{http://xml.amadeus.com/QUERES_09_1_IA}MessageActionDetailsTypeI"/>
 *         &lt;element name="statusInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}StatusTypeI" minOccurs="0"/>
 *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/QUERES_09_1_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
 *         &lt;element name="errorDetailsgroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errorInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}ApplicationErrorInformationTypeI"/>
 *                   &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/QUERES_09_1_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="headerInfoGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="selectionInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}SelectionDetailsTypeI"/>
 *                   &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}DateAndTimeInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="officeDetails" type="{http://xml.amadeus.com/QUERES_09_1_IA}TicketAgentInfoTypeI" minOccurs="0"/>
 *                   &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/QUERES_09_1_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                   &lt;element name="pnrRecLocator" type="{http://xml.amadeus.com/QUERES_09_1_IA}ReservationControlInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="quantityInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}QuantityTypeI" minOccurs="0"/>
 *                   &lt;element name="queueInfoGrp" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="queueInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}QueueInformationTypeI"/>
 *                             &lt;element name="subQueueDetails" type="{http://xml.amadeus.com/QUERES_09_1_IA}SubQueueInformationTypeI" maxOccurs="2" minOccurs="0"/>
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
    "messageAction",
    "statusInfo",
    "interactiveFreeText",
    "errorDetailsgroup",
    "headerInfoGroup"
})
@XmlRootElement(name = "QueueMode_ProcessQueueReply")
public class QueueModeProcessQueueReply {

    @XmlElement(required = true)
    protected MessageActionDetailsTypeI messageAction;
    protected StatusTypeI statusInfo;
    protected InteractiveFreeTextTypeI interactiveFreeText;
    protected QueueModeProcessQueueReply.ErrorDetailsgroup errorDetailsgroup;
    protected QueueModeProcessQueueReply.HeaderInfoGroup headerInfoGroup;

    /**
     * Gets the value of the messageAction property.
     * 
     * @return
     *     possible object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public MessageActionDetailsTypeI getMessageAction() {
        return messageAction;
    }

    /**
     * Sets the value of the messageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public void setMessageAction(MessageActionDetailsTypeI value) {
        this.messageAction = value;
    }

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTypeI }
     *     
     */
    public StatusTypeI getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTypeI }
     *     
     */
    public void setStatusInfo(StatusTypeI value) {
        this.statusInfo = value;
    }

    /**
     * Gets the value of the interactiveFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link InteractiveFreeTextTypeI }
     *     
     */
    public InteractiveFreeTextTypeI getInteractiveFreeText() {
        return interactiveFreeText;
    }

    /**
     * Sets the value of the interactiveFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractiveFreeTextTypeI }
     *     
     */
    public void setInteractiveFreeText(InteractiveFreeTextTypeI value) {
        this.interactiveFreeText = value;
    }

    /**
     * Gets the value of the errorDetailsgroup property.
     * 
     * @return
     *     possible object is
     *     {@link QueueModeProcessQueueReply.ErrorDetailsgroup }
     *     
     */
    public QueueModeProcessQueueReply.ErrorDetailsgroup getErrorDetailsgroup() {
        return errorDetailsgroup;
    }

    /**
     * Sets the value of the errorDetailsgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueModeProcessQueueReply.ErrorDetailsgroup }
     *     
     */
    public void setErrorDetailsgroup(QueueModeProcessQueueReply.ErrorDetailsgroup value) {
        this.errorDetailsgroup = value;
    }

    /**
     * Gets the value of the headerInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link QueueModeProcessQueueReply.HeaderInfoGroup }
     *     
     */
    public QueueModeProcessQueueReply.HeaderInfoGroup getHeaderInfoGroup() {
        return headerInfoGroup;
    }

    /**
     * Sets the value of the headerInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueModeProcessQueueReply.HeaderInfoGroup }
     *     
     */
    public void setHeaderInfoGroup(QueueModeProcessQueueReply.HeaderInfoGroup value) {
        this.headerInfoGroup = value;
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
     *         &lt;element name="errorInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}ApplicationErrorInformationTypeI"/>
     *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/QUERES_09_1_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
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
        "errorInfo",
        "interactiveFreeText"
    })
    public static class ErrorDetailsgroup {

        @XmlElement(required = true)
        protected ApplicationErrorInformationTypeI errorInfo;
        protected InteractiveFreeTextTypeI interactiveFreeText;

        /**
         * Gets the value of the errorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationTypeI }
         *     
         */
        public ApplicationErrorInformationTypeI getErrorInfo() {
            return errorInfo;
        }

        /**
         * Sets the value of the errorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationTypeI }
         *     
         */
        public void setErrorInfo(ApplicationErrorInformationTypeI value) {
            this.errorInfo = value;
        }

        /**
         * Gets the value of the interactiveFreeText property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public InteractiveFreeTextTypeI getInteractiveFreeText() {
            return interactiveFreeText;
        }

        /**
         * Sets the value of the interactiveFreeText property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public void setInteractiveFreeText(InteractiveFreeTextTypeI value) {
            this.interactiveFreeText = value;
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
     *         &lt;element name="selectionInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}SelectionDetailsTypeI"/>
     *         &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}DateAndTimeInformationTypeI" minOccurs="0"/>
     *         &lt;element name="officeDetails" type="{http://xml.amadeus.com/QUERES_09_1_IA}TicketAgentInfoTypeI" minOccurs="0"/>
     *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/QUERES_09_1_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
     *         &lt;element name="pnrRecLocator" type="{http://xml.amadeus.com/QUERES_09_1_IA}ReservationControlInformationTypeI" minOccurs="0"/>
     *         &lt;element name="quantityInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}QuantityTypeI" minOccurs="0"/>
     *         &lt;element name="queueInfoGrp" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="queueInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}QueueInformationTypeI"/>
     *                   &lt;element name="subQueueDetails" type="{http://xml.amadeus.com/QUERES_09_1_IA}SubQueueInformationTypeI" maxOccurs="2" minOccurs="0"/>
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
        "selectionInfo",
        "dateTimeInfo",
        "officeDetails",
        "interactiveFreeText",
        "pnrRecLocator",
        "quantityInfo",
        "queueInfoGrp"
    })
    public static class HeaderInfoGroup {

        @XmlElement(required = true)
        protected SelectionDetailsTypeI selectionInfo;
        protected DateAndTimeInformationTypeI dateTimeInfo;
        protected TicketAgentInfoTypeI officeDetails;
        protected InteractiveFreeTextTypeI interactiveFreeText;
        protected ReservationControlInformationTypeI pnrRecLocator;
        protected QuantityTypeI quantityInfo;
        protected QueueModeProcessQueueReply.HeaderInfoGroup.QueueInfoGrp queueInfoGrp;

        /**
         * Gets the value of the selectionInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SelectionDetailsTypeI }
         *     
         */
        public SelectionDetailsTypeI getSelectionInfo() {
            return selectionInfo;
        }

        /**
         * Sets the value of the selectionInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectionDetailsTypeI }
         *     
         */
        public void setSelectionInfo(SelectionDetailsTypeI value) {
            this.selectionInfo = value;
        }

        /**
         * Gets the value of the dateTimeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link DateAndTimeInformationTypeI }
         *     
         */
        public DateAndTimeInformationTypeI getDateTimeInfo() {
            return dateTimeInfo;
        }

        /**
         * Sets the value of the dateTimeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateAndTimeInformationTypeI }
         *     
         */
        public void setDateTimeInfo(DateAndTimeInformationTypeI value) {
            this.dateTimeInfo = value;
        }

        /**
         * Gets the value of the officeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TicketAgentInfoTypeI }
         *     
         */
        public TicketAgentInfoTypeI getOfficeDetails() {
            return officeDetails;
        }

        /**
         * Sets the value of the officeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketAgentInfoTypeI }
         *     
         */
        public void setOfficeDetails(TicketAgentInfoTypeI value) {
            this.officeDetails = value;
        }

        /**
         * Gets the value of the interactiveFreeText property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public InteractiveFreeTextTypeI getInteractiveFreeText() {
            return interactiveFreeText;
        }

        /**
         * Sets the value of the interactiveFreeText property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextTypeI }
         *     
         */
        public void setInteractiveFreeText(InteractiveFreeTextTypeI value) {
            this.interactiveFreeText = value;
        }

        /**
         * Gets the value of the pnrRecLocator property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformationTypeI }
         *     
         */
        public ReservationControlInformationTypeI getPnrRecLocator() {
            return pnrRecLocator;
        }

        /**
         * Sets the value of the pnrRecLocator property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformationTypeI }
         *     
         */
        public void setPnrRecLocator(ReservationControlInformationTypeI value) {
            this.pnrRecLocator = value;
        }

        /**
         * Gets the value of the quantityInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QuantityTypeI }
         *     
         */
        public QuantityTypeI getQuantityInfo() {
            return quantityInfo;
        }

        /**
         * Sets the value of the quantityInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuantityTypeI }
         *     
         */
        public void setQuantityInfo(QuantityTypeI value) {
            this.quantityInfo = value;
        }

        /**
         * Gets the value of the queueInfoGrp property.
         * 
         * @return
         *     possible object is
         *     {@link QueueModeProcessQueueReply.HeaderInfoGroup.QueueInfoGrp }
         *     
         */
        public QueueModeProcessQueueReply.HeaderInfoGroup.QueueInfoGrp getQueueInfoGrp() {
            return queueInfoGrp;
        }

        /**
         * Sets the value of the queueInfoGrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueueModeProcessQueueReply.HeaderInfoGroup.QueueInfoGrp }
         *     
         */
        public void setQueueInfoGrp(QueueModeProcessQueueReply.HeaderInfoGroup.QueueInfoGrp value) {
            this.queueInfoGrp = value;
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
         *         &lt;element name="queueInfo" type="{http://xml.amadeus.com/QUERES_09_1_IA}QueueInformationTypeI"/>
         *         &lt;element name="subQueueDetails" type="{http://xml.amadeus.com/QUERES_09_1_IA}SubQueueInformationTypeI" maxOccurs="2" minOccurs="0"/>
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
            "queueInfo",
            "subQueueDetails"
        })
        public static class QueueInfoGrp {

            @XmlElement(required = true)
            protected QueueInformationTypeI queueInfo;
            protected List<SubQueueInformationTypeI> subQueueDetails;

            /**
             * Gets the value of the queueInfo property.
             * 
             * @return
             *     possible object is
             *     {@link QueueInformationTypeI }
             *     
             */
            public QueueInformationTypeI getQueueInfo() {
                return queueInfo;
            }

            /**
             * Sets the value of the queueInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link QueueInformationTypeI }
             *     
             */
            public void setQueueInfo(QueueInformationTypeI value) {
                this.queueInfo = value;
            }

            /**
             * Gets the value of the subQueueDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subQueueDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubQueueDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SubQueueInformationTypeI }
             * 
             * 
             */
            public List<SubQueueInformationTypeI> getSubQueueDetails() {
                if (subQueueDetails == null) {
                    subQueueDetails = new ArrayList<SubQueueInformationTypeI>();
                }
                return this.subQueueDetails;
            }

        }

    }

}
