package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;
import com.example.demo.tienda.repository.IProductoRepository;

public class GestorMatriculaServiceImpl implements IGestorMatriculaService{
	@Qualifier("pesado")
	@Autowired
	private IMatriculaNuevaService iMatriculaServicePesado;
	
	@Qualifier("liviano")
	@Autowired
	private IMatriculaNuevaService iMatriculaServiceLiviano;
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	@Autowired
	private IProductoRepository  iProductoRepository;
	@Autowired
	private IMatriculaService iMatriculaService;
	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		
		//Vehiculo vehiculo = this.
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		Propietario pro = this.iProductoRepository.buscar(cedula);
		matricula.setPorpietario(pro);
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		matricula.setVehiculo(vehiculo);
		
		BigDecimal valor =null;
		if(vehiculo.getTipo().equals("P")) {
			valor=this.iMatriculaService.matricular(vehiculo.getPrecio());	
			System.out.println("Su vehiculo es pesado");
		}else {
			valor=this.iMatriculaServiceLiviano.matricula(vehiculo.getPrecio());
			System.out.println("Su vehiculo es liviano");
		}
		//Programo descuento 
		if(valor.compareTo(new BigDecimal(2000))>1) {
				BigDecimal descuento =valor.multiply(new BigDecimal(0.7));
				valor = valor.subtract(descuento);
		}
	
	}

}
