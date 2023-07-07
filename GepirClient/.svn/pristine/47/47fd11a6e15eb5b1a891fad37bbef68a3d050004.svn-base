
package org.gepir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gepirStatisticsLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gepirStatisticsLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryISOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Counters" type="{http://www.gepir.org/}gepirStatisticsLineCounters" minOccurs="0"/>
 *         &lt;element name="CountHits" type="{http://www.gepir.org/}gepirStatisticsLineCountHits" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gepirStatisticsLine", propOrder = {
    "countryISOCode",
    "counters",
    "countHits"
})
public class GepirStatisticsLine {

    protected String countryISOCode;
    @XmlElement(name = "Counters")
    protected GepirStatisticsLineCounters counters;
    @XmlElement(name = "CountHits")
    protected List<GepirStatisticsLineCountHits> countHits;

    /**
     * Gets the value of the countryISOCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOCode() {
        return countryISOCode;
    }

    /**
     * Sets the value of the countryISOCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOCode(String value) {
        this.countryISOCode = value;
    }

    /**
     * Gets the value of the counters property.
     * 
     * @return
     *     possible object is
     *     {@link GepirStatisticsLineCounters }
     *     
     */
    public GepirStatisticsLineCounters getCounters() {
        return counters;
    }

    /**
     * Sets the value of the counters property.
     * 
     * @param value
     *     allowed object is
     *     {@link GepirStatisticsLineCounters }
     *     
     */
    public void setCounters(GepirStatisticsLineCounters value) {
        this.counters = value;
    }

    /**
     * Gets the value of the countHits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countHits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountHits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GepirStatisticsLineCountHits }
     * 
     * 
     */
    public List<GepirStatisticsLineCountHits> getCountHits() {
        if (countHits == null) {
            countHits = new ArrayList<GepirStatisticsLineCountHits>();
        }
        return this.countHits;
    }

}
