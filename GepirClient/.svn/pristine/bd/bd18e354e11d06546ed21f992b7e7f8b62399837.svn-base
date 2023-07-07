
package org.gepir;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for gepirResponseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gepirResponseHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responderGln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gepirResponseHeader", propOrder = {
    "responderGln",
    "numberOfHits",
    "returnCode"
})
public class GepirResponseHeader {

    protected String responderGln;
    protected int numberOfHits;
    protected int returnCode;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the responderGln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponderGln() {
        return responderGln;
    }

    /**
     * Sets the value of the responderGln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponderGln(String value) {
        this.responderGln = value;
    }

    /**
     * Gets the value of the numberOfHits property.
     * 
     */
    public int getNumberOfHits() {
        return numberOfHits;
    }

    /**
     * Sets the value of the numberOfHits property.
     * 
     */
    public void setNumberOfHits(int value) {
        this.numberOfHits = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
