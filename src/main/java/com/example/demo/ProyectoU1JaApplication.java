package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaRepository;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;

@SpringBootApplication
public class ProyectoU1JaApplication implements CommandLineRunner {
	
	
	@Autowired
	private IVehiculoService iVehiculoService;
	@Autowired
	private IPropietarioService iPropietarioService;
	@Autowired
	private IMatriculaService iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Opcion1
		Vehiculo vehi = new Vehiculo();
		vehi.setMarca("Toyota");
		vehi.setPlaca("PDGD5667");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("P");
		
		this.iVehiculoService.crear(vehi);
		
		vehi.setPrecio(new BigDecimal(10000));
		vehi.setMarca("Toyota");
		
		this.iVehiculoService.modificar(vehi);
		
		//Opcion2
		Propietario propietario= new Propietario();
		propietario.setApellido("Altamirano");
		propietario.setCedula("1727501510");
		propietario.setFechaDeNacimiento(LocalDateTime.of(1998, 7,7,12,35));
		propietario.setNombre("Jhonatan");
		
		this.iPropietarioService.guardar(propietario);
		
		//Opcion3
		this.iMatriculaService.matricular("1727501510", "PDGD5667");
	}

}
