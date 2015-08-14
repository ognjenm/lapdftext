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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import edu.isi.bmkeg.lapdf.pmcXml.mathml.PmcXmlMath;


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
 *         &lt;element ref="{}object-id" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}sec-meta" minOccurs="0"/>
 *         &lt;element ref="{}label" minOccurs="0"/>
 *         &lt;element ref="{}caption" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}address"/>
 *           &lt;element ref="{}alternatives"/>
 *           &lt;element ref="{}array"/>
 *           &lt;element ref="{}boxed-text"/>
 *           &lt;element ref="{}chem-struct-wrap"/>
 *           &lt;element ref="{}fig"/>
 *           &lt;element ref="{}fig-group"/>
 *           &lt;element ref="{}graphic"/>
 *           &lt;element ref="{}media"/>
 *           &lt;element ref="{}preformat"/>
 *           &lt;element ref="{}supplementary-material"/>
 *           &lt;element ref="{}table-wrap"/>
 *           &lt;element ref="{}table-wrap-group"/>
 *           &lt;element ref="{}disp-formula"/>
 *           &lt;element ref="{}disp-formula-group"/>
 *           &lt;element ref="{}p"/>
 *           &lt;element ref="{}def-list"/>
 *           &lt;element ref="{}list"/>
 *           &lt;element ref="{}tex-math"/>
 *           &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *           &lt;element ref="{}related-article"/>
 *           &lt;element ref="{}related-object"/>
 *           &lt;element ref="{}disp-quote"/>
 *           &lt;element ref="{}speech"/>
 *           &lt;element ref="{}statement"/>
 *           &lt;element ref="{}verse-group"/>
 *         &lt;/choice>
 *         &lt;element ref="{}sec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}fn-group"/>
 *           &lt;element ref="{}glossary"/>
 *           &lt;element ref="{}ref-list"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}attrib"/>
 *           &lt;element ref="{}permissions"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="position" default="float">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="anchor"/>
 *             &lt;enumeration value="float"/>
 *             &lt;enumeration value="margin"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="orientation" default="portrait">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="portrait"/>
 *             &lt;enumeration value="landscape"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objectIds",
    "secMeta",
    "label",
    "caption",
    "addressesAndAlternativesAndArraies",
    "secs",
    "fnGroupsAndGlossariesAndRefLists",
    "attribsAndPermissions"
})
@XmlRootElement(name = "boxed-text")
public class PmcXmlBoxedText {

    @XmlElement(name = "object-id")
    protected List<PmcXmlObjectId> objectIds;
    @XmlElement(name = "sec-meta")
    protected PmcXmlSecMeta secMeta;
    protected PmcXmlLabel label;
    protected PmcXmlCaption caption;
    @XmlElements({
        @XmlElement(name = "address", type = PmcXmlAddress.class),
        @XmlElement(name = "alternatives", type = PmcXmlAlternatives.class),
        @XmlElement(name = "array", type = PmcXmlArray.class),
        @XmlElement(name = "boxed-text", type = PmcXmlBoxedText.class),
        @XmlElement(name = "chem-struct-wrap", type = PmcXmlChemStructWrap.class),
        @XmlElement(name = "fig", type = PmcXmlFig.class),
        @XmlElement(name = "fig-group", type = PmcXmlFigGroup.class),
        @XmlElement(name = "graphic", type = PmcXmlGraphic.class),
        @XmlElement(name = "media", type = PmcXmlMedia.class),
        @XmlElement(name = "preformat", type = PmcXmlPreformat.class),
        @XmlElement(name = "supplementary-material", type = PmcXmlSupplementaryMaterial.class),
        @XmlElement(name = "table-wrap", type = PmcXmlTableWrap.class),
        @XmlElement(name = "table-wrap-group", type = PmcXmlTableWrapGroup.class),
        @XmlElement(name = "disp-formula", type = PmcXmlDispFormula.class),
        @XmlElement(name = "disp-formula-group", type = PmcXmlDispFormulaGroup.class),
        @XmlElement(name = "p", type = PmcXmlP.class),
        @XmlElement(name = "def-list", type = PmcXmlDefList.class),
        @XmlElement(name = "list", type = PmcXmlList.class),
        @XmlElement(name = "tex-math", type = PmcXmlTexMath.class),
        @XmlElement(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = PmcXmlMath.class),
        @XmlElement(name = "related-article", type = PmcXmlRelatedArticle.class),
        @XmlElement(name = "related-object", type = PmcXmlRelatedObject.class),
        @XmlElement(name = "disp-quote", type = PmcXmlDispQuote.class),
        @XmlElement(name = "speech", type = PmcXmlSpeech.class),
        @XmlElement(name = "statement", type = PmcXmlStatement.class),
        @XmlElement(name = "verse-group", type = PmcXmlVerseGroup.class)
    })
    protected List<Object> addressesAndAlternativesAndArraies;
    @XmlElement(name = "sec")
    protected List<PmcXmlSec> secs;
    @XmlElements({
        @XmlElement(name = "fn-group", type = PmcXmlFnGroup.class),
        @XmlElement(name = "glossary", type = PmcXmlGlossary.class),
        @XmlElement(name = "ref-list", type = PmcXmlRefList.class)
    })
    protected List<Object> fnGroupsAndGlossariesAndRefLists;
    @XmlElements({
        @XmlElement(name = "attrib", type = PmcXmlAttrib.class),
        @XmlElement(name = "permissions", type = PmcXmlPermissions.class)
    })
    protected List<Object> attribsAndPermissions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "position")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String position;
    @XmlAttribute(name = "orientation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;

    /**
     * Gets the value of the objectIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlObjectId }
     * 
     * 
     */
    public List<PmcXmlObjectId> getObjectIds() {
        if (objectIds == null) {
            objectIds = new ArrayList<PmcXmlObjectId>();
        }
        return this.objectIds;
    }

    /**
     * Gets the value of the secMeta property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlSecMeta }
     *     
     */
    public PmcXmlSecMeta getSecMeta() {
        return secMeta;
    }

    /**
     * Sets the value of the secMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlSecMeta }
     *     
     */
    public void setSecMeta(PmcXmlSecMeta value) {
        this.secMeta = value;
    }

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
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlCaption }
     *     
     */
    public PmcXmlCaption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlCaption }
     *     
     */
    public void setCaption(PmcXmlCaption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the addressesAndAlternativesAndArraies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressesAndAlternativesAndArraies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressesAndAlternativesAndArraies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlAddress }
     * {@link PmcXmlAlternatives }
     * {@link PmcXmlArray }
     * {@link PmcXmlBoxedText }
     * {@link PmcXmlChemStructWrap }
     * {@link PmcXmlFig }
     * {@link PmcXmlFigGroup }
     * {@link PmcXmlGraphic }
     * {@link PmcXmlMedia }
     * {@link PmcXmlPreformat }
     * {@link PmcXmlSupplementaryMaterial }
     * {@link PmcXmlTableWrap }
     * {@link PmcXmlTableWrapGroup }
     * {@link PmcXmlDispFormula }
     * {@link PmcXmlDispFormulaGroup }
     * {@link PmcXmlP }
     * {@link PmcXmlDefList }
     * {@link PmcXmlList }
     * {@link PmcXmlTexMath }
     * {@link PmcXmlMath }
     * {@link PmcXmlRelatedArticle }
     * {@link PmcXmlRelatedObject }
     * {@link PmcXmlDispQuote }
     * {@link PmcXmlSpeech }
     * {@link PmcXmlStatement }
     * {@link PmcXmlVerseGroup }
     * 
     * 
     */
    public List<Object> getAddressesAndAlternativesAndArraies() {
        if (addressesAndAlternativesAndArraies == null) {
            addressesAndAlternativesAndArraies = new ArrayList<Object>();
        }
        return this.addressesAndAlternativesAndArraies;
    }

    /**
     * Gets the value of the secs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlSec }
     * 
     * 
     */
    public List<PmcXmlSec> getSecs() {
        if (secs == null) {
            secs = new ArrayList<PmcXmlSec>();
        }
        return this.secs;
    }

    /**
     * Gets the value of the fnGroupsAndGlossariesAndRefLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fnGroupsAndGlossariesAndRefLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFnGroupsAndGlossariesAndRefLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlFnGroup }
     * {@link PmcXmlGlossary }
     * {@link PmcXmlRefList }
     * 
     * 
     */
    public List<Object> getFnGroupsAndGlossariesAndRefLists() {
        if (fnGroupsAndGlossariesAndRefLists == null) {
            fnGroupsAndGlossariesAndRefLists = new ArrayList<Object>();
        }
        return this.fnGroupsAndGlossariesAndRefLists;
    }

    /**
     * Gets the value of the attribsAndPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribsAndPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribsAndPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlAttrib }
     * {@link PmcXmlPermissions }
     * 
     * 
     */
    public List<Object> getAttribsAndPermissions() {
        if (attribsAndPermissions == null) {
            attribsAndPermissions = new ArrayList<Object>();
        }
        return this.attribsAndPermissions;
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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        if (position == null) {
            return "float";
        } else {
            return position;
        }
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "portrait";
        } else {
            return orientation;
        }
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
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
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
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