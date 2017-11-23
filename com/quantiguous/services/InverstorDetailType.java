
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inverstorDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inverstorDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dpID" type="{http://www.quantiguous.com/services}dpIDType" minOccurs="0"/>
 *         &lt;element name="clientID" type="{http://www.quantiguous.com/services}clientIDType"/>
 *         &lt;element name="PAN" type="{http://www.quantiguous.com/services}PANType"/>
 *         &lt;element name="category" type="{http://www.quantiguous.com/services}categoryType"/>
 *         &lt;element name="accountNo" type="{http://www.quantiguous.com/services}accountNoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inverstorDetailType", propOrder = {
    "dpID",
    "clientID",
    "pan",
    "category",
    "accountNo"
})
public class InverstorDetailType {

    protected String dpID;
    @XmlElement(required = true)
    protected String clientID;
    @XmlElement(name = "PAN", required = true)
    protected String pan;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String accountNo;

    /**
     * Gets the value of the dpID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpID() {
        return dpID;
    }

    /**
     * Sets the value of the dpID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpID(String value) {
        this.dpID = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

}
