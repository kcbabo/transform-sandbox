
package application;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all minOccurs="0">
 *         &lt;element name="Rep_Identifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Source_Identifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Other_Income_Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Other_Liabilities_Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Agency_Case_Number" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Lender_Case_Number" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Conventional"/>
 *               &lt;enumeration value="FHA"/>
 *               &lt;enumeration value="VA"/>
 *               &lt;enumeration value="FmHA"/>
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
 *         &lt;element name="Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Interest_Rate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Number_Of_Months" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Amortization_Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Fixed_Rate"/>
 *               &lt;enumeration value="GPM"/>
 *               &lt;enumeration value="Other"/>
 *               &lt;enumeration value="ARM"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Amortization_Type_Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Property" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}PropertyType" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}PurposeType" minOccurs="0"/>
 *         &lt;element name="Borrowers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Borrower" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}BorrowerType" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="Housing_Expense" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Expense" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}ExpenseType" maxOccurs="2" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Assets_Liabilities" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}AssetsLiabilitiesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Transaction" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}TransactionType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="Application_ID" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="32"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Date_Created">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
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
@XmlType(name = "ApplicationType", propOrder = {

})
public class ApplicationType {

    @XmlElement(name = "Rep_Identifier")
    protected String repIdentifier;
    @XmlElement(name = "Source_Identifier")
    protected String sourceIdentifier;
    @XmlElement(name = "Other_Income_Included")
    protected Boolean otherIncomeIncluded;
    @XmlElement(name = "Other_Liabilities_Included")
    protected Boolean otherLiabilitiesIncluded;
    @XmlElement(name = "Agency_Case_Number")
    protected String agencyCaseNumber;
    @XmlElement(name = "Lender_Case_Number")
    protected String lenderCaseNumber;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Type_Description")
    protected String typeDescription;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Interest_Rate")
    protected BigDecimal interestRate;
    @XmlElement(name = "Number_Of_Months")
    protected BigInteger numberOfMonths;
    @XmlElement(name = "Amortization_Type")
    protected String amortizationType;
    @XmlElement(name = "Amortization_Type_Description")
    protected String amortizationTypeDescription;
    @XmlElement(name = "Property")
    protected PropertyType property;
    @XmlElement(name = "Purpose")
    protected PurposeType purpose;
    @XmlElement(name = "Borrowers")
    protected ApplicationType.Borrowers borrowers;
    @XmlElement(name = "Transaction")
    protected TransactionType transaction;
    @XmlAttribute(name = "Application_ID", required = true)
    protected String applicationID;
    @XmlAttribute(name = "Date_Created")
    protected XMLGregorianCalendar dateCreated;

    /**
     * Gets the value of the repIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepIdentifier() {
        return repIdentifier;
    }

    /**
     * Sets the value of the repIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepIdentifier(String value) {
        this.repIdentifier = value;
    }

    /**
     * Gets the value of the sourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * Sets the value of the sourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIdentifier(String value) {
        this.sourceIdentifier = value;
    }

    /**
     * Gets the value of the otherIncomeIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherIncomeIncluded() {
        return otherIncomeIncluded;
    }

    /**
     * Sets the value of the otherIncomeIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherIncomeIncluded(Boolean value) {
        this.otherIncomeIncluded = value;
    }

    /**
     * Gets the value of the otherLiabilitiesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherLiabilitiesIncluded() {
        return otherLiabilitiesIncluded;
    }

    /**
     * Sets the value of the otherLiabilitiesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherLiabilitiesIncluded(Boolean value) {
        this.otherLiabilitiesIncluded = value;
    }

    /**
     * Gets the value of the agencyCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCaseNumber() {
        return agencyCaseNumber;
    }

    /**
     * Sets the value of the agencyCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCaseNumber(String value) {
        this.agencyCaseNumber = value;
    }

    /**
     * Gets the value of the lenderCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenderCaseNumber() {
        return lenderCaseNumber;
    }

    /**
     * Sets the value of the lenderCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenderCaseNumber(String value) {
        this.lenderCaseNumber = value;
    }

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestRate(BigDecimal value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the numberOfMonths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMonths() {
        return numberOfMonths;
    }

    /**
     * Sets the value of the numberOfMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMonths(BigInteger value) {
        this.numberOfMonths = value;
    }

    /**
     * Gets the value of the amortizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmortizationType() {
        return amortizationType;
    }

    /**
     * Sets the value of the amortizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmortizationType(String value) {
        this.amortizationType = value;
    }

    /**
     * Gets the value of the amortizationTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmortizationTypeDescription() {
        return amortizationTypeDescription;
    }

    /**
     * Sets the value of the amortizationTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmortizationTypeDescription(String value) {
        this.amortizationTypeDescription = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setProperty(PropertyType value) {
        this.property = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeType }
     *     
     */
    public PurposeType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeType }
     *     
     */
    public void setPurpose(PurposeType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the borrowers property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType.Borrowers }
     *     
     */
    public ApplicationType.Borrowers getBorrowers() {
        return borrowers;
    }

    /**
     * Sets the value of the borrowers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType.Borrowers }
     *     
     */
    public void setBorrowers(ApplicationType.Borrowers value) {
        this.borrowers = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransaction(TransactionType value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the applicationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationID() {
        return applicationID;
    }

    /**
     * Sets the value of the applicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationID(String value) {
        this.applicationID = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
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
     *         &lt;element name="Borrower" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}BorrowerType" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="Housing_Expense" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Expense" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}ExpenseType" maxOccurs="2" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Assets_Liabilities" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}AssetsLiabilitiesType" minOccurs="0"/>
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
        "borrower",
        "housingExpense",
        "assetsLiabilities"
    })
    public static class Borrowers {

        @XmlElement(name = "Borrower")
        protected List<BorrowerType> borrower;
        @XmlElement(name = "Housing_Expense")
        protected ApplicationType.Borrowers.HousingExpense housingExpense;
        @XmlElement(name = "Assets_Liabilities")
        protected AssetsLiabilitiesType assetsLiabilities;

        /**
         * Gets the value of the borrower property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the borrower property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBorrower().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BorrowerType }
         * 
         * 
         */
        public List<BorrowerType> getBorrower() {
            if (borrower == null) {
                borrower = new ArrayList<BorrowerType>();
            }
            return this.borrower;
        }

        /**
         * Gets the value of the housingExpense property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationType.Borrowers.HousingExpense }
         *     
         */
        public ApplicationType.Borrowers.HousingExpense getHousingExpense() {
            return housingExpense;
        }

        /**
         * Sets the value of the housingExpense property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationType.Borrowers.HousingExpense }
         *     
         */
        public void setHousingExpense(ApplicationType.Borrowers.HousingExpense value) {
            this.housingExpense = value;
        }

        /**
         * Gets the value of the assetsLiabilities property.
         * 
         * @return
         *     possible object is
         *     {@link AssetsLiabilitiesType }
         *     
         */
        public AssetsLiabilitiesType getAssetsLiabilities() {
            return assetsLiabilities;
        }

        /**
         * Sets the value of the assetsLiabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AssetsLiabilitiesType }
         *     
         */
        public void setAssetsLiabilities(AssetsLiabilitiesType value) {
            this.assetsLiabilities = value;
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
         *         &lt;element name="Expense" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}ExpenseType" maxOccurs="2" minOccurs="0"/>
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
            "expense"
        })
        public static class HousingExpense {

            @XmlElement(name = "Expense")
            protected List<ExpenseType> expense;

            /**
             * Gets the value of the expense property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the expense property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExpense().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExpenseType }
             * 
             * 
             */
            public List<ExpenseType> getExpense() {
                if (expense == null) {
                    expense = new ArrayList<ExpenseType>();
                }
                return this.expense;
            }

        }

    }

}
