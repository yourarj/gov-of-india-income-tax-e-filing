
package com.github.yourarj.e_filing.gov.bulk_pan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BulkPanResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkPanResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://incometaxindiaefiling.gov.in/ditsecws/response}DitResponse">
 *       &lt;sequence>
 *         &lt;element name="tokenNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkPanResponse", propOrder = {
    "tokenNumber"
})
public class BulkPanResponse
    extends DitResponse
{

    protected String tokenNumber;

    /**
     * Gets the value of the tokenNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenNumber() {
        return tokenNumber;
    }

    /**
     * Sets the value of the tokenNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenNumber(String value) {
        this.tokenNumber = value;
    }

}
