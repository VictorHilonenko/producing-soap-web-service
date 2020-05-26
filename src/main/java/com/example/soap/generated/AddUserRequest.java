package com.example.soap.generated;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "salary"
})
@XmlRootElement(name = "addUserRequest", namespace = "http://example.com/spring-boot-soap-example")
public class AddUserRequest {

    @XmlElement(namespace = "http://example.com/spring-boot-soap-example", required = true)
    protected String name;
    @XmlElement(namespace = "http://example.com/spring-boot-soap-example")
    protected double salary;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the salary property.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     */
    public void setSalary(double value) {
        this.salary = value;
    }

}
