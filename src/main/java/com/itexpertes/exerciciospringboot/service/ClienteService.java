package com.itexpertes.exerciciospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itexpertes.exerciciospringboot.model.Cliente;
import com.itexpertes.exerciciospringboot.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> getAllClientes() {
	
		List<Cliente> clientes = clienteRepository.findAll();
		
		if (clientes.isEmpty())
			throw new RuntimeException("Ainda não posssui clientes cadastrados");

		return clientes;

	}

}
