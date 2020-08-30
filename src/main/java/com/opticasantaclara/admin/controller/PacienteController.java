package com.opticasantaclara.admin.controller;

import java.util.List;

import com.opticasantaclara.admin.entities.HistoriaClinica;
import com.opticasantaclara.admin.entities.Paciente;
import com.opticasantaclara.admin.repositoriesServices.IPacienteService;

import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PacienteController {
    @Autowired
    private IPacienteService pService;

    @GetMapping("/pacientes")
    public ResponseEntity<List<Paciente>> listarPacientes(){
        List<Paciente>pacientes = pService.listarPacientes();
        return new ResponseEntity<List<Paciente>>(pacientes,HttpStatus.OK);
    }
    
    @PostMapping("/crear-paciente")
	public ResponseEntity<Paciente> crearPaciente(@Validated @RequestBody Paciente Paciente) {
		
		Paciente nuevoPaciente = pService.saveOrUpdate(Paciente);
		
		return new ResponseEntity<Paciente>(nuevoPaciente,HttpStatus.CREATED);
    }
    
    @PutMapping("/editar-paciente")
	public ResponseEntity<Paciente> editarPaciente(@Validated @RequestBody Paciente Paciente) {
		
		Paciente  PacienteEditado = pService.saveOrUpdate(Paciente);		
		
		return new ResponseEntity<Paciente>(PacienteEditado,HttpStatus.CREATED);
    }

    @GetMapping("/hiclinica-paciente/{pacientes}")
	public ResponseEntity<List<HistoriaClinica>> getHiClinicasByPaciente(@PathVariable("pacientes") int cedula){
		Paciente  paciente = pService.findByCedula(cedula);
		
		List<HistoriaClinica> historiasClinicas= pService.findHiClinicasByPaciente(paciente);
		if(historiasClinicas != null) {
		return new ResponseEntity<List<HistoriaClinica>>(historiasClinicas,HttpStatus.OK);
			
		
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
	
    @GetMapping("/hiclinica-paciente/{cedula}/{id}")
	public ResponseEntity<HistoriaClinica> getHiClinicasByPacienteAndId(@PathVariable("cedula") Integer cedula, @PathVariable("id") Integer id){
		Paciente  paciente = pService.findByCedula(cedula);
		HistoriaClinica hiClinicaId = pService.findByIdHiclinica(id);
		
		HistoriaClinica historiaClinica = pService.findHiClinicasByPacienteAndId(paciente, hiClinicaId);
		if(historiaClinica != null) {
		return new ResponseEntity<HistoriaClinica>(historiaClinica,HttpStatus.OK);
			
		
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	 
	// Esto es una prueba de los path
	@GetMapping(path="/{name}/{age}")
    public String getMessage(@PathVariable("name") String name, 
            @PathVariable("age") String age) {
        
        String msg = String.format("%s is %s years old", name, age);
        
        return msg;
    }
    
    
    @PostMapping("/hiclinica-paciente/{cedula}")
	public ResponseEntity<HistoriaClinica> crearHiClinica(@Validated @RequestBody HistoriaClinica historiaClinica,
            @PathVariable int cedula) {
		
		Paciente  paciente = pService.findByCedula(cedula);
		if(paciente != null) {
			
			historiaClinica.setPaciente(paciente);
			
			HistoriaClinica nuevaHiClinica = pService.crearOEditarHiClinica(historiaClinica);
			
			return new ResponseEntity<HistoriaClinica>(nuevaHiClinica,HttpStatus.CREATED);
		}
			
		
		return  null;
	}

    @PutMapping("/hiclinica-paciente/{cedula}")
	public ResponseEntity<HistoriaClinica> editarHiClinica(@Validated @RequestBody HistoriaClinica historiaClinica,
            @PathVariable int cedula) {
		
		Paciente  paciente = pService.findByCedula(cedula);
		if(paciente != null) {
			
			historiaClinica.setPaciente(paciente);
			
			HistoriaClinica nuevaHiClinica = pService.crearOEditarHiClinica(historiaClinica);
			
			return new ResponseEntity<HistoriaClinica>(nuevaHiClinica,HttpStatus.CREATED);
		}
			
		
		return  null;
	}
}