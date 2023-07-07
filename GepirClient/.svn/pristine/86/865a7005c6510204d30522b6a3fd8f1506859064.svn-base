
package org.gepir;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetItemByGTIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemByGTIN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedGtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedLanguages" type="{http://www.gepir.org/}ArrayOfLanguage" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" default="3.10" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemByGTIN", propOrder = {
    "requestedGtin",
    "requestedLanguages"
})
public class GetItemByGTIN {

    protected String requestedGtin;
    protected ArrayOfLanguage requestedLanguages;
    @XmlAttribute(name = "version")
    protected BigDecimal version;

    /**
     * Gets the value of the requestedGtin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedGtin() {
        return requestedGtin;
    }

    /**
     * Sets the value of the requestedGtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedGtin(String value) {
        this.requestedGtin = value;
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
        if (version == null) {
            return new BigDecimal("3.10");
        } else {
            return version;
        }
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
