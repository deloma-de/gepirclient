
package gs1.gepir.gepir_common.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gs1.shared.shared_common.xsd._3.CountryCodeType;
import gs1.shared.shared_common.xsd._3.Description70Type;


/**
 * <p>Java-Klasse für GepirCountryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GepirCountryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{urn:gs1:shared:shared_common:xsd:3}CountryCodeType"/>
 *         &lt;element name="countryName" type="{urn:gs1:shared:shared_common:xsd:3}Description70Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GepirCountryType", propOrder = {
    "countryCode",
    "countryName"
})
public class GepirCountryType {

    @XmlElement(required = true)
    protected CountryCodeType countryCode;
    @XmlElement(required = true)
    protected List<Description70Type> countryName;

    /**
     * Ruft den Wert der countryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description70Type }
     * 
     * 
     */
    public List<Description70Type> getCountryName() {
        if (countryName == null) {
            countryName = new ArrayList<Description70Type>();
        }
        return this.countryName;
    }

}
