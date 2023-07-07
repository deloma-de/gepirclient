
package gs1.gepir.gepir_common.xsd._4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PartyContainmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PartyContainmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyChild" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirPartyInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyContainmentType", propOrder = {
    "partyChild"
})
public class PartyContainmentType {

    @XmlElement(required = true)
    protected GepirPartyInformationType partyChild;

    /**
     * Ruft den Wert der partyChild-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public GepirPartyInformationType getPartyChild() {
        return partyChild;
    }

    /**
     * Legt den Wert der partyChild-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public void setPartyChild(GepirPartyInformationType value) {
        this.partyChild = value;
    }

}
