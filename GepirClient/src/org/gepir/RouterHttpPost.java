
package org.gepir;

import javax.jws.WebMethod;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "routerHttpPost", targetNamespace = "http://www.gepir.org/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ch.ean.gepir.response.ObjectFactory.class,
    ch.ean.gepir.request.ObjectFactory.class,
    org.gepir.ObjectFactory.class
})
public interface RouterHttpPost {


    /**
     * Gepir Server Swiss for client version 2
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GepirVersion2")
    @WebResult(name = "string", targetNamespace = "http://www.gepir.org/", partName = "Body")
    public String gepirVersion2();

    /**
     * SetAuthorize
     * 
     */
    @WebMethod(operationName = "SessionAuthorize")
    public void sessionAuthorize();

    /**
     * Hello World
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWorld")
    @WebResult(name = "string", targetNamespace = "http://www.gepir.org/", partName = "Body")
    public String helloWorld();

}
