package com.personalportfolio.pokemonsquad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalportfolio.pokemonsquad.entities.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {

}
