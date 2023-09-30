package com.personalportfolio.pokemonsquad.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.personalportfolio.pokemonsquad.enums.Genero;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "treinador")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Trainer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	private String name;
	private Integer age;
	@Enumerated(EnumType.STRING)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Genero genero;
	private String imgURL;
	
	@OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Pokemon> pokemons = new ArrayList<>(); 
	
	public Trainer() {
		
	}
	

}
