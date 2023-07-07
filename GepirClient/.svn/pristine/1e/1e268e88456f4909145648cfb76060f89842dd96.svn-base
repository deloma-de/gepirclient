
package gs1.gepir.gepir_common.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.ContactType;


/**
 * <p>Java-Klasse für GepirRouterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GepirRouterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routerGLN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routerIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routerSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routerURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacyVersion" type="{urn:gs1:gepir:gepir_common:xsd:4}EntryPointType" maxOccurs="unbounded"/>
 *         &lt;element name="gepirRouterTechnicalContact" type="{urn:gs1:shared:shared_common:xsd:3}ContactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GepirRouterType", propOrder = {
    "routerGLN",
    "routerIPAddress",
    "routerSubnetMask",
    "routerURL",
    "legacyVersion",
    "gepirRouterTechnicalContact"
})
public class GepirRouterType {

    @XmlElement(required = true)
    protected String routerGLN;
    @XmlElement(required = true)
    protected String routerIPAddress;
    @XmlElement(required = true)
    protected String routerSubnetMask;
    @XmlElement(required = true)
    protected String routerURL;
    @XmlElement(required = true)
    protected List<EntryPointType> legacyVersion;
    @XmlElement(nillable = true)
    protected List<ContactType> gepirRouterTechnicalContact;

    /**
     * Ruft den Wert der routerGLN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouterGLN() {
        return routerGLN;
    }

    /**
     * Legt den Wert der routerGLN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouterGLN(String value) {
        this.routerGLN = value;
    }

    /**
     * Ruft den Wert der routerIPAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouterIPAddress() {
        return routerIPAddress;
    }

    /**
     * Legt den Wert der routerIPAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouterIPAddress(String value) {
        this.routerIPAddress = value;
    }

    /**
     * Ruft den Wert der routerSubnetMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouterSubnetMask() {
        return routerSubnetMask;
    }

    /**
     * Legt den Wert der routerSubnetMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouterSubnetMask(String value) {
        this.routerSubnetMask = value;
    }

    /**
     * Ruft den Wert der routerURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouterURL() {
        return routerURL;
    }

    /**
     * Legt den Wert der routerURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouterURL(String value) {
        this.routerURL = value;
    }

    /**
     * Gets the value of the legacyVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legacyVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegacyVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryPointType }
     * 
     * 
     */
    public List<EntryPointType> getLegacyVersion() {
        if (legacyVersion == null) {
            legacyVersion = new ArrayList<EntryPointType>();
        }
        return this.legacyVersion;
    }

    /**
     * Gets the value of the gepirRouterTechnicalContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gepirRouterTechnicalContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGepirRouterTechnicalContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getGepirRouterTechnicalContact() {
        if (gepirRouterTechnicalContact == null) {
            gepirRouterTechnicalContact = new ArrayList<ContactType>();
        }
        return this.gepirRouterTechnicalContact;
    }

}
