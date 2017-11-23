
package com.quantiguous.services;

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
 *         &lt;element ref="{http://www.quantiguous.com/services}version"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}requestReferenceNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}bankReferenceNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}ipoCode"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}applicationNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}inverstorDetail"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}exchangeOrderID"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}numShares"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}sharePrice"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}totalAmount"/>
 *         &lt;element name="applicationStatus" type="{http://www.quantiguous.com/services}statusType"/>
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
    "bankReferenceNo",
    "ipoCode",
    "applicationNo",
    "inverstorDetail",
    "exchangeOrderID",
    "numShares",
    "sharePrice",
    "totalAmount",
    "applicationStatus"
})
@XmlRootElement(name = "inquireHoldResponse")
public class InquireHoldResponse {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String requestReferenceNo;
    @XmlElement(required = true, nillable = true)
    protected String bankReferenceNo;
    @XmlElement(required = true)
    protected String ipoCode;
    @XmlElement(required = true)
    protected String applicationNo;
    @XmlElement(required = true)
    protected InverstorDetailType inverstorDetail;
    @XmlElement(required = true)
    protected String exchangeOrderID;
    protected int numShares;
    @XmlElement(required = true)
    protected BigDecimal sharePrice;
    @XmlElement(required = true)
    protected BigDecimal totalAmount;
    @XmlElement(required = true)
    protected String applicationStatus;

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
     * Gets the value of the numShares property.
     * 
     */
    public int getNumShares() {
        return numShares;
    }

    /**
     * Sets the value of the numShares property.
     * 
     */
    public void setNumShares(int value) {
        this.numShares = value;
    }

    /**
     * Gets the value of the sharePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSharePrice() {
        return sharePrice;
    }

    /**
     * Sets the value of the sharePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSharePrice(BigDecimal value) {
        this.sharePrice = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the applicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Sets the value of the applicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationStatus(String value) {
        this.applicationStatus = value;
    }

}
