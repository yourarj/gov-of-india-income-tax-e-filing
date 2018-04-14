
package com.github.yourarj.e_filing.gov.evc_thru_bank_atm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBankAtmGenEvcDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBankAtmGenEvcDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DitRequest" type="{http://incometaxindiaefiling.gov.in/ditsecws/request}BankAtmGenEvcRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBankAtmGenEvcDetails", propOrder = {
    "ditRequest"
})
public class GetBankAtmGenEvcDetails {

    @XmlElement(name = "DitRequest", required = true)
    protected BankAtmGenEvcRequest ditRequest;

    /**
     * Gets the value of the ditRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BankAtmGenEvcRequest }
     *     
     */
    public BankAtmGenEvcRequest getDitRequest() {
        return ditRequest;
    }

    /**
     * Sets the value of the ditRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAtmGenEvcRequest }
     *     
     */
    public void setDitRequest(BankAtmGenEvcRequest value) {
        this.ditRequest = value;
    }

}
