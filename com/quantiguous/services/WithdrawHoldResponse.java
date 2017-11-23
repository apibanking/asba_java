
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
 *         &lt;element ref="{http://www.quantiguous.com/services}requestReferenceNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}ipoCode"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}applicationNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}exchangeOrderID"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}inverstorDetail"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}bankReferenceNo"/>
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
    "requestReferenceNo",
    "ipoCode",
    "applicationNo",
    "exchangeOrderID",
    "inverstorDetail",
    "bankReferenceNo"
})
@XmlRootElement(name = "withdrawHoldResponse")
public class WithdrawHoldResponse {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String requestReferenceNo;
    @XmlElement(required = true)
    protected String ipoCode;
    @XmlElement(required = true)
    protected String applicationNo;
    @XmlElement(required = true)
    protected String exchangeOrderID;
    @XmlElement(required = true)
    protected InverstorDetailType inverstorDetail;
    @XmlElement(required = true, nillable = true)
    protected String bankReferenceNo;

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

    /**
     * Gets the value of the applicationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNo() {
        return applicationNo;
    }

    /**
     * Sets the value of the applicationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNo(String value) {
        this.applicationNo = value;
    }

    /**
     * Gets the value of the exchangeOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeOrderID() {
        return exchangeOrderID;
    }

    /**
     * Sets the value of the exchangeOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeOrderID(String value) {
        this.exchangeOrderID = value;
    }

    /**
     * Gets the value of the inverstorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InverstorDetailType }
     *     
     */
    public InverstorDetailType getInverstorDetail() {
        return inverstorDetail;
    }

    /**
     * Sets the value of the inverstorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InverstorDetailType }
     *     
     */
    public void setInverstorDetail(InverstorDetailType value) {
        this.inverstorDetail = value;
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

}
