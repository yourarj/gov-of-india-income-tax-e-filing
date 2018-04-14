
package com.github.yourarj.e_filing.gov.evc_thru_bank_atm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankAtmGenEvcRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAtmGenEvcRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pan">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *               &lt;pattern value="[A-Za-z][A-Za-z][A-Za-z][JjLlBbTtAaCcFfHhPpGg][A-Za-z]\d\d\d\d[A-Za-z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="atmId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[A-Z0-9]{5,20}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="atmCardNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="16"/>
 *               &lt;pattern value="[0-9Xx]{16}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bankAccNum">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *               &lt;pattern value="[a-zA-Z0-9]([/-]?(((\d*[1-9]\d*)*[a-zA-Z/-])|(\d*[1-9]\d*[a-zA-Z]*))+)*[0-9]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ifsCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="11"/>
 *               &lt;pattern value="[A-Za-z]{4}(0)[a-zA-Z0-9]{6}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="atmAccessTime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}-([0][1-9]|[1][012])-([0][1-9]|[12][0-9]|[3][01])-([01][0-9]|[2][0-3]).[0-5][0-9].[0-5][0-9].[0-9]{6}"/>
 *               &lt;maxLength value="26"/>
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
@XmlType(name = "BankAtmGenEvcRequest", namespace = "http://incometaxindiaefiling.gov.in/ditsecws/request", propOrder = {
    "pan",
    "atmId",
    "atmCardNo",
    "bankAccNum",
    "ifsCode",
    "atmAccessTime"
})
public class BankAtmGenEvcRequest {

    @XmlElement(required = true)
    protected String pan;
    @XmlElement(required = true)
    protected String atmId;
    @XmlElement(required = true)
    protected String atmCardNo;
    @XmlElement(required = true)
    protected String bankAccNum;
    @XmlElement(required = true)
    protected String ifsCode;
    @XmlElement(required = true)
    protected String atmAccessTime;
    @XmlAttribute(required = true)
    protected String uniqueRequestId;

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
     * Gets the value of the atmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtmId() {
        return atmId;
    }

    /**
     * Sets the value of the atmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtmId(String value) {
        this.atmId = value;
    }

    /**
     * Gets the value of the atmCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtmCardNo() {
        return atmCardNo;
    }

    /**
     * Sets the value of the atmCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtmCardNo(String value) {
        this.atmCardNo = value;
    }

    /**
     * Gets the value of the bankAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccNum() {
        return bankAccNum;
    }

    /**
     * Sets the value of the bankAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccNum(String value) {
        this.bankAccNum = value;
    }

    /**
     * Gets the value of the ifsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfsCode() {
        return ifsCode;
    }

    /**
     * Sets the value of the ifsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfsCode(String value) {
        this.ifsCode = value;
    }

    /**
     * Gets the value of the atmAccessTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtmAccessTime() {
        return atmAccessTime;
    }

    /**
     * Sets the value of the atmAccessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtmAccessTime(String value) {
        this.atmAccessTime = value;
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
