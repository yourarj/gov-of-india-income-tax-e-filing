
package com.github.yourarj.e_filing.gov.itrv_by_ackno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItrV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItrV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DitRequest" type="{http://incometaxindiaefiling.gov.in/ditsecws/request}GetItrVByAckNoRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItrV", namespace = "http://incometaxindiaefiling.gov.in/ditsecws", propOrder = {
    "ditRequest"
})
public class GetItrV {

    @XmlElement(name = "DitRequest", required = true)
    protected GetItrVByAckNoRequest ditRequest;

    /**
     * Gets the value of the ditRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetItrVByAckNoRequest }
     *     
     */
    public GetItrVByAckNoRequest getDitRequest() {
        return ditRequest;
    }

    /**
     * Sets the value of the ditRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetItrVByAckNoRequest }
     *     
     */
    public void setDitRequest(GetItrVByAckNoRequest value) {
        this.ditRequest = value;
    }

}
