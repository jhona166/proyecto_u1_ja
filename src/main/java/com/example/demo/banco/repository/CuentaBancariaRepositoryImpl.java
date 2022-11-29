package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {
	private static List<CuentaBancaria> baseCuentas = new ArrayList<>();
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		//SELECT * FROM CUENTA C WHERE C.NUMERO = numeroCuenta
		//*Mock
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setNumero(numeroCuenta);
		cuenta.setSaldo(new BigDecimal(100));
		cuenta.setTipo("A");
		cuenta.setTitular("Jhonatan Altamirano");
		return cuenta;
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		baseCuentas.add(cuentaBancaria);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
