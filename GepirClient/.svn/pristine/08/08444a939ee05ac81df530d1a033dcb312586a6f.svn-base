
package org.gepir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemDataLineTypeTradeItemUnitDescriptor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="itemDataLineTypeTradeItemUnitDescriptor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASE_UNIT_OR_EACH"/>
 *     &lt;enumeration value="PACK_OR_INNER_PACK"/>
 *     &lt;enumeration value="CASE"/>
 *     &lt;enumeration value="DISPLAY_SHIPPER"/>
 *     &lt;enumeration value="PALLET"/>
 *     &lt;enumeration value="MIXED_MODULE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "itemDataLineTypeTradeItemUnitDescriptor")
@XmlEnum
public enum ItemDataLineTypeTradeItemUnitDescriptor {

    BASE_UNIT_OR_EACH,
    PACK_OR_INNER_PACK,
    CASE,
    DISPLAY_SHIPPER,
    PALLET,
    MIXED_MODULE;

    public String value() {
        return name();
    }

    public static ItemDataLineTypeTradeItemUnitDescriptor fromValue(String v) {
        return valueOf(v);
    }

}
