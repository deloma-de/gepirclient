
package gs1.gepir.gepir_item.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GepirItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GepirItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemDataLine" type="{urn:gs1:gepir:gepir_item:xsd:4}ItemDataLineType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GepirItemType", propOrder = {
    "itemDataLine"
})
public class GepirItemType {

    @XmlElement(required = true)
    protected List<ItemDataLineType> itemDataLine;

    /**
     * Gets the value of the itemDataLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDataLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDataLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDataLineType }
     * 
     * 
     */
    public List<ItemDataLineType> getItemDataLine() {
        if (itemDataLine == null) {
            itemDataLine = new ArrayList<ItemDataLineType>();
        }
        return this.itemDataLine;
    }

}
