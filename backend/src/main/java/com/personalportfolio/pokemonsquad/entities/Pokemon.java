package com.personalportfolio.pokemonsquad.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pokemon")
public class Pokemon implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer level;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "pokemon_tipo",
	joinColumns = @JoinColumn(name = "pokemon_id"),
	inverseJoinColumns = @JoinColumn(name = "tipo_id")
	)
	private List<Tipo> tipo = new ArrayList<>();
	
	public Pokemon(Long id, String name, Integer level) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
	}
	
	public Pokemon() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<Tipo> getTipo() {
		return tipo;
	}

	public void setTipo(List<Tipo> tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(level);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(level, other.level);
	}
	
}
