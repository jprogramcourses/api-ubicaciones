package com.ubicaciones.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubicaciones.api.entities.Ubicacion;

public interface UbicacionRespository extends JpaRepository<Ubicacion, Long> {

}
