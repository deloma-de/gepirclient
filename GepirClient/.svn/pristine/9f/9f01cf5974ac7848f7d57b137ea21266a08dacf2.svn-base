
package gs1.shared.shared_common.xsd._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ServiceRelationIdentificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceRelationIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gsrn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additionalServiceRelationIdentification" type="{urn:gs1:shared:shared_common:xsd:3}AdditionalServiceRelationIdentificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRelationIdentificationType", propOrder = {
    "gsrn",
    "additionalServiceRelationIdentification"
})
public class ServiceRelationIdentificationType {

    @XmlElement(required = true)
    protected String gsrn;
    @XmlElement(nillable = true)
    protected List<AdditionalServiceRelationIdentificationType> additionalServiceRelationIdentification;

    /**
     * Ruft den Wert der gsrn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsrn() {
        return gsrn;
    }

    /**
     * Legt den Wert der gsrn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsrn(String value) {
        this.gsrn = value;
    }

    /**
     * Gets the value of the additionalServiceRelationIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalServiceRelationIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalServiceRelationIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalServiceRelationIdentificationType }
     * 
     * 
     */
    public List<AdditionalServiceRelationIdentificationType> getAdditionalServiceRelationIdentification() {
        if (additionalServiceRelationIdentification == null) {
            additionalServiceRelationIdentification = new ArrayList<AdditionalServiceRelationIdentificationType>();
        }
        return this.additionalServiceRelationIdentification;
    }

}
