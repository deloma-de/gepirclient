
package org.gs1.ws.gepir4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gepir.gepir_item.xsd._4.GepirItemType;


/**
 * <p>Java-Klasse für getItemByGTINResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getItemByGTINResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gepirItem" type="{urn:gs1:gepir:gepir_item:xsd:4}GepirItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemByGTINResponse", propOrder = {
    "gepirItem"
})
public class GetItemByGTINResponse {

    protected GepirItemType gepirItem;

    /**
     * Ruft den Wert der gepirItem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirItemType }
     *     
     */
    public GepirItemType getGepirItem() {
        return gepirItem;
    }

    /**
     * Legt den Wert der gepirItem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirItemType }
     *     
     */
    public void setGepirItem(GepirItemType value) {
        this.gepirItem = value;
    }

}
