
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DimensionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DimensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depth" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType"/>
 *         &lt;element name="height" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType"/>
 *         &lt;element name="width" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionType", propOrder = {
    "depth",
    "height",
    "width"
})
public class DimensionType {

    @XmlElement(required = true)
    protected MeasurementType depth;
    @XmlElement(required = true)
    protected MeasurementType height;
    @XmlElement(required = true)
    protected MeasurementType width;

    /**
     * Ruft den Wert der depth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getDepth() {
        return depth;
    }

    /**
     * Legt den Wert der depth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setDepth(MeasurementType value) {
        this.depth = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setHeight(MeasurementType value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setWidth(MeasurementType value) {
        this.width = value;
    }

}
