
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GPCAttributeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GPCAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gpcAttributeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpcAttributeValueCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpcAttributeTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gpcAttributeValueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPCAttributeType", propOrder = {
    "gpcAttributeTypeCode",
    "gpcAttributeValueCode",
    "gpcAttributeTypeName",
    "gpcAttributeValueName"
})
public class GPCAttributeType {

    @XmlElement(required = true)
    protected String gpcAttributeTypeCode;
    @XmlElement(required = true)
    protected String gpcAttributeValueCode;
    protected String gpcAttributeTypeName;
    protected String gpcAttributeValueName;

    /**
     * Ruft den Wert der gpcAttributeTypeCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeTypeCode() {
        return gpcAttributeTypeCode;
    }

    /**
     * Legt den Wert der gpcAttributeTypeCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeTypeCode(String value) {
        this.gpcAttributeTypeCode = value;
    }

    /**
     * Ruft den Wert der gpcAttributeValueCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeValueCode() {
        return gpcAttributeValueCode;
    }

    /**
     * Legt den Wert der gpcAttributeValueCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeValueCode(String value) {
        this.gpcAttributeValueCode = value;
    }

    /**
     * Ruft den Wert der gpcAttributeTypeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeTypeName() {
        return gpcAttributeTypeName;
    }

    /**
     * Legt den Wert der gpcAttributeTypeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeTypeName(String value) {
        this.gpcAttributeTypeName = value;
    }

    /**
     * Ruft den Wert der gpcAttributeValueName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcAttributeValueName() {
        return gpcAttributeValueName;
    }

    /**
     * Legt den Wert der gpcAttributeValueName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcAttributeValueName(String value) {
        this.gpcAttributeValueName = value;
    }

}
