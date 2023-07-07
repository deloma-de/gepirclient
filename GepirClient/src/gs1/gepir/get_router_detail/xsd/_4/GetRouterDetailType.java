
package gs1.gepir.get_router_detail.xsd._4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetRouterDetailType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetRouterDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedRouter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requesterRouter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRouterDetailType", propOrder = {
    "requestedRouter",
    "requesterRouter"
})
public class GetRouterDetailType {

    @XmlElement(required = true)
    protected String requestedRouter;
    @XmlElement(required = true)
    protected String requesterRouter;

    /**
     * Ruft den Wert der requestedRouter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedRouter() {
        return requestedRouter;
    }

    /**
     * Legt den Wert der requestedRouter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedRouter(String value) {
        this.requestedRouter = value;
    }

    /**
     * Ruft den Wert der requesterRouter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterRouter() {
        return requesterRouter;
    }

    /**
     * Legt den Wert der requesterRouter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterRouter(String value) {
        this.requesterRouter = value;
    }

}
