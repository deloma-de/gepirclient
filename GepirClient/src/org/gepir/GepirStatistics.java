
package org.gepir;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for gepirStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gepirStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periodBegin" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="periodEnd" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="statisticsLine" type="{http://www.gepir.org/}gepirStatisticsLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" default="3.10" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gepirStatistics", propOrder = {
    "periodBegin",
    "periodEnd",
    "statisticsLine"
})
public class GepirStatistics {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodBegin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodEnd;
    protected List<GepirStatisticsLine> statisticsLine;
    @XmlAttribute(name = "version")
    protected BigDecimal version;

    /**
     * Gets the value of the periodBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodBegin() {
        return periodBegin;
    }

    /**
     * Sets the value of the periodBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodBegin(XMLGregorianCalendar value) {
        this.periodBegin = value;
    }

    /**
     * Gets the value of the periodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEnd() {
        return periodEnd;
    }

    /**
     * Sets the value of the periodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEnd(XMLGregorianCalendar value) {
        this.periodEnd = value;
    }

    /**
     * Gets the value of the statisticsLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statisticsLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatisticsLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GepirStatisticsLine }
     * 
     * 
     */
    public List<GepirStatisticsLine> getStatisticsLine() {
        if (statisticsLine == null) {
            statisticsLine = new ArrayList<GepirStatisticsLine>();
        }
        return this.statisticsLine;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        if (version == null) {
            return new BigDecimal("3.10");
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}
