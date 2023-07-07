
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import gs1.gepir.gepir_common.xsd._4.AdditionalTradeItemClassificationCodeListCodeType;
import gs1.gepir.gepir_common.xsd._4.FileFormatCodeType;
import gs1.gepir.gepir_common.xsd._4.GepirReturnCodeType;
import gs1.gepir.gepir_common.xsd._4.GepirStatusCodeType;
import gs1.gepir.gepir_common.xsd._4.GepirVersionCodeType;
import gs1.gepir.gepir_common.xsd._4.RequestedKeyCodeType;
import gs1.gepir.gepir_common.xsd._4.TradeItemUnitDescriptorCodeType;


/**
 * <p>Java-Klasse für GS1CodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GS1CodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="codeListVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS1CodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    RequestedKeyCodeType.class,
    AdditionalTradeItemClassificationCodeListCodeType.class,
    GepirVersionCodeType.class,
    FileFormatCodeType.class,
    GepirReturnCodeType.class,
    GepirStatusCodeType.class,
    TradeItemUnitDescriptorCodeType.class,
    FinancialAccountNumberTypeCodeType.class,
    AdditionalTradeItemIdentificationTypeCodeType.class,
    IncotermsCodeType.class,
    TaxCategoryCodeType.class,
    AdditionalReturnableAssetIdentificationTypeCodeType.class,
    CountrySubdivisionCodeType.class,
    ContactTypeCodeType.class,
    AdditionalShipmentIdentificationTypeCodeType.class,
    LanguageCodeType.class,
    PaymentMethodCodeType.class,
    MeasurementUnitCodeType.class,
    PaymentTermsTypeCodeType.class,
    AdditionalServiceRelationIdentificationTypeCodeType.class,
    EntityTypeCodeType.class,
    FinancialRoutingNumberTypeCodeType.class,
    CommunicationChannelCodeType.class,
    AllowanceChargeTypeCodeType.class,
    AdditionalLogisticUnitIdentificationTypeCodeType.class,
    CountryCodeType.class,
    CurrencyCodeType.class,
    TemperatureMeasurementUnitCodeType.class,
    BarCodeTypeCodeType.class,
    PartyRoleCodeType.class,
    AdditionalPartyIdentificationTypeCodeType.class,
    DateFormatCodeType.class,
    NutrientTypeCodeType.class,
    TimeMeasurementUnitCodeType.class,
    AdditionalIndividualAssetIdentificationTypeCodeType.class,
    AdditionalConsignmentIdentificationTypeCodeType.class
})
public class GS1CodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "codeListVersion")
    protected String codeListVersion;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
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
     * Legt den Wert der value-Eigenschaft fest.
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
     * Ruft den Wert der codeListVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersion() {
        return codeListVersion;
    }

    /**
     * Legt den Wert der codeListVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersion(String value) {
        this.codeListVersion = value;
    }

}
