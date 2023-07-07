
package gs1.shared.shared_common.xsd._3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für DocumentReferenceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:gs1:shared:shared_common:xsd:3}EntityIdentificationType">
 *       &lt;sequence>
 *         &lt;element name="creationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="revisionNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="lineItemNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReferenceType", propOrder = {
    "creationDateTime",
    "revisionNumber",
    "lineItemNumber"
})
public class DocumentReferenceType
    extends EntityIdentificationType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger revisionNumber;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lineItemNumber;

    /**
     * Ruft den Wert der creationDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Legt den Wert der creationDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Ruft den Wert der revisionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Legt den Wert der revisionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRevisionNumber(BigInteger value) {
        this.revisionNumber = value;
    }

    /**
     * Ruft den Wert der lineItemNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Legt den Wert der lineItemNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineItemNumber(BigInteger value) {
        this.lineItemNumber = value;
    }

}
