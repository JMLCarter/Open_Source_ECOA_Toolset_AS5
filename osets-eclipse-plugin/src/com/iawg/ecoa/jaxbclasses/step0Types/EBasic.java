//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:00 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step0Types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for E_basic.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="E_basic">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="boolean8"/>
 *     &lt;enumeration value="int8"/>
 *     &lt;enumeration value="int16"/>
 *     &lt;enumeration value="int32"/>
 *     &lt;enumeration value="int64"/>
 *     &lt;enumeration value="uint8"/>
 *     &lt;enumeration value="uint16"/>
 *     &lt;enumeration value="uint32"/>
 *     &lt;enumeration value="uint64"/>
 *     &lt;enumeration value="char8"/>
 *     &lt;enumeration value="byte"/>
 *     &lt;enumeration value="float32"/>
 *     &lt;enumeration value="double64"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "E_basic")
@XmlEnum
public enum EBasic {

	@XmlEnumValue("boolean8")
	BOOLEAN_8("boolean8"), @XmlEnumValue("int8")
	INT_8("int8"), @XmlEnumValue("int16")
	INT_16("int16"), @XmlEnumValue("int32")
	INT_32("int32"), @XmlEnumValue("int64")
	INT_64("int64"), @XmlEnumValue("uint8")
	UINT_8("uint8"), @XmlEnumValue("uint16")
	UINT_16("uint16"), @XmlEnumValue("uint32")
	UINT_32("uint32"), @XmlEnumValue("uint64")
	UINT_64("uint64"), @XmlEnumValue("char8")
	CHAR_8("char8"), @XmlEnumValue("byte")
	BYTE("byte"), @XmlEnumValue("float32")
	FLOAT_32("float32"), @XmlEnumValue("double64")
	DOUBLE_64("double64");
	private final String value;

	EBasic(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EBasic fromValue(String v) {
		for (EBasic c : EBasic.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
