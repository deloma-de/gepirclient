
package gs1.gepir.gepir_common.xsd._4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GepirItemExternalFileLinkType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GepirItemExternalFileLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileFormatName" type="{urn:gs1:gepir:gepir_common:xsd:4}FileFormatCodeType" minOccurs="0"/>
 *         &lt;element name="uniformResourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GepirItemExternalFileLinkType", propOrder = {
    "fileFormatName",
    "uniformResourceIdentifier"
})
public class GepirItemExternalFileLinkType {

    protected FileFormatCodeType fileFormatName;
    @XmlSchemaType(name = "anyURI")
    protected String uniformResourceIdentifier;

    /**
     * Ruft den Wert der fileFormatName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileFormatCodeType }
     *     
     */
    public FileFormatCodeType getFileFormatName() {
        return fileFormatName;
    }

    /**
     * Legt den Wert der fileFormatName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFormatCodeType }
     *     
     */
    public void setFileFormatName(FileFormatCodeType value) {
        this.fileFormatName = value;
    }

    /**
     * Ruft den Wert der uniformResourceIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniformResourceIdentifier() {
        return uniformResourceIdentifier;
    }

    /**
     * Legt den Wert der uniformResourceIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniformResourceIdentifier(String value) {
        this.uniformResourceIdentifier = value;
    }

}
