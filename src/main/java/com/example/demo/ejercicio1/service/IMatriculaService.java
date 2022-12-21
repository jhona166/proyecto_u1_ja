package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

public interface IMatriculaService {
	public BigDecimal matricular(String cedula, String placa);

	public BigDecimal matricular(BigDecimal precio);
}
