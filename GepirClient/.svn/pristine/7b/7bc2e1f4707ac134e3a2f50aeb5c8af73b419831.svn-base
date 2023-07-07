
package org.gepir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemDataLineTypeLinkUriFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="itemDataLineTypeLinkUriFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="html"/>
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "itemDataLineTypeLinkUriFormat")
@XmlEnum
public enum ItemDataLineTypeLinkUriFormat {

    @XmlEnumValue("html")
    HTML("html"),
    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("text")
    TEXT("text");
    private final String value;

    ItemDataLineTypeLinkUriFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemDataLineTypeLinkUriFormat fromValue(String v) {
        for (ItemDataLineTypeLinkUriFormat c: ItemDataLineTypeLinkUriFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
