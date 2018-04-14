
package com.github.yourarj.e_filing.gov.return_status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReturnStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReturnStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DitResponse" type="{http://incometaxindiaefiling.gov.in/ditsecws/response}ReturnStatusResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReturnStatusResponse", propOrder = {
    "ditResponse"
})
public class GetReturnStatusResponse {

    @XmlElement(name = "DitResponse")
    protected ReturnStatusResponse ditResponse;

    /**
     * Gets the value of the ditResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnStatusResponse }
     *     
     */
    public ReturnStatusResponse getDitResponse() {
        return ditResponse;
    }

    /**
     * Sets the value of the ditResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnStatusResponse }
     *     
     */
    public void setDitResponse(ReturnStatusResponse value) {
        this.ditResponse = value;
    }

}
