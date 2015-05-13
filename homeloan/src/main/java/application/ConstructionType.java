
package application;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstructionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Year_Lot_Acquired" minOccurs="0">
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
 *         &lt;element name="Present_Value_Of_Lot" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Cost_Of_Improvements" minOccurs="0">
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
@XmlType(name = "ConstructionType", propOrder = {

})
public class ConstructionType {

    @XmlElement(name = "Year_Lot_Acquired")
    protected BigInteger yearLotAcquired;
    @XmlElement(name = "Original_Cost")
    protected BigDecimal originalCost;
    @XmlElement(name = "Amount_Existing_Liens")
    protected BigDecimal amountExistingLiens;
    @XmlElement(name = "Present_Value_Of_Lot")
    protected BigDecimal presentValueOfLot;
    @XmlElement(name = "Cost_Of_Improvements")
    protected BigDecimal costOfImprovements;

    /**
     * Gets the value of the yearLotAcquired property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearLotAcquired() {
        return yearLotAcquired;
    }

    /**
     * Sets the value of the yearLotAcquired property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearLotAcquired(BigInteger value) {
        this.yearLotAcquired = value;
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
     * Gets the value of the presentValueOfLot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPresentValueOfLot() {
        return presentValueOfLot;
    }

    /**
     * Sets the value of the presentValueOfLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPresentValueOfLot(BigDecimal value) {
        this.presentValueOfLot = value;
    }

    /**
     * Gets the value of the costOfImprovements property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostOfImprovements() {
        return costOfImprovements;
    }

    /**
     * Sets the value of the costOfImprovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostOfImprovements(BigDecimal value) {
        this.costOfImprovements = value;
    }

}
