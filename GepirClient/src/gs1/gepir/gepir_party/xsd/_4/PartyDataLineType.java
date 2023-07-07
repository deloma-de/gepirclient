
package gs1.gepir.gepir_party.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gs1.gepir.gepir_common.xsd._4.GepirItemExternalFileLinkType;
import gs1.gepir.gepir_common.xsd._4.GepirPartyInformationType;
import gs1.gepir.gepir_common.xsd._4.GepirRequestedKeyType;
import gs1.gepir.gepir_common.xsd._4.GepirReturnCodeType;
import gs1.gepir.gepir_common.xsd._4.ResponderSpecificDataType;
import gs1.gepir.gepir_party_ext.xsd._4.PartyDataLineExtensionType;
import gs1.shared.shared_common.xsd._3.AddressType;
import gs1.shared.shared_common.xsd._3.ContactType;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;


/**
 * <p>Java-Klasse für PartyDataLineType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PartyDataLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gS1CompanyPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="partyDataLanguage" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType"/>
 *         &lt;element name="returnCode" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirReturnCodeType"/>
 *         &lt;element name="address" type="{urn:gs1:shared:shared_common:xsd:3}AddressType" minOccurs="0"/>
 *         &lt;element name="gepirRequestedKey" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirRequestedKeyType" minOccurs="0"/>
 *         &lt;element name="responderSpecificData" type="{urn:gs1:gepir:gepir_common:xsd:4}ResponderSpecificDataType" minOccurs="0"/>
 *         &lt;element name="gepirItemExternalFileLink" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirItemExternalFileLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gS1CompanyPrefixLicensee" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirPartyInformationType" minOccurs="0"/>
 *         &lt;element name="gS1KeyLicensee" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirPartyInformationType" minOccurs="0"/>
 *         &lt;element name="informationProvider" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirPartyInformationType"/>
 *         &lt;element name="contact" type="{urn:gs1:shared:shared_common:xsd:3}ContactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyDataLineType", propOrder = {
    "gs1CompanyPrefix",
    "lastChangeDate",
    "partyDataLanguage",
    "returnCode",
    "address",
    "gepirRequestedKey",
    "responderSpecificData",
    "gepirItemExternalFileLink",
    "gs1CompanyPrefixLicensee",
    "gs1KeyLicensee",
    "informationProvider",
    "contact"
})
@XmlSeeAlso({
    PartyDataLineExtensionType.class
})
public class PartyDataLineType {

    @XmlElement(name = "gS1CompanyPrefix")
    protected String gs1CompanyPrefix;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlElement(required = true)
    protected LanguageCodeType partyDataLanguage;
    @XmlElement(required = true)
    protected GepirReturnCodeType returnCode;
    protected AddressType address;
    protected GepirRequestedKeyType gepirRequestedKey;
    protected ResponderSpecificDataType responderSpecificData;
    @XmlElement(nillable = true)
    protected List<GepirItemExternalFileLinkType> gepirItemExternalFileLink;
    @XmlElement(name = "gS1CompanyPrefixLicensee")
    protected GepirPartyInformationType gs1CompanyPrefixLicensee;
    @XmlElement(name = "gS1KeyLicensee")
    protected GepirPartyInformationType gs1KeyLicensee;
    @XmlElement(required = true)
    protected GepirPartyInformationType informationProvider;
    @XmlElement(nillable = true)
    protected List<ContactType> contact;

    /**
     * Ruft den Wert der gs1CompanyPrefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGS1CompanyPrefix() {
        return gs1CompanyPrefix;
    }

    /**
     * Legt den Wert der gs1CompanyPrefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGS1CompanyPrefix(String value) {
        this.gs1CompanyPrefix = value;
    }

    /**
     * Ruft den Wert der lastChangeDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Legt den Wert der lastChangeDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangeDate(XMLGregorianCalendar value) {
        this.lastChangeDate = value;
    }

    /**
     * Ruft den Wert der partyDataLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getPartyDataLanguage() {
        return partyDataLanguage;
    }

    /**
     * Legt den Wert der partyDataLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setPartyDataLanguage(LanguageCodeType value) {
        this.partyDataLanguage = value;
    }

    /**
     * Ruft den Wert der returnCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirReturnCodeType }
     *     
     */
    public GepirReturnCodeType getReturnCode() {
        return returnCode;
    }

    /**
     * Legt den Wert der returnCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirReturnCodeType }
     *     
     */
    public void setReturnCode(GepirReturnCodeType value) {
        this.returnCode = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der gepirRequestedKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirRequestedKeyType }
     *     
     */
    public GepirRequestedKeyType getGepirRequestedKey() {
        return gepirRequestedKey;
    }

    /**
     * Legt den Wert der gepirRequestedKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirRequestedKeyType }
     *     
     */
    public void setGepirRequestedKey(GepirRequestedKeyType value) {
        this.gepirRequestedKey = value;
    }

    /**
     * Ruft den Wert der responderSpecificData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponderSpecificDataType }
     *     
     */
    public ResponderSpecificDataType getResponderSpecificData() {
        return responderSpecificData;
    }

    /**
     * Legt den Wert der responderSpecificData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponderSpecificDataType }
     *     
     */
    public void setResponderSpecificData(ResponderSpecificDataType value) {
        this.responderSpecificData = value;
    }

    /**
     * Gets the value of the gepirItemExternalFileLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gepirItemExternalFileLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGepirItemExternalFileLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GepirItemExternalFileLinkType }
     * 
     * 
     */
    public List<GepirItemExternalFileLinkType> getGepirItemExternalFileLink() {
        if (gepirItemExternalFileLink == null) {
            gepirItemExternalFileLink = new ArrayList<GepirItemExternalFileLinkType>();
        }
        return this.gepirItemExternalFileLink;
    }

    /**
     * Ruft den Wert der gs1CompanyPrefixLicensee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public GepirPartyInformationType getGS1CompanyPrefixLicensee() {
        return gs1CompanyPrefixLicensee;
    }

    /**
     * Legt den Wert der gs1CompanyPrefixLicensee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public void setGS1CompanyPrefixLicensee(GepirPartyInformationType value) {
        this.gs1CompanyPrefixLicensee = value;
    }

    /**
     * Ruft den Wert der gs1KeyLicensee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public GepirPartyInformationType getGS1KeyLicensee() {
        return gs1KeyLicensee;
    }

    /**
     * Legt den Wert der gs1KeyLicensee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public void setGS1KeyLicensee(GepirPartyInformationType value) {
        this.gs1KeyLicensee = value;
    }

    /**
     * Ruft den Wert der informationProvider-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public GepirPartyInformationType getInformationProvider() {
        return informationProvider;
    }

    /**
     * Legt den Wert der informationProvider-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public void setInformationProvider(GepirPartyInformationType value) {
        this.informationProvider = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactType>();
        }
        return this.contact;
    }

}
