package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	PacienteTerceraEdadH pacienteTe = new PacienteTerceraEdadH();
//	pacienteTe.setCedula("123456789");
//	pacienteTe.setCodIess("1234");
//	pacienteTe.setNombre("Jhonatan");
//	pacienteTe.setTipo("TE");

	PacienteNinioH pacienteN = new PacienteNinioH();
	pacienteN.setCedula("123456789");
	pacienteN.setPesoNacimiento(12);
	pacienteN.setNombre("Jhonatan");
	pacienteN.setTipo("TE");
		
	MedicoH medico = new MedicoH();
	medico.setCedula("123456789");
	medico.setNombre("Danilo");
	
	CitaMedicaH cita = new CitaMedicaH();
	cita.agendar("1", LocalDateTime.of(2022,12,2,8,30), pacienteN, medico);
	
	
	}

}
