package com.opticasantaclara.admin.controller;

import java.util.List;

import com.opticasantaclara.admin.entities.Inventario;
import com.opticasantaclara.admin.repositoriesServices.IInventarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class InventarioController {
    @Autowired
    private IInventarioService iService;

    @GetMapping("/inventarios")
    public ResponseEntity<List<Inventario>> listarInventarios(){
        List<Inventario>inventarios = iService.listarInventarios();
        return new ResponseEntity<List<Inventario>>(inventarios,HttpStatus.OK);
    }
    
    @PostMapping("/crear-inventario")
	public ResponseEntity<Inventario> crearPaciente(@Validated @RequestBody Inventario inventario) {
		
		Inventario nuevoInventario = iService.saveOrUpdate(inventario);
		
		return new ResponseEntity<Inventario>(nuevoInventario,HttpStatus.CREATED);
    }
    
    @PutMapping("/editar-inventario")
	public ResponseEntity<Inventario> editarInventario(@Validated @RequestBody Inventario inventario) {
		
		Inventario  inventarioEditado = iService.saveOrUpdate(inventario);		
		
		return new ResponseEntity<Inventario>(inventarioEditado,HttpStatus.CREATED);
    }
}
