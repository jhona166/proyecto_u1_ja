package com.example.demo.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.tienda.modelo.ItemTO;
import com.example.demo.tienda.repository.IFacturaRepository;

public interface IFacturaService {

	
	public void generar(String cedulaCliente,List<ItemTO> detalles );
	//CRUD
	
}
