
package application;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeclarationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclarationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Any_Judgments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Declared_Bankrupt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Property_Foreclosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Lawsuit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Obligated_On_Any_Loan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Delinquent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Obligated_To_Pay_Alimony" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Borrowed_Down_Payment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Co_Maker_Note" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="U_S_Citizen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Permanent_Resident" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Primary_Residence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Ownership_Interest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Property_Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Not_Specified"/>
 *               &lt;enumeration value="Principal_Residence"/>
 *               &lt;enumeration value="Second_Home"/>
 *               &lt;enumeration value="Investment_Property"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Title_Held" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Not_Specified"/>
 *               &lt;enumeration value="Solely_By_Yourself"/>
 *               &lt;enumeration value="Jointly_With_Your_Spouse"/>
 *               &lt;enumeration value="Jointly_With_Another_Person"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationsType", propOrder = {

})
public class DeclarationsType {

    @XmlElement(name = "Any_Judgments")
    protected Boolean anyJudgments;
    @XmlElement(name = "Declared_Bankrupt")
    protected Boolean declaredBankrupt;
    @XmlElement(name = "Property_Foreclosed")
    protected Boolean propertyForeclosed;
    @XmlElement(name = "Lawsuit")
    protected Boolean lawsuit;
    @XmlElement(name = "Obligated_On_Any_Loan")
    protected Boolean obligatedOnAnyLoan;
    @XmlElement(name = "Delinquent")
    protected Boolean delinquent;
    @XmlElement(name = "Obligated_To_Pay_Alimony")
    protected Boolean obligatedToPayAlimony;
    @XmlElement(name = "Borrowed_Down_Payment")
    protected Boolean borrowedDownPayment;
    @XmlElement(name = "Co_Maker_Note")
    protected Boolean coMakerNote;
    @XmlElement(name = "U_S_Citizen")
    protected Boolean usCitizen;
    @XmlElement(name = "Permanent_Resident")
    protected Boolean permanentResident;
    @XmlElement(name = "Primary_Residence")
    protected Boolean primaryResidence;
    @XmlElement(name = "Ownership_Interest")
    protected Boolean ownershipInterest;
    @XmlElement(name = "Property_Type")
    protected String propertyType;
    @XmlElement(name = "Title_Held")
    protected String titleHeld;

    /**
     * Gets the value of the anyJudgments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnyJudgments() {
        return anyJudgments;
    }

    /**
     * Sets the value of the anyJudgments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnyJudgments(Boolean value) {
        this.anyJudgments = value;
    }

    /**
     * Gets the value of the declaredBankrupt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeclaredBankrupt() {
        return declaredBankrupt;
    }

    /**
     * Sets the value of the declaredBankrupt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeclaredBankrupt(Boolean value) {
        this.declaredBankrupt = value;
    }

    /**
     * Gets the value of the propertyForeclosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyForeclosed() {
        return propertyForeclosed;
    }

    /**
     * Sets the value of the propertyForeclosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyForeclosed(Boolean value) {
        this.propertyForeclosed = value;
    }

    /**
     * Gets the value of the lawsuit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLawsuit() {
        return lawsuit;
    }

    /**
     * Sets the value of the lawsuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLawsuit(Boolean value) {
        this.lawsuit = value;
    }

    /**
     * Gets the value of the obligatedOnAnyLoan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObligatedOnAnyLoan() {
        return obligatedOnAnyLoan;
    }

    /**
     * Sets the value of the obligatedOnAnyLoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObligatedOnAnyLoan(Boolean value) {
        this.obligatedOnAnyLoan = value;
    }

    /**
     * Gets the value of the delinquent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelinquent() {
        return delinquent;
    }

    /**
     * Sets the value of the delinquent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelinquent(Boolean value) {
        this.delinquent = value;
    }

    /**
     * Gets the value of the obligatedToPayAlimony property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObligatedToPayAlimony() {
        return obligatedToPayAlimony;
    }

    /**
     * Sets the value of the obligatedToPayAlimony property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObligatedToPayAlimony(Boolean value) {
        this.obligatedToPayAlimony = value;
    }

    /**
     * Gets the value of the borrowedDownPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBorrowedDownPayment() {
        return borrowedDownPayment;
    }

    /**
     * Sets the value of the borrowedDownPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBorrowedDownPayment(Boolean value) {
        this.borrowedDownPayment = value;
    }

    /**
     * Gets the value of the coMakerNote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoMakerNote() {
        return coMakerNote;
    }

    /**
     * Sets the value of the coMakerNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoMakerNote(Boolean value) {
        this.coMakerNote = value;
    }

    /**
     * Gets the value of the usCitizen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSCitizen() {
        return usCitizen;
    }

    /**
     * Sets the value of the usCitizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSCitizen(Boolean value) {
        this.usCitizen = value;
    }

    /**
     * Gets the value of the permanentResident property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermanentResident() {
        return permanentResident;
    }

    /**
     * Sets the value of the permanentResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermanentResident(Boolean value) {
        this.permanentResident = value;
    }

    /**
     * Gets the value of the primaryResidence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryResidence() {
        return primaryResidence;
    }

    /**
     * Sets the value of the primaryResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryResidence(Boolean value) {
        this.primaryResidence = value;
    }

    /**
     * Gets the value of the ownershipInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnershipInterest() {
        return ownershipInterest;
    }

    /**
     * Sets the value of the ownershipInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnershipInterest(Boolean value) {
        this.ownershipInterest = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the titleHeld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleHeld() {
        return titleHeld;
    }

    /**
     * Sets the value of the titleHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleHeld(String value) {
        this.titleHeld = value;
    }

}
