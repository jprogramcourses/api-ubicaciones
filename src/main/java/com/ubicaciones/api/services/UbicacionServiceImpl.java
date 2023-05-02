package com.ubicaciones.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubicaciones.api.entities.Ubicacion;
import com.ubicaciones.api.repositories.UbicacionRespository;

@Service
public class UbicacionServiceImpl implements IUbicacionService {
	
	@Autowired
	private UbicacionRespository ubicacionRepository;

	@Override
	public List<Ubicacion> findAll() {
		return ubicacionRepository.findAll();
	}

	@Override
	public Ubicacion findById(Long id) {
		return ubicacionRepository.findById(id).orElse(null);
	}

}
