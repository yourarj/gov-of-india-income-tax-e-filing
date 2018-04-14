
package com.github.yourarj.e_filing.gov.bulk_pan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadBulkPanResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadBulkPanResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://incometaxindiaefiling.gov.in/ditsecws/response}BulkPanResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadBulkPanResponse", namespace = "http://incometaxindiaefiling.gov.in/ditsecws", propOrder = {
    "result"
})
public class UploadBulkPanResponse {

    protected BulkPanResponse result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link BulkPanResponse }
     *     
     */
    public BulkPanResponse getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkPanResponse }
     *     
     */
    public void setResult(BulkPanResponse value) {
        this.result = value;
    }

}
