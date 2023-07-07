
package org.gepir;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gepirStatisticsLineCounters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gepirStatisticsLineCounters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountGCP" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="CountGLN" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="CountGTIN" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="CountClient" type="{http://www.gepir.org/}gepirStatisticsLineCountersCountClient" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gepirStatisticsLineCounters", propOrder = {
    "countGCP",
    "countGLN",
    "countGTIN",
    "countClient"
})
public class GepirStatisticsLineCounters {

    @XmlElement(name = "CountGCP")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger countGCP;
    @XmlElement(name = "CountGLN")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger countGLN;
    @XmlElement(name = "CountGTIN")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger countGTIN;
    @XmlElement(name = "CountClient")
    protected List<GepirStatisticsLineCountersCountClient> countClient;

    /**
     * Gets the value of the countGCP property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountGCP() {
        return countGCP;
    }

    /**
     * Sets the value of the countGCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountGCP(BigInteger value) {
        this.countGCP = value;
    }

    /**
     * Gets the value of the countGLN property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountGLN() {
        return countGLN;
    }

    /**
     * Sets the value of the countGLN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountGLN(BigInteger value) {
        this.countGLN = value;
    }

    /**
     * Gets the value of the countGTIN property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountGTIN() {
        return countGTIN;
    }

    /**
     * Sets the value of the countGTIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountGTIN(BigInteger value) {
        this.countGTIN = value;
    }

    /**
     * Gets the value of the countClient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countClient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GepirStatisticsLineCountersCountClient }
     * 
     * 
     */
    public List<GepirStatisticsLineCountersCountClient> getCountClient() {
        if (countClient == null) {
            countClient = new ArrayList<GepirStatisticsLineCountersCountClient>();
        }
        return this.countClient;
    }

}
