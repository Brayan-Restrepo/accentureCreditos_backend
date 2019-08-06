package com.accenture.credito.model.dto;

import java.io.Serializable;

public class RegistroClienteDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer identificacion;	
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	
	public Integer getIdentificacion() {
		return identificacion;
	}
	
	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}	
}
