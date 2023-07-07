
package org.gepir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uomType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="uomType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PCE"/>
 *     &lt;enumeration value="GRM"/>
 *     &lt;enumeration value="KGM"/>
 *     &lt;enumeration value="LBS"/>
 *     &lt;enumeration value="MLT"/>
 *     &lt;enumeration value="LTR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "uomType")
@XmlEnum
public enum UomType {

    PCE,
    GRM,
    KGM,
    LBS,
    MLT,
    LTR;

    public String value() {
        return name();
    }

    public static UomType fromValue(String v) {
        return valueOf(v);
    }

}
