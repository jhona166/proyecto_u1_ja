package com.example.demo.tienda.modelo;

public class ItemTO {
	private String codigoBarras;
	private Integer cantidad;
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	@Override
	public String toString() {
		return "ItemTO [codigoBarras=" + codigoBarras + ", cantidad=" + cantidad + "]";
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}
