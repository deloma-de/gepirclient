
package gs1.gepir.gepir_common.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.AdditionalPartyIdentificationType;
import gs1.shared.shared_common.xsd._3.PartyRoleCodeType;


/**
 * <p>Java-Klasse für GepirPartyInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GepirPartyInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalPartyIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalPartyIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyRole" type="{urn:gs1:shared:shared_common:xsd:3}PartyRoleCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyContainment" type="{urn:gs1:gepir:gepir_common:xsd:4}PartyContainmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GepirPartyInformationType", propOrder = {
    "additionalPartyIdentification",
    "gln",
    "partyName",
    "partyRole",
    "partyContainment"
})
public class GepirPartyInformationType {

    @XmlElement(nillable = true)
    protected List<AdditionalPartyIdentificationType> additionalPartyIdentification;
    protected String gln;
    @XmlElement(nillable = true)
    protected List<String> partyName;
    @XmlElement(nillable = true)
    protected List<PartyRoleCodeType> partyRole;
    @XmlElement(nillable = true)
    protected List<PartyContainmentType> partyContainment;

    /**
     * Gets the value of the additionalPartyIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPartyIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPartyIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalPartyIdentificationType }
     * 
     * 
     */
    public List<AdditionalPartyIdentificationType> getAdditionalPartyIdentification() {
        if (additionalPartyIdentification == null) {
            additionalPartyIdentification = new ArrayList<AdditionalPartyIdentificationType>();
        }
        return this.additionalPartyIdentification;
    }

    /**
     * Ruft den Wert der gln-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGln() {
        return gln;
    }

    /**
     * Legt den Wert der gln-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGln(String value) {
        this.gln = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartyName() {
        if (partyName == null) {
            partyName = new ArrayList<String>();
        }
        return this.partyName;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRoleCodeType }
     * 
     * 
     */
    public List<PartyRoleCodeType> getPartyRole() {
        if (partyRole == null) {
            partyRole = new ArrayList<PartyRoleCodeType>();
        }
        return this.partyRole;
    }

    /**
     * Gets the value of the partyContainment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyContainment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyContainment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyContainmentType }
     * 
     * 
     */
    public List<PartyContainmentType> getPartyContainment() {
        if (partyContainment == null) {
            partyContainment = new ArrayList<PartyContainmentType>();
        }
        return this.partyContainment;
    }

}
