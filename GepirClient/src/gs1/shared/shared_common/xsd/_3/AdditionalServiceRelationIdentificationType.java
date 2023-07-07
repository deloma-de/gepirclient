
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für AdditionalServiceRelationIdentificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServiceRelationIdentificationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="additionalServiceRelationIdentificationTypeCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeListVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServiceRelationIdentificationType", propOrder = {
    "value"
})
public class AdditionalServiceRelationIdentificationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "additionalServiceRelationIdentificationTypeCode", required = true)
    protected String additionalServiceRelationIdentificationTypeCode;
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
     * Ruft den Wert der additionalServiceRelationIdentificationTypeCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServiceRelationIdentificationTypeCode() {
        return additionalServiceRelationIdentificationTypeCode;
    }

    /**
     * Legt den Wert der additionalServiceRelationIdentificationTypeCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServiceRelationIdentificationTypeCode(String value) {
        this.additionalServiceRelationIdentificationTypeCode = value;
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
