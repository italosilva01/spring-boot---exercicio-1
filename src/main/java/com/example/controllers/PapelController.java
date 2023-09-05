package com.example.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repositories.PapelRepository;
import com.example.domain.Papel;
@RestController
public class PapelController {

	@RequestMapping("/papeis")
	public List<Papel>  getPapeis(){
		return PapelRepository.getPapeis();
	}
	
	@PostMapping("/papeis")
	public Papel addPapel(@RequestBody Papel papel) {
		return PapelRepository.addPapel(papel);
	}
}
