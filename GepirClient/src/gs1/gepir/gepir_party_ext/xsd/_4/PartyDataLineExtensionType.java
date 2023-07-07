
package gs1.gepir.gepir_party_ext.xsd._4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.gepir.gepir_party.xsd._4.PartyDataLineType;


/**
 * <p>Java-Klasse für PartyDataLineExtensionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PartyDataLineExtensionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:gepir:gepir_party:xsd:4}PartyDataLineType">
 *       &lt;sequence>
 *         &lt;element name="administeringMO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registryValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registryValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gcpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateOfMember" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyDataLineExtensionType", propOrder = {
    "administeringMO",
    "registryValue",
    "registryValueType",
    "gcpType",
    "stateOfMember",
    "dateOfState"
})
public class PartyDataLineExtensionType
    extends PartyDataLineType
{

    protected String administeringMO;
    protected String registryValue;
    protected String registryValueType;
    protected String gcpType;
    @XmlElement(required = true)
    protected String stateOfMember;
    @XmlElement(required = true)
    protected String dateOfState;

    /**
     * Ruft den Wert der administeringMO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeringMO() {
        return administeringMO;
    }

    /**
     * Legt den Wert der administeringMO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeringMO(String value) {
        this.administeringMO = value;
    }

    /**
     * Ruft den Wert der registryValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryValue() {
        return registryValue;
    }

    /**
     * Legt den Wert der registryValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryValue(String value) {
        this.registryValue = value;
    }

    /**
     * Ruft den Wert der registryValueType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryValueType() {
        return registryValueType;
    }

    /**
     * Legt den Wert der registryValueType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryValueType(String value) {
        this.registryValueType = value;
    }

    /**
     * Ruft den Wert der gcpType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGcpType() {
        return gcpType;
    }

    /**
     * Legt den Wert der gcpType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGcpType(String value) {
        this.gcpType = value;
    }

    /**
     * Ruft den Wert der stateOfMember-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOfMember() {
        return stateOfMember;
    }

    /**
     * Legt den Wert der stateOfMember-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOfMember(String value) {
        this.stateOfMember = value;
    }

    /**
     * Ruft den Wert der dateOfState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfState() {
        return dateOfState;
    }

    /**
     * Legt den Wert der dateOfState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfState(String value) {
        this.dateOfState = value;
    }

}
