package com.personalportfolio.pokemonsquad.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personalportfolio.pokemonsquad.entities.Trainer;
import com.personalportfolio.pokemonsquad.repositories.TrainerRepository;

@Service
public class TrainerService {
	
	@Autowired
	private TrainerRepository trainerRepository;

	@Transactional(readOnly = true)
	public List<Trainer> findAll() {
		List<Trainer> trainers = trainerRepository.findAll();
		return trainers;
	}

}
