
package gs1.gepir.response_header.xsd._4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gs1.gepir.gepir_common.xsd._4.GepirReturnCodeType;


/**
 * <p>Java-Klasse für ResponseHeaderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responderGLN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberOfHits" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="gepirReturnCode" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirReturnCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeaderType", propOrder = {
    "responderGLN",
    "numberOfHits",
    "gepirReturnCode"
})
public class ResponseHeaderType {

    @XmlElement(required = true)
    protected String responderGLN;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfHits;
    @XmlElement(required = true)
    protected GepirReturnCodeType gepirReturnCode;

    /**
     * Ruft den Wert der responderGLN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponderGLN() {
        return responderGLN;
    }

    /**
     * Legt den Wert der responderGLN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponderGLN(String value) {
        this.responderGLN = value;
    }

    /**
     * Ruft den Wert der numberOfHits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHits() {
        return numberOfHits;
    }

    /**
     * Legt den Wert der numberOfHits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHits(BigInteger value) {
        this.numberOfHits = value;
    }

    /**
     * Ruft den Wert der gepirReturnCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirReturnCodeType }
     *     
     */
    public GepirReturnCodeType getGepirReturnCode() {
        return gepirReturnCode;
    }

    /**
     * Legt den Wert der gepirReturnCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirReturnCodeType }
     *     
     */
    public void setGepirReturnCode(GepirReturnCodeType value) {
        this.gepirReturnCode = value;
    }

}
