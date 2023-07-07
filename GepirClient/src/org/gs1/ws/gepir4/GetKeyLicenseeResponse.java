
package org.gs1.ws.gepir4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gepir.gepir_party.xsd._4.GepirPartyType;


/**
 * <p>Java-Klasse für getKeyLicenseeResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getKeyLicenseeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gepirParty" type="{urn:gs1:gepir:gepir_party:xsd:4}GepirPartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getKeyLicenseeResponse", propOrder = {
    "gepirParty"
})
public class GetKeyLicenseeResponse {

    protected GepirPartyType gepirParty;

    /**
     * Ruft den Wert der gepirParty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirPartyType }
     *     
     */
    public GepirPartyType getGepirParty() {
        return gepirParty;
    }

    /**
     * Legt den Wert der gepirParty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirPartyType }
     *     
     */
    public void setGepirParty(GepirPartyType value) {
        this.gepirParty = value;
    }

}
