
package com.github.yourarj.e_filing.gov.bulk_pan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bulk_pan package.
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

    private final static QName _UploadBulkPan_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "uploadBulkPan");
    private final static QName _BulkPanRequest_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/request", "BulkPanRequest");
    private final static QName _UploadBulkPanResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws", "uploadBulkPanResponse");
    private final static QName _DitResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "DitResponse");
    private final static QName _BulkPanResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditsecws/response", "BulkPanResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bulk_pan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadBulkPan }
     * 
     */
    public UploadBulkPan createUploadBulkPan() {
        return new UploadBulkPan();
    }

    /**
     * Create an instance of {@link UploadBulkPanResponse }
     * 
     */
    public UploadBulkPanResponse createUploadBulkPanResponse() {
        return new UploadBulkPanResponse();
    }

    /**
     * Create an instance of {@link DitResponse }
     * 
     */
    public DitResponse createDitResponse() {
        return new DitResponse();
    }

    /**
     * Create an instance of {@link BulkPanResponse }
     * 
     */
    public BulkPanResponse createBulkPanResponse() {
        return new BulkPanResponse();
    }

    /**
     * Create an instance of {@link BulkPanRequest }
     * 
     */
    public BulkPanRequest createBulkPanRequest() {
        return new BulkPanRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadBulkPan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws", name = "uploadBulkPan")
    public JAXBElement<UploadBulkPan> createUploadBulkPan(UploadBulkPan value) {
        return new JAXBElement<UploadBulkPan>(_UploadBulkPan_QNAME, UploadBulkPan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkPanRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/request", name = "BulkPanRequest")
    public JAXBElement<BulkPanRequest> createBulkPanRequest(BulkPanRequest value) {
        return new JAXBElement<BulkPanRequest>(_BulkPanRequest_QNAME, BulkPanRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadBulkPanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws", name = "uploadBulkPanResponse")
    public JAXBElement<UploadBulkPanResponse> createUploadBulkPanResponse(UploadBulkPanResponse value) {
        return new JAXBElement<UploadBulkPanResponse>(_UploadBulkPanResponse_QNAME, UploadBulkPanResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkPanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditsecws/response", name = "BulkPanResponse")
    public JAXBElement<BulkPanResponse> createBulkPanResponse(BulkPanResponse value) {
        return new JAXBElement<BulkPanResponse>(_BulkPanResponse_QNAME, BulkPanResponse.class, null, value);
    }

}
