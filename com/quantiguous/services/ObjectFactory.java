
package com.quantiguous.services;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.quantiguous.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BrokerLocation_QNAME = new QName("http://www.quantiguous.com/services", "brokerLocation");
    private final static QName _UniqueRequestNo_QNAME = new QName("http://www.quantiguous.com/services", "uniqueRequestNo");
    private final static QName _AppID_QNAME = new QName("http://www.quantiguous.com/services", "appID");
    private final static QName _BankReferenceNo_QNAME = new QName("http://www.quantiguous.com/services", "bankReferenceNo");
    private final static QName _DpType_QNAME = new QName("http://www.quantiguous.com/services", "dpType");
    private final static QName _IssueType_QNAME = new QName("http://www.quantiguous.com/services", "issueType");
    private final static QName _TotalAmount_QNAME = new QName("http://www.quantiguous.com/services", "totalAmount");
    private final static QName _BrokerCode_QNAME = new QName("http://www.quantiguous.com/services", "brokerCode");
    private final static QName _SharePrice_QNAME = new QName("http://www.quantiguous.com/services", "sharePrice");
    private final static QName _BrokerName_QNAME = new QName("http://www.quantiguous.com/services", "brokerName");
    private final static QName _IpoCode_QNAME = new QName("http://www.quantiguous.com/services", "ipoCode");
    private final static QName _ExchangeOrderID_QNAME = new QName("http://www.quantiguous.com/services", "exchangeOrderID");
    private final static QName _NumShares_QNAME = new QName("http://www.quantiguous.com/services", "numShares");
    private final static QName _ApplicationTimeStamp_QNAME = new QName("http://www.quantiguous.com/services", "applicationTimeStamp");
    private final static QName _InverstorDetail_QNAME = new QName("http://www.quantiguous.com/services", "inverstorDetail");
    private final static QName _ApplicationNo_QNAME = new QName("http://www.quantiguous.com/services", "applicationNo");
    private final static QName _Version_QNAME = new QName("http://www.quantiguous.com/services", "version");
    private final static QName _RequestReferenceNo_QNAME = new QName("http://www.quantiguous.com/services", "requestReferenceNo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.quantiguous.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddHold }
     * 
     */
    public AddHold createAddHold() {
        return new AddHold();
    }

    /**
     * Create an instance of {@link InverstorDetailType }
     * 
     */
    public InverstorDetailType createInverstorDetailType() {
        return new InverstorDetailType();
    }

    /**
     * Create an instance of {@link ModifyHoldResponse }
     * 
     */
    public ModifyHoldResponse createModifyHoldResponse() {
        return new ModifyHoldResponse();
    }

    /**
     * Create an instance of {@link WithdrawHoldResponse }
     * 
     */
    public WithdrawHoldResponse createWithdrawHoldResponse() {
        return new WithdrawHoldResponse();
    }

    /**
     * Create an instance of {@link WithdrawHold }
     * 
     */
    public WithdrawHold createWithdrawHold() {
        return new WithdrawHold();
    }

    /**
     * Create an instance of {@link InquireHoldResponse }
     * 
     */
    public InquireHoldResponse createInquireHoldResponse() {
        return new InquireHoldResponse();
    }

    /**
     * Create an instance of {@link InquireHold }
     * 
     */
    public InquireHold createInquireHold() {
        return new InquireHold();
    }

    /**
     * Create an instance of {@link ModifyHold }
     * 
     */
    public ModifyHold createModifyHold() {
        return new ModifyHold();
    }

    /**
     * Create an instance of {@link AddHoldResponse }
     * 
     */
    public AddHoldResponse createAddHoldResponse() {
        return new AddHoldResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "brokerLocation")
    public JAXBElement<String> createBrokerLocation(String value) {
        return new JAXBElement<String>(_BrokerLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "uniqueRequestNo")
    public JAXBElement<String> createUniqueRequestNo(String value) {
        return new JAXBElement<String>(_UniqueRequestNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "appID")
    public JAXBElement<String> createAppID(String value) {
        return new JAXBElement<String>(_AppID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "bankReferenceNo")
    public JAXBElement<String> createBankReferenceNo(String value) {
        return new JAXBElement<String>(_BankReferenceNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "dpType")
    public JAXBElement<String> createDpType(String value) {
        return new JAXBElement<String>(_DpType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "issueType")
    public JAXBElement<String> createIssueType(String value) {
        return new JAXBElement<String>(_IssueType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "totalAmount")
    public JAXBElement<BigDecimal> createTotalAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TotalAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "brokerCode")
    public JAXBElement<String> createBrokerCode(String value) {
        return new JAXBElement<String>(_BrokerCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "sharePrice")
    public JAXBElement<BigDecimal> createSharePrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SharePrice_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "brokerName")
    public JAXBElement<String> createBrokerName(String value) {
        return new JAXBElement<String>(_BrokerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "ipoCode")
    public JAXBElement<String> createIpoCode(String value) {
        return new JAXBElement<String>(_IpoCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "exchangeOrderID")
    public JAXBElement<String> createExchangeOrderID(String value) {
        return new JAXBElement<String>(_ExchangeOrderID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "numShares")
    public JAXBElement<Integer> createNumShares(Integer value) {
        return new JAXBElement<Integer>(_NumShares_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "applicationTimeStamp")
    public JAXBElement<XMLGregorianCalendar> createApplicationTimeStamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApplicationTimeStamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InverstorDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "inverstorDetail")
    public JAXBElement<InverstorDetailType> createInverstorDetail(InverstorDetailType value) {
        return new JAXBElement<InverstorDetailType>(_InverstorDetail_QNAME, InverstorDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "applicationNo")
    public JAXBElement<String> createApplicationNo(String value) {
        return new JAXBElement<String>(_ApplicationNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "requestReferenceNo")
    public JAXBElement<String> createRequestReferenceNo(String value) {
        return new JAXBElement<String>(_RequestReferenceNo_QNAME, String.class, null, value);
    }

}
