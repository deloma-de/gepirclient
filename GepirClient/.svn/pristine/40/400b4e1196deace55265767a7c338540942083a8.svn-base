
package gs1.gepir.gepir_item.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gs1.gepir.gepir_common.xsd._4.GepirItemExternalFileLinkType;
import gs1.gepir.gepir_common.xsd._4.GepirPartyInformationType;
import gs1.gepir.gepir_common.xsd._4.GepirRequestedKeyType;
import gs1.gepir.gepir_common.xsd._4.GepirReturnCodeType;
import gs1.gepir.gepir_common.xsd._4.ResponderSpecificDataType;
import gs1.gepir.gepir_common.xsd._4.TradeItemClassificationType;
import gs1.gepir.gepir_common.xsd._4.TradeItemUnitDescriptorCodeType;
import gs1.gepir.gepir_item_ext.xsd._4.ItemDataLineExtensionType;
import gs1.shared.shared_common.xsd._3.LanguageCodeType;
import gs1.shared.shared_common.xsd._3.MeasurementType;
import gs1.shared.shared_common.xsd._3.SizeType;


/**
 * <p>Java-Klasse für ItemDataLineType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ItemDataLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemDataLanguage" type="{urn:gs1:shared:shared_common:xsd:3}LanguageCodeType"/>
 *         &lt;element name="lastChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="netContent" type="{urn:gs1:shared:shared_common:xsd:3}MeasurementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirReturnCodeType"/>
 *         &lt;element name="tradeItemUnitDescriptor" type="{urn:gs1:gepir:gepir_common:xsd:4}TradeItemUnitDescriptorCodeType" minOccurs="0"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeItemClassification" type="{urn:gs1:gepir:gepir_common:xsd:4}TradeItemClassificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gepirRequestedKey" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirRequestedKeyType"/>
 *         &lt;element name="responderSpecificData" type="{urn:gs1:gepir:gepir_common:xsd:4}ResponderSpecificDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="informationProvider" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirPartyInformationType"/>
 *         &lt;element name="manufacturer" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirPartyInformationType" minOccurs="0"/>
 *         &lt;element name="requestedItem" type="{urn:gs1:gepir:gepir_common:xsd:4}GepirItemExternalFileLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="size" type="{urn:gs1:shared:shared_common:xsd:3}SizeType" minOccurs="0"/>
 *         &lt;element name="nextLowerLevelTradeItemInformation" type="{urn:gs1:gepir:gepir_item:xsd:4}NextLowerLevelTradeItemInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDataLineType", propOrder = {
    "itemDataLanguage",
    "lastChangeDate",
    "netContent",
    "returnCode",
    "tradeItemUnitDescriptor",
    "itemName",
    "brandName",
    "tradeItemClassification",
    "gepirRequestedKey",
    "responderSpecificData",
    "informationProvider",
    "manufacturer",
    "requestedItem",
    "size",
    "nextLowerLevelTradeItemInformation"
})
@XmlSeeAlso({
    ItemDataLineExtensionType.class
})
public class ItemDataLineType {

    @XmlElement(required = true)
    protected LanguageCodeType itemDataLanguage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlElement(nillable = true)
    protected List<MeasurementType> netContent;
    @XmlElement(required = true)
    protected GepirReturnCodeType returnCode;
    protected TradeItemUnitDescriptorCodeType tradeItemUnitDescriptor;
    protected String itemName;
    protected String brandName;
    @XmlElement(nillable = true)
    protected List<TradeItemClassificationType> tradeItemClassification;
    @XmlElement(required = true)
    protected GepirRequestedKeyType gepirRequestedKey;
    @XmlElement(nillable = true)
    protected List<ResponderSpecificDataType> responderSpecificData;
    @XmlElement(required = true)
    protected GepirPartyInformationType informationProvider;
    protected GepirPartyInformationType manufacturer;
    @XmlElement(nillable = true)
    protected List<GepirItemExternalFileLinkType> requestedItem;
    protected SizeType size;
    protected NextLowerLevelTradeItemInformationType nextLowerLevelTradeItemInformation;

    /**
     * Ruft den Wert der itemDataLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getItemDataLanguage() {
        return itemDataLanguage;
    }

    /**
     * Legt den Wert der itemDataLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setItemDataLanguage(LanguageCodeType value) {
        this.itemDataLanguage = value;
    }

    /**
     * Ruft den Wert der lastChangeDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Legt den Wert der lastChangeDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangeDate(XMLGregorianCalendar value) {
        this.lastChangeDate = value;
    }

    /**
     * Gets the value of the netContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getNetContent() {
        if (netContent == null) {
            netContent = new ArrayList<MeasurementType>();
        }
        return this.netContent;
    }

    /**
     * Ruft den Wert der returnCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirReturnCodeType }
     *     
     */
    public GepirReturnCodeType getReturnCode() {
        return returnCode;
    }

    /**
     * Legt den Wert der returnCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirReturnCodeType }
     *     
     */
    public void setReturnCode(GepirReturnCodeType value) {
        this.returnCode = value;
    }

    /**
     * Ruft den Wert der tradeItemUnitDescriptor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemUnitDescriptorCodeType }
     *     
     */
    public TradeItemUnitDescriptorCodeType getTradeItemUnitDescriptor() {
        return tradeItemUnitDescriptor;
    }

    /**
     * Legt den Wert der tradeItemUnitDescriptor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemUnitDescriptorCodeType }
     *     
     */
    public void setTradeItemUnitDescriptor(TradeItemUnitDescriptorCodeType value) {
        this.tradeItemUnitDescriptor = value;
    }

    /**
     * Ruft den Wert der itemName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Legt den Wert der itemName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Ruft den Wert der brandName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Legt den Wert der brandName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the tradeItemClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemClassificationType }
     * 
     * 
     */
    public List<TradeItemClassificationType> getTradeItemClassification() {
        if (tradeItemClassification == null) {
            tradeItemClassification = new ArrayList<TradeItemClassificationType>();
        }
        return this.tradeItemClassification;
    }

    /**
     * Ruft den Wert der gepirRequestedKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirRequestedKeyType }
     *     
     */
    public GepirRequestedKeyType getGepirRequestedKey() {
        return gepirRequestedKey;
    }

    /**
     * Legt den Wert der gepirRequestedKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirRequestedKeyType }
     *     
     */
    public void setGepirRequestedKey(GepirRequestedKeyType value) {
        this.gepirRequestedKey = value;
    }

    /**
     * Gets the value of the responderSpecificData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responderSpecificData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponderSpecificData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponderSpecificDataType }
     * 
     * 
     */
    public List<ResponderSpecificDataType> getResponderSpecificData() {
        if (responderSpecificData == null) {
            responderSpecificData = new ArrayList<ResponderSpecificDataType>();
        }
        return this.responderSpecificData;
    }

    /**
     * Ruft den Wert der informationProvider-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public GepirPartyInformationType getInformationProvider() {
        return informationProvider;
    }

    /**
     * Legt den Wert der informationProvider-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public void setInformationProvider(GepirPartyInformationType value) {
        this.informationProvider = value;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public GepirPartyInformationType getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirPartyInformationType }
     *     
     */
    public void setManufacturer(GepirPartyInformationType value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the requestedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GepirItemExternalFileLinkType }
     * 
     * 
     */
    public List<GepirItemExternalFileLinkType> getRequestedItem() {
        if (requestedItem == null) {
            requestedItem = new ArrayList<GepirItemExternalFileLinkType>();
        }
        return this.requestedItem;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    public SizeType getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    public void setSize(SizeType value) {
        this.size = value;
    }

    /**
     * Ruft den Wert der nextLowerLevelTradeItemInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NextLowerLevelTradeItemInformationType }
     *     
     */
    public NextLowerLevelTradeItemInformationType getNextLowerLevelTradeItemInformation() {
        return nextLowerLevelTradeItemInformation;
    }

    /**
     * Legt den Wert der nextLowerLevelTradeItemInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NextLowerLevelTradeItemInformationType }
     *     
     */
    public void setNextLowerLevelTradeItemInformation(NextLowerLevelTradeItemInformationType value) {
        this.nextLowerLevelTradeItemInformation = value;
    }

}
