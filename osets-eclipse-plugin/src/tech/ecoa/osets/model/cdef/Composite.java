//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 02:26:48 PM IST 
//

package tech.ecoa.osets.model.cdef;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for Composite complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Composite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/opencsa/sca/200912}CommonExtensionBase">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="service" type="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Service"/>
 *           &lt;element name="property" type="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Property"/>
 *           &lt;element name="component" type="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Component"/>
 *           &lt;element name="reference" type="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Reference"/>
 *           &lt;element name="wire" type="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Wire"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="targetNamespace" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Composite", propOrder = { "serviceOrPropertyOrComponent" })
public class Composite extends CommonExtensionBase {

	@XmlElements({ @XmlElement(name = "service", type = Service.class), @XmlElement(name = "property", type = Property.class), @XmlElement(name = "component", type = Component.class), @XmlElement(name = "reference", type = Reference.class), @XmlElement(name = "wire", type = Wire.class) })
	protected List<Object> serviceOrPropertyOrComponent;
	@XmlAttribute(name = "name", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String name;
	@XmlAttribute(name = "targetNamespace", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String targetNamespace;

	/**
	 * Gets the value of the serviceOrPropertyOrComponent property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the serviceOrPropertyOrComponent property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getServiceOrPropertyOrComponent().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Service }
	 * {@link Property } {@link Component } {@link Reference } {@link Wire }
	 * 
	 * 
	 */
	public List<Object> getServiceOrPropertyOrComponent() {
		if (serviceOrPropertyOrComponent == null) {
			serviceOrPropertyOrComponent = new ArrayList<Object>();
		}
		return this.serviceOrPropertyOrComponent;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the targetNamespace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * Sets the value of the targetNamespace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTargetNamespace(String value) {
		this.targetNamespace = value;
	}

}
