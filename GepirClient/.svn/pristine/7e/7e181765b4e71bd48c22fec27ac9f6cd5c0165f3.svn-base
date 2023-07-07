
package org.gepir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gepirStatisticsLineCountHitsMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gepirStatisticsLineCountHitsMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GetItemByGTIN"/>
 *     &lt;enumeration value="GetOwnerOfGLN"/>
 *     &lt;enumeration value="GetPartyByGLN"/>
 *     &lt;enumeration value="GetPartyByGTIN"/>
 *     &lt;enumeration value="GetPartyByName"/>
 *     &lt;enumeration value="GetPartyBySSCC"/>
 *     &lt;enumeration value="GetStatistics"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gepirStatisticsLineCountHitsMethod")
@XmlEnum
public enum GepirStatisticsLineCountHitsMethod {

    @XmlEnumValue("GetItemByGTIN")
    GET_ITEM_BY_GTIN("GetItemByGTIN"),
    @XmlEnumValue("GetOwnerOfGLN")
    GET_OWNER_OF_GLN("GetOwnerOfGLN"),
    @XmlEnumValue("GetPartyByGLN")
    GET_PARTY_BY_GLN("GetPartyByGLN"),
    @XmlEnumValue("GetPartyByGTIN")
    GET_PARTY_BY_GTIN("GetPartyByGTIN"),
    @XmlEnumValue("GetPartyByName")
    GET_PARTY_BY_NAME("GetPartyByName"),
    @XmlEnumValue("GetPartyBySSCC")
    GET_PARTY_BY_SSCC("GetPartyBySSCC"),
    @XmlEnumValue("GetStatistics")
    GET_STATISTICS("GetStatistics");
    private final String value;

    GepirStatisticsLineCountHitsMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GepirStatisticsLineCountHitsMethod fromValue(String v) {
        for (GepirStatisticsLineCountHitsMethod c: GepirStatisticsLineCountHitsMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
