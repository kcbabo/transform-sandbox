
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BorrowerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorrowerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Title" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="First_Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Middle_Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Last_Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SSN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Phone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;pattern value="[0-1]?[0-9]/[0-3]?[0-9]/[12][0-9][0-9][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Years_School" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Marital_Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Not_Specified"/>
 *               &lt;enumeration value="Married"/>
 *               &lt;enumeration value="Unmarried"/>
 *               &lt;enumeration value="Separated"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Dependents" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Dependents_Ages" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Addresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Address" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}AddressType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Employment_Information" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Years_In_Profession" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;fractionDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Employment" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}EmploymentType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Income" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}IncomeType" minOccurs="0"/>
 *         &lt;element name="Declarations" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}DeclarationsType" minOccurs="0"/>
 *         &lt;element name="Government_Monitoring" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}GovernmentMonitoringType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="Borrower_Type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Borrower"/>
 *             &lt;enumeration value="Co_Borrower"/>
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
@XmlType(name = "BorrowerType", propOrder = {

})
public class BorrowerType {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "First_Name")
    protected String firstName;
    @XmlElement(name = "Middle_Name")
    protected String middleName;
    @XmlElement(name = "Last_Name")
    protected String lastName;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "DOB")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dob;
    @XmlElement(name = "Years_School")
    protected BigDecimal yearsSchool;
    @XmlElement(name = "Marital_Status")
    protected String maritalStatus;
    @XmlElement(name = "Dependents")
    protected BigInteger dependents;
    @XmlElement(name = "Dependents_Ages")
    protected String dependentsAges;
    @XmlElement(name = "Addresses")
    protected BorrowerType.Addresses addresses;
    @XmlElement(name = "Employment_Information")
    protected BorrowerType.EmploymentInformation employmentInformation;
    @XmlElement(name = "Income")
    protected IncomeType income;
    @XmlElement(name = "Declarations")
    protected DeclarationsType declarations;
    @XmlElement(name = "Government_Monitoring")
    protected GovernmentMonitoringType governmentMonitoring;
    @XmlAttribute(name = "Borrower_Type", required = true)
    protected String borrowerType;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOB(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the yearsSchool property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYearsSchool() {
        return yearsSchool;
    }

    /**
     * Sets the value of the yearsSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYearsSchool(BigDecimal value) {
        this.yearsSchool = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the dependents property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDependents() {
        return dependents;
    }

    /**
     * Sets the value of the dependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDependents(BigInteger value) {
        this.dependents = value;
    }

    /**
     * Gets the value of the dependentsAges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentsAges() {
        return dependentsAges;
    }

    /**
     * Sets the value of the dependentsAges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentsAges(String value) {
        this.dependentsAges = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerType.Addresses }
     *     
     */
    public BorrowerType.Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerType.Addresses }
     *     
     */
    public void setAddresses(BorrowerType.Addresses value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the employmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowerType.EmploymentInformation }
     *     
     */
    public BorrowerType.EmploymentInformation getEmploymentInformation() {
        return employmentInformation;
    }

    /**
     * Sets the value of the employmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowerType.EmploymentInformation }
     *     
     */
    public void setEmploymentInformation(BorrowerType.EmploymentInformation value) {
        this.employmentInformation = value;
    }

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeType }
     *     
     */
    public IncomeType getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeType }
     *     
     */
    public void setIncome(IncomeType value) {
        this.income = value;
    }

    /**
     * Gets the value of the declarations property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationsType }
     *     
     */
    public DeclarationsType getDeclarations() {
        return declarations;
    }

    /**
     * Sets the value of the declarations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationsType }
     *     
     */
    public void setDeclarations(DeclarationsType value) {
        this.declarations = value;
    }

    /**
     * Gets the value of the governmentMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentMonitoringType }
     *     
     */
    public GovernmentMonitoringType getGovernmentMonitoring() {
        return governmentMonitoring;
    }

    /**
     * Sets the value of the governmentMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentMonitoringType }
     *     
     */
    public void setGovernmentMonitoring(GovernmentMonitoringType value) {
        this.governmentMonitoring = value;
    }

    /**
     * Gets the value of the borrowerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowerType() {
        return borrowerType;
    }

    /**
     * Sets the value of the borrowerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowerType(String value) {
        this.borrowerType = value;
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
     *         &lt;element name="Address" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}AddressType" maxOccurs="3" minOccurs="0"/>
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
        "address"
    })
    public static class Addresses {

        @XmlElement(name = "Address")
        protected List<AddressType> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddressType }
         * 
         * 
         */
        public List<AddressType> getAddress() {
            if (address == null) {
                address = new ArrayList<AddressType>();
            }
            return this.address;
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
     *         &lt;element name="Years_In_Profession" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;fractionDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Employment" type="{http://jboss.com/demo/products/soa-p/5.2/Application.xsd}EmploymentType" maxOccurs="3" minOccurs="0"/>
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
        "yearsInProfession",
        "employment"
    })
    public static class EmploymentInformation {

        @XmlElement(name = "Years_In_Profession")
        protected BigDecimal yearsInProfession;
        @XmlElement(name = "Employment")
        protected List<EmploymentType> employment;

        /**
         * Gets the value of the yearsInProfession property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getYearsInProfession() {
            return yearsInProfession;
        }

        /**
         * Sets the value of the yearsInProfession property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setYearsInProfession(BigDecimal value) {
            this.yearsInProfession = value;
        }

        /**
         * Gets the value of the employment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmploymentType }
         * 
         * 
         */
        public List<EmploymentType> getEmployment() {
            if (employment == null) {
                employment = new ArrayList<EmploymentType>();
            }
            return this.employment;
        }

    }

}
