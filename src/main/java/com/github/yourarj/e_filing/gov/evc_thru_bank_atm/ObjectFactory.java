
package com.github.yourarj.e_filing.gov.evc_thru_bank_atm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the evc_thru_bank_atm package.
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

    private final static QName _GetBankAtmGenEvcDetails_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "getBankAtmGenEvcDetails");
    private final static QName _BankAtmGenEvcRequest_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/request", "BankAtmGenEvcRequest");
    private final static QName _GetBankAtmGenEvcDetailsResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "getBankAtmGenEvcDetailsResponse");
    private final static QName _BankAtmGenEvcResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "BankAtmGenEvcResponse");
    private final static QName _DitResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "DitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: evc_thru_bank_atm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBankAtmGenEvcDetailsResponse }
     * 
     */
    public GetBankAtmGenEvcDetailsResponse createGetBankAtmGenEvcDetailsResponse() {
        return new GetBankAtmGenEvcDetailsResponse();
    }

    /**
     * Create an instance of {@link GetBankAtmGenEvcDetails }
     * 
     */
    public GetBankAtmGenEvcDetails createGetBankAtmGenEvcDetails() {
        return new GetBankAtmGenEvcDetails();
    }

    /**
     * Create an instance of {@link DitResponse }
     * 
     */
    public DitResponse createDitResponse() {
        return new DitResponse();
    }

    /**
     * Create an instance of {@link BankAtmGenEvcResponse }
     * 
     */
    public BankAtmGenEvcResponse createBankAtmGenEvcResponse() {
        return new BankAtmGenEvcResponse();
    }

    /**
     * Create an instance of {@link BankAtmGenEvcRequest }
     * 
     */
    public BankAtmGenEvcRequest createBankAtmGenEvcRequest() {
        return new BankAtmGenEvcRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankAtmGenEvcDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws", name = "getBankAtmGenEvcDetails")
    public JAXBElement<GetBankAtmGenEvcDetails> createGetBankAtmGenEvcDetails(GetBankAtmGenEvcDetails value) {
        return new JAXBElement<GetBankAtmGenEvcDetails>(_GetBankAtmGenEvcDetails_QNAME, GetBankAtmGenEvcDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAtmGenEvcRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/request", name = "BankAtmGenEvcRequest")
    public JAXBElement<BankAtmGenEvcRequest> createBankAtmGenEvcRequest(BankAtmGenEvcRequest value) {
        return new JAXBElement<BankAtmGenEvcRequest>(_BankAtmGenEvcRequest_QNAME, BankAtmGenEvcRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankAtmGenEvcDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws", name = "getBankAtmGenEvcDetailsResponse")
    public JAXBElement<GetBankAtmGenEvcDetailsResponse> createGetBankAtmGenEvcDetailsResponse(GetBankAtmGenEvcDetailsResponse value) {
        return new JAXBElement<GetBankAtmGenEvcDetailsResponse>(_GetBankAtmGenEvcDetailsResponse_QNAME, GetBankAtmGenEvcDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAtmGenEvcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/response", name = "BankAtmGenEvcResponse")
    public JAXBElement<BankAtmGenEvcResponse> createBankAtmGenEvcResponse(BankAtmGenEvcResponse value) {
        return new JAXBElement<BankAtmGenEvcResponse>(_BankAtmGenEvcResponse_QNAME, BankAtmGenEvcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/response", name = "DitResponse")
    public JAXBElement<DitResponse> createDitResponse(DitResponse value) {
        return new JAXBElement<DitResponse>(_DitResponse_QNAME, DitResponse.class, null, value);
    }

}
