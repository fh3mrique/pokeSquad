package com.personalportfolio.pokemonsquad.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "pokemon")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pokemon implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	private String name;
	private Integer level;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "pokemon_tipo",
	joinColumns = @JoinColumn(name = "pokemon_id"),
	inverseJoinColumns = @JoinColumn(name = "tipo_id")
	)
	private List<Tipo> tipo = new ArrayList<>();
	
	@ManyToOne
	@JsonIgnore
	private Trainer trainer;
		
}
