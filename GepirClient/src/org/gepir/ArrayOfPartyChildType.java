
package org.gepir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPartyChildType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPartyChildType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyChild" type="{http://www.gepir.org/}partyChildType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPartyChildType", propOrder = {
    "partyChild"
})
public class ArrayOfPartyChildType {

    protected List<PartyChildType> partyChild;

    /**
     * Gets the value of the partyChild property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyChild property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyChildType }
     * 
     * 
     */
    public List<PartyChildType> getPartyChild() {
        if (partyChild == null) {
            partyChild = new ArrayList<PartyChildType>();
        }
        return this.partyChild;
    }

}
