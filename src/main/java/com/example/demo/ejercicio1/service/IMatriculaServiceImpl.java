package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service
public class IMatriculaServiceImpl implements IMatriculaService{
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		Propietario pro = this.iPropietarioRepository.buscar(cedula);
		matricula.setPorpietario(pro);
		
		Vehiculo vehiculo=this.iVehiculoRepository.buscar(placa);
		matricula.setVehiculo(vehiculo);
		
		this.iMatriculaRepository.insertar(matricula);
		
		BigDecimal valor=null;
		
		if(vehiculo.getTipo().equals("P")) {
			valor = vehiculo.getPrecio().multiply(new BigDecimal(0.15)); 
			
		}else {
			//liviano
			valor = vehiculo.getPrecio().multiply(new BigDecimal(0.10)); 
			
		}
		//-1valor izquierda menor
		//0 son iguales
		//1 valor izquierda es mayor
		if(valor.compareTo(new BigDecimal(2000))>1) {
			BigDecimal descuento=valor.multiply(new BigDecimal(0.7));
			valor = valor.subtract(descuento);
			
		}
		matricula.setValor(valor);
		this.iMatriculaRepository.insertar(matricula);
	}

}
