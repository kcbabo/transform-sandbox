
package application;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurposeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurposeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Purchase"/>
 *               &lt;enumeration value="Refinance"/>
 *               &lt;enumeration value="Construction"/>
 *               &lt;enumeration value="Construction_Permanent"/>
 *               &lt;enumeration value="Other"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Type_Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Title_Holder_Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Manner_Title_Held" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Source_Of_Down_Payment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Estate_Held" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Fee_Simple"/>
 *               &lt;enumeration value="Leasehold"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Estate_Held_Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Construction" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}ConstructionType" minOccurs="0"/>
 *         &lt;element name="Refinance" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}RefinanceType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurposeType", propOrder = {

})
public class PurposeType {

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Type_Description")
    protected String typeDescription;
    @XmlElement(name = "Title_Holder_Name")
    protected String titleHolderName;
    @XmlElement(name = "Manner_Title_Held")
    protected String mannerTitleHeld;
    @XmlElement(name = "Source_Of_Down_Payment")
    protected String sourceOfDownPayment;
    @XmlElement(name = "Estate_Held")
    protected String estateHeld;
    @XmlElement(name = "Estate_Held_Description")
    protected String estateHeldDescription;
    @XmlElement(name = "Construction")
    protected ConstructionType construction;
    @XmlElement(name = "Refinance")
    protected RefinanceType refinance;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Sets the value of the typeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
    }

    /**
     * Gets the value of the titleHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleHolderName() {
        return titleHolderName;
    }

    /**
     * Sets the value of the titleHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleHolderName(String value) {
        this.titleHolderName = value;
    }

    /**
     * Gets the value of the mannerTitleHeld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMannerTitleHeld() {
        return mannerTitleHeld;
    }

    /**
     * Sets the value of the mannerTitleHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMannerTitleHeld(String value) {
        this.mannerTitleHeld = value;
    }

    /**
     * Gets the value of the sourceOfDownPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfDownPayment() {
        return sourceOfDownPayment;
    }

    /**
     * Sets the value of the sourceOfDownPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfDownPayment(String value) {
        this.sourceOfDownPayment = value;
    }

    /**
     * Gets the value of the estateHeld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstateHeld() {
        return estateHeld;
    }

    /**
     * Sets the value of the estateHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstateHeld(String value) {
        this.estateHeld = value;
    }

    /**
     * Gets the value of the estateHeldDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstateHeldDescription() {
        return estateHeldDescription;
    }

    /**
     * Sets the value of the estateHeldDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstateHeldDescription(String value) {
        this.estateHeldDescription = value;
    }

    /**
     * Gets the value of the construction property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionType }
     *     
     */
    public ConstructionType getConstruction() {
        return construction;
    }

    /**
     * Sets the value of the construction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionType }
     *     
     */
    public void setConstruction(ConstructionType value) {
        this.construction = value;
    }

    /**
     * Gets the value of the refinance property.
     * 
     * @return
     *     possible object is
     *     {@link RefinanceType }
     *     
     */
    public RefinanceType getRefinance() {
        return refinance;
    }

    /**
     * Sets the value of the refinance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefinanceType }
     *     
     */
    public void setRefinance(RefinanceType value) {
        this.refinance = value;
    }

}
