//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 07:36:06 AM IST 
//

package tech.ecoa.osets.model.cimp;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Describes all the information needed to integrate the software implementation
 * of an ECOA component in an ECOA system.
 * 
 * 
 * <p>
 * Java class for ComponentImplementation complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentImplementation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ecoa.technology/implementation-1.0}use" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.ecoa.technology/implementation-1.0}ServiceQoS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.ecoa.technology/implementation-1.0}ServiceQoS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="moduleType" type="{http://www.ecoa.technology/implementation-1.0}ModuleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="moduleImplementation" type="{http://www.ecoa.technology/implementation-1.0}ModuleImplementation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="moduleInstance" type="{http://www.ecoa.technology/implementation-1.0}ModuleInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="triggerInstance" type="{http://www.ecoa.technology/implementation-1.0}TriggerInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dynamicTriggerInstance" type="{http://www.ecoa.technology/implementation-1.0}DynamicTriggerInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="dataLink" type="{http://www.ecoa.technology/implementation-1.0}DataLink" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="eventLink" type="{http://www.ecoa.technology/implementation-1.0}EventLink" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="requestLink" type="{http://www.ecoa.technology/implementation-1.0}RequestLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="componentDefinition" use="required" type="{http://www.ecoa.technology/implementation-1.0}NameId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentImplementation", propOrder = { "use", "service", "reference", "moduleType", "moduleImplementation", "moduleInstance", "triggerInstance", "dynamicTriggerInstance", "dataLinkOrEventLinkOrRequestLink" })
public class ComponentImplementation {

	protected List<Use> use;
	protected List<ServiceQoS> service;
	protected List<ServiceQoS> reference;
	protected List<ModuleType> moduleType;
	protected List<ModuleImplementation> moduleImplementation;
	protected List<ModuleInstance> moduleInstance;
	protected List<TriggerInstance> triggerInstance;
	protected List<DynamicTriggerInstance> dynamicTriggerInstance;
	@XmlElements({ @XmlElement(name = "dataLink", type = DataLink.class), @XmlElement(name = "eventLink", type = EventLink.class), @XmlElement(name = "requestLink", type = RequestLink.class) })
	protected List<Object> dataLinkOrEventLinkOrRequestLink;
	@XmlAttribute(name = "componentDefinition", required = true)
	protected String componentDefinition;

	/**
	 * Gets the value of the use property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the use property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getUse().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Use }
	 * 
	 * 
	 */
	public List<Use> getUse() {
		if (use == null) {
			use = new ArrayList<Use>();
		}
		return this.use;
	}

	/**
	 * Gets the value of the service property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the service property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getService().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ServiceQoS }
	 * 
	 * 
	 */
	public List<ServiceQoS> getService() {
		if (service == null) {
			service = new ArrayList<ServiceQoS>();
		}
		return this.service;
	}

	/**
	 * Gets the value of the reference property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the reference property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReference().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ServiceQoS }
	 * 
	 * 
	 */
	public List<ServiceQoS> getReference() {
		if (reference == null) {
			reference = new ArrayList<ServiceQoS>();
		}
		return this.reference;
	}

	/**
	 * Gets the value of the moduleType property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the moduleType property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getModuleType().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ModuleType }
	 * 
	 * 
	 */
	public List<ModuleType> getModuleType() {
		if (moduleType == null) {
			moduleType = new ArrayList<ModuleType>();
		}
		return this.moduleType;
	}

	/**
	 * Gets the value of the moduleImplementation property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the moduleImplementation property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getModuleImplementation().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ModuleImplementation }
	 * 
	 * 
	 */
	public List<ModuleImplementation> getModuleImplementation() {
		if (moduleImplementation == null) {
			moduleImplementation = new ArrayList<ModuleImplementation>();
		}
		return this.moduleImplementation;
	}

	/**
	 * Gets the value of the moduleInstance property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the moduleInstance property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getModuleInstance().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ModuleInstance }
	 * 
	 * 
	 */
	public List<ModuleInstance> getModuleInstance() {
		if (moduleInstance == null) {
			moduleInstance = new ArrayList<ModuleInstance>();
		}
		return this.moduleInstance;
	}

	/**
	 * Gets the value of the triggerInstance property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the triggerInstance property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTriggerInstance().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TriggerInstance }
	 * 
	 * 
	 */
	public List<TriggerInstance> getTriggerInstance() {
		if (triggerInstance == null) {
			triggerInstance = new ArrayList<TriggerInstance>();
		}
		return this.triggerInstance;
	}

	/**
	 * Gets the value of the dynamicTriggerInstance property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dynamicTriggerInstance property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDynamicTriggerInstance().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DynamicTriggerInstance }
	 * 
	 * 
	 */
	public List<DynamicTriggerInstance> getDynamicTriggerInstance() {
		if (dynamicTriggerInstance == null) {
			dynamicTriggerInstance = new ArrayList<DynamicTriggerInstance>();
		}
		return this.dynamicTriggerInstance;
	}

	/**
	 * Gets the value of the dataLinkOrEventLinkOrRequestLink property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dataLinkOrEventLinkOrRequestLink
	 * property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDataLinkOrEventLinkOrRequestLink().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link DataLink
	 * } {@link EventLink } {@link RequestLink }
	 * 
	 * 
	 */
	public List<Object> getDataLinkOrEventLinkOrRequestLink() {
		if (dataLinkOrEventLinkOrRequestLink == null) {
			dataLinkOrEventLinkOrRequestLink = new ArrayList<Object>();
		}
		return this.dataLinkOrEventLinkOrRequestLink;
	}

	/**
	 * Gets the value of the componentDefinition property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComponentDefinition() {
		return componentDefinition;
	}

	/**
	 * Sets the value of the componentDefinition property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setComponentDefinition(String value) {
		this.componentDefinition = value;
	}

}