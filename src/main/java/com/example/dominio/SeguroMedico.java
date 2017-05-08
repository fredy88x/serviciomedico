package com.example.dominio;

public class SeguroMedico {

	private int idSeguro;
	private String nif;
	private String nombre;
	private String apel;
	private int edad;
	private Sexo sexo;
	private Boolean casado;
	private int numHijos;
	private Boolean embarazada;
	private Coberturas coberturas;
	private Enfermedades enfermedades;

	public int getIdSeguro() {
		return idSeguro;
	}
	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApel() {
		return apel;
	}
	public void setApel(String apel) {
		this.apel = apel;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Boolean getCasado() {
		return casado;
	}
	public void setCasado(Boolean casado) {
		this.casado = casado;
	}
	public int getNumHijos() {
		return numHijos;
	}
	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}
	public Boolean getEmbarazada() {
		return embarazada;
	}
	public void setEmbarazada(Boolean embarazada) {
		this.embarazada = embarazada;
	}
	public Coberturas getCoberturas() {
		return coberturas;
	}
	public void setCoberturas(Coberturas coberturas) {
		this.coberturas = coberturas;
	}
	public Enfermedades getEnfermedades() {
		return enfermedades;
	}
	public void setEnfermedades(Enfermedades enfermedades) {
		this.enfermedades = enfermedades;
	}



}
