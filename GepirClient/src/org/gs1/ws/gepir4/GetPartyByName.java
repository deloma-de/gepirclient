
package org.gs1.ws.gepir4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gepir.get_party_by_name.xsd._4.GetPartyByNameType;


/**
 * <p>Java-Klasse für getPartyByName complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getPartyByName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPartyByName" type="{urn:gs1:gepir:get_party_by_name:xsd:4}GetPartyByNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPartyByName", propOrder = {
    "getPartyByName"
})
public class GetPartyByName {

    protected GetPartyByNameType getPartyByName;

    /**
     * Ruft den Wert der getPartyByName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetPartyByNameType }
     *     
     */
    public GetPartyByNameType getGetPartyByName() {
        return getPartyByName;
    }

    /**
     * Legt den Wert der getPartyByName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPartyByNameType }
     *     
     */
    public void setGetPartyByName(GetPartyByNameType value) {
        this.getPartyByName = value;
    }

}
