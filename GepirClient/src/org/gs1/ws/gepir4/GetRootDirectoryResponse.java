
package org.gs1.ws.gepir4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gs1.gepir.root_directory.xsd._4.RootDirectoryType;


/**
 * <p>Java-Klasse für getRootDirectoryResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getRootDirectoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rootDirectory" type="{urn:gs1:gepir:root_directory:xsd:4}RootDirectoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRootDirectoryResponse", propOrder = {
    "rootDirectory"
})
public class GetRootDirectoryResponse {

    protected RootDirectoryType rootDirectory;

    /**
     * Ruft den Wert der rootDirectory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RootDirectoryType }
     *     
     */
    public RootDirectoryType getRootDirectory() {
        return rootDirectory;
    }

    /**
     * Legt den Wert der rootDirectory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RootDirectoryType }
     *     
     */
    public void setRootDirectory(RootDirectoryType value) {
        this.rootDirectory = value;
    }

}
