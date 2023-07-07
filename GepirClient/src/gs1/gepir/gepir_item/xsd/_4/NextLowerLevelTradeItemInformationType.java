
package gs1.gepir.gepir_item.xsd._4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NextLowerLevelTradeItemInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NextLowerLevelTradeItemInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityOfChildren" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="totalQuantityOfNextLowerLevelTradeItem" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextLowerLevelTradeItemInformationType", propOrder = {
    "quantityOfChildren",
    "totalQuantityOfNextLowerLevelTradeItem"
})
public class NextLowerLevelTradeItemInformationType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantityOfChildren;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalQuantityOfNextLowerLevelTradeItem;

    /**
     * Ruft den Wert der quantityOfChildren-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOfChildren() {
        return quantityOfChildren;
    }

    /**
     * Legt den Wert der quantityOfChildren-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOfChildren(BigInteger value) {
        this.quantityOfChildren = value;
    }

    /**
     * Ruft den Wert der totalQuantityOfNextLowerLevelTradeItem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalQuantityOfNextLowerLevelTradeItem() {
        return totalQuantityOfNextLowerLevelTradeItem;
    }

    /**
     * Legt den Wert der totalQuantityOfNextLowerLevelTradeItem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalQuantityOfNextLowerLevelTradeItem(BigInteger value) {
        this.totalQuantityOfNextLowerLevelTradeItem = value;
    }

}
