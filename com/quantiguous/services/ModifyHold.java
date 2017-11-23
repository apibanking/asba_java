
package com.quantiguous.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.quantiguous.com/services}uniqueRequestNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}appID"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}bankReferenceNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}brokerCode"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}brokerName"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}brokerLocation"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}ipoCode"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}applicationNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}applicationTimeStamp"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}exchangeOrderID" minOccurs="0"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}inverstorDetail"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}numShares"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}sharePrice"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}totalAmount"/>
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
    "uniqueRequestNo",
    "appID",
    "bankReferenceNo",
    "brokerCode",
    "brokerName",
    "brokerLocation",
    "ipoCode",
    "applicationNo",
    "applicationTimeStamp",
    "exchangeOrderID",
    "inverstorDetail",
    "numShares",
    "sharePrice",
    "totalAmount"
})
@XmlRootElement(name = "modifyHold")
public class ModifyHold {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String uniqueRequestNo;
    @XmlElement(required = true)
    protected String appID;
    @XmlElement(required = true, nillable = true)
    protected String bankReferenceNo;
    @XmlElement(required = true)
    protected String brokerCode;
    @XmlElement(required = true)
    protected String brokerName;
    @XmlElement(required = true)
    protected String brokerLocation;
    @XmlElement(required = true)
    protected String ipoCode;
    @XmlElement(required = true)
    protected String applicationNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationTimeStamp;
    protected String exchangeOrderID;
    @XmlElement(required = true)
    protected InverstorDetailType inverstorDetail;
    protected int numShares;
    @XmlElement(required = true)
    protected BigDecimal sharePrice;
    @XmlElement(required = true)
    protected BigDecimal totalAmount;

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
     * Gets the value of the uniqueRequestNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRequestNo() {
        return uniqueRequestNo;
    }

    /**
     * Sets the value of the uniqueRequestNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRequestNo(String value) {
        this.uniqueRequestNo = value;
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
     * Gets the value of the brokerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerName() {
        return brokerName;
    }

    /**
     * Sets the value of the brokerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerName(String value) {
        this.brokerName = value;
    }

    /**
     * Gets the value of the brokerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerLocation() {
        return brokerLocation;
    }

    /**
     * Sets the value of the brokerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerLocation(String value) {
        this.brokerLocation = value;
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
     * Gets the value of the applicationTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationTimeStamp() {
        return applicationTimeStamp;
    }

    /**
     * Sets the value of the applicationTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationTimeStamp(XMLGregorianCalendar value) {
        this.applicationTimeStamp = value;
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

}
