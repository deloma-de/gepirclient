
package org.gs1.ws.gepir4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gepir.get_item_by_gtin.xsd._4.GetItemByGTINType;


/**
 * <p>Java-Klasse für getItemByGTIN complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getItemByGTIN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getItemByGTIN" type="{urn:gs1:gepir:get_item_by_gtin:xsd:4}GetItemByGTINType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemByGTIN", propOrder = {
    "getItemByGTIN"
})
public class GetItemByGTIN {

    protected GetItemByGTINType getItemByGTIN;

    /**
     * Ruft den Wert der getItemByGTIN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetItemByGTINType }
     *     
     */
    public GetItemByGTINType getGetItemByGTIN() {
        return getItemByGTIN;
    }

    /**
     * Legt den Wert der getItemByGTIN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetItemByGTINType }
     *     
     */
    public void setGetItemByGTIN(GetItemByGTINType value) {
        this.getItemByGTIN = value;
    }

}
