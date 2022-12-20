package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.ejercicio1.modelo.Vehiculo;

public class GestorMatriculaServiceImpl implements IGestorMatriculaService{
	@Qualifier("pesado")
	@Autowired
	private IMatriculaNuevaService iMatriculaServicePesado;
	
	@Qualifier("liviano")
	@Autowired
	private IMatriculaNuevaService iMatriculaServiceLiviano;
	
	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehi = null;
		if(vehi.getTipo().equals("P")) {
			this.iMatriculaServicePesado.matricula("1727501510", "PDGD5667");	
		}else {
			this.iMatriculaServiceLiviano.matricula("1727501510", "PDGD5667");
		}
		
	}

}
