
package gs1.gepir.gepir_item_ext.xsd._4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gs1.gepir.gepir_item_ext.xsd._4 package. 
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

    private final static QName _ItemDatalineExtension_QNAME = new QName("urn:gs1:gepir:gepir_item_ext:xsd:4", "itemDatalineExtension");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gs1.gepir.gepir_item_ext.xsd._4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemDataLineExtensionType }
     * 
     */
    public ItemDataLineExtensionType createItemDataLineExtensionType() {
        return new ItemDataLineExtensionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemDataLineExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:gs1:gepir:gepir_item_ext:xsd:4", name = "itemDatalineExtension")
    public JAXBElement<ItemDataLineExtensionType> createItemDatalineExtension(ItemDataLineExtensionType value) {
        return new JAXBElement<ItemDataLineExtensionType>(_ItemDatalineExtension_QNAME, ItemDataLineExtensionType.class, null, value);
    }

}
