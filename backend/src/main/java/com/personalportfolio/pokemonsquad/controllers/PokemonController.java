package com.personalportfolio.pokemonsquad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalportfolio.pokemonsquad.entities.Pokemon;
import com.personalportfolio.pokemonsquad.services.PokemonService;

@RestController
@RequestMapping("/pokemons")
@CrossOrigin("*")
public class PokemonController {
	
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("list")
	public ResponseEntity<List<Pokemon>> findAllPokemons (){
		List<Pokemon> pokemons = pokemonService.findAll(); 
		
		return ResponseEntity.ok().body(pokemons);
	}

}
