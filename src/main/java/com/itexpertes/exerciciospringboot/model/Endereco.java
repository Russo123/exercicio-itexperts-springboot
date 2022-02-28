package com.itexpertes.exerciciospringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Endereco implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String bairro;
	private String tipoLogradouro;
	private int numero;
	private String status;
	private String cidade;
	private String estado;
}
