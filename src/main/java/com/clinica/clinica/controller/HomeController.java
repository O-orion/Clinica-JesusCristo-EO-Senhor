package com.clinica.clinica.controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.clinica.clinica.DAO.peidoRepository;
import com.clinica.clinica.model.Consulta;

@Controller
public class HomeController {
	
	@Autowired //spring vai injectar automaticamente para min
	private peidoRepository consultaRepository;
	
	@GetMapping("")
	public String Home(Model model) {
		List<Consulta> consultas = consultaRepository.findAll();
		model.addAttribute("consultas", consultas);

		return "Home";
	}

}
