
package org.gs1.ws.gepir4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gepir.get_router_detail.xsd._4.GetRouterDetailType;


/**
 * <p>Java-Klasse für getRouterDetail complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getRouterDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getRouterDetail" type="{urn:gs1:gepir:get_router_detail:xsd:4}GetRouterDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRouterDetail", propOrder = {
    "getRouterDetail"
})
public class GetRouterDetail {

    protected GetRouterDetailType getRouterDetail;

    /**
     * Ruft den Wert der getRouterDetail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetRouterDetailType }
     *     
     */
    public GetRouterDetailType getGetRouterDetail() {
        return getRouterDetail;
    }

    /**
     * Legt den Wert der getRouterDetail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRouterDetailType }
     *     
     */
    public void setGetRouterDetail(GetRouterDetailType value) {
        this.getRouterDetail = value;
    }

}
