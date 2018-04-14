
package com.github.yourarj.e_filing.gov.bulk_itr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bulk_itr package.
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

    private final static QName _BulkItrResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "BulkItrResponse");
    private final static QName _UploadBulkItrResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "uploadBulkItrResponse");
    private final static QName _DitResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "DitResponse");
    private final static QName _BulkItrRequest_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/request", "BulkItrRequest");
    private final static QName _UploadBulkItr_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "uploadBulkItr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bulk_itr
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
     * Create an instance of {@link BulkItrResponse }
     * 
     */
    public BulkItrResponse createBulkItrResponse() {
        return new BulkItrResponse();
    }

    /**
     * Create an instance of {@link BulkItrRequest }
     * 
     */
    public BulkItrRequest createBulkItrRequest() {
        return new BulkItrRequest();
    }

    /**
     * Create an instance of {@link UploadBulkItr }
     * 
     */
    public UploadBulkItr createUploadBulkItr() {
        return new UploadBulkItr();
    }

    /**
     * Create an instance of {@link UploadBulkItrResponse }
     * 
     */
    public UploadBulkItrResponse createUploadBulkItrResponse() {
        return new UploadBulkItrResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkItrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/response", name = "BulkItrResponse")
    public JAXBElement<BulkItrResponse> createBulkItrResponse(BulkItrResponse value) {
        return new JAXBElement<BulkItrResponse>(_BulkItrResponse_QNAME, BulkItrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadBulkItrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws", name = "uploadBulkItrResponse")
    public JAXBElement<UploadBulkItrResponse> createUploadBulkItrResponse(UploadBulkItrResponse value) {
        return new JAXBElement<UploadBulkItrResponse>(_UploadBulkItrResponse_QNAME, UploadBulkItrResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkItrRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/request", name = "BulkItrRequest")
    public JAXBElement<BulkItrRequest> createBulkItrRequest(BulkItrRequest value) {
        return new JAXBElement<BulkItrRequest>(_BulkItrRequest_QNAME, BulkItrRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadBulkItr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws", name = "uploadBulkItr")
    public JAXBElement<UploadBulkItr> createUploadBulkItr(UploadBulkItr value) {
        return new JAXBElement<UploadBulkItr>(_UploadBulkItr_QNAME, UploadBulkItr.class, null, value);
    }

}
