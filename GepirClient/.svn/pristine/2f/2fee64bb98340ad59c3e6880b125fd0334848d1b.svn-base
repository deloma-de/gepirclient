
package gs1.gepir.gepir_common.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;


/**
 * <p>Java-Klasse für GepirInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GepirInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gepirClientURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gepirStatusCode" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirStatusCodeType"/>
 *         &lt;element name="gepirVersionCode" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirVersionCodeType"/>
 *         &lt;element name="supportedLanguage" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gepirServer" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirServerType" maxOccurs="unbounded"/>
 *         &lt;element name="gepirRouter" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirRouterType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GepirInformationType", propOrder = {
    "gepirClientURI",
    "gepirStatusCode",
    "gepirVersionCode",
    "supportedLanguage",
    "gepirServer",
    "gepirRouter"
})
public class GepirInformationType {

    @XmlElement(required = true)
    protected String gepirClientURI;
    @XmlElement(required = true)
    protected GepirStatusCodeType gepirStatusCode;
    @XmlElement(required = true)
    protected GepirVersionCodeType gepirVersionCode;
    @XmlElement(nillable = true)
    protected List<LanguageCodeType> supportedLanguage;
    @XmlElement(required = true)
    protected List<GepirServerType> gepirServer;
    @XmlElement(required = true)
    protected GepirRouterType gepirRouter;

    /**
     * Ruft den Wert der gepirClientURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGepirClientURI() {
        return gepirClientURI;
    }

    /**
     * Legt den Wert der gepirClientURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGepirClientURI(String value) {
        this.gepirClientURI = value;
    }

    /**
     * Ruft den Wert der gepirStatusCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirStatusCodeType }
     *     
     */
    public GepirStatusCodeType getGepirStatusCode() {
        return gepirStatusCode;
    }

    /**
     * Legt den Wert der gepirStatusCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirStatusCodeType }
     *     
     */
    public void setGepirStatusCode(GepirStatusCodeType value) {
        this.gepirStatusCode = value;
    }

    /**
     * Ruft den Wert der gepirVersionCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirVersionCodeType }
     *     
     */
    public GepirVersionCodeType getGepirVersionCode() {
        return gepirVersionCode;
    }

    /**
     * Legt den Wert der gepirVersionCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirVersionCodeType }
     *     
     */
    public void setGepirVersionCode(GepirVersionCodeType value) {
        this.gepirVersionCode = value;
    }

    /**
     * Gets the value of the supportedLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getSupportedLanguage() {
        if (supportedLanguage == null) {
            supportedLanguage = new ArrayList<LanguageCodeType>();
        }
        return this.supportedLanguage;
    }

    /**
     * Gets the value of the gepirServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gepirServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGepirServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GepirServerType }
     * 
     * 
     */
    public List<GepirServerType> getGepirServer() {
        if (gepirServer == null) {
            gepirServer = new ArrayList<GepirServerType>();
        }
        return this.gepirServer;
    }

    /**
     * Ruft den Wert der gepirRouter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirRouterType }
     *     
     */
    public GepirRouterType getGepirRouter() {
        return gepirRouter;
    }

    /**
     * Legt den Wert der gepirRouter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirRouterType }
     *     
     */
    public void setGepirRouter(GepirRouterType value) {
        this.gepirRouter = value;
    }

}
