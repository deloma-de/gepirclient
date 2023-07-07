
package gs1.gepir.gepir_party.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GepirPartyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GepirPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyDataLine" type="{urn:gs1:gepir:gepir_party:xsd:4}PartyDataLineType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GepirPartyType", propOrder = {
    "partyDataLine"
})
public class GepirPartyType {

    @XmlElement(required = true)
    protected List<PartyDataLineType> partyDataLine;

    /**
     * Gets the value of the partyDataLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyDataLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyDataLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyDataLineType }
     * 
     * 
     */
    public List<PartyDataLineType> getPartyDataLine() {
        if (partyDataLine == null) {
            partyDataLine = new ArrayList<PartyDataLineType>();
        }
        return this.partyDataLine;
    }

}
