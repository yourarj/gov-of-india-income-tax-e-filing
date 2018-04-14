
package com.github.yourarj.e_filing.gov.bulk_itr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadBulkItr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadBulkItr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DitRequest" type="{http://incometaxindiaefiling.gov.in/ditsecws/request}BulkItrRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadBulkItr", propOrder = {
    "ditRequest"
})
public class UploadBulkItr {

    @XmlElement(name = "DitRequest", required = true)
    protected BulkItrRequest ditRequest;

    /**
     * Gets the value of the ditRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BulkItrRequest }
     *     
     */
    public BulkItrRequest getDitRequest() {
        return ditRequest;
    }

    /**
     * Sets the value of the ditRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkItrRequest }
     *     
     */
    public void setDitRequest(BulkItrRequest value) {
        this.ditRequest = value;
    }

}
