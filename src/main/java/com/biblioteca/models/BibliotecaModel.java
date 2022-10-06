package com.biblioteca.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "TB_LIVROS")
public class BibliotecaModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false, length = 70)
	private String title;
	
	@Column(nullable = false, length = 100)
	private String author;
	
	@Column(nullable = false, length = 70)
	private String publishingCompany;
	
	@Column(nullable = false, length = 50)
	private String theme;
	
	@Column(nullable = false)
	private boolean isAvailable;
	
	
	
}
