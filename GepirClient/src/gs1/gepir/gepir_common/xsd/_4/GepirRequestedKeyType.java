
package gs1.gepir.gepir_common.xsd._4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;


/**
 * <p>Java-Klasse für GepirRequestedKeyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GepirRequestedKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedKeyCode" type="{urn:gs1:gepir:gepir_common:xsd:4}RequestedKeyCodeType"/>
 *         &lt;element name="requestedKeyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestedLanguage" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GepirRequestedKeyType", propOrder = {
    "requestedKeyCode",
    "requestedKeyValue",
    "requestedLanguage"
})
public class GepirRequestedKeyType {

    @XmlElement(required = true)
    protected RequestedKeyCodeType requestedKeyCode;
    @XmlElement(required = true)
    protected String requestedKeyValue;
    protected LanguageCodeType requestedLanguage;

    /**
     * Ruft den Wert der requestedKeyCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestedKeyCodeType }
     *     
     */
    public RequestedKeyCodeType getRequestedKeyCode() {
        return requestedKeyCode;
    }

    /**
     * Legt den Wert der requestedKeyCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedKeyCodeType }
     *     
     */
    public void setRequestedKeyCode(RequestedKeyCodeType value) {
        this.requestedKeyCode = value;
    }

    /**
     * Ruft den Wert der requestedKeyValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedKeyValue() {
        return requestedKeyValue;
    }

    /**
     * Legt den Wert der requestedKeyValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedKeyValue(String value) {
        this.requestedKeyValue = value;
    }

    /**
     * Ruft den Wert der requestedLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getRequestedLanguage() {
        return requestedLanguage;
    }

    /**
     * Legt den Wert der requestedLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setRequestedLanguage(LanguageCodeType value) {
        this.requestedLanguage = value;
    }

}
