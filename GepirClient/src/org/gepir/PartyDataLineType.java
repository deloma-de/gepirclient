
package org.gepir;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for partyDataLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyDataLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="informationProviderGln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastChangeDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gcp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalPartyId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pOBoxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryISOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.gepir.org/}partyContactType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyRole" type="{http://www.gepir.org/}partyRoleListType" minOccurs="0"/>
 *         &lt;element name="partyContainment" type="{http://www.gepir.org/}ArrayOfPartyChildType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyDataLineType", propOrder = {
    "gln",
    "returnCode",
    "informationProviderGln",
    "lastChangeDateTime",
    "gcp",
    "additionalPartyId",
    "partyName",
    "streetAddress",
    "poBoxNumber",
    "subDivision",
    "postalCode",
    "city",
    "countryISOCode",
    "contact",
    "partyRole",
    "partyContainment"
})
public class PartyDataLineType {

    protected String gln;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger returnCode;
    protected String informationProviderGln;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangeDateTime;
    protected String gcp;
    protected List<String> additionalPartyId;
    protected String partyName;
    protected List<String> streetAddress;
    @XmlElement(name = "pOBoxNumber")
    protected String poBoxNumber;
    protected String subDivision;
    protected String postalCode;
    protected String city;
    protected String countryISOCode;
    protected List<PartyContactType> contact;
    protected PartyRoleListType partyRole;
    protected ArrayOfPartyChildType partyContainment;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**
     * Gets the value of the gln property.
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
     * Sets the value of the gln property.
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
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReturnCode(BigInteger value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the informationProviderGln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationProviderGln() {
        return informationProviderGln;
    }

    /**
     * Sets the value of the informationProviderGln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationProviderGln(String value) {
        this.informationProviderGln = value;
    }

    /**
     * Gets the value of the lastChangeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangeDateTime() {
        return lastChangeDateTime;
    }

    /**
     * Sets the value of the lastChangeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangeDateTime(XMLGregorianCalendar value) {
        this.lastChangeDateTime = value;
    }

    /**
     * Gets the value of the gcp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGcp() {
        return gcp;
    }

    /**
     * Sets the value of the gcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGcp(String value) {
        this.gcp = value;
    }

    /**
     * Gets the value of the additionalPartyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPartyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPartyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalPartyId() {
        if (additionalPartyId == null) {
            additionalPartyId = new ArrayList<String>();
        }
        return this.additionalPartyId;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStreetAddress() {
        if (streetAddress == null) {
            streetAddress = new ArrayList<String>();
        }
        return this.streetAddress;
    }

    /**
     * Gets the value of the poBoxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxNumber() {
        return poBoxNumber;
    }

    /**
     * Sets the value of the poBoxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxNumber(String value) {
        this.poBoxNumber = value;
    }

    /**
     * Gets the value of the subDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDivision() {
        return subDivision;
    }

    /**
     * Sets the value of the subDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDivision(String value) {
        this.subDivision = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryISOCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOCode() {
        return countryISOCode;
    }

    /**
     * Sets the value of the countryISOCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOCode(String value) {
        this.countryISOCode = value;
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
     * {@link PartyContactType }
     * 
     * 
     */
    public List<PartyContactType> getContact() {
        if (contact == null) {
            contact = new ArrayList<PartyContactType>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRoleListType }
     *     
     */
    public PartyRoleListType getPartyRole() {
        return partyRole;
    }

    /**
     * Sets the value of the partyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRoleListType }
     *     
     */
    public void setPartyRole(PartyRoleListType value) {
        this.partyRole = value;
    }

    /**
     * Gets the value of the partyContainment property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPartyChildType }
     *     
     */
    public ArrayOfPartyChildType getPartyContainment() {
        return partyContainment;
    }

    /**
     * Sets the value of the partyContainment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPartyChildType }
     *     
     */
    public void setPartyContainment(ArrayOfPartyChildType value) {
        this.partyContainment = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
