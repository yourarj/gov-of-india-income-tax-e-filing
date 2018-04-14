
package com.github.yourarj.e_filing.gov.evc_thru_bank_atm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankAtmGenEvcResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAtmGenEvcResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://incometaxindiaefiling.gov.in/ditsecws/response}DitResponse">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAtmGenEvcResponse", namespace = "http://incometaxindiaefiling.gov.in/ditsecws/response", propOrder = {
    "result"
})
public class BankAtmGenEvcResponse
    extends DitResponse
{

    protected String result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

	@Override
	public String toString() {
		return "BankAtmGenEvcResponse [result=" + result + "]";
	}
    
    

}
