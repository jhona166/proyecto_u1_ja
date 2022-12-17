package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.ejercicio1.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{
	private static List<Vehiculo> base = new ArrayList<>();
	
	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = null;
		for(Vehiculo v:base) {
			if(v.getPlaca().equals(placa)) {
				vehiculo = v;
			}
		//	System.out.println("Se busca la cuenta bancaria: "+placa);
		}
		return vehiculo;
		
	
		
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo vehi = null;
		for(Vehiculo v:base) {
			if(v.getPlaca().equals(vehi.getPlaca())) {
				vehi = v;
			}
			base.remove(vehi);
			base.add(vehiculo);
		//	System.out.println("Se busca la cuenta bancaria: "+placa);
		}
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(placa));
	}

}
