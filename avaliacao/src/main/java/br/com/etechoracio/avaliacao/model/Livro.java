package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.avaliacao.enums.CategoriaEnum;
import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Table(name="TBL_LIVRO")
@Entity
@Getter
@Setter
public class Livro extends BaseORM{
	
	@Id
	@GeneratedValue
	@Column(name="ID_LIVRO")
	private Long id;
	
	@Column(name="TITULO_LIVRO")
	private String titulo;
	
	@Column(name="AUTOR_LIVRO")
	private String autor;
	
	@Column(name="EDITORA_LIVRO")
	private String editora;
	
	@Column(name="CATEGORIA")
	@Enumerated(EnumType.STRING)
	private CategoriaEnum categoria;
	
	@Column(name="QUANTIDADE")
	private int quantidade;


	
	
}
