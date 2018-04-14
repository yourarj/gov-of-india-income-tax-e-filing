
package com.github.yourarj.e_filing.gov.itrv_by_ackno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItrVResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItrVResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DitResponse" type="{http://incometaxindiaefiling.gov.in/ditsecws/response}ItrVStatusAckNoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItrVResponse", namespace = "http://incometaxindiaefiling.gov.in/ditsecws", propOrder = {
    "ditResponse"
})
public class GetItrVResponse {

    @XmlElement(name = "DitResponse")
    protected ItrVStatusAckNoResponse ditResponse;

    /**
     * Gets the value of the ditResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ItrVStatusAckNoResponse }
     *     
     */
    public ItrVStatusAckNoResponse getDitResponse() {
        return ditResponse;
    }

    /**
     * Sets the value of the ditResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItrVStatusAckNoResponse }
     *     
     */
    public void setDitResponse(ItrVStatusAckNoResponse value) {
        this.ditResponse = value;
    }

}
