
package com.amadeus.xml.quereq_09_1_ia;

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
 *         &lt;element name="messageActionDetails" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}MessageActionDetailsTypeI"/>
 *         &lt;element name="recordLocator" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}ReservationControlInformationTypeI" minOccurs="0"/>
 *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}InteractiveFreeTextTypeI" minOccurs="0"/>
 *         &lt;element name="queueInfoDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="selectionInfoDetails" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}SelectionDetailsTypeI"/>
 *                   &lt;element name="queueGroup" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="queueInfo" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}QueueInformationTypeI"/>
 *                             &lt;element name="subQueueInfo" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}SubQueueInformationTypeI" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="targetOffice" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}TicketAgentInfoTypeI" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}DateAndTimeInformationTypeI" minOccurs="0"/>
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
    "messageActionDetails",
    "recordLocator",
    "interactiveFreeText",
    "queueInfoDetails"
})
@XmlRootElement(name = "QueueMode_ProcessQueue")
public class QueueModeProcessQueue {

    @XmlElement(required = true)
    protected MessageActionDetailsTypeI messageActionDetails;
    protected ReservationControlInformationTypeI recordLocator;
    protected InteractiveFreeTextTypeI interactiveFreeText;
    protected QueueModeProcessQueue.QueueInfoDetails queueInfoDetails;

    /**
     * Gets the value of the messageActionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public MessageActionDetailsTypeI getMessageActionDetails() {
        return messageActionDetails;
    }

    /**
     * Sets the value of the messageActionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public void setMessageActionDetails(MessageActionDetailsTypeI value) {
        this.messageActionDetails = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setRecordLocator(ReservationControlInformationTypeI value) {
        this.recordLocator = value;
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
     * Gets the value of the queueInfoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QueueModeProcessQueue.QueueInfoDetails }
     *     
     */
    public QueueModeProcessQueue.QueueInfoDetails getQueueInfoDetails() {
        return queueInfoDetails;
    }

    /**
     * Sets the value of the queueInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueModeProcessQueue.QueueInfoDetails }
     *     
     */
    public void setQueueInfoDetails(QueueModeProcessQueue.QueueInfoDetails value) {
        this.queueInfoDetails = value;
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
     *         &lt;element name="selectionInfoDetails" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}SelectionDetailsTypeI"/>
     *         &lt;element name="queueGroup" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="queueInfo" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}QueueInformationTypeI"/>
     *                   &lt;element name="subQueueInfo" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}SubQueueInformationTypeI" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="targetOffice" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}TicketAgentInfoTypeI" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}DateAndTimeInformationTypeI" minOccurs="0"/>
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
        "selectionInfoDetails",
        "queueGroup",
        "dateTimeInfo"
    })
    public static class QueueInfoDetails {

        @XmlElement(required = true)
        protected SelectionDetailsTypeI selectionInfoDetails;
        protected List<QueueModeProcessQueue.QueueInfoDetails.QueueGroup> queueGroup;
        protected DateAndTimeInformationTypeI dateTimeInfo;

        /**
         * Gets the value of the selectionInfoDetails property.
         * 
         * @return
         *     possible object is
         *     {@link SelectionDetailsTypeI }
         *     
         */
        public SelectionDetailsTypeI getSelectionInfoDetails() {
            return selectionInfoDetails;
        }

        /**
         * Sets the value of the selectionInfoDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectionDetailsTypeI }
         *     
         */
        public void setSelectionInfoDetails(SelectionDetailsTypeI value) {
            this.selectionInfoDetails = value;
        }

        /**
         * Gets the value of the queueGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queueGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueueGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QueueModeProcessQueue.QueueInfoDetails.QueueGroup }
         * 
         * 
         */
        public List<QueueModeProcessQueue.QueueInfoDetails.QueueGroup> getQueueGroup() {
            if (queueGroup == null) {
                queueGroup = new ArrayList<QueueModeProcessQueue.QueueInfoDetails.QueueGroup>();
            }
            return this.queueGroup;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="queueInfo" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}QueueInformationTypeI"/>
         *         &lt;element name="subQueueInfo" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}SubQueueInformationTypeI" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="targetOffice" type="{http://xml.amadeus.com/QUEREQ_09_1_IA}TicketAgentInfoTypeI" minOccurs="0"/>
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
            "subQueueInfo",
            "targetOffice"
        })
        public static class QueueGroup {

            @XmlElement(required = true)
            protected QueueInformationTypeI queueInfo;
            protected List<SubQueueInformationTypeI> subQueueInfo;
            protected TicketAgentInfoTypeI targetOffice;

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
             * Gets the value of the subQueueInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subQueueInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubQueueInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SubQueueInformationTypeI }
             * 
             * 
             */
            public List<SubQueueInformationTypeI> getSubQueueInfo() {
                if (subQueueInfo == null) {
                    subQueueInfo = new ArrayList<SubQueueInformationTypeI>();
                }
                return this.subQueueInfo;
            }

            /**
             * Gets the value of the targetOffice property.
             * 
             * @return
             *     possible object is
             *     {@link TicketAgentInfoTypeI }
             *     
             */
            public TicketAgentInfoTypeI getTargetOffice() {
                return targetOffice;
            }

            /**
             * Sets the value of the targetOffice property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketAgentInfoTypeI }
             *     
             */
            public void setTargetOffice(TicketAgentInfoTypeI value) {
                this.targetOffice = value;
            }

        }

    }

}
