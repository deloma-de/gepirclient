
package org.gepir;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAuthorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedGln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestedIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "GetAuthorization", propOrder = {
    "requestedGln",
    "requestedIp"
})
public class GetAuthorization {

    protected String requestedGln;
    protected String requestedIp;
    @XmlAttribute(name = "version")
    protected BigDecimal version;

    /**
     * Gets the value of the requestedGln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedGln() {
        return requestedGln;
    }

    /**
     * Sets the value of the requestedGln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedGln(String value) {
        this.requestedGln = value;
    }

    /**
     * Gets the value of the requestedIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedIp() {
        return requestedIp;
    }

    /**
     * Sets the value of the requestedIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedIp(String value) {
        this.requestedIp = value;
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
