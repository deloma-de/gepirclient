
package org.gepir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gepirStatisticsLineCountHits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gepirStatisticsLineCountHits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hits" type="{http://www.gepir.org/}gepirStatisticsLineCountHitsHits" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Method" type="{http://www.gepir.org/}gepirStatisticsLineCountHitsMethod" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gepirStatisticsLineCountHits", propOrder = {
    "hits"
})
public class GepirStatisticsLineCountHits {

    @XmlElement(name = "Hits")
    protected List<GepirStatisticsLineCountHitsHits> hits;
    @XmlAttribute(name = "Method", namespace = "http://www.gepir.org/")
    protected GepirStatisticsLineCountHitsMethod method;

    /**
     * Gets the value of the hits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GepirStatisticsLineCountHitsHits }
     * 
     * 
     */
    public List<GepirStatisticsLineCountHitsHits> getHits() {
        if (hits == null) {
            hits = new ArrayList<GepirStatisticsLineCountHitsHits>();
        }
        return this.hits;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link GepirStatisticsLineCountHitsMethod }
     *     
     */
    public GepirStatisticsLineCountHitsMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirStatisticsLineCountHitsMethod }
     *     
     */
    public void setMethod(GepirStatisticsLineCountHitsMethod value) {
        this.method = value;
    }

}
