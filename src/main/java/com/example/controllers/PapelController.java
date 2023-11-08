package com.example.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.repositories.PapelRepository;
import com.example.domain.Paper;
@Controller
@RequestMapping("paper")
public class PapelController {

	@GetMapping("/form")
	public String getPapeis(Model model){
		model.addAttribute("paper", new Paper());
		return "registerPaper";
	}
	@RequestMapping(value="/papers",method =RequestMethod.GET)
	@ResponseBody
	public List<Paper> getPapeis() {
		return PapelRepository.getPapeis();
	}
	@CrossOrigin
	@PostMapping("/register")
	public String addPapel(@RequestBody Paper paper) {		
		PapelRepository.addPapel(paper);
		return "registerPaper";
	}
	
}
