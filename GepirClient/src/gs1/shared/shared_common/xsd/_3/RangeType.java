
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RangeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maximumType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="minimumType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeType", propOrder = {
    "maximum",
    "maximumType",
    "minimum",
    "minimumType"
})
public class RangeType {

    protected Float maximum;
    protected String maximumType;
    protected Float minimum;
    protected String minimumType;

    /**
     * Ruft den Wert der maximum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximum() {
        return maximum;
    }

    /**
     * Legt den Wert der maximum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximum(Float value) {
        this.maximum = value;
    }

    /**
     * Ruft den Wert der maximumType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumType() {
        return maximumType;
    }

    /**
     * Legt den Wert der maximumType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumType(String value) {
        this.maximumType = value;
    }

    /**
     * Ruft den Wert der minimum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimum() {
        return minimum;
    }

    /**
     * Legt den Wert der minimum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimum(Float value) {
        this.minimum = value;
    }

    /**
     * Ruft den Wert der minimumType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumType() {
        return minimumType;
    }

    /**
     * Legt den Wert der minimumType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumType(String value) {
        this.minimumType = value;
    }

}
