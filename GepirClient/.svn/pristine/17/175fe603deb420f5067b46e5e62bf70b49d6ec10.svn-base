
package org.gepir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for itemDataLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemDataLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informationProviderGln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerGln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradeItemUnitDescriptor" type="{http://www.gepir.org/}itemDataLineTypeTradeItemUnitDescriptor"/>
 *         &lt;element name="descriptiveSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netContent" type="{http://www.gepir.org/}itemDataLineTypeNetContent" minOccurs="0"/>
 *         &lt;element name="linkUri" type="{http://www.gepir.org/}itemDataLineTypeLinkUri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classificationCode" type="{http://www.gepir.org/}classificationCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastChangeDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="childItems" type="{http://www.gepir.org/}ArrayOfItemDataLineTypeChildItemsChildItem" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" default="en" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemDataLineType", propOrder = {
    "gtin",
    "informationProviderGln",
    "manufacturerGln",
    "itemName",
    "brandName",
    "tradeItemUnitDescriptor",
    "descriptiveSize",
    "netContent",
    "linkUri",
    "classificationCode",
    "lastChangeDateTime",
    "childItems"
})
public class ItemDataLineType {

    protected String gtin;
    protected String informationProviderGln;
    protected String manufacturerGln;
    protected String itemName;
    protected String brandName;
    @XmlElement(required = true)
    protected ItemDataLineTypeTradeItemUnitDescriptor tradeItemUnitDescriptor;
    protected String descriptiveSize;
    protected ItemDataLineTypeNetContent netContent;
    protected List<ItemDataLineTypeLinkUri> linkUri;
    protected List<ClassificationCodeType> classificationCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangeDateTime;
    protected ArrayOfItemDataLineTypeChildItemsChildItem childItems;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtin() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtin(String value) {
        this.gtin = value;
    }

    /**
     * Gets the value of the informationProviderGln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationProviderGln() {
        return informationProviderGln;
    }

    /**
     * Sets the value of the informationProviderGln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationProviderGln(String value) {
        this.informationProviderGln = value;
    }

    /**
     * Gets the value of the manufacturerGln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerGln() {
        return manufacturerGln;
    }

    /**
     * Sets the value of the manufacturerGln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerGln(String value) {
        this.manufacturerGln = value;
    }

    /**
     * Gets the value of the itemName property.
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
     * Sets the value of the itemName property.
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
     * Gets the value of the brandName property.
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
     * Sets the value of the brandName property.
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
     * Gets the value of the tradeItemUnitDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDataLineTypeTradeItemUnitDescriptor }
     *     
     */
    public ItemDataLineTypeTradeItemUnitDescriptor getTradeItemUnitDescriptor() {
        return tradeItemUnitDescriptor;
    }

    /**
     * Sets the value of the tradeItemUnitDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDataLineTypeTradeItemUnitDescriptor }
     *     
     */
    public void setTradeItemUnitDescriptor(ItemDataLineTypeTradeItemUnitDescriptor value) {
        this.tradeItemUnitDescriptor = value;
    }

    /**
     * Gets the value of the descriptiveSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveSize() {
        return descriptiveSize;
    }

    /**
     * Sets the value of the descriptiveSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveSize(String value) {
        this.descriptiveSize = value;
    }

    /**
     * Gets the value of the netContent property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDataLineTypeNetContent }
     *     
     */
    public ItemDataLineTypeNetContent getNetContent() {
        return netContent;
    }

    /**
     * Sets the value of the netContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDataLineTypeNetContent }
     *     
     */
    public void setNetContent(ItemDataLineTypeNetContent value) {
        this.netContent = value;
    }

    /**
     * Gets the value of the linkUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDataLineTypeLinkUri }
     * 
     * 
     */
    public List<ItemDataLineTypeLinkUri> getLinkUri() {
        if (linkUri == null) {
            linkUri = new ArrayList<ItemDataLineTypeLinkUri>();
        }
        return this.linkUri;
    }

    /**
     * Gets the value of the classificationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationCodeType }
     * 
     * 
     */
    public List<ClassificationCodeType> getClassificationCode() {
        if (classificationCode == null) {
            classificationCode = new ArrayList<ClassificationCodeType>();
        }
        return this.classificationCode;
    }

    /**
     * Gets the value of the lastChangeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangeDateTime() {
        return lastChangeDateTime;
    }

    /**
     * Sets the value of the lastChangeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangeDateTime(XMLGregorianCalendar value) {
        this.lastChangeDateTime = value;
    }

    /**
     * Gets the value of the childItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemDataLineTypeChildItemsChildItem }
     *     
     */
    public ArrayOfItemDataLineTypeChildItemsChildItem getChildItems() {
        return childItems;
    }

    /**
     * Sets the value of the childItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemDataLineTypeChildItemsChildItem }
     *     
     */
    public void setChildItems(ArrayOfItemDataLineTypeChildItemsChildItem value) {
        this.childItems = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        if (lang == null) {
            return "en";
        } else {
            return lang;
        }
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
