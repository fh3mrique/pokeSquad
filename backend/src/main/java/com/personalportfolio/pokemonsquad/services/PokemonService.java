package com.personalportfolio.pokemonsquad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalportfolio.pokemonsquad.entities.Pokemon;
import com.personalportfolio.pokemonsquad.repositories.PokemonRepository;

@Service
public class PokemonService {
	
	@Autowired
	private PokemonRepository pokemonRepository;

	public List<Pokemon> findAll() {
		return pokemonRepository.findAll();
	}

}
