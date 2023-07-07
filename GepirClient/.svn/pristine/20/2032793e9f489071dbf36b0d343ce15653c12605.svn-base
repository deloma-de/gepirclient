
package gs1.shared.shared_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ShipmentIdentificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gsin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalShipmentIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalShipmentIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentIdentificationType", propOrder = {
    "gsin",
    "additionalShipmentIdentification"
})
public class ShipmentIdentificationType {

    @XmlElement(required = true)
    protected String gsin;
    @XmlElement(nillable = true)
    protected List<AdditionalShipmentIdentificationType> additionalShipmentIdentification;

    /**
     * Ruft den Wert der gsin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsin() {
        return gsin;
    }

    /**
     * Legt den Wert der gsin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsin(String value) {
        this.gsin = value;
    }

    /**
     * Gets the value of the additionalShipmentIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalShipmentIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalShipmentIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalShipmentIdentificationType }
     * 
     * 
     */
    public List<AdditionalShipmentIdentificationType> getAdditionalShipmentIdentification() {
        if (additionalShipmentIdentification == null) {
            additionalShipmentIdentification = new ArrayList<AdditionalShipmentIdentificationType>();
        }
        return this.additionalShipmentIdentification;
    }

}
