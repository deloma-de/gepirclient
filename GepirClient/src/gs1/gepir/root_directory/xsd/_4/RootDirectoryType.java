
package gs1.gepir.root_directory.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gepir.gepir_common.xsd._4.MemberOrganisationType;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;


/**
 * <p>Java-Klasse für RootDirectoryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RootDirectoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rootDirectoryDataLanguage" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType"/>
 *         &lt;element name="rootDirectoryVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberOrganisation" type="{urn:gs1:gepir:gepir_common:xsd:4}MemberOrganisationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootDirectoryType", propOrder = {
    "rootDirectoryDataLanguage",
    "rootDirectoryVersion",
    "memberOrganisation"
})
public class RootDirectoryType {

    @XmlElement(required = true)
    protected LanguageCodeType rootDirectoryDataLanguage;
    @XmlElement(required = true)
    protected String rootDirectoryVersion;
    @XmlElement(required = true)
    protected List<MemberOrganisationType> memberOrganisation;

    /**
     * Ruft den Wert der rootDirectoryDataLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getRootDirectoryDataLanguage() {
        return rootDirectoryDataLanguage;
    }

    /**
     * Legt den Wert der rootDirectoryDataLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setRootDirectoryDataLanguage(LanguageCodeType value) {
        this.rootDirectoryDataLanguage = value;
    }

    /**
     * Ruft den Wert der rootDirectoryVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootDirectoryVersion() {
        return rootDirectoryVersion;
    }

    /**
     * Legt den Wert der rootDirectoryVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootDirectoryVersion(String value) {
        this.rootDirectoryVersion = value;
    }

    /**
     * Gets the value of the memberOrganisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberOrganisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberOrganisationType }
     * 
     * 
     */
    public List<MemberOrganisationType> getMemberOrganisation() {
        if (memberOrganisation == null) {
            memberOrganisation = new ArrayList<MemberOrganisationType>();
        }
        return this.memberOrganisation;
    }

}
