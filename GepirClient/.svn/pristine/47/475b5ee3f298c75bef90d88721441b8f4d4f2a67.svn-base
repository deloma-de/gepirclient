
package gs1.gepir.router_detail.xsd._4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gs1.gepir.gepir_common.xsd._4.MemberOrganisationType;


/**
 * <p>Java-Klasse für RouterDetailType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouterDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routerDetailRefreshDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="requestedRouterDetail" type="{urn:gs1:gepir:gepir_common:xsd:4}MemberOrganisationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouterDetailType", propOrder = {
    "routerDetailRefreshDate",
    "requestedRouterDetail"
})
public class RouterDetailType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routerDetailRefreshDate;
    @XmlElement(required = true)
    protected MemberOrganisationType requestedRouterDetail;

    /**
     * Ruft den Wert der routerDetailRefreshDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouterDetailRefreshDate() {
        return routerDetailRefreshDate;
    }

    /**
     * Legt den Wert der routerDetailRefreshDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouterDetailRefreshDate(XMLGregorianCalendar value) {
        this.routerDetailRefreshDate = value;
    }

    /**
     * Ruft den Wert der requestedRouterDetail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MemberOrganisationType }
     *     
     */
    public MemberOrganisationType getRequestedRouterDetail() {
        return requestedRouterDetail;
    }

    /**
     * Legt den Wert der requestedRouterDetail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberOrganisationType }
     *     
     */
    public void setRequestedRouterDetail(MemberOrganisationType value) {
        this.requestedRouterDetail = value;
    }

}
