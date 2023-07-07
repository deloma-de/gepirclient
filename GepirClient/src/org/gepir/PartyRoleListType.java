
package org.gepir;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyRoleListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="partyRoleListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BILL_TO"/>
 *     &lt;enumeration value="BUYER"/>
 *     &lt;enumeration value="CONSUMER"/>
 *     &lt;enumeration value="CORPORATE_IDENTITY"/>
 *     &lt;enumeration value="DELIVERY_PARTY"/>
 *     &lt;enumeration value="DISTRIBUTOR_AND_OR_BROKER"/>
 *     &lt;enumeration value="INFORMATION_PROVIDER"/>
 *     &lt;enumeration value="INVOICEE"/>
 *     &lt;enumeration value="ISSUER_OF_INVOICE"/>
 *     &lt;enumeration value="LOGISTICS_SERVICE_PROVIDER"/>
 *     &lt;enumeration value="MANUFACTURING_PLANT"/>
 *     &lt;enumeration value="MARK_FOR"/>
 *     &lt;enumeration value="MESSAGE_FROM"/>
 *     &lt;enumeration value="MESSAGE_RECIPIENT"/>
 *     &lt;enumeration value="OPERATOR"/>
 *     &lt;enumeration value="PARTY_TO_RECEIVE_COMMERCIAL_INVOICE"/>
 *     &lt;enumeration value="PAYEE"/>
 *     &lt;enumeration value="PAYER"/>
 *     &lt;enumeration value="SELLER"/>
 *     &lt;enumeration value="SHIP_FROM"/>
 *     &lt;enumeration value="SHIP_TO"/>
 *     &lt;enumeration value="STORE"/>
 *     &lt;enumeration value="SUPPLIER"/>
 *     &lt;enumeration value="WAREHOUSE_AND_OR_DEPOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "partyRoleListType")
@XmlEnum
public enum PartyRoleListType {

    BILL_TO,
    BUYER,
    CONSUMER,
    CORPORATE_IDENTITY,
    DELIVERY_PARTY,
    DISTRIBUTOR_AND_OR_BROKER,
    INFORMATION_PROVIDER,
    INVOICEE,
    ISSUER_OF_INVOICE,
    LOGISTICS_SERVICE_PROVIDER,
    MANUFACTURING_PLANT,
    MARK_FOR,
    MESSAGE_FROM,
    MESSAGE_RECIPIENT,
    OPERATOR,
    PARTY_TO_RECEIVE_COMMERCIAL_INVOICE,
    PAYEE,
    PAYER,
    SELLER,
    SHIP_FROM,
    SHIP_TO,
    STORE,
    SUPPLIER,
    WAREHOUSE_AND_OR_DEPOT;

    public String value() {
        return name();
    }

    public static PartyRoleListType fromValue(String v) {
        return valueOf(v);
    }

}
