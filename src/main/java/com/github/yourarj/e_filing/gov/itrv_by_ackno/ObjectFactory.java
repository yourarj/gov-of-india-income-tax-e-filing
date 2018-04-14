
package com.github.yourarj.e_filing.gov.itrv_by_ackno;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the itrv_by_ackno package.
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

    private final static QName _GetItrVByAckNoRequest_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/request", "GetItrVByAckNoRequest");
    private final static QName _ItrVStatusAckNoResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "ItrVStatusAckNoResponse");
    private final static QName _GetItrV_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "getItrV");
    private final static QName _GetItrVResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "getItrVResponse");
    private final static QName _DitResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "DitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: itrv_by_ackno
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DitResponse }
     * 
     */
    public DitResponse createDitResponse() {
        return new DitResponse();
    }

    /**
     * Create an instance of {@link ItrVStatusAckNoResponse }
     * 
     */
    public ItrVStatusAckNoResponse createItrVStatusAckNoResponse() {
        return new ItrVStatusAckNoResponse();
    }

    /**
     * Create an instance of {@link GetItrVResponse }
     * 
     */
    public GetItrVResponse createGetItrVResponse() {
        return new GetItrVResponse();
    }

    /**
     * Create an instance of {@link GetItrV }
     * 
     */
    public GetItrV createGetItrV() {
        return new GetItrV();
    }

    /**
     * Create an instance of {@link GetItrVByAckNoRequest }
     * 
     */
    public GetItrVByAckNoRequest createGetItrVByAckNoRequest() {
        return new GetItrVByAckNoRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItrVByAckNoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/request", name = "GetItrVByAckNoRequest")
    public JAXBElement<GetItrVByAckNoRequest> createGetItrVByAckNoRequest(GetItrVByAckNoRequest value) {
        return new JAXBElement<GetItrVByAckNoRequest>(_GetItrVByAckNoRequest_QNAME, GetItrVByAckNoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItrVStatusAckNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/response", name = "ItrVStatusAckNoResponse")
    public JAXBElement<ItrVStatusAckNoResponse> createItrVStatusAckNoResponse(ItrVStatusAckNoResponse value) {
        return new JAXBElement<ItrVStatusAckNoResponse>(_ItrVStatusAckNoResponse_QNAME, ItrVStatusAckNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItrV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws", name = "getItrV")
    public JAXBElement<GetItrV> createGetItrV(GetItrV value) {
        return new JAXBElement<GetItrV>(_GetItrV_QNAME, GetItrV.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItrVResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws", name = "getItrVResponse")
    public JAXBElement<GetItrVResponse> createGetItrVResponse(GetItrVResponse value) {
        return new JAXBElement<GetItrVResponse>(_GetItrVResponse_QNAME, GetItrVResponse.class, null, value);
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
