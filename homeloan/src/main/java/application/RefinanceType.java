
package application;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefinanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefinanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Year_Acquired" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Original_Cost" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Amount_Existing_Liens" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Purpose" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Improvement_Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="None"/>
 *               &lt;enumeration value="Made"/>
 *               &lt;enumeration value="To_Be_Made"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Improvements" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Improvements_Cost" minOccurs="0">
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
@XmlType(name = "RefinanceType", propOrder = {

})
public class RefinanceType {

    @XmlElement(name = "Year_Acquired")
    protected BigInteger yearAcquired;
    @XmlElement(name = "Original_Cost")
    protected BigDecimal originalCost;
    @XmlElement(name = "Amount_Existing_Liens")
    protected BigDecimal amountExistingLiens;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "Improvement_Type")
    protected String improvementType;
    @XmlElement(name = "Improvements")
    protected String improvements;
    @XmlElement(name = "Improvements_Cost")
    protected BigDecimal improvementsCost;

    /**
     * Gets the value of the yearAcquired property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearAcquired() {
        return yearAcquired;
    }

    /**
     * Sets the value of the yearAcquired property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearAcquired(BigInteger value) {
        this.yearAcquired = value;
    }

    /**
     * Gets the value of the originalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    /**
     * Sets the value of the originalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalCost(BigDecimal value) {
        this.originalCost = value;
    }

    /**
     * Gets the value of the amountExistingLiens property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountExistingLiens() {
        return amountExistingLiens;
    }

    /**
     * Sets the value of the amountExistingLiens property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountExistingLiens(BigDecimal value) {
        this.amountExistingLiens = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the improvementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImprovementType() {
        return improvementType;
    }

    /**
     * Sets the value of the improvementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImprovementType(String value) {
        this.improvementType = value;
    }

    /**
     * Gets the value of the improvements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImprovements() {
        return improvements;
    }

    /**
     * Sets the value of the improvements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImprovements(String value) {
        this.improvements = value;
    }

    /**
     * Gets the value of the improvementsCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImprovementsCost() {
        return improvementsCost;
    }

    /**
     * Sets the value of the improvementsCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImprovementsCost(BigDecimal value) {
        this.improvementsCost = value;
    }

}
