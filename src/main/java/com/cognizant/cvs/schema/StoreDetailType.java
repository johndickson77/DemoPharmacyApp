//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.03 at 08:46:48 PM EST 
//


package com.cognizant.cvs.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workLoadScore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="storeCapacity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promiseHours" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rphdetails" type="{http://www.example.org/NewXMLSchema}RPHPDetailType" maxOccurs="unbounded"/>
 *         &lt;element name="isAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreDetailType", propOrder = {
    "storeId",
    "storeName",
    "workLoadScore",
    "storeCapacity",
    "promiseHours",
    "rphdetails",
    "isAvailable"
})
public class StoreDetailType {

    @XmlElement(required = true)
    protected String storeId;
    @XmlElement(required = true)
    protected String storeName;
    @XmlElement(required = true)
    protected String workLoadScore;
    @XmlElement(required = true)
    protected String storeCapacity;
    @XmlElement(required = true)
    protected String promiseHours;
    @XmlElement(required = true)
    protected List<RPHPDetailType> rphdetails;
    protected boolean isAvailable;

    /**
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreId(String value) {
        this.storeId = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the workLoadScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkLoadScore() {
        return workLoadScore;
    }

    /**
     * Sets the value of the workLoadScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkLoadScore(String value) {
        this.workLoadScore = value;
    }

    /**
     * Gets the value of the storeCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCapacity() {
        return storeCapacity;
    }

    /**
     * Sets the value of the storeCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCapacity(String value) {
        this.storeCapacity = value;
    }

    /**
     * Gets the value of the promiseHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromiseHours() {
        return promiseHours;
    }

    /**
     * Sets the value of the promiseHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromiseHours(String value) {
        this.promiseHours = value;
    }

    /**
     * Gets the value of the rphdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rphdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRphdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RPHPDetailType }
     * 
     * 
     */
    public List<RPHPDetailType> getRphdetails() {
        if (rphdetails == null) {
            rphdetails = new ArrayList<RPHPDetailType>();
        }
        return this.rphdetails;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     */
    public void setIsAvailable(boolean value) {
        this.isAvailable = value;
    }

}
