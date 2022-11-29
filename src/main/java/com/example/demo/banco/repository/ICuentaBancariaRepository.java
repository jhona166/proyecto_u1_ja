package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	//Vamos a necesitar
	public CuentaBancaria buscarPorNumero(String numeroCuenta);
	//public void actualizar(CuentaBancaria cuentaBancaria);
		
	//CRUD
	public CuentaBancaria buscar(Integer id);
	//Vamos a necesitar
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
	
}
