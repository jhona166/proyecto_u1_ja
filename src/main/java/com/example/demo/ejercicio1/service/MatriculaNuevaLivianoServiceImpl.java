package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service("liviano")
public class MatriculaNuevaLivianoServiceImpl implements IMatriculaNuevaService {

	@Override
	public void matricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado Liviano");
	System.out.println("Calculo del descuento de 2000");
	}

}
