package com.transformador.transformadorRomanos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transformador.transformadorRomanos.model.Response;
import com.transformador.transformadorRomanos.service.TransformadorService;

import static org.springframework.http.ResponseEntity.ok;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/")
public class Controller {
    
	@Autowired
	private TransformadorService service;

    @GetMapping("/healthCheck")
    public ResponseEntity<Response> getHealthcheck() {
		Response resp = null;
		try {
			resp = new Response(200, System.currentTimeMillis() );
	
			return ok(resp);
		} catch(Exception e) {
			resp = new Response(500, e.getMessage());
			return ok(resp); 
		}        
    }

	@GetMapping("/transformador/romanos/{numero}")
    public ResponseEntity<Response> getNumero(@PathVariable Integer numero) {
		Response resp = null;
		try {
			resp = new Response(200, this.service.transformador(numero) );
	
			return ok(resp);
		} catch(Exception e) {
			resp = new Response(500, e.getMessage());
			return ok(resp); 
		}        
    }

}
