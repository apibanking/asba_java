import javax.xml.ws.Holder;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext; 
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.math.BigInteger;
import java.util.UUID;
import java.math.BigDecimal;

import java.util.ArrayList;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URL;
import java.util.Iterator;

import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;
import java.security.KeyStoreException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.KeyManagementException;
import java.security.UnrecoverableKeyException;

import javax.xml.soap.SOAPException;
import javax.xml.ws.soap.SOAPFaultException;
import javax.xml.soap.SOAPFault;
import javax.xml.namespace.QName;
import javax.xml.soap.Detail;
import javax.xml.soap.DetailEntry;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;

import com.quantiguous.services.ASBAService;
import com.quantiguous.services.ASBAServiceHttpService;

import com.quantiguous.services.InverstorDetailType;

class ApiBankingFault
{
   String faultCode;
   String faultSubCode;
   String faultReason;
}

@SuppressWarnings("unchecked")
public class Asba {


   public static void main(String[] argv) throws NoSuchAlgorithmException, KeyStoreException, FileNotFoundException, IOException, KeyStoreException, KeyStoreException, CertificateException, UnrecoverableKeyException, KeyManagementException, DatatypeConfigurationException {

      enableTrace();

      Path currentRelativePath = Paths.get("");
      String wsdlFilePath = currentRelativePath.toAbsolutePath().toString() + "/ASBAService.wsdl";

      ASBAServiceHttpService svc =  new ASBAServiceHttpService(new URL("file://" + wsdlFilePath));
      ASBAService client = svc.getASBAServiceHttpPort();
 

      Holder<String> version                          = new Holder<String>();
      String uniqueRequestNo;
      String appID;
      String brokerCode;
      String brokerName;
      String brokerLocation;
      Holder<String> ipoCode                          = new Holder<String>();
      Holder<String> applicationNo                    = new Holder<String>();
      String dpType;
      String issueType;
      XMLGregorianCalendar applicationTimeStamp;
      Holder<String> exchangeOrderID                  = new Holder<String>();
      Holder<InverstorDetailType> investorDetail      = new Holder<InverstorDetailType>();
      int numShares; 
      BigDecimal sharePrice;
      BigDecimal totalAmount;
      Holder<String> requestReferenceNo               = new Holder<String>();
      Holder<String> bankReferenceNo                  = new Holder<String>();

      version.value                                   = "1.0";
      uniqueRequestNo                                 = String.valueOf(UUID.randomUUID()).replaceAll("-","");
      appID                                           = "Broker";
      brokerCode                                      = "ANUJBROKER";
      brokerName                                      = "BrokerName";
      brokerLocation                                  = "SURAT";
      ipoCode.value                                   = "BSE";
      applicationNo.value                             = "09876543";
      dpType                                          = "NSDL";
      issueType                                       = "IPO";
      applicationTimeStamp                            = DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-11-01T23:11:15");
      exchangeOrderID.value                           = "2554325444";
      investorDetail.value                            = new InverstorDetailType();
      investorDetail.value.setDpID("IN454546");
      investorDetail.value.setClientID("12345678");
      investorDetail.value.setPAN("AHNDT0608J");
      investorDetail.value.setCategory("IND");
      investorDetail.value.setAccountNo("001193700001399");
   

      
      numShares                                       = 18;
      sharePrice                                      = new BigDecimal(500);
      totalAmount                                     = new BigDecimal(9000);
      

      // set the url
      ((BindingProvider)client).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://api.quantiguous.com/ASBAService");        

      // set the user & password
      ((BindingProvider)client).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "guest");
      ((BindingProvider)client).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "qg123$#");

      // send the request
      try {
         client.addHold(version, uniqueRequestNo, appID, brokerCode, brokerName, brokerLocation, ipoCode, applicationNo, dpType, issueType, applicationTimeStamp, exchangeOrderID,
                         investorDetail, numShares, sharePrice, totalAmount, requestReferenceNo, bankReferenceNo
                        );

         System.out.println("version                    : " + version.value);
         System.out.println("requestReferenceNo         : " + requestReferenceNo.value);
         System.out.println("ipoCode                    : " + ipoCode.value);
         System.out.println("applicationNo              : " + applicationNo.value);
         System.out.println("exchangeOrderID            : " + exchangeOrderID.value);
         System.out.println("investorDetail.dpID        : " + investorDetail.value.getDpID());
         System.out.println("investorDetail.clientID    : " + investorDetail.value.getClientID());
         System.out.println("investorDetail.PAN         : " + investorDetail.value.getPAN());
         System.out.println("investorDetail.category    : " + investorDetail.value.getCategory());
         System.out.println("investorDetail.accountNo   : " + investorDetail.value.getAccountNo());
         System.out.println("bankReferenceNo            : " + bankReferenceNo);
      }
      catch(SOAPFaultException e) {
        printFault(e.getFault());
      }
      catch(Exception e) {
        e.printStackTrace(System.out); 
      };

    
   }

   private static String parseQName(QName val) {
      if ( val != null ) {
         if ( val.getNamespaceURI() == "http://www.quantiguous.com/services" ) {
            return "ns:" + val.getLocalPart();
         }
         return val.toString();
      }
      return null;
   }

   private static ApiBankingFault parseFault(SOAPFault f) {
      boolean first = false;
      ApiBankingFault apiFault = new ApiBankingFault();

      for (Iterator<QName> subCodesIterator = (Iterator<QName>)f.getFaultSubcodes(); subCodesIterator.hasNext();) {
         if (first == false) { 
            apiFault.faultCode = parseQName(subCodesIterator.next());
            first = true;
         } else {
           apiFault.faultSubCode = parseQName(subCodesIterator.next());
         }
      }
      try {
         for (Iterator<String> reasonTextsIterator = (Iterator<String>)f.getFaultReasonTexts(); reasonTextsIterator.hasNext();) {
            apiFault.faultReason = reasonTextsIterator.next();
         }
      } catch (SOAPException x) {
         x.printStackTrace(System.out); 
      }
      if ( f.hasDetail() ) {
         for (Iterator<DetailEntry> detailEntriesIterator = (Iterator<DetailEntry>)f.getDetail().getDetailEntries(); detailEntriesIterator.hasNext();) {
            System.out.println(detailEntriesIterator.next());
         }
      }
 
      return apiFault;
   }

   private static void printFault(SOAPFault f) {
      ApiBankingFault apiFault = parseFault(f);

      System.out.println(apiFault.faultCode);
      System.out.println(apiFault.faultSubCode);
      System.out.println(apiFault.faultReason);
   }

   private static void enableTrace() {
     System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
     System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
     System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
     System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
   }


}
