
package org.gepir;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPartyByGTIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPartyByGTIN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedGtin" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requestedLanguages" type="{http://www.gepir.org/}ArrayOfLanguage" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPartyByGTIN", propOrder = {
    "requestedGtin",
    "requestedLanguages"
})
public class GetPartyByGTIN {

    protected List<String> requestedGtin;
    protected ArrayOfLanguage requestedLanguages;
    @XmlAttribute(name = "version", required = true)
    protected BigDecimal version;

    /**
     * Gets the value of the requestedGtin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedGtin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedGtin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestedGtin() {
        if (requestedGtin == null) {
            requestedGtin = new ArrayList<String>();
        }
        return this.requestedGtin;
    }

    /**
     * Gets the value of the requestedLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguage }
     *     
     */
    public ArrayOfLanguage getRequestedLanguages() {
        return requestedLanguages;
    }

    /**
     * Sets the value of the requestedLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguage }
     *     
     */
    public void setRequestedLanguages(ArrayOfLanguage value) {
        this.requestedLanguages = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}
