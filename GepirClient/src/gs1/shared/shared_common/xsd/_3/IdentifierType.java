
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für IdentifierType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IdentifierType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="identificationSchemeAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="identificationSchemeAgencyCodeCodeListVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="identificationSchemeAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="identificationSchemeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", propOrder = {
    "value"
})
public class IdentifierType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "identificationSchemeAgencyCode")
    protected String identificationSchemeAgencyCode;
    @XmlAttribute(name = "identificationSchemeAgencyCodeCodeListVersion")
    protected String identificationSchemeAgencyCodeCodeListVersion;
    @XmlAttribute(name = "identificationSchemeAgencyName")
    protected String identificationSchemeAgencyName;
    @XmlAttribute(name = "identificationSchemeName")
    protected String identificationSchemeName;

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
     * Ruft den Wert der identificationSchemeAgencyCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationSchemeAgencyCode() {
        return identificationSchemeAgencyCode;
    }

    /**
     * Legt den Wert der identificationSchemeAgencyCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationSchemeAgencyCode(String value) {
        this.identificationSchemeAgencyCode = value;
    }

    /**
     * Ruft den Wert der identificationSchemeAgencyCodeCodeListVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationSchemeAgencyCodeCodeListVersion() {
        return identificationSchemeAgencyCodeCodeListVersion;
    }

    /**
     * Legt den Wert der identificationSchemeAgencyCodeCodeListVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationSchemeAgencyCodeCodeListVersion(String value) {
        this.identificationSchemeAgencyCodeCodeListVersion = value;
    }

    /**
     * Ruft den Wert der identificationSchemeAgencyName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationSchemeAgencyName() {
        return identificationSchemeAgencyName;
    }

    /**
     * Legt den Wert der identificationSchemeAgencyName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationSchemeAgencyName(String value) {
        this.identificationSchemeAgencyName = value;
    }

    /**
     * Ruft den Wert der identificationSchemeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationSchemeName() {
        return identificationSchemeName;
    }

    /**
     * Legt den Wert der identificationSchemeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationSchemeName(String value) {
        this.identificationSchemeName = value;
    }

}
