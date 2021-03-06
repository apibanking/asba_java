
package com.quantiguous.services;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ASBAService", targetNamespace = "http://www.quantiguous.com/services")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ASBAService {


    /**
     * This operation is to hold the shares. If an investor is applying through ASBA, his application money shall be debited from the bank account only if his/her application is selected for allotment after the basis of allotment is finalized
     * 
     * @param inverstorDetail
     * @param applicationNo
     * @param version
     * @param requestReferenceNo
     * @param dpType
     * @param issueType
     * @param totalAmount
     * @param brokerCode
     * @param sharePrice
     * @param brokerLocation
     * @param uniqueRequestNo
     * @param appID
     * @param bankReferenceNo
     * @param numShares
     * @param applicationTimeStamp
     * @param brokerName
     * @param ipoCode
     * @param exchangeOrderID
     */
    @WebMethod(action = "http://www.quantiguous.com/services/addHold")
    @RequestWrapper(localName = "addHold", targetNamespace = "http://www.quantiguous.com/services", className = "com.quantiguous.services.AddHold")
    @ResponseWrapper(localName = "addHoldResponse", targetNamespace = "http://www.quantiguous.com/services", className = "com.quantiguous.services.AddHoldResponse")
    public void addHold(
        @WebParam(name = "version", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> version,
        @WebParam(name = "uniqueRequestNo", targetNamespace = "http://www.quantiguous.com/services")
        String uniqueRequestNo,
        @WebParam(name = "appID", targetNamespace = "http://www.quantiguous.com/services")
        String appID,
        @WebParam(name = "brokerCode", targetNamespace = "http://www.quantiguous.com/services")
        String brokerCode,
        @WebParam(name = "brokerName", targetNamespace = "http://www.quantiguous.com/services")
        String brokerName,
        @WebParam(name = "brokerLocation", targetNamespace = "http://www.quantiguous.com/services")
        String brokerLocation,
        @WebParam(name = "ipoCode", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> ipoCode,
        @WebParam(name = "applicationNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> applicationNo,
        @WebParam(name = "dpType", targetNamespace = "http://www.quantiguous.com/services")
        String dpType,
        @WebParam(name = "issueType", targetNamespace = "http://www.quantiguous.com/services")
        String issueType,
        @WebParam(name = "applicationTimeStamp", targetNamespace = "http://www.quantiguous.com/services")
        XMLGregorianCalendar applicationTimeStamp,
        @WebParam(name = "exchangeOrderID", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> exchangeOrderID,
        @WebParam(name = "inverstorDetail", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<InverstorDetailType> inverstorDetail,
        @WebParam(name = "numShares", targetNamespace = "http://www.quantiguous.com/services")
        int numShares,
        @WebParam(name = "sharePrice", targetNamespace = "http://www.quantiguous.com/services")
        BigDecimal sharePrice,
        @WebParam(name = "totalAmount", targetNamespace = "http://www.quantiguous.com/services")
        BigDecimal totalAmount,
        @WebParam(name = "requestReferenceNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<String> requestReferenceNo,
        @WebParam(name = "bankReferenceNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<String> bankReferenceNo);

    /**
     * This operation is to for modify the shares which is held.
     * 
     * @param inverstorDetail
     * @param applicationNo
     * @param version
     * @param requestReferenceNo
     * @param totalAmount
     * @param brokerCode
     * @param sharePrice
     * @param brokerLocation
     * @param uniqueRequestNo
     * @param appID
     * @param bankReferenceNo
     * @param numShares
     * @param applicationTimeStamp
     * @param brokerName
     * @param ipoCode
     * @param exchangeOrderID
     */
    @WebMethod(action = "http://www.quantiguous.com/services/modifyHold")
    @RequestWrapper(localName = "modifyHold", targetNamespace = "http://www.quantiguous.com/services", className = "com.quantiguous.services.ModifyHold")
    @ResponseWrapper(localName = "modifyHoldResponse", targetNamespace = "http://www.quantiguous.com/services", className = "com.quantiguous.services.ModifyHoldResponse")
    public void modifyHold(
        @WebParam(name = "version", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> version,
        @WebParam(name = "uniqueRequestNo", targetNamespace = "http://www.quantiguous.com/services")
        String uniqueRequestNo,
        @WebParam(name = "appID", targetNamespace = "http://www.quantiguous.com/services")
        String appID,
        @WebParam(name = "bankReferenceNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> bankReferenceNo,
        @WebParam(name = "brokerCode", targetNamespace = "http://www.quantiguous.com/services")
        String brokerCode,
        @WebParam(name = "brokerName", targetNamespace = "http://www.quantiguous.com/services")
        String brokerName,
        @WebParam(name = "brokerLocation", targetNamespace = "http://www.quantiguous.com/services")
        String brokerLocation,
        @WebParam(name = "ipoCode", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> ipoCode,
        @WebParam(name = "applicationNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> applicationNo,
        @WebParam(name = "applicationTimeStamp", targetNamespace = "http://www.quantiguous.com/services")
        XMLGregorianCalendar applicationTimeStamp,
        @WebParam(name = "exchangeOrderID", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> exchangeOrderID,
        @WebParam(name = "inverstorDetail", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<InverstorDetailType> inverstorDetail,
        @WebParam(name = "numShares", targetNamespace = "http://www.quantiguous.com/services")
        int numShares,
        @WebParam(name = "sharePrice", targetNamespace = "http://www.quantiguous.com/services")
        BigDecimal sharePrice,
        @WebParam(name = "totalAmount", targetNamespace = "http://www.quantiguous.com/services")
        BigDecimal totalAmount,
        @WebParam(name = "requestReferenceNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<String> requestReferenceNo);

    /**
     * This is to withdraw the shares which are held.
     * 
     * @param inverstorDetail
     * @param applicationNo
     * @param version
     * @param requestReferenceNo
     * @param totalAmount
     * @param brokerCode
     * @param sharePrice
     * @param brokerLocation
     * @param uniqueRequestNo
     * @param appID
     * @param bankReferenceNo
     * @param numShares
     * @param applicationTimeStamp
     * @param brokerName
     * @param ipoCode
     * @param exchangeOrderID
     */
    @WebMethod(action = "http://www.quantiguous.com/services/withdrawHold")
    @RequestWrapper(localName = "withdrawHold", targetNamespace = "http://www.quantiguous.com/services", className = "com.quantiguous.services.WithdrawHold")
    @ResponseWrapper(localName = "withdrawHoldResponse", targetNamespace = "http://www.quantiguous.com/services", className = "com.quantiguous.services.WithdrawHoldResponse")
    public void withdrawHold(
        @WebParam(name = "version", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> version,
        @WebParam(name = "uniqueRequestNo", targetNamespace = "http://www.quantiguous.com/services")
        String uniqueRequestNo,
        @WebParam(name = "appID", targetNamespace = "http://www.quantiguous.com/services")
        String appID,
        @WebParam(name = "bankReferenceNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> bankReferenceNo,
        @WebParam(name = "brokerCode", targetNamespace = "http://www.quantiguous.com/services")
        String brokerCode,
        @WebParam(name = "brokerName", targetNamespace = "http://www.quantiguous.com/services")
        String brokerName,
        @WebParam(name = "brokerLocation", targetNamespace = "http://www.quantiguous.com/services")
        String brokerLocation,
        @WebParam(name = "ipoCode", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> ipoCode,
        @WebParam(name = "applicationNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> applicationNo,
        @WebParam(name = "applicationTimeStamp", targetNamespace = "http://www.quantiguous.com/services")
        XMLGregorianCalendar applicationTimeStamp,
        @WebParam(name = "exchangeOrderID", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> exchangeOrderID,
        @WebParam(name = "inverstorDetail", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<InverstorDetailType> inverstorDetail,
        @WebParam(name = "numShares", targetNamespace = "http://www.quantiguous.com/services")
        int numShares,
        @WebParam(name = "sharePrice", targetNamespace = "http://www.quantiguous.com/services")
        BigDecimal sharePrice,
        @WebParam(name = "totalAmount", targetNamespace = "http://www.quantiguous.com/services")
        BigDecimal totalAmount,
        @WebParam(name = "requestReferenceNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<String> requestReferenceNo);

    /**
     * This is to check the status of the held shares.
     * 
     * @param inverstorDetail
     * @param applicationNo
     * @param version
     * @param requestReferenceNo
     * @param totalAmount
     * @param brokerCode
     * @param sharePrice
     * @param applicationStatus
     * @param appID
     * @param bankReferenceNo
     * @param numShares
     * @param ipoCode
     * @param exchangeOrderID
     */
    @WebMethod(action = "http://www.quantiguous.com/services/inquireHold")
    @RequestWrapper(localName = "inquireHold", targetNamespace = "http://www.quantiguous.com/services", className = "com.quantiguous.services.InquireHold")
    @ResponseWrapper(localName = "inquireHoldResponse", targetNamespace = "http://www.quantiguous.com/services", className = "com.quantiguous.services.InquireHoldResponse")
    public void inquireHold(
        @WebParam(name = "version", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> version,
        @WebParam(name = "appID", targetNamespace = "http://www.quantiguous.com/services")
        String appID,
        @WebParam(name = "brokerCode", targetNamespace = "http://www.quantiguous.com/services")
        String brokerCode,
        @WebParam(name = "requestReferenceNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> requestReferenceNo,
        @WebParam(name = "bankReferenceNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> bankReferenceNo,
        @WebParam(name = "ipoCode", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.INOUT)
        Holder<String> ipoCode,
        @WebParam(name = "applicationNo", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<String> applicationNo,
        @WebParam(name = "inverstorDetail", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<InverstorDetailType> inverstorDetail,
        @WebParam(name = "exchangeOrderID", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<String> exchangeOrderID,
        @WebParam(name = "numShares", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<Integer> numShares,
        @WebParam(name = "sharePrice", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<BigDecimal> sharePrice,
        @WebParam(name = "totalAmount", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<BigDecimal> totalAmount,
        @WebParam(name = "applicationStatus", targetNamespace = "http://www.quantiguous.com/services", mode = WebParam.Mode.OUT)
        Holder<String> applicationStatus);

}
