
package gs1.gepir.gepir_common.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gs1.shared.shared_common.xsd._3.AddressType;
import gs1.shared.shared_common.xsd._3.ContactType;
import gs1.shared.shared_common.xsd._3.CountryCodeType;


/**
 * <p>Java-Klasse für MemberOrganisationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MemberOrganisationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryAdministered" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType" maxOccurs="unbounded"/>
 *         &lt;element name="lastChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="returnCode" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirReturnCodeType"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gepirCountry" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirCountryType" maxOccurs="unbounded"/>
 *         &lt;element name="informationProvider" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirPartyInformationType"/>
 *         &lt;element name="prefixRange" type="{urn:gs1:gepir:gepir_common:xsd:4}PrefixRangeType" maxOccurs="unbounded"/>
 *         &lt;element name="gepirInformation" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirInformationType"/>
 *         &lt;element name="contact" type="{urn:gs1:shared:shared_common:xsd:3}ContactType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{urn:gs1:shared:shared_common:xsd:3}AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberOrganisationType", propOrder = {
    "countryAdministered",
    "lastChangeDate",
    "returnCode",
    "url",
    "gepirCountry",
    "informationProvider",
    "prefixRange",
    "gepirInformation",
    "contact",
    "address"
})
public class MemberOrganisationType {

    @XmlElement(required = true)
    protected List<CountryCodeType> countryAdministered;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlElement(required = true)
    protected GepirReturnCodeType returnCode;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected List<GepirCountryType> gepirCountry;
    @XmlElement(required = true)
    protected GepirPartyInformationType informationProvider;
    @XmlElement(required = true)
    protected List<PrefixRangeType> prefixRange;
    @XmlElement(required = true)
    protected GepirInformationType gepirInformation;
    @XmlElement(nillable = true)
    protected List<ContactType> contact;
    protected AddressType address;

    /**
     * Gets the value of the countryAdministered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryAdministered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryAdministered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getCountryAdministered() {
        if (countryAdministered == null) {
            countryAdministered = new ArrayList<CountryCodeType>();
        }
        return this.countryAdministered;
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
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the gepirCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gepirCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGepirCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GepirCountryType }
     * 
     * 
     */
    public List<GepirCountryType> getGepirCountry() {
        if (gepirCountry == null) {
            gepirCountry = new ArrayList<GepirCountryType>();
        }
        return this.gepirCountry;
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
     * Gets the value of the prefixRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefixRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefixRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixRangeType }
     * 
     * 
     */
    public List<PrefixRangeType> getPrefixRange() {
        if (prefixRange == null) {
            prefixRange = new ArrayList<PrefixRangeType>();
        }
        return this.prefixRange;
    }

    /**
     * Ruft den Wert der gepirInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirInformationType }
     *     
     */
    public GepirInformationType getGepirInformation() {
        return gepirInformation;
    }

    /**
     * Legt den Wert der gepirInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirInformationType }
     *     
     */
    public void setGepirInformation(GepirInformationType value) {
        this.gepirInformation = value;
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

}
