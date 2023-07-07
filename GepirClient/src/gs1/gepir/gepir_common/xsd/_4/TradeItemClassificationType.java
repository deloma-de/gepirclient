
package gs1.gepir.gepir_common.xsd._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TradeItemClassificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TradeItemClassificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gpcCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gpcCategoryDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gpcCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalTradeItemClassification" type="{urn:gs1:gepir:gepir_common:xsd:4}AdditionalTradeItemClassificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeItemClassificationType", propOrder = {
    "gpcCategoryCode",
    "gpcCategoryDefinition",
    "gpcCategoryName",
    "additionalTradeItemClassification"
})
public class TradeItemClassificationType {

    @XmlElement(required = true)
    protected String gpcCategoryCode;
    protected String gpcCategoryDefinition;
    protected String gpcCategoryName;
    @XmlElement(nillable = true)
    protected List<AdditionalTradeItemClassificationType> additionalTradeItemClassification;

    /**
     * Ruft den Wert der gpcCategoryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryCode() {
        return gpcCategoryCode;
    }

    /**
     * Legt den Wert der gpcCategoryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryCode(String value) {
        this.gpcCategoryCode = value;
    }

    /**
     * Ruft den Wert der gpcCategoryDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryDefinition() {
        return gpcCategoryDefinition;
    }

    /**
     * Legt den Wert der gpcCategoryDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryDefinition(String value) {
        this.gpcCategoryDefinition = value;
    }

    /**
     * Ruft den Wert der gpcCategoryName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpcCategoryName() {
        return gpcCategoryName;
    }

    /**
     * Legt den Wert der gpcCategoryName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpcCategoryName(String value) {
        this.gpcCategoryName = value;
    }

    /**
     * Gets the value of the additionalTradeItemClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTradeItemClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTradeItemClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalTradeItemClassificationType }
     * 
     * 
     */
    public List<AdditionalTradeItemClassificationType> getAdditionalTradeItemClassification() {
        if (additionalTradeItemClassification == null) {
            additionalTradeItemClassification = new ArrayList<AdditionalTradeItemClassificationType>();
        }
        return this.additionalTradeItemClassification;
    }

}
