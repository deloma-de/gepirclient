
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EntityIdentificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EntityIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityIdentification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentOwner" type="{urn:gs1:shared:shared_common:xsd:3}PartyIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityIdentificationType", propOrder = {
    "entityIdentification",
    "contentOwner"
})
@XmlSeeAlso({
    DocumentReferenceType.class,
    TypedEntityIdentificationType.class
})
public class EntityIdentificationType {

    @XmlElement(required = true)
    protected String entityIdentification;
    protected PartyIdentificationType contentOwner;

    /**
     * Ruft den Wert der entityIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityIdentification() {
        return entityIdentification;
    }

    /**
     * Legt den Wert der entityIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityIdentification(String value) {
        this.entityIdentification = value;
    }

    /**
     * Ruft den Wert der contentOwner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationType }
     *     
     */
    public PartyIdentificationType getContentOwner() {
        return contentOwner;
    }

    /**
     * Legt den Wert der contentOwner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationType }
     *     
     */
    public void setContentOwner(PartyIdentificationType value) {
        this.contentOwner = value;
    }

}
