
package org.gepir;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for classificationCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classificationCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="classificationSystemCode" use="required" type="{http://www.gepir.org/}classificationCodeTypeClassificationSystemCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classificationCodeType", propOrder = {
    "value"
})
public class ClassificationCodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "classificationSystemCode", required = true)
    protected ClassificationCodeTypeClassificationSystemCode classificationSystemCode;

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
     * Gets the value of the classificationSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationCodeTypeClassificationSystemCode }
     *     
     */
    public ClassificationCodeTypeClassificationSystemCode getClassificationSystemCode() {
        return classificationSystemCode;
    }

    /**
     * Sets the value of the classificationSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationCodeTypeClassificationSystemCode }
     *     
     */
    public void setClassificationSystemCode(ClassificationCodeTypeClassificationSystemCode value) {
        this.classificationSystemCode = value;
    }

}
