
package ch.ean.gepir.response;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.ean.gepir.response package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.ean.gepir.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GepirVersion2Response }
     * 
     */
    public GepirVersion2Response createGepirVersion2Response() {
        return new GepirVersion2Response();
    }

    /**
     * Create an instance of {@link GepirVersion2Response.GepirVersion2Result }
     * 
     */
    public GepirVersion2Response.GepirVersion2Result createGepirVersion2ResponseGepirVersion2Result() {
        return new GepirVersion2Response.GepirVersion2Result();
    }

}
