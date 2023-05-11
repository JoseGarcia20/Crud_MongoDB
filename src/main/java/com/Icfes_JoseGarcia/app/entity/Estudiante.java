package com.Icfes_JoseGarcia.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Estudiantes")
public class Estudiante {

	@Id
	private String id;
	private String tipoDocumento;
	private String documento;
	private String apellido;
	private String nombre;
	private String correo;
	private String telefono;
	private String clave;
	private String numeroRegistro;
	private int puntaje;
	
	private int pComunicacionEscrita;
	private int pRazonamientoCuantitativo;
	private int pLecturaCritica;
	private int pCompetenciasCiudadanas;
	private int pIngles;
	private String pNivelIngles;
	private int pFormulacionProyectosIngenieria;
	private int pPensamientoCientifico;
	private int pDisenoSoftware;
	
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	
	
	public int getpComunicacionEscrita() {
		return pComunicacionEscrita;
	}
	public void setpComunicacionEscrita(int pComunicacionEscrita) {
		this.pComunicacionEscrita = pComunicacionEscrita;
	}
	public int getpRazonamientoCuantitativo() {
		return pRazonamientoCuantitativo;
	}
	public void setpRazonamientoCuantitativo(int pRazonamientoCuantitativo) {
		this.pRazonamientoCuantitativo = pRazonamientoCuantitativo;
	}
	public int getpLecturaCritica() {
		return pLecturaCritica;
	}
	public void setpLecturaCritica(int pLecturaCritica) {
		this.pLecturaCritica = pLecturaCritica;
	}
	public int getpCompetenciasCiudadanas() {
		return pCompetenciasCiudadanas;
	}
	public void setpCompetenciasCiudadanas(int pCompetenciasCiudadanas) {
		this.pCompetenciasCiudadanas = pCompetenciasCiudadanas;
	}
	public int getpIngles() {
		return pIngles;
	}
	public void setpIngles(int pIngles) {
		this.pIngles = pIngles;
	}
	public String getpNivelIngles() {
		return pNivelIngles;
	}
	public void setpNivelIngles(String pNivelIngles) {
		this.pNivelIngles = pNivelIngles;
	}
	public int getpFormulacionProyectosIngenieria() {
		return pFormulacionProyectosIngenieria;
	}
	public void setpFormulacionProyectosIngenieria(int pFormulacionProyectosIngenieria) {
		this.pFormulacionProyectosIngenieria = pFormulacionProyectosIngenieria;
	}
	public int getpPensamientoCientifico() {
		return pPensamientoCientifico;
	}
	public void setpPensamientoCientifico(int pPensamientoCientifico) {
		this.pPensamientoCientifico = pPensamientoCientifico;
	}
	public int getpDisenoSoftware() {
		return pDisenoSoftware;
	}
	public void setpDisenoSoftware(int pDisenoSoftware) {
		this.pDisenoSoftware = pDisenoSoftware;
	}	
}
