package com.ubicaciones.api.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "UBICACIONES")
@Data
@NoArgsConstructor
public class Ubicacion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String parroquia;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "municipio_id", referencedColumnName = "id")
	private Municipio municipio;
	

}
