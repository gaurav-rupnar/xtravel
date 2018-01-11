
package com.amadeus.xml.qcsdrq_13_1_1a;

import java.math.BigDecimal;
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
 *         &lt;element name="queueingOptions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="selectionDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="option">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
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
 *         &lt;element name="targetOffice" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sourceType">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sourceQualifier1">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="originatorDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="inHouseIdentification1">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="9"/>
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
 *         &lt;element name="queueNumber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="queueDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="number">
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
 *         &lt;element name="categorySelection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subQueueInfoDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="identificationType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="itemNumber" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="itemDescription" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="35"/>
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
    "queueingOptions",
    "targetOffice",
    "queueNumber",
    "categorySelection"
})
@XmlRootElement(name = "Queue_CountTotal")
public class QueueCountTotal {

    @XmlElement(required = true)
    protected QueueCountTotal.QueueingOptions queueingOptions;
    protected QueueCountTotal.TargetOffice targetOffice;
    protected QueueCountTotal.QueueNumber queueNumber;
    protected QueueCountTotal.CategorySelection categorySelection;

    /**
     * Gets the value of the queueingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link QueueCountTotal.QueueingOptions }
     *     
     */
    public QueueCountTotal.QueueingOptions getQueueingOptions() {
        return queueingOptions;
    }

    /**
     * Sets the value of the queueingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueCountTotal.QueueingOptions }
     *     
     */
    public void setQueueingOptions(QueueCountTotal.QueueingOptions value) {
        this.queueingOptions = value;
    }

    /**
     * Gets the value of the targetOffice property.
     * 
     * @return
     *     possible object is
     *     {@link QueueCountTotal.TargetOffice }
     *     
     */
    public QueueCountTotal.TargetOffice getTargetOffice() {
        return targetOffice;
    }

    /**
     * Sets the value of the targetOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueCountTotal.TargetOffice }
     *     
     */
    public void setTargetOffice(QueueCountTotal.TargetOffice value) {
        this.targetOffice = value;
    }

    /**
     * Gets the value of the queueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueueCountTotal.QueueNumber }
     *     
     */
    public QueueCountTotal.QueueNumber getQueueNumber() {
        return queueNumber;
    }

    /**
     * Sets the value of the queueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueCountTotal.QueueNumber }
     *     
     */
    public void setQueueNumber(QueueCountTotal.QueueNumber value) {
        this.queueNumber = value;
    }

    /**
     * Gets the value of the categorySelection property.
     * 
     * @return
     *     possible object is
     *     {@link QueueCountTotal.CategorySelection }
     *     
     */
    public QueueCountTotal.CategorySelection getCategorySelection() {
        return categorySelection;
    }

    /**
     * Sets the value of the categorySelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueCountTotal.CategorySelection }
     *     
     */
    public void setCategorySelection(QueueCountTotal.CategorySelection value) {
        this.categorySelection = value;
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
     *         &lt;element name="subQueueInfoDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="identificationType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="itemNumber" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="itemDescription" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="35"/>
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
        "subQueueInfoDetails"
    })
    public static class CategorySelection {

        @XmlElement(required = true)
        protected QueueCountTotal.CategorySelection.SubQueueInfoDetails subQueueInfoDetails;

        /**
         * Gets the value of the subQueueInfoDetails property.
         * 
         * @return
         *     possible object is
         *     {@link QueueCountTotal.CategorySelection.SubQueueInfoDetails }
         *     
         */
        public QueueCountTotal.CategorySelection.SubQueueInfoDetails getSubQueueInfoDetails() {
            return subQueueInfoDetails;
        }

        /**
         * Sets the value of the subQueueInfoDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueueCountTotal.CategorySelection.SubQueueInfoDetails }
         *     
         */
        public void setSubQueueInfoDetails(QueueCountTotal.CategorySelection.SubQueueInfoDetails value) {
            this.subQueueInfoDetails = value;
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
         *         &lt;element name="identificationType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="itemNumber" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="itemDescription" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="35"/>
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
            "identificationType",
            "itemNumber",
            "itemDescription"
        })
        public static class SubQueueInfoDetails {

            @XmlElement(required = true)
            protected String identificationType;
            protected String itemNumber;
            protected String itemDescription;

            /**
             * Gets the value of the identificationType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentificationType() {
                return identificationType;
            }

            /**
             * Sets the value of the identificationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentificationType(String value) {
                this.identificationType = value;
            }

            /**
             * Gets the value of the itemNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemNumber() {
                return itemNumber;
            }

            /**
             * Sets the value of the itemNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemNumber(String value) {
                this.itemNumber = value;
            }

            /**
             * Gets the value of the itemDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemDescription() {
                return itemDescription;
            }

            /**
             * Sets the value of the itemDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemDescription(String value) {
                this.itemDescription = value;
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
     *         &lt;element name="queueDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="number">
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
        "queueDetails"
    })
    public static class QueueNumber {

        @XmlElement(required = true)
        protected QueueCountTotal.QueueNumber.QueueDetails queueDetails;

        /**
         * Gets the value of the queueDetails property.
         * 
         * @return
         *     possible object is
         *     {@link QueueCountTotal.QueueNumber.QueueDetails }
         *     
         */
        public QueueCountTotal.QueueNumber.QueueDetails getQueueDetails() {
            return queueDetails;
        }

        /**
         * Sets the value of the queueDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueueCountTotal.QueueNumber.QueueDetails }
         *     
         */
        public void setQueueDetails(QueueCountTotal.QueueNumber.QueueDetails value) {
            this.queueDetails = value;
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
         *         &lt;element name="number">
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
            "number"
        })
        public static class QueueDetails {

            @XmlElement(required = true)
            protected BigDecimal number;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNumber(BigDecimal value) {
                this.number = value;
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
     *         &lt;element name="selectionDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="option">
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
        "selectionDetails"
    })
    public static class QueueingOptions {

        @XmlElement(required = true)
        protected QueueCountTotal.QueueingOptions.SelectionDetails selectionDetails;

        /**
         * Gets the value of the selectionDetails property.
         * 
         * @return
         *     possible object is
         *     {@link QueueCountTotal.QueueingOptions.SelectionDetails }
         *     
         */
        public QueueCountTotal.QueueingOptions.SelectionDetails getSelectionDetails() {
            return selectionDetails;
        }

        /**
         * Sets the value of the selectionDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueueCountTotal.QueueingOptions.SelectionDetails }
         *     
         */
        public void setSelectionDetails(QueueCountTotal.QueueingOptions.SelectionDetails value) {
            this.selectionDetails = value;
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
         *         &lt;element name="option">
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
            "option"
        })
        public static class SelectionDetails {

            @XmlElement(required = true)
            protected String option;

            /**
             * Gets the value of the option property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOption() {
                return option;
            }

            /**
             * Sets the value of the option property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOption(String value) {
                this.option = value;
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
     *         &lt;element name="sourceType">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sourceQualifier1">
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
     *         &lt;element name="originatorDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="inHouseIdentification1">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="9"/>
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
        "sourceType",
        "originatorDetails"
    })
    public static class TargetOffice {

        @XmlElement(required = true)
        protected QueueCountTotal.TargetOffice.SourceType sourceType;
        @XmlElement(required = true)
        protected QueueCountTotal.TargetOffice.OriginatorDetails originatorDetails;

        /**
         * Gets the value of the sourceType property.
         * 
         * @return
         *     possible object is
         *     {@link QueueCountTotal.TargetOffice.SourceType }
         *     
         */
        public QueueCountTotal.TargetOffice.SourceType getSourceType() {
            return sourceType;
        }

        /**
         * Sets the value of the sourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueueCountTotal.TargetOffice.SourceType }
         *     
         */
        public void setSourceType(QueueCountTotal.TargetOffice.SourceType value) {
            this.sourceType = value;
        }

        /**
         * Gets the value of the originatorDetails property.
         * 
         * @return
         *     possible object is
         *     {@link QueueCountTotal.TargetOffice.OriginatorDetails }
         *     
         */
        public QueueCountTotal.TargetOffice.OriginatorDetails getOriginatorDetails() {
            return originatorDetails;
        }

        /**
         * Sets the value of the originatorDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueueCountTotal.TargetOffice.OriginatorDetails }
         *     
         */
        public void setOriginatorDetails(QueueCountTotal.TargetOffice.OriginatorDetails value) {
            this.originatorDetails = value;
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
         *         &lt;element name="inHouseIdentification1">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="9"/>
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
            "inHouseIdentification1"
        })
        public static class OriginatorDetails {

            @XmlElement(required = true)
            protected String inHouseIdentification1;

            /**
             * Gets the value of the inHouseIdentification1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInHouseIdentification1() {
                return inHouseIdentification1;
            }

            /**
             * Sets the value of the inHouseIdentification1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInHouseIdentification1(String value) {
                this.inHouseIdentification1 = value;
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
         *         &lt;element name="sourceQualifier1">
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
            "sourceQualifier1"
        })
        public static class SourceType {

            @XmlElement(required = true)
            protected String sourceQualifier1;

            /**
             * Gets the value of the sourceQualifier1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceQualifier1() {
                return sourceQualifier1;
            }

            /**
             * Sets the value of the sourceQualifier1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceQualifier1(String value) {
                this.sourceQualifier1 = value;
            }

        }

    }

}
