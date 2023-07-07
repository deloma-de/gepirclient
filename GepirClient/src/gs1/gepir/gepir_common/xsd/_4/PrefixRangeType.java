
package gs1.gepir.gepir_common.xsd._4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PrefixRangeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PrefixRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prefixRangeHigh" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="prefixRangeLow" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefixRangeType", propOrder = {
    "prefixRangeHigh",
    "prefixRangeLow"
})
public class PrefixRangeType {

    @XmlElement(required = true)
    protected BigInteger prefixRangeHigh;
    @XmlElement(required = true)
    protected BigInteger prefixRangeLow;

    /**
     * Ruft den Wert der prefixRangeHigh-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrefixRangeHigh() {
        return prefixRangeHigh;
    }

    /**
     * Legt den Wert der prefixRangeHigh-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrefixRangeHigh(BigInteger value) {
        this.prefixRangeHigh = value;
    }

    /**
     * Ruft den Wert der prefixRangeLow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrefixRangeLow() {
        return prefixRangeLow;
    }

    /**
     * Legt den Wert der prefixRangeLow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrefixRangeLow(BigInteger value) {
        this.prefixRangeLow = value;
    }

}
