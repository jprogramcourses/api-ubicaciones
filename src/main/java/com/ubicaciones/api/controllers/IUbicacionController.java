package com.ubicaciones.api.controllers;

import org.springframework.http.ResponseEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = {"Ubicacion Controller"})
public interface IUbicacionController {
	
	@ApiOperation(value = "This method is usedto get all the Ubicaciones")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Ubicaciones successfully retrieve"),
			@ApiResponse(code = 400, message = "Bad request")
	})
	public ResponseEntity<?> getUbicaciones();
	
	@ApiOperation(value = "This method is used to retrieve a Ubicacion by id")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Ubicacion successfully retrieve")
	})
	public ResponseEntity<?> getUbicacionById(@ApiParam(name = "ubicacionId", value = "Id of the Ubicacion") Long id);

}
