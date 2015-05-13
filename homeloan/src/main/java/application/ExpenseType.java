
package application;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpenseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpenseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Rent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="First_Mortgage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Other_Financing" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Hazard_Insurance" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Real_Estate_Taxes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Mortgage_Insurance" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Homeowner_Assn_Dues" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Other" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="Expense_Type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Present"/>
 *             &lt;enumeration value="Proposed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseType", propOrder = {

})
public class ExpenseType {

    @XmlElement(name = "Rent")
    protected BigDecimal rent;
    @XmlElement(name = "First_Mortgage")
    protected BigDecimal firstMortgage;
    @XmlElement(name = "Other_Financing")
    protected BigDecimal otherFinancing;
    @XmlElement(name = "Hazard_Insurance")
    protected BigDecimal hazardInsurance;
    @XmlElement(name = "Real_Estate_Taxes")
    protected BigDecimal realEstateTaxes;
    @XmlElement(name = "Mortgage_Insurance")
    protected BigDecimal mortgageInsurance;
    @XmlElement(name = "Homeowner_Assn_Dues")
    protected BigDecimal homeownerAssnDues;
    @XmlElement(name = "Other")
    protected BigDecimal other;
    @XmlAttribute(name = "Expense_Type", required = true)
    protected String expenseType;

    /**
     * Gets the value of the rent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRent() {
        return rent;
    }

    /**
     * Sets the value of the rent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRent(BigDecimal value) {
        this.rent = value;
    }

    /**
     * Gets the value of the firstMortgage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstMortgage() {
        return firstMortgage;
    }

    /**
     * Sets the value of the firstMortgage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstMortgage(BigDecimal value) {
        this.firstMortgage = value;
    }

    /**
     * Gets the value of the otherFinancing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherFinancing() {
        return otherFinancing;
    }

    /**
     * Sets the value of the otherFinancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherFinancing(BigDecimal value) {
        this.otherFinancing = value;
    }

    /**
     * Gets the value of the hazardInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHazardInsurance() {
        return hazardInsurance;
    }

    /**
     * Sets the value of the hazardInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHazardInsurance(BigDecimal value) {
        this.hazardInsurance = value;
    }

    /**
     * Gets the value of the realEstateTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRealEstateTaxes() {
        return realEstateTaxes;
    }

    /**
     * Sets the value of the realEstateTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRealEstateTaxes(BigDecimal value) {
        this.realEstateTaxes = value;
    }

    /**
     * Gets the value of the mortgageInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMortgageInsurance() {
        return mortgageInsurance;
    }

    /**
     * Sets the value of the mortgageInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMortgageInsurance(BigDecimal value) {
        this.mortgageInsurance = value;
    }

    /**
     * Gets the value of the homeownerAssnDues property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHomeownerAssnDues() {
        return homeownerAssnDues;
    }

    /**
     * Sets the value of the homeownerAssnDues property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHomeownerAssnDues(BigDecimal value) {
        this.homeownerAssnDues = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOther(BigDecimal value) {
        this.other = value;
    }

    /**
     * Gets the value of the expenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpenseType() {
        return expenseType;
    }

    /**
     * Sets the value of the expenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpenseType(String value) {
        this.expenseType = value;
    }

}
