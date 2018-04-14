
package com.github.yourarj.e_filing.gov.return_status;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnStatusRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pan">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *               &lt;pattern value="[A-Za-z][A-Za-z][A-Za-z][A-Za-z][A-Za-z]\d\d\d\d[A-Za-z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="assessmentYear">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;totalDigits value="4"/>
 *               &lt;pattern value="\d\d\d\d"/>
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
@XmlType(name = "ReturnStatusRequest", namespace = "http://incometaxindiaefiling.gov.in/ditsecws/request", propOrder = {
    "pan",
    "assessmentYear"
})
public class ReturnStatusRequest {

    @XmlElement(required = true)
    protected String pan;
    @XmlElement(required = true)
    protected BigInteger assessmentYear;
    @XmlAttribute(name = "uniqueRequestId", required = true)
    protected String uniqueRequestId;
 
    public ReturnStatusRequest() {
		super();
	}

	public ReturnStatusRequest(String pan, BigInteger assessmentYear,
			String uniqueRequestId) {
		super();
		this.pan = pan;
		this.assessmentYear = assessmentYear;
		this.uniqueRequestId = uniqueRequestId;
	}

	/**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the assessmentYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssessmentYear() {
        return assessmentYear;
    }

    /**
     * Sets the value of the assessmentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssessmentYear(BigInteger value) {
        this.assessmentYear = value;
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
