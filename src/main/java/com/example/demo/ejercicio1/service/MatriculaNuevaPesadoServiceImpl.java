package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("pesado")
public class MatriculaNuevaPesadoServiceImpl implements IMatriculaNuevaService{

	@Override
	public BigDecimal matricula(BigDecimal precio) {
		// TODO Auto-generated method stub
		System.out.println("Matriculado pesado");
		System.out.println("Calculo del descuento de 2000");
		BigDecimal valor = precio.multiply(new BigDecimal(0.15));
		return valor;
	}




}
