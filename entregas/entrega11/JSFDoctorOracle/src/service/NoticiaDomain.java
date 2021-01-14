/**
 * NoticiaDomain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

import java.util.Calendar;
import java.util.Date;

public class NoticiaDomain implements java.io.Serializable {
	private java.lang.String descripcion;

	private java.util.Date fecha;

	private int numero;

	private java.lang.String titulo;

	public NoticiaDomain() {
	}

	public NoticiaDomain(java.lang.String descripcion, java.util.Date fecha, int numero, java.lang.String titulo) {
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.numero = numero;
		this.titulo = titulo;
	}

	public NoticiaDomain(int numero, String titulo, String descripcion, Date fecha) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	/**
	 * Gets the descripcion value for this NoticiaDomain.
	 * 
	 * @return descripcion
	 */
	public java.lang.String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the descripcion value for this NoticiaDomain.
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(java.lang.String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Gets the fecha value for this NoticiaDomain.
	 * 
	 * @return fecha
	 */
	public java.util.Date getFecha() {
		return fecha;
	}

	/**
	 * Sets the fecha value for this NoticiaDomain.
	 * 
	 * @param fecha
	 */
	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Gets the numero value for this NoticiaDomain.
	 * 
	 * @return numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Sets the numero value for this NoticiaDomain.
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Gets the titulo value for this NoticiaDomain.
	 * 
	 * @return titulo
	 */
	public java.lang.String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the titulo value for this NoticiaDomain.
	 * 
	 * @param titulo
	 */
	public void setTitulo(java.lang.String titulo) {
		this.titulo = titulo;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof NoticiaDomain))
			return false;
		NoticiaDomain other = (NoticiaDomain) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.descripcion == null && other.getDescripcion() == null)
						|| (this.descripcion != null && this.descripcion.equals(other.getDescripcion())))
				&& ((this.fecha == null && other.getFecha() == null)
						|| (this.fecha != null && this.fecha.equals(other.getFecha())))
				&& this.numero == other.getNumero() && ((this.titulo == null && other.getTitulo() == null)
						|| (this.titulo != null && this.titulo.equals(other.getTitulo())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getDescripcion() != null) {
			_hashCode += getDescripcion().hashCode();
		}
		if (getFecha() != null) {
			_hashCode += getFecha().hashCode();
		}
		_hashCode += getNumero();
		if (getTitulo() != null) {
			_hashCode += getTitulo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			NoticiaDomain.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "noticiaDomain"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descripcion");
		elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fecha");
		elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numero");
		elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("titulo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "titulo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

	@Override
	public String toString() {
		return "NoticiaDomain [numero=" + numero + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fecha="
				+ fecha + "]";
	}

}
