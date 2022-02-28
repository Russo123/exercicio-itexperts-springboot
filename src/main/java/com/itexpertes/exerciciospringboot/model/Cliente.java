package com.itexpertes.exerciciospringboot.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String nome;
	private int idade;
	private char genero;
	private double altura;
	private boolean ativo;

	//private List<Documentos> documentos;
	//private List<Endereco> endereco;

}
