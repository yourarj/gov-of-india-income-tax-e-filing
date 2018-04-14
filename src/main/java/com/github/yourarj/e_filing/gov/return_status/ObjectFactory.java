
package com.github.yourarj.e_filing.gov.return_status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the return_status package.
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

    private final static QName _GetReturnStatus_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "getReturnStatus");
    private final static QName _ReturnStatusResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "ReturnStatusResponse");
    private final static QName _ReturnStatusRequest_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/request", "ReturnStatusRequest");
    private final static QName _DitResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "DitResponse");
    private final static QName _GetReturnStatusResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "getReturnStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: return_status
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnStatusRequest }
     * 
     */
    public ReturnStatusRequest createReturnStatusRequest() {
        return new ReturnStatusRequest();
    }

    /**
     * Create an instance of {@link GetReturnStatusResponse }
     * 
     */
    public GetReturnStatusResponse createGetReturnStatusResponse() {
        return new GetReturnStatusResponse();
    }

    /**
     * Create an instance of {@link GetReturnStatus }
     * 
     */
    public GetReturnStatus createGetReturnStatus() {
        return new GetReturnStatus();
    }

    /**
     * Create an instance of {@link DitResponse }
     * 
     */
    public DitResponse createDitResponse() {
        return new DitResponse();
    }

    /**
     * Create an instance of {@link ReturnStatusResponse }
     * 
     */
    public ReturnStatusResponse createReturnStatusResponse() {
        return new ReturnStatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReturnStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws", name = "getReturnStatus")
    public JAXBElement<GetReturnStatus> createGetReturnStatus(GetReturnStatus value) {
        return new JAXBElement<GetReturnStatus>(_GetReturnStatus_QNAME, GetReturnStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/response", name = "ReturnStatusResponse")
    public JAXBElement<ReturnStatusResponse> createReturnStatusResponse(ReturnStatusResponse value) {
        return new JAXBElement<ReturnStatusResponse>(_ReturnStatusResponse_QNAME, ReturnStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/request", name = "ReturnStatusRequest")
    public JAXBElement<ReturnStatusRequest> createReturnStatusRequest(ReturnStatusRequest value) {
        return new JAXBElement<ReturnStatusRequest>(_ReturnStatusRequest_QNAME, ReturnStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/response", name = "DitResponse")
    public JAXBElement<DitResponse> createDitResponse(DitResponse value) {
        return new JAXBElement<DitResponse>(_DitResponse_QNAME, DitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReturnStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws", name = "getReturnStatusResponse")
    public JAXBElement<GetReturnStatusResponse> createGetReturnStatusResponse(GetReturnStatusResponse value) {
        return new JAXBElement<GetReturnStatusResponse>(_GetReturnStatusResponse_QNAME, GetReturnStatusResponse.class, null, value);
    }

}
