
package org.gepir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for CommunicationChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationChannelType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="communicationChannelCode" use="required" type="{http://www.gepir.org/}CommunicationChannelCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationChannelType", propOrder = {
    "value"
})
public class CommunicationChannelType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "communicationChannelCode", required = true)
    protected CommunicationChannelCodeType communicationChannelCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the communicationChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationChannelCodeType }
     *     
     */
    public CommunicationChannelCodeType getCommunicationChannelCode() {
        return communicationChannelCode;
    }

    /**
     * Sets the value of the communicationChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationChannelCodeType }
     *     
     */
    public void setCommunicationChannelCode(CommunicationChannelCodeType value) {
        this.communicationChannelCode = value;
    }

}
