
package com.github.yourarj.e_filing.gov.itrv_by_ackno;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetItrVByAckNoService", targetNamespace = "http://incometaxindiaefiling.gov.in/ditsecws")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetItrVByAckNoService {


    /**
     * 
     * @param ditRequest
     * @return
     *     returns itrv_by_ackno.ItrVStatusAckNoResponse
     */
    @WebMethod
    @WebResult(name = "DitResponse", targetNamespace = "http://incometaxindiaefiling.gov.in/ditsecws")
    @RequestWrapper(localName = "getItrV", targetNamespace = "http://incometaxindiaefiling.gov.in/ditsecws", className = "itrv_by_ackno.GetItrV")
    @ResponseWrapper(localName = "getItrVResponse", targetNamespace = "http://incometaxindiaefiling.gov.in/ditsecws", className = "itrv_by_ackno.GetItrVResponse")
    public ItrVStatusAckNoResponse getItrV(
            @WebParam(name = "DitRequest", targetNamespace = "http://incometaxindiaefiling.gov.in/ditsecws")
                    GetItrVByAckNoRequest ditRequest);

}
