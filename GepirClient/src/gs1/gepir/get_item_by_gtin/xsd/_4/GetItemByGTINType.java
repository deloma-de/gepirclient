
package gs1.gepir.get_item_by_gtin.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;


/**
 * <p>Java-Klasse für GetItemByGTINType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetItemByGTINType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedLanguage" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType" minOccurs="0"/>
 *         &lt;element name="requestedGTIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemByGTINType", propOrder = {
    "requestedLanguage",
    "requestedGTIN"
})
public class GetItemByGTINType {

    protected LanguageCodeType requestedLanguage;
    @XmlElement(required = true)
    protected List<String> requestedGTIN;

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

    /**
     * Gets the value of the requestedGTIN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedGTIN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedGTIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestedGTIN() {
        if (requestedGTIN == null) {
            requestedGTIN = new ArrayList<String>();
        }
        return this.requestedGTIN;
    }

}
