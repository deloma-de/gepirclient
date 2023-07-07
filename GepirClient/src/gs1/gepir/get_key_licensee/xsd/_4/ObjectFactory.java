
package gs1.gepir.get_key_licensee.xsd._4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gepir.get_key_licensee.xsd._4 package. 
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

    private final static QName _GetKeyLicensee_QNAME = new QName("urn:gs1:gepir:get_key_licensee:xsd:4", "getKeyLicensee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gepir.get_key_licensee.xsd._4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetKeyLicenseeType }
     * 
     */
    public GetKeyLicenseeType createGetKeyLicenseeType() {
        return new GetKeyLicenseeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKeyLicenseeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gs1:gepir:get_key_licensee:xsd:4", name = "getKeyLicensee")
    public JAXBElement<GetKeyLicenseeType> createGetKeyLicensee(GetKeyLicenseeType value) {
        return new JAXBElement<GetKeyLicenseeType>(_GetKeyLicensee_QNAME, GetKeyLicenseeType.class, null, value);
    }

}
