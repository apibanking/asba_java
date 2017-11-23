
package com.quantiguous.services;

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
 *         &lt;element ref="{http://www.quantiguous.com/services}version"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}appID"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}brokerCode"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}requestReferenceNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}bankReferenceNo" minOccurs="0"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}ipoCode"/>
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
    "version",
    "appID",
    "brokerCode",
    "requestReferenceNo",
    "bankReferenceNo",
    "ipoCode"
})
@XmlRootElement(name = "inquireHold")
public class InquireHold {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String appID;
    @XmlElement(required = true)
    protected String brokerCode;
    @XmlElement(required = true)
    protected String requestReferenceNo;
    @XmlElement(nillable = true)
    protected String bankReferenceNo;
    @XmlElement(required = true)
    protected String ipoCode;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * Gets the value of the brokerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerCode() {
        return brokerCode;
    }

    /**
     * Sets the value of the brokerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerCode(String value) {
        this.brokerCode = value;
    }

    /**
     * Gets the value of the requestReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestReferenceNo() {
        return requestReferenceNo;
    }

    /**
     * Sets the value of the requestReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestReferenceNo(String value) {
        this.requestReferenceNo = value;
    }

    /**
     * Gets the value of the bankReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankReferenceNo() {
        return bankReferenceNo;
    }

    /**
     * Sets the value of the bankReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankReferenceNo(String value) {
        this.bankReferenceNo = value;
    }

    /**
     * Gets the value of the ipoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpoCode() {
        return ipoCode;
    }

    /**
     * Sets the value of the ipoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpoCode(String value) {
        this.ipoCode = value;
    }

}
