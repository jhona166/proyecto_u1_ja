package com.example.demo.tienda.repository;

import com.example.demo.tienda.modelo.Cliente;

public interface IClienteRepository {
	//Crud
	public void insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	//Eliminar y buscar siempre con identificador
	public Cliente buscar(String cedula);
	public void eliminar(String cedula);
	
}
