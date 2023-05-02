package com.ubicaciones.api.services;

import java.util.List;

import com.ubicaciones.api.entities.Ubicacion;

public interface IUbicacionService {
	
	public List<Ubicacion> findAll();
	
	public Ubicacion findById(Long id);

}
