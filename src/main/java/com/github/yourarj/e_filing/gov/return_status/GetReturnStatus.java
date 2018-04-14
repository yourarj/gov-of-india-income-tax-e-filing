
package com.github.yourarj.e_filing.gov.return_status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReturnStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReturnStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DitRequest" type="{http://incometaxindiaefiling.gov.in/ditsecws/request}ReturnStatusRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReturnStatus", propOrder = {
    "ditRequest"
})
public class GetReturnStatus {

    @XmlElement(name = "DitRequest", required = true)
    protected ReturnStatusRequest ditRequest;

    /**
     * Gets the value of the ditRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatusRequest }
     *     
     */
    public ReturnStatusRequest getDitRequest() {
        return ditRequest;
    }

    /**
     * Sets the value of the ditRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatusRequest }
     *     
     */
    public void setDitRequest(ReturnStatusRequest value) {
        this.ditRequest = value;
    }

}
