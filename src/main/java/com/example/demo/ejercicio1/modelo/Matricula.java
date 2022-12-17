package com.example.demo.ejercicio1.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {
	private LocalDateTime fecha;
	private BigDecimal valor;
	private Propietario porpietario;
	private Vehiculo vehiculo;
	@Override
	public String toString() {
		return "Matricula [fecha=" + fecha + ", valor=" + valor + ", porpietario=" + porpietario + ", vehiculo="
				+ vehiculo + "]";
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Propietario getPorpietario() {
		return porpietario;
	}
	public void setPorpietario(Propietario porpietario) {
		this.porpietario = porpietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
}
