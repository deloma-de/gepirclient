
package org.gepir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyChildType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyChildType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyChildRole" type="{http://www.gepir.org/}partyRoleListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyChildType", propOrder = {
    "partyChildRole",
    "gln"
})
public class PartyChildType {

    protected List<PartyRoleListType> partyChildRole;
    protected String gln;

    /**
     * Gets the value of the partyChildRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyChildRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyChildRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRoleListType }
     * 
     * 
     */
    public List<PartyRoleListType> getPartyChildRole() {
        if (partyChildRole == null) {
            partyChildRole = new ArrayList<PartyRoleListType>();
        }
        return this.partyChildRole;
    }

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGln(String value) {
        this.gln = value;
    }

}
