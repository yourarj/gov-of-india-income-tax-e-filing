
package com.github.yourarj.e_filing.gov.itrv_by_ackno;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetItrVByAckNoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItrVByAckNoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="panNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *               &lt;pattern value="[A-Za-z][A-Za-z][A-Za-z][A-Za-z][A-Za-z]\d\d\d\d[A-Za-z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ackNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="uniqueRequestId" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[A-Za-z0-9]{10}[/-][A-Za-z0-9]{4,29}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItrVByAckNoRequest", namespace = "http://incometaxindiaefiling.gov.in/ditsecws/request", propOrder = {
    "panNo",
    "ackNo"
})
public class GetItrVByAckNoRequest {

    @XmlElement(required = true)
    protected String panNo;
    @XmlElement(required = true)
    protected BigInteger ackNo;
    @XmlAttribute(name = "uniqueRequestId", required = true)
    protected String uniqueRequestId;
    
    public GetItrVByAckNoRequest() {
		super();
	}

	public GetItrVByAckNoRequest(String panNo, BigInteger ackNo,
			String uniqueRequestId) {
		super();
		this.panNo = panNo;
		this.ackNo = ackNo;
		this.uniqueRequestId = uniqueRequestId;
	}

	/**
     * Gets the value of the panNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanNo() {
        return panNo;
    }

    /**
     * Sets the value of the panNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanNo(String value) {
        this.panNo = value;
    }

    /**
     * Gets the value of the ackNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAckNo() {
        return ackNo;
    }

    /**
     * Sets the value of the ackNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAckNo(BigInteger value) {
        this.ackNo = value;
    }

    /**
     * Gets the value of the uniqueRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRequestId() {
        return uniqueRequestId;
    }

    /**
     * Sets the value of the uniqueRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRequestId(String value) {
        this.uniqueRequestId = value;
    }

}
