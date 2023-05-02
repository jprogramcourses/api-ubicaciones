package com.ubicaciones.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ubicaciones.api.entities.Ubicacion;
import com.ubicaciones.api.services.IUbicacionService;

@RestController
@RequestMapping(value = "api/v1")
public class UbicacionControllerImpl implements IUbicacionController {
	
	@Autowired
	IUbicacionService ubicacionService;

	@GetMapping(value = "/ubicaciones")
	@Override
	public ResponseEntity<?> getUbicaciones() {
		
		List<Ubicacion> ubicaciones = ubicacionService.findAll();
		
		return new ResponseEntity<List<Ubicacion>>(ubicaciones, HttpStatus.OK);
	}

	@GetMapping(value = "/ubicacion")
	@Override
	public ResponseEntity<?> getUbicacionById(@RequestParam Long id) {
		Ubicacion ubicacion = ubicacionService.findById(id);
		return new ResponseEntity<Ubicacion>(ubicacion, HttpStatus.OK);
	}

}
