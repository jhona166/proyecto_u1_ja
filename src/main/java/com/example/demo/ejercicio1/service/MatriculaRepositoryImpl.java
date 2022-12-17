package com.example.demo.ejercicio1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
@Service
public class MatriculaRepositoryImpl implements IMatriculaRepository {
	private static List<Matricula> base = new ArrayList<>();
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		base.add(matricula);
	}
	

}
