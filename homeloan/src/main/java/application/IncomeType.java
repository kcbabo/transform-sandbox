
package application;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Base_Employment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Overtime" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Bonuses" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Commissions" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Dividents_Interest" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Net_Rental_Income" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Other_1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Other_2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Other_Income_Sources" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Other_Income" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}OtherIncomeType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "IncomeType", propOrder = {

})
public class IncomeType {

    @XmlElement(name = "Base_Employment")
    protected BigDecimal baseEmployment;
    @XmlElement(name = "Overtime")
    protected BigDecimal overtime;
    @XmlElement(name = "Bonuses")
    protected BigDecimal bonuses;
    @XmlElement(name = "Commissions")
    protected BigDecimal commissions;
    @XmlElement(name = "Dividents_Interest")
    protected BigDecimal dividentsInterest;
    @XmlElement(name = "Net_Rental_Income")
    protected BigDecimal netRentalIncome;
    @XmlElement(name = "Other_1")
    protected BigDecimal other1;
    @XmlElement(name = "Other_2")
    protected BigDecimal other2;
    @XmlElement(name = "Other_Income_Sources")
    protected IncomeType.OtherIncomeSources otherIncomeSources;

    /**
     * Gets the value of the baseEmployment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseEmployment() {
        return baseEmployment;
    }

    /**
     * Sets the value of the baseEmployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseEmployment(BigDecimal value) {
        this.baseEmployment = value;
    }

    /**
     * Gets the value of the overtime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOvertime() {
        return overtime;
    }

    /**
     * Sets the value of the overtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOvertime(BigDecimal value) {
        this.overtime = value;
    }

    /**
     * Gets the value of the bonuses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBonuses() {
        return bonuses;
    }

    /**
     * Sets the value of the bonuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBonuses(BigDecimal value) {
        this.bonuses = value;
    }

    /**
     * Gets the value of the commissions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissions() {
        return commissions;
    }

    /**
     * Sets the value of the commissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissions(BigDecimal value) {
        this.commissions = value;
    }

    /**
     * Gets the value of the dividentsInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividentsInterest() {
        return dividentsInterest;
    }

    /**
     * Sets the value of the dividentsInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividentsInterest(BigDecimal value) {
        this.dividentsInterest = value;
    }

    /**
     * Gets the value of the netRentalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetRentalIncome() {
        return netRentalIncome;
    }

    /**
     * Sets the value of the netRentalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetRentalIncome(BigDecimal value) {
        this.netRentalIncome = value;
    }

    /**
     * Gets the value of the other1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOther1() {
        return other1;
    }

    /**
     * Sets the value of the other1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOther1(BigDecimal value) {
        this.other1 = value;
    }

    /**
     * Gets the value of the other2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOther2() {
        return other2;
    }

    /**
     * Sets the value of the other2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOther2(BigDecimal value) {
        this.other2 = value;
    }

    /**
     * Gets the value of the otherIncomeSources property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeType.OtherIncomeSources }
     *     
     */
    public IncomeType.OtherIncomeSources getOtherIncomeSources() {
        return otherIncomeSources;
    }

    /**
     * Sets the value of the otherIncomeSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeType.OtherIncomeSources }
     *     
     */
    public void setOtherIncomeSources(IncomeType.OtherIncomeSources value) {
        this.otherIncomeSources = value;
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
     *       &lt;sequence>
     *         &lt;element name="Other_Income" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}OtherIncomeType" maxOccurs="3" minOccurs="0"/>
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
        "otherIncome"
    })
    public static class OtherIncomeSources {

        @XmlElement(name = "Other_Income")
        protected List<OtherIncomeType> otherIncome;

        /**
         * Gets the value of the otherIncome property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherIncome property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherIncome().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherIncomeType }
         * 
         * 
         */
        public List<OtherIncomeType> getOtherIncome() {
            if (otherIncome == null) {
                otherIncome = new ArrayList<OtherIncomeType>();
            }
            return this.otherIncome;
        }

    }

}
