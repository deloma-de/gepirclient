
package org.gepir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationChannelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationChannelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TELEPHONE"/>
 *     &lt;enumeration value="TELEFAX"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="WEBSITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationChannelCodeType")
@XmlEnum
public enum CommunicationChannelCodeType {

    TELEPHONE,
    TELEFAX,
    EMAIL,
    WEBSITE;

    public String value() {
        return name();
    }

    public static CommunicationChannelCodeType fromValue(String v) {
        return valueOf(v);
    }

}
