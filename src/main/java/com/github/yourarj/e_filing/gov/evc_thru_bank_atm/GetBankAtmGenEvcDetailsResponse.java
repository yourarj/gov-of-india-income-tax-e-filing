
package com.github.yourarj.e_filing.gov.evc_thru_bank_atm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBankAtmGenEvcDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBankAtmGenEvcDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DitResponse" type="{http://incometaxindiaefiling.gov.in/ditsecws/response}BankAtmGenEvcResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBankAtmGenEvcDetailsResponse", propOrder = {
    "ditResponse"
})
public class GetBankAtmGenEvcDetailsResponse {

    @XmlElement(name = "DitResponse")
    protected BankAtmGenEvcResponse ditResponse;

    /**
     * Gets the value of the ditResponse property.
     * 
     * @return
     *     possible object is
     *     {@link BankAtmGenEvcResponse }
     *     
     */
    public BankAtmGenEvcResponse getDitResponse() {
        return ditResponse;
    }

    /**
     * Sets the value of the ditResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAtmGenEvcResponse }
     *     
     */
    public void setDitResponse(BankAtmGenEvcResponse value) {
        this.ditResponse = value;
    }

}
