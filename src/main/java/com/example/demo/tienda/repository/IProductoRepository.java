package com.example.demo.tienda.repository;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.tienda.modelo.Producto;

public interface IProductoRepository {
	public void insertar(Producto producto);

	public Propietario buscar(String cedula);
}
