package org.gepir;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java class for gepirRequestHeader complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gepirRequestHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requesterGln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cascade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gepirRequestHeader", propOrder =
{
	"requesterGln", "cascade"
})
public class GepirRequestHeader
{

	protected String requesterGln;
	protected Integer cascade;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the requesterGln property.
	 * 
	 * @return
	 *         possible object is {@link String }
	 * 
	 */
	public String getRequesterGln()
	{
		return this.requesterGln;
	}

	/**
	 * Sets the value of the requesterGln property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequesterGln(final String value)
	{
		this.requesterGln = value;
	}

	/**
	 * Gets the value of the cascade property.
	 * 
	 * @return
	 *         possible object is {@link Integer }
	 * 
	 */
	public Integer getCascade()
	{
		return this.cascade;
	}

	/**
	 * Sets the value of the cascade property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCascade(final Integer value)
	{
		this.cascade = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of
	 * this design, there's no setter.
	 * 
	 * 
	 * @return
	 *         always non-null
	 */
	public Map<QName, String> getOtherAttributes()
	{
		return this.otherAttributes;
	}

}
