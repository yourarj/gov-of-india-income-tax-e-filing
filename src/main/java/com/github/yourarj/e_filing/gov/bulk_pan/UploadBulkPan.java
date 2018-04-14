
package com.github.yourarj.e_filing.gov.bulk_pan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadBulkPan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadBulkPan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DitRequest" type="{http://incometaxindiaefiling.gov.in/ditsecws/request}BulkPanRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadBulkPan", namespace = "http://incometaxindiaefiling.gov.in/ditsecws", propOrder = {
    "ditRequest"
})
public class UploadBulkPan {

    @XmlElement(name = "DitRequest", required = true)
    protected BulkPanRequest ditRequest;

    /**
     * Gets the value of the ditRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BulkPanRequest }
     *     
     */
    public BulkPanRequest getDitRequest() {
        return ditRequest;
    }

    /**
     * Sets the value of the ditRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkPanRequest }
     *     
     */
    public void setDitRequest(BulkPanRequest value) {
        this.ditRequest = value;
    }

}
