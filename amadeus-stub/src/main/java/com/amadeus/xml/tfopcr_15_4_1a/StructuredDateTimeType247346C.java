
package com.amadeus.xml.tfopcr_15_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Store date and time in a structured way
 * 
 * <p>Java class for StructuredDateTimeType_247346C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeType_247346C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="year" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}Year_YYYY" minOccurs="0"/>
 *         &lt;element name="month" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}Month_mM" minOccurs="0"/>
 *         &lt;element name="day" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}Day_nN" minOccurs="0"/>
 *         &lt;element name="hour" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}Hour_hH" minOccurs="0"/>
 *         &lt;element name="minutes" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}Minute_mM" minOccurs="0"/>
 *         &lt;element name="seconds" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericString_Length1To2" minOccurs="0"/>
 *         &lt;element name="milliseconds" type="{http://xml.amadeus.com/TFOPCR_15_4_1A}NumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeType_247346C", propOrder = {
    "year",
    "month",
    "day",
    "hour",
    "minutes",
    "seconds",
    "milliseconds"
})
public class StructuredDateTimeType247346C {

    protected String year;
    protected String month;
    protected String day;
    protected String hour;
    protected String minutes;
    protected String seconds;
    protected String milliseconds;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDay(String value) {
        this.day = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHour(String value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinutes(String value) {
        this.minutes = value;
    }

    /**
     * Gets the value of the seconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeconds() {
        return seconds;
    }

    /**
     * Sets the value of the seconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeconds(String value) {
        this.seconds = value;
    }

    /**
     * Gets the value of the milliseconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilliseconds() {
        return milliseconds;
    }

    /**
     * Sets the value of the milliseconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilliseconds(String value) {
        this.milliseconds = value;
    }

}
