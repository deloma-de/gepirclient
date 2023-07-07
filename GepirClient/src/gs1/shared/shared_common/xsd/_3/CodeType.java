
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für CodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="codeDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeListAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeListAgencyCodeListVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeListAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeListName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeListURI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeListVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType", propOrder = {
    "value"
})
public class CodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "codeDescription")
    protected String codeDescription;
    @XmlAttribute(name = "codeListAgencyCode")
    protected String codeListAgencyCode;
    @XmlAttribute(name = "codeListAgencyCodeListVersion")
    protected String codeListAgencyCodeListVersion;
    @XmlAttribute(name = "codeListAgencyName")
    protected String codeListAgencyName;
    @XmlAttribute(name = "codeListName")
    protected String codeListName;
    @XmlAttribute(name = "codeListURI")
    protected String codeListURI;
    @XmlAttribute(name = "codeListVersion")
    protected String codeListVersion;

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
     * Ruft den Wert der codeDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDescription() {
        return codeDescription;
    }

    /**
     * Legt den Wert der codeDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDescription(String value) {
        this.codeDescription = value;
    }

    /**
     * Ruft den Wert der codeListAgencyCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListAgencyCode() {
        return codeListAgencyCode;
    }

    /**
     * Legt den Wert der codeListAgencyCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListAgencyCode(String value) {
        this.codeListAgencyCode = value;
    }

    /**
     * Ruft den Wert der codeListAgencyCodeListVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListAgencyCodeListVersion() {
        return codeListAgencyCodeListVersion;
    }

    /**
     * Legt den Wert der codeListAgencyCodeListVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListAgencyCodeListVersion(String value) {
        this.codeListAgencyCodeListVersion = value;
    }

    /**
     * Ruft den Wert der codeListAgencyName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListAgencyName() {
        return codeListAgencyName;
    }

    /**
     * Legt den Wert der codeListAgencyName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListAgencyName(String value) {
        this.codeListAgencyName = value;
    }

    /**
     * Ruft den Wert der codeListName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListName() {
        return codeListName;
    }

    /**
     * Legt den Wert der codeListName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListName(String value) {
        this.codeListName = value;
    }

    /**
     * Ruft den Wert der codeListURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListURI() {
        return codeListURI;
    }

    /**
     * Legt den Wert der codeListURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListURI(String value) {
        this.codeListURI = value;
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

}
