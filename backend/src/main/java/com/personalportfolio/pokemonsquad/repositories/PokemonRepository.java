package com.personalportfolio.pokemonsquad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personalportfolio.pokemonsquad.entities.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}
