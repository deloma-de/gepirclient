
package gs1.shared.shared_common.xsd._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für PaymentTimePeriodType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentTimePeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dayOfMonthDue" type="{http://www.w3.org/2001/XMLSchema}gDay" minOccurs="0"/>
 *         &lt;element name="timePeriodDue" type="{urn:gs1:shared:shared_common:xsd:3}TimeMeasurementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTimePeriodType", propOrder = {
    "dateDue",
    "dayOfMonthDue",
    "timePeriodDue"
})
public class PaymentTimePeriodType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDue;
    @XmlSchemaType(name = "gDay")
    protected XMLGregorianCalendar dayOfMonthDue;
    protected TimeMeasurementType timePeriodDue;

    /**
     * Ruft den Wert der dateDue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDue() {
        return dateDue;
    }

    /**
     * Legt den Wert der dateDue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDue(XMLGregorianCalendar value) {
        this.dateDue = value;
    }

    /**
     * Ruft den Wert der dayOfMonthDue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayOfMonthDue() {
        return dayOfMonthDue;
    }

    /**
     * Legt den Wert der dayOfMonthDue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayOfMonthDue(XMLGregorianCalendar value) {
        this.dayOfMonthDue = value;
    }

    /**
     * Ruft den Wert der timePeriodDue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasurementType }
     *     
     */
    public TimeMeasurementType getTimePeriodDue() {
        return timePeriodDue;
    }

    /**
     * Legt den Wert der timePeriodDue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasurementType }
     *     
     */
    public void setTimePeriodDue(TimeMeasurementType value) {
        this.timePeriodDue = value;
    }

}
