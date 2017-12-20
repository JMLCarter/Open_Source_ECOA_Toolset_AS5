//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:12 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step5cDeployment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines an OS executable, offering memory (and possibly also temporal)
 * protection
 * 
 * 
 * <p>
 * Java class for ProtectionDomain complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ProtectionDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="executeOn">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="computingNode" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
 *                 &lt;attribute name="computingPlatform" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="deployedModuleInstance" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="componentName" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
 *                   &lt;attribute name="moduleInstanceName" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
 *                   &lt;attribute name="modulePriority" use="required" type="{http://www.ecoa.technology/deployment-1.0}ModulePriority" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="deployedTriggerInstance" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="componentName" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
 *                   &lt;attribute name="triggerInstanceName" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
 *                   &lt;attribute name="triggerPriority" use="required" type="{http://www.ecoa.technology/deployment-1.0}ModulePriority" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionDomain", propOrder = { "executeOn", "deployedModuleInstancesAndDeployedTriggerInstances" })
public class ProtectionDomain {

	@XmlElement(required = true)
	protected ProtectionDomain.ExecuteOn executeOn;
	@XmlElements({ @XmlElement(name = "deployedModuleInstance", type = ProtectionDomain.DeployedModuleInstance.class), @XmlElement(name = "deployedTriggerInstance", type = ProtectionDomain.DeployedTriggerInstance.class) })
	protected List<Object> deployedModuleInstancesAndDeployedTriggerInstances;
	@XmlAttribute(name = "name", required = true)
	protected String name;

	/**
	 * Gets the value of the executeOn property.
	 * 
	 * @return possible object is {@link ProtectionDomain.ExecuteOn }
	 * 
	 */
	public ProtectionDomain.ExecuteOn getExecuteOn() {
		return executeOn;
	}

	/**
	 * Sets the value of the executeOn property.
	 * 
	 * @param value
	 *            allowed object is {@link ProtectionDomain.ExecuteOn }
	 * 
	 */
	public void setExecuteOn(ProtectionDomain.ExecuteOn value) {
		this.executeOn = value;
	}

	/**
	 * Gets the value of the deployedModuleInstancesAndDeployedTriggerInstances
	 * property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the
	 * deployedModuleInstancesAndDeployedTriggerInstances property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDeployedModuleInstancesAndDeployedTriggerInstances().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ProtectionDomain.DeployedModuleInstance }
	 * {@link ProtectionDomain.DeployedTriggerInstance }
	 * 
	 * 
	 */
	public List<Object> getDeployedModuleInstancesAndDeployedTriggerInstances() {
		if (deployedModuleInstancesAndDeployedTriggerInstances == null) {
			deployedModuleInstancesAndDeployedTriggerInstances = new ArrayList<Object>();
		}
		return this.deployedModuleInstancesAndDeployedTriggerInstances;
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
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;attribute name="componentName" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
	 *       &lt;attribute name="moduleInstanceName" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
	 *       &lt;attribute name="modulePriority" use="required" type="{http://www.ecoa.technology/deployment-1.0}ModulePriority" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class DeployedModuleInstance {

		@XmlAttribute(name = "componentName", required = true)
		protected String componentName;
		@XmlAttribute(name = "moduleInstanceName", required = true)
		protected String moduleInstanceName;
		@XmlAttribute(name = "modulePriority", required = true)
		protected BigDecimal modulePriority;

		/**
		 * Gets the value of the componentName property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getComponentName() {
			return componentName;
		}

		/**
		 * Sets the value of the componentName property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setComponentName(String value) {
			this.componentName = value;
		}

		/**
		 * Gets the value of the moduleInstanceName property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getModuleInstanceName() {
			return moduleInstanceName;
		}

		/**
		 * Sets the value of the moduleInstanceName property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setModuleInstanceName(String value) {
			this.moduleInstanceName = value;
		}

		/**
		 * Gets the value of the modulePriority property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getModulePriority() {
			return modulePriority;
		}

		/**
		 * Sets the value of the modulePriority property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setModulePriority(BigDecimal value) {
			this.modulePriority = value;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;attribute name="componentName" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
	 *       &lt;attribute name="triggerInstanceName" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
	 *       &lt;attribute name="triggerPriority" use="required" type="{http://www.ecoa.technology/deployment-1.0}ModulePriority" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class DeployedTriggerInstance {

		@XmlAttribute(name = "componentName", required = true)
		protected String componentName;
		@XmlAttribute(name = "triggerInstanceName", required = true)
		protected String triggerInstanceName;
		@XmlAttribute(name = "triggerPriority", required = true)
		protected BigDecimal triggerPriority;

		/**
		 * Gets the value of the componentName property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getComponentName() {
			return componentName;
		}

		/**
		 * Sets the value of the componentName property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setComponentName(String value) {
			this.componentName = value;
		}

		/**
		 * Gets the value of the triggerInstanceName property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTriggerInstanceName() {
			return triggerInstanceName;
		}

		/**
		 * Sets the value of the triggerInstanceName property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTriggerInstanceName(String value) {
			this.triggerInstanceName = value;
		}

		/**
		 * Gets the value of the triggerPriority property.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getTriggerPriority() {
			return triggerPriority;
		}

		/**
		 * Sets the value of the triggerPriority property.
		 * 
		 * @param value
		 *            allowed object is {@link BigDecimal }
		 * 
		 */
		public void setTriggerPriority(BigDecimal value) {
			this.triggerPriority = value;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;attribute name="computingNode" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
	 *       &lt;attribute name="computingPlatform" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class ExecuteOn {

		@XmlAttribute(name = "computingNode", required = true)
		protected String computingNode;
		@XmlAttribute(name = "computingPlatform")
		protected String computingPlatform;

		/**
		 * Gets the value of the computingNode property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getComputingNode() {
			return computingNode;
		}

		/**
		 * Sets the value of the computingNode property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setComputingNode(String value) {
			this.computingNode = value;
		}

		/**
		 * Gets the value of the computingPlatform property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getComputingPlatform() {
			return computingPlatform;
		}

		/**
		 * Sets the value of the computingPlatform property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setComputingPlatform(String value) {
			this.computingPlatform = value;
		}

	}

}