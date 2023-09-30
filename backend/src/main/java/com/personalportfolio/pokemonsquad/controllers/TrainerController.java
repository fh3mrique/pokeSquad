package com.personalportfolio.pokemonsquad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalportfolio.pokemonsquad.entities.Trainer;
import com.personalportfolio.pokemonsquad.services.TrainerService;

@RestController
@RequestMapping("/trainers")
@CrossOrigin("*")
public class TrainerController {
	
	@Autowired
	private TrainerService trainerService;
	
	@GetMapping("list")
	public ResponseEntity<List<Trainer>> findAlltrainers() {
		List<Trainer> trainers = trainerService.findAll();
		
		return ResponseEntity.ok().body(trainers);
	}
}
