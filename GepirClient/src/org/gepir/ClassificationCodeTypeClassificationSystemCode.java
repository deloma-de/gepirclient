
package org.gepir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classificationCodeTypeClassificationSystemCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="classificationCodeTypeClassificationSystemCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNSPSC"/>
 *     &lt;enumeration value="ISIC"/>
 *     &lt;enumeration value="GPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "classificationCodeTypeClassificationSystemCode")
@XmlEnum
public enum ClassificationCodeTypeClassificationSystemCode {

    UNSPSC,
    ISIC,
    GPC;

    public String value() {
        return name();
    }

    public static ClassificationCodeTypeClassificationSystemCode fromValue(String v) {
        return valueOf(v);
    }

}
