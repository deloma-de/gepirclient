
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für SizeCodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SizeCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="sizeCodeListCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sizeCodeListDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeListVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sizeCodeListVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SizeCodeType", propOrder = {
    "value"
})
public class SizeCodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "sizeCodeListCode", required = true)
    protected String sizeCodeListCode;
    @XmlAttribute(name = "sizeCodeListDescription")
    protected String sizeCodeListDescription;
    @XmlAttribute(name = "codeListVersion")
    protected String codeListVersion;
    @XmlAttribute(name = "sizeCodeListVersion")
    protected String sizeCodeListVersion;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der sizeCodeListCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCodeListCode() {
        return sizeCodeListCode;
    }

    /**
     * Legt den Wert der sizeCodeListCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCodeListCode(String value) {
        this.sizeCodeListCode = value;
    }

    /**
     * Ruft den Wert der sizeCodeListDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCodeListDescription() {
        return sizeCodeListDescription;
    }

    /**
     * Legt den Wert der sizeCodeListDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCodeListDescription(String value) {
        this.sizeCodeListDescription = value;
    }

    /**
     * Ruft den Wert der codeListVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersion() {
        return codeListVersion;
    }

    /**
     * Legt den Wert der codeListVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersion(String value) {
        this.codeListVersion = value;
    }

    /**
     * Ruft den Wert der sizeCodeListVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCodeListVersion() {
        return sizeCodeListVersion;
    }

    /**
     * Legt den Wert der sizeCodeListVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCodeListVersion(String value) {
        this.sizeCodeListVersion = value;
    }

}
