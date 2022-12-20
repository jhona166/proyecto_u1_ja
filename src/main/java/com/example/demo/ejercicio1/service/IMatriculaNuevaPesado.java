package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service
public class IMatriculaNuevaPesado implements IMatriculaNuevaService{

	@Override
	public void matricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado");
	}

}
