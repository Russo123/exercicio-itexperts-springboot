package com.itexpertes.exerciciospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itexpertes.exerciciospringboot.model.Cliente;
import com.itexpertes.exerciciospringboot.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> buscarTodosClientes() {
		
		List<Cliente> clientes = clienteService.getAllClientes();
		
		return ResponseEntity.ok().body(clientes);
	}
	

}
