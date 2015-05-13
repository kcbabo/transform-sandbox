
package application;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Purchase_Price" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Alterations_Improvements" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Land" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Refinance" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Prepaid_Items" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Closing_Costs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PMI_MIP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Discount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Subordinate_Financing" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Closing_Costs_Seller" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Loan_Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PMI_MIP_Financed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Other_Credits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Other_Credit" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}OtherCreditType" maxOccurs="3" minOccurs="0"/>
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
@XmlType(name = "TransactionType", propOrder = {

})
public class TransactionType {

    @XmlElement(name = "Purchase_Price")
    protected BigDecimal purchasePrice;
    @XmlElement(name = "Alterations_Improvements")
    protected BigDecimal alterationsImprovements;
    @XmlElement(name = "Land")
    protected BigDecimal land;
    @XmlElement(name = "Refinance")
    protected BigDecimal refinance;
    @XmlElement(name = "Prepaid_Items")
    protected BigDecimal prepaidItems;
    @XmlElement(name = "Closing_Costs")
    protected BigDecimal closingCosts;
    @XmlElement(name = "PMI_MIP")
    protected BigDecimal pmimip;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "Subordinate_Financing")
    protected BigDecimal subordinateFinancing;
    @XmlElement(name = "Closing_Costs_Seller")
    protected BigDecimal closingCostsSeller;
    @XmlElement(name = "Loan_Amount")
    protected BigDecimal loanAmount;
    @XmlElement(name = "PMI_MIP_Financed")
    protected BigDecimal pmimipFinanced;
    @XmlElement(name = "Other_Credits")
    protected TransactionType.OtherCredits otherCredits;

    /**
     * Gets the value of the purchasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Sets the value of the purchasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurchasePrice(BigDecimal value) {
        this.purchasePrice = value;
    }

    /**
     * Gets the value of the alterationsImprovements property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlterationsImprovements() {
        return alterationsImprovements;
    }

    /**
     * Sets the value of the alterationsImprovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlterationsImprovements(BigDecimal value) {
        this.alterationsImprovements = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLand(BigDecimal value) {
        this.land = value;
    }

    /**
     * Gets the value of the refinance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefinance() {
        return refinance;
    }

    /**
     * Sets the value of the refinance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefinance(BigDecimal value) {
        this.refinance = value;
    }

    /**
     * Gets the value of the prepaidItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepaidItems() {
        return prepaidItems;
    }

    /**
     * Sets the value of the prepaidItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepaidItems(BigDecimal value) {
        this.prepaidItems = value;
    }

    /**
     * Gets the value of the closingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClosingCosts() {
        return closingCosts;
    }

    /**
     * Sets the value of the closingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClosingCosts(BigDecimal value) {
        this.closingCosts = value;
    }

    /**
     * Gets the value of the pmimip property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPMIMIP() {
        return pmimip;
    }

    /**
     * Sets the value of the pmimip property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPMIMIP(BigDecimal value) {
        this.pmimip = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the subordinateFinancing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubordinateFinancing() {
        return subordinateFinancing;
    }

    /**
     * Sets the value of the subordinateFinancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubordinateFinancing(BigDecimal value) {
        this.subordinateFinancing = value;
    }

    /**
     * Gets the value of the closingCostsSeller property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClosingCostsSeller() {
        return closingCostsSeller;
    }

    /**
     * Sets the value of the closingCostsSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClosingCostsSeller(BigDecimal value) {
        this.closingCostsSeller = value;
    }

    /**
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmount(BigDecimal value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the pmimipFinanced property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPMIMIPFinanced() {
        return pmimipFinanced;
    }

    /**
     * Sets the value of the pmimipFinanced property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPMIMIPFinanced(BigDecimal value) {
        this.pmimipFinanced = value;
    }

    /**
     * Gets the value of the otherCredits property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType.OtherCredits }
     *     
     */
    public TransactionType.OtherCredits getOtherCredits() {
        return otherCredits;
    }

    /**
     * Sets the value of the otherCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType.OtherCredits }
     *     
     */
    public void setOtherCredits(TransactionType.OtherCredits value) {
        this.otherCredits = value;
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
     *         &lt;element name="Other_Credit" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}OtherCreditType" maxOccurs="3" minOccurs="0"/>
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
        "otherCredit"
    })
    public static class OtherCredits {

        @XmlElement(name = "Other_Credit")
        protected List<OtherCreditType> otherCredit;

        /**
         * Gets the value of the otherCredit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherCredit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherCredit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherCreditType }
         * 
         * 
         */
        public List<OtherCreditType> getOtherCredit() {
            if (otherCredit == null) {
                otherCredit = new ArrayList<OtherCreditType>();
            }
            return this.otherCredit;
        }

    }

}
