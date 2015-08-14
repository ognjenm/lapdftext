//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}label" minOccurs="0"/>
 *         &lt;element ref="{}title" minOccurs="0"/>
 *         &lt;element ref="{}term-head" minOccurs="0"/>
 *         &lt;element ref="{}def-head" minOccurs="0"/>
 *         &lt;element ref="{}def-item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}def-list" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="list-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="prefix-word" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="list-content" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="continued-from" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "label",
    "title",
    "termHead",
    "defHead",
    "defItems",
    "defLists"
})
@XmlRootElement(name = "def-list")
public class PmcXmlDefList {

    protected PmcXmlLabel label;
    protected PmcXmlTitle title;
    @XmlElement(name = "term-head")
    protected PmcXmlTermHead termHead;
    @XmlElement(name = "def-head")
    protected PmcXmlDefHead defHead;
    @XmlElement(name = "def-item")
    protected List<PmcXmlDefItem> defItems;
    @XmlElement(name = "def-list")
    protected List<PmcXmlDefList> defLists;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "list-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String listType;
    @XmlAttribute(name = "prefix-word")
    @XmlSchemaType(name = "anySimpleType")
    protected String prefixWord;
    @XmlAttribute(name = "list-content")
    @XmlSchemaType(name = "anySimpleType")
    protected String listContent;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(name = "continued-from")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object continuedFrom;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlLabel }
     *     
     */
    public PmcXmlLabel getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlLabel }
     *     
     */
    public void setLabel(PmcXmlLabel value) {
        this.label = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlTitle }
     *     
     */
    public PmcXmlTitle getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlTitle }
     *     
     */
    public void setTitle(PmcXmlTitle value) {
        this.title = value;
    }

    /**
     * Gets the value of the termHead property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlTermHead }
     *     
     */
    public PmcXmlTermHead getTermHead() {
        return termHead;
    }

    /**
     * Sets the value of the termHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlTermHead }
     *     
     */
    public void setTermHead(PmcXmlTermHead value) {
        this.termHead = value;
    }

    /**
     * Gets the value of the defHead property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlDefHead }
     *     
     */
    public PmcXmlDefHead getDefHead() {
        return defHead;
    }

    /**
     * Sets the value of the defHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlDefHead }
     *     
     */
    public void setDefHead(PmcXmlDefHead value) {
        this.defHead = value;
    }

    /**
     * Gets the value of the defItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlDefItem }
     * 
     * 
     */
    public List<PmcXmlDefItem> getDefItems() {
        if (defItems == null) {
            defItems = new ArrayList<PmcXmlDefItem>();
        }
        return this.defItems;
    }

    /**
     * Gets the value of the defLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlDefList }
     * 
     * 
     */
    public List<PmcXmlDefList> getDefLists() {
        if (defLists == null) {
            defLists = new ArrayList<PmcXmlDefList>();
        }
        return this.defLists;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the listType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListType() {
        return listType;
    }

    /**
     * Sets the value of the listType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListType(String value) {
        this.listType = value;
    }

    /**
     * Gets the value of the prefixWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixWord() {
        return prefixWord;
    }

    /**
     * Sets the value of the prefixWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixWord(String value) {
        this.prefixWord = value;
    }

    /**
     * Gets the value of the listContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListContent() {
        return listContent;
    }

    /**
     * Sets the value of the listContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListContent(String value) {
        this.listContent = value;
    }

    /**
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
    }

    /**
     * Gets the value of the continuedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContinuedFrom() {
        return continuedFrom;
    }

    /**
     * Sets the value of the continuedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContinuedFrom(Object value) {
        this.continuedFrom = value;
    }

}