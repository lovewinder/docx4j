//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.20 at 03:00:48 PM GMT+10:00 
//


package org.docx4j.jaxb.document;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


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
 *         &lt;group ref="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}EG_RPrBase" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rStyle",
    "rFonts",
    "b",
    "i",
    "caps",
    "smallCaps",
    "strike",
    "dstrike",
    "outline",
    "shadow",
    "emboss",
    "imprint",
    "color",
    "sz",
    "highlight",
    "u",
    "vertAlign"
})
public class RPr
    implements Child
{

    protected RPr.RStyle rStyle;
    protected RPr.RFonts rFonts;
    protected BooleanDefaultTrue b;
    protected BooleanDefaultTrue i;
    protected BooleanDefaultTrue caps;
    protected BooleanDefaultTrue smallCaps;
    protected BooleanDefaultTrue strike;
    protected BooleanDefaultTrue dstrike;
    protected BooleanDefaultTrue outline;
    protected BooleanDefaultTrue shadow;
    protected BooleanDefaultTrue emboss;
    protected BooleanDefaultTrue imprint;
    protected Color color;
    protected HpsMeasure sz;
    protected Highlight highlight;
    protected Underline u;
    protected VerticalAlignRun vertAlign;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the rStyle property.
     * 
     * @return
     *     possible object is
     *     {@link RPr.RStyle }
     *     
     */
    public RPr.RStyle getRStyle() {
        return rStyle;
    }

    /**
     * Sets the value of the rStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPr.RStyle }
     *     
     */
    public void setRStyle(RPr.RStyle value) {
        this.rStyle = value;
    }

    /**
     * Gets the value of the rFonts property.
     * 
     * @return
     *     possible object is
     *     {@link RPr.RFonts }
     *     
     */
    public RPr.RFonts getRFonts() {
        return rFonts;
    }

    /**
     * Sets the value of the rFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPr.RFonts }
     *     
     */
    public void setRFonts(RPr.RFonts value) {
        this.rFonts = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public BooleanDefaultTrue getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public void setB(BooleanDefaultTrue value) {
        this.b = value;
    }

    /**
     * Gets the value of the i property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public BooleanDefaultTrue getI() {
        return i;
    }

    /**
     * Sets the value of the i property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public void setI(BooleanDefaultTrue value) {
        this.i = value;
    }

    /**
     * Gets the value of the caps property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public BooleanDefaultTrue getCaps() {
        return caps;
    }

    /**
     * Sets the value of the caps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public void setCaps(BooleanDefaultTrue value) {
        this.caps = value;
    }

    /**
     * Gets the value of the smallCaps property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public BooleanDefaultTrue getSmallCaps() {
        return smallCaps;
    }

    /**
     * Sets the value of the smallCaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public void setSmallCaps(BooleanDefaultTrue value) {
        this.smallCaps = value;
    }

    /**
     * Gets the value of the strike property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public BooleanDefaultTrue getStrike() {
        return strike;
    }

    /**
     * Sets the value of the strike property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public void setStrike(BooleanDefaultTrue value) {
        this.strike = value;
    }

    /**
     * Gets the value of the dstrike property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public BooleanDefaultTrue getDstrike() {
        return dstrike;
    }

    /**
     * Sets the value of the dstrike property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public void setDstrike(BooleanDefaultTrue value) {
        this.dstrike = value;
    }

    /**
     * Gets the value of the outline property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public BooleanDefaultTrue getOutline() {
        return outline;
    }

    /**
     * Sets the value of the outline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public void setOutline(BooleanDefaultTrue value) {
        this.outline = value;
    }

    /**
     * Gets the value of the shadow property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public BooleanDefaultTrue getShadow() {
        return shadow;
    }

    /**
     * Sets the value of the shadow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public void setShadow(BooleanDefaultTrue value) {
        this.shadow = value;
    }

    /**
     * Gets the value of the emboss property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public BooleanDefaultTrue getEmboss() {
        return emboss;
    }

    /**
     * Sets the value of the emboss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public void setEmboss(BooleanDefaultTrue value) {
        this.emboss = value;
    }

    /**
     * Gets the value of the imprint property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public BooleanDefaultTrue getImprint() {
        return imprint;
    }

    /**
     * Sets the value of the imprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDefaultTrue }
     *     
     */
    public void setImprint(BooleanDefaultTrue value) {
        this.imprint = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setColor(Color value) {
        this.color = value;
    }

    /**
     * Gets the value of the sz property.
     * 
     * @return
     *     possible object is
     *     {@link HpsMeasure }
     *     
     */
    public HpsMeasure getSz() {
        return sz;
    }

    /**
     * Sets the value of the sz property.
     * 
     * @param value
     *     allowed object is
     *     {@link HpsMeasure }
     *     
     */
    public void setSz(HpsMeasure value) {
        this.sz = value;
    }

    /**
     * Gets the value of the highlight property.
     * 
     * @return
     *     possible object is
     *     {@link Highlight }
     *     
     */
    public Highlight getHighlight() {
        return highlight;
    }

    /**
     * Sets the value of the highlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Highlight }
     *     
     */
    public void setHighlight(Highlight value) {
        this.highlight = value;
    }

    /**
     * Gets the value of the u property.
     * 
     * @return
     *     possible object is
     *     {@link Underline }
     *     
     */
    public Underline getU() {
        return u;
    }

    /**
     * Sets the value of the u property.
     * 
     * @param value
     *     allowed object is
     *     {@link Underline }
     *     
     */
    public void setU(Underline value) {
        this.u = value;
    }

    /**
     * Gets the value of the vertAlign property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalAlignRun }
     *     
     */
    public VerticalAlignRun getVertAlign() {
        return vertAlign;
    }

    /**
     * Sets the value of the vertAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalAlignRun }
     *     
     */
    public void setVertAlign(VerticalAlignRun value) {
        this.vertAlign = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }


    /**
     * Run Fonts
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ascii" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="hAnsi" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RFonts
        implements Child
    {

        @XmlAttribute(namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main")
        protected String ascii;
        @XmlAttribute(namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main")
        protected String hAnsi;
        @XmlTransient
        private Object parent;

        /**
         * Gets the value of the ascii property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAscii() {
            return ascii;
        }

        /**
         * Sets the value of the ascii property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAscii(String value) {
            this.ascii = value;
        }

        /**
         * Gets the value of the hAnsi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHAnsi() {
            return hAnsi;
        }

        /**
         * Sets the value of the hAnsi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHAnsi(String value) {
            this.hAnsi = value;
        }

        /**
         * Gets the parent object in the object tree representing the unmarshalled xml document.
         * 
         * @return
         *     The parent object.
         */
        public Object getParent() {
            return this.parent;
        }

        public void setParent(Object parent) {
            this.parent = parent;
        }

        /**
         * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
         * 
         * @param parent
         *     The parent object in the object tree.
         * @param unmarshaller
         *     The unmarshaller that generated the instance.
         */
        public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
            setParent(parent);
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://schemas.openxmlformats.org/wordprocessingml/2006/main}CT_String"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RStyle
        implements Child
    {

        @XmlAttribute(namespace = "http://schemas.openxmlformats.org/wordprocessingml/2006/main", required = true)
        protected String val;
        @XmlTransient
        private Object parent;

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVal() {
            return val;
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVal(String value) {
            this.val = value;
        }

        /**
         * Gets the parent object in the object tree representing the unmarshalled xml document.
         * 
         * @return
         *     The parent object.
         */
        public Object getParent() {
            return this.parent;
        }

        public void setParent(Object parent) {
            this.parent = parent;
        }

        /**
         * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
         * 
         * @param parent
         *     The parent object in the object tree.
         * @param unmarshaller
         *     The unmarshaller that generated the instance.
         */
        public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
            setParent(parent);
        }

    }

}
