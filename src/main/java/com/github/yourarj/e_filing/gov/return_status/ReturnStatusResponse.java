
package com.github.yourarj.e_filing.gov.return_status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnStatusResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://incometaxindiaefiling.gov.in/ditsecws/response}DitResponse">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ackNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnStatusResponse", namespace = "http://incometaxindiaefiling.gov.in/ditsecws/response", propOrder = {
    "status",
    "ackNo"
})
public class ReturnStatusResponse
    extends DitResponse
{

    protected String status;
    protected String ackNo;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the ackNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckNo() {
        return ackNo;
    }

    /**
     * Sets the value of the ackNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckNo(String value) {
        this.ackNo = value;
    }

}
