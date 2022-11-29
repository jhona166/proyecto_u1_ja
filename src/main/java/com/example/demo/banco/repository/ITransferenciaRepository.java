package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	
	//CRUD
		public Transferencia buscar(Integer id);
		//Vamos a necesitar
		public void actualizar(Transferencia transferencia);
		public void insertar(Transferencia transferencia);
		public void borrar(Integer id);
		
}
//ctrl+shif+o para importar