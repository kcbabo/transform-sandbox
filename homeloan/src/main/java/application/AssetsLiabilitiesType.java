
package application;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetsLiabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetsLiabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Completed_Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Jointly"/>
 *               &lt;enumeration value="Not_Jointly"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Real_Estate_Owned" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Retirement_Fund" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Businesses_Owned" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Cash_Deposits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Cash_Deposit" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}CashDepositType" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Checking_Savings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Account" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}CheckingSavingsAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Stocks_Bonds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Account" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}StocksBondsAccountType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Life_Insurance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="Net_Cash_Value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Face_Amount" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Automobiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Automobile" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}AutomobileType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Other_Assets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Asset" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}AssetType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Liabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Liability" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}LiabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Alimony_Child_Support" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="Owed_To" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="0"/>
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Monthly_Payment" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Months_Left" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Job_Related_Expenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Job_Related_Expense" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}JobRelatedExpenseType" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Real_Estate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Property" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}RealEstatePropertyType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Credit_Previously_Received" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Credit_Received" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}CreditReceivedType" maxOccurs="3" minOccurs="0"/>
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
@XmlType(name = "AssetsLiabilitiesType", propOrder = {

})
public class AssetsLiabilitiesType {

    @XmlElement(name = "Completed_Type")
    protected String completedType;
    @XmlElement(name = "Real_Estate_Owned")
    protected BigDecimal realEstateOwned;
    @XmlElement(name = "Retirement_Fund")
    protected BigDecimal retirementFund;
    @XmlElement(name = "Businesses_Owned")
    protected BigDecimal businessesOwned;
    @XmlElement(name = "Cash_Deposits")
    protected AssetsLiabilitiesType.CashDeposits cashDeposits;
    @XmlElement(name = "Checking_Savings")
    protected AssetsLiabilitiesType.CheckingSavings checkingSavings;
    @XmlElement(name = "Stocks_Bonds")
    protected AssetsLiabilitiesType.StocksBonds stocksBonds;
    @XmlElement(name = "Life_Insurance")
    protected AssetsLiabilitiesType.LifeInsurance lifeInsurance;
    @XmlElement(name = "Automobiles")
    protected AssetsLiabilitiesType.Automobiles automobiles;
    @XmlElement(name = "Other_Assets")
    protected AssetsLiabilitiesType.OtherAssets otherAssets;
    @XmlElement(name = "Liabilities")
    protected AssetsLiabilitiesType.Liabilities liabilities;
    @XmlElement(name = "Alimony_Child_Support")
    protected AssetsLiabilitiesType.AlimonyChildSupport alimonyChildSupport;
    @XmlElement(name = "Job_Related_Expenses")
    protected AssetsLiabilitiesType.JobRelatedExpenses jobRelatedExpenses;
    @XmlElement(name = "Real_Estate")
    protected AssetsLiabilitiesType.RealEstate realEstate;
    @XmlElement(name = "Credit_Previously_Received")
    protected AssetsLiabilitiesType.CreditPreviouslyReceived creditPreviouslyReceived;

    /**
     * Gets the value of the completedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedType() {
        return completedType;
    }

    /**
     * Sets the value of the completedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedType(String value) {
        this.completedType = value;
    }

    /**
     * Gets the value of the realEstateOwned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRealEstateOwned() {
        return realEstateOwned;
    }

    /**
     * Sets the value of the realEstateOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRealEstateOwned(BigDecimal value) {
        this.realEstateOwned = value;
    }

    /**
     * Gets the value of the retirementFund property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRetirementFund() {
        return retirementFund;
    }

    /**
     * Sets the value of the retirementFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRetirementFund(BigDecimal value) {
        this.retirementFund = value;
    }

    /**
     * Gets the value of the businessesOwned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBusinessesOwned() {
        return businessesOwned;
    }

    /**
     * Sets the value of the businessesOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBusinessesOwned(BigDecimal value) {
        this.businessesOwned = value;
    }

    /**
     * Gets the value of the cashDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.CashDeposits }
     *     
     */
    public AssetsLiabilitiesType.CashDeposits getCashDeposits() {
        return cashDeposits;
    }

    /**
     * Sets the value of the cashDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.CashDeposits }
     *     
     */
    public void setCashDeposits(AssetsLiabilitiesType.CashDeposits value) {
        this.cashDeposits = value;
    }

    /**
     * Gets the value of the checkingSavings property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.CheckingSavings }
     *     
     */
    public AssetsLiabilitiesType.CheckingSavings getCheckingSavings() {
        return checkingSavings;
    }

    /**
     * Sets the value of the checkingSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.CheckingSavings }
     *     
     */
    public void setCheckingSavings(AssetsLiabilitiesType.CheckingSavings value) {
        this.checkingSavings = value;
    }

    /**
     * Gets the value of the stocksBonds property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.StocksBonds }
     *     
     */
    public AssetsLiabilitiesType.StocksBonds getStocksBonds() {
        return stocksBonds;
    }

    /**
     * Sets the value of the stocksBonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.StocksBonds }
     *     
     */
    public void setStocksBonds(AssetsLiabilitiesType.StocksBonds value) {
        this.stocksBonds = value;
    }

    /**
     * Gets the value of the lifeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.LifeInsurance }
     *     
     */
    public AssetsLiabilitiesType.LifeInsurance getLifeInsurance() {
        return lifeInsurance;
    }

    /**
     * Sets the value of the lifeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.LifeInsurance }
     *     
     */
    public void setLifeInsurance(AssetsLiabilitiesType.LifeInsurance value) {
        this.lifeInsurance = value;
    }

    /**
     * Gets the value of the automobiles property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.Automobiles }
     *     
     */
    public AssetsLiabilitiesType.Automobiles getAutomobiles() {
        return automobiles;
    }

    /**
     * Sets the value of the automobiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.Automobiles }
     *     
     */
    public void setAutomobiles(AssetsLiabilitiesType.Automobiles value) {
        this.automobiles = value;
    }

    /**
     * Gets the value of the otherAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.OtherAssets }
     *     
     */
    public AssetsLiabilitiesType.OtherAssets getOtherAssets() {
        return otherAssets;
    }

    /**
     * Sets the value of the otherAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.OtherAssets }
     *     
     */
    public void setOtherAssets(AssetsLiabilitiesType.OtherAssets value) {
        this.otherAssets = value;
    }

    /**
     * Gets the value of the liabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.Liabilities }
     *     
     */
    public AssetsLiabilitiesType.Liabilities getLiabilities() {
        return liabilities;
    }

    /**
     * Sets the value of the liabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.Liabilities }
     *     
     */
    public void setLiabilities(AssetsLiabilitiesType.Liabilities value) {
        this.liabilities = value;
    }

    /**
     * Gets the value of the alimonyChildSupport property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.AlimonyChildSupport }
     *     
     */
    public AssetsLiabilitiesType.AlimonyChildSupport getAlimonyChildSupport() {
        return alimonyChildSupport;
    }

    /**
     * Sets the value of the alimonyChildSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.AlimonyChildSupport }
     *     
     */
    public void setAlimonyChildSupport(AssetsLiabilitiesType.AlimonyChildSupport value) {
        this.alimonyChildSupport = value;
    }

    /**
     * Gets the value of the jobRelatedExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.JobRelatedExpenses }
     *     
     */
    public AssetsLiabilitiesType.JobRelatedExpenses getJobRelatedExpenses() {
        return jobRelatedExpenses;
    }

    /**
     * Sets the value of the jobRelatedExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.JobRelatedExpenses }
     *     
     */
    public void setJobRelatedExpenses(AssetsLiabilitiesType.JobRelatedExpenses value) {
        this.jobRelatedExpenses = value;
    }

    /**
     * Gets the value of the realEstate property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.RealEstate }
     *     
     */
    public AssetsLiabilitiesType.RealEstate getRealEstate() {
        return realEstate;
    }

    /**
     * Sets the value of the realEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.RealEstate }
     *     
     */
    public void setRealEstate(AssetsLiabilitiesType.RealEstate value) {
        this.realEstate = value;
    }

    /**
     * Gets the value of the creditPreviouslyReceived property.
     * 
     * @return
     *     possible object is
     *     {@link AssetsLiabilitiesType.CreditPreviouslyReceived }
     *     
     */
    public AssetsLiabilitiesType.CreditPreviouslyReceived getCreditPreviouslyReceived() {
        return creditPreviouslyReceived;
    }

    /**
     * Sets the value of the creditPreviouslyReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsLiabilitiesType.CreditPreviouslyReceived }
     *     
     */
    public void setCreditPreviouslyReceived(AssetsLiabilitiesType.CreditPreviouslyReceived value) {
        this.creditPreviouslyReceived = value;
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
     *       &lt;all>
     *         &lt;element name="Owed_To" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="0"/>
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Monthly_Payment" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Months_Left" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
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
    @XmlType(name = "", propOrder = {

    })
    public static class AlimonyChildSupport {

        @XmlElement(name = "Owed_To")
        protected String owedTo;
        @XmlElement(name = "Monthly_Payment")
        protected BigDecimal monthlyPayment;
        @XmlElement(name = "Months_Left")
        protected BigDecimal monthsLeft;

        /**
         * Gets the value of the owedTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwedTo() {
            return owedTo;
        }

        /**
         * Sets the value of the owedTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwedTo(String value) {
            this.owedTo = value;
        }

        /**
         * Gets the value of the monthlyPayment property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMonthlyPayment() {
            return monthlyPayment;
        }

        /**
         * Sets the value of the monthlyPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMonthlyPayment(BigDecimal value) {
            this.monthlyPayment = value;
        }

        /**
         * Gets the value of the monthsLeft property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMonthsLeft() {
            return monthsLeft;
        }

        /**
         * Sets the value of the monthsLeft property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMonthsLeft(BigDecimal value) {
            this.monthsLeft = value;
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
     *       &lt;sequence>
     *         &lt;element name="Automobile" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}AutomobileType" maxOccurs="3" minOccurs="0"/>
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
        "automobile"
    })
    public static class Automobiles {

        @XmlElement(name = "Automobile")
        protected List<AutomobileType> automobile;

        /**
         * Gets the value of the automobile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the automobile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutomobile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AutomobileType }
         * 
         * 
         */
        public List<AutomobileType> getAutomobile() {
            if (automobile == null) {
                automobile = new ArrayList<AutomobileType>();
            }
            return this.automobile;
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
     *       &lt;sequence>
     *         &lt;element name="Cash_Deposit" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}CashDepositType" maxOccurs="2" minOccurs="0"/>
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
        "cashDeposit"
    })
    public static class CashDeposits {

        @XmlElement(name = "Cash_Deposit")
        protected List<CashDepositType> cashDeposit;

        /**
         * Gets the value of the cashDeposit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cashDeposit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCashDeposit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CashDepositType }
         * 
         * 
         */
        public List<CashDepositType> getCashDeposit() {
            if (cashDeposit == null) {
                cashDeposit = new ArrayList<CashDepositType>();
            }
            return this.cashDeposit;
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
     *       &lt;sequence>
     *         &lt;element name="Account" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}CheckingSavingsAccountType" maxOccurs="unbounded" minOccurs="0"/>
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
        "account"
    })
    public static class CheckingSavings {

        @XmlElement(name = "Account")
        protected List<CheckingSavingsAccountType> account;

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CheckingSavingsAccountType }
         * 
         * 
         */
        public List<CheckingSavingsAccountType> getAccount() {
            if (account == null) {
                account = new ArrayList<CheckingSavingsAccountType>();
            }
            return this.account;
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
     *       &lt;sequence>
     *         &lt;element name="Credit_Received" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}CreditReceivedType" maxOccurs="3" minOccurs="0"/>
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
        "creditReceived"
    })
    public static class CreditPreviouslyReceived {

        @XmlElement(name = "Credit_Received")
        protected List<CreditReceivedType> creditReceived;

        /**
         * Gets the value of the creditReceived property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creditReceived property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreditReceived().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CreditReceivedType }
         * 
         * 
         */
        public List<CreditReceivedType> getCreditReceived() {
            if (creditReceived == null) {
                creditReceived = new ArrayList<CreditReceivedType>();
            }
            return this.creditReceived;
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
     *       &lt;sequence>
     *         &lt;element name="Job_Related_Expense" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}JobRelatedExpenseType" maxOccurs="2" minOccurs="0"/>
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
        "jobRelatedExpense"
    })
    public static class JobRelatedExpenses {

        @XmlElement(name = "Job_Related_Expense")
        protected List<JobRelatedExpenseType> jobRelatedExpense;

        /**
         * Gets the value of the jobRelatedExpense property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jobRelatedExpense property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJobRelatedExpense().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JobRelatedExpenseType }
         * 
         * 
         */
        public List<JobRelatedExpenseType> getJobRelatedExpense() {
            if (jobRelatedExpense == null) {
                jobRelatedExpense = new ArrayList<JobRelatedExpenseType>();
            }
            return this.jobRelatedExpense;
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
     *       &lt;sequence>
     *         &lt;element name="Liability" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}LiabilityType" maxOccurs="unbounded" minOccurs="0"/>
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
        "liability"
    })
    public static class Liabilities {

        @XmlElement(name = "Liability")
        protected List<LiabilityType> liability;

        /**
         * Gets the value of the liability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the liability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLiability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LiabilityType }
         * 
         * 
         */
        public List<LiabilityType> getLiability() {
            if (liability == null) {
                liability = new ArrayList<LiabilityType>();
            }
            return this.liability;
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
     *       &lt;all>
     *         &lt;element name="Net_Cash_Value" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Face_Amount" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
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
    @XmlType(name = "", propOrder = {

    })
    public static class LifeInsurance {

        @XmlElement(name = "Net_Cash_Value")
        protected BigDecimal netCashValue;
        @XmlElement(name = "Face_Amount")
        protected BigDecimal faceAmount;

        /**
         * Gets the value of the netCashValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNetCashValue() {
            return netCashValue;
        }

        /**
         * Sets the value of the netCashValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNetCashValue(BigDecimal value) {
            this.netCashValue = value;
        }

        /**
         * Gets the value of the faceAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFaceAmount() {
            return faceAmount;
        }

        /**
         * Sets the value of the faceAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFaceAmount(BigDecimal value) {
            this.faceAmount = value;
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
     *       &lt;sequence>
     *         &lt;element name="Asset" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}AssetType" maxOccurs="3" minOccurs="0"/>
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
        "asset"
    })
    public static class OtherAssets {

        @XmlElement(name = "Asset")
        protected List<AssetType> asset;

        /**
         * Gets the value of the asset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAsset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssetType }
         * 
         * 
         */
        public List<AssetType> getAsset() {
            if (asset == null) {
                asset = new ArrayList<AssetType>();
            }
            return this.asset;
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
     *       &lt;sequence>
     *         &lt;element name="Property" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}RealEstatePropertyType" maxOccurs="3" minOccurs="0"/>
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
        "property"
    })
    public static class RealEstate {

        @XmlElement(name = "Property")
        protected List<RealEstatePropertyType> property;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RealEstatePropertyType }
         * 
         * 
         */
        public List<RealEstatePropertyType> getProperty() {
            if (property == null) {
                property = new ArrayList<RealEstatePropertyType>();
            }
            return this.property;
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
     *       &lt;sequence>
     *         &lt;element name="Account" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}StocksBondsAccountType" maxOccurs="3" minOccurs="0"/>
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
        "account"
    })
    public static class StocksBonds {

        @XmlElement(name = "Account")
        protected List<StocksBondsAccountType> account;

        /**
         * Gets the value of the account property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the account property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StocksBondsAccountType }
         * 
         * 
         */
        public List<StocksBondsAccountType> getAccount() {
            if (account == null) {
                account = new ArrayList<StocksBondsAccountType>();
            }
            return this.account;
        }

    }

}
