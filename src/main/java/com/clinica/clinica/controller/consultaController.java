package com.clinica.clinica.controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clinica.clinica.DAO.peidoRepository;
import com.clinica.clinica.dto.RequisicaoNovaConsulta;
import com.clinica.clinica.model.Consulta;

@Controller
@RequestMapping("consulta") //todas as requisções para consulta vai ser gerenciado por esse controller
public class consultaController {
	@Autowired
	private peidoRepository consultaRepository;
	
	@GetMapping("")
	public String listaConsultas(Model model) {
		
		List<Consulta> consultas= consultaRepository.findAll();
		model.addAttribute("consultas", consultas);
		return "consulta/Consultas";
	}
	
	@GetMapping("form")
	public String form(RequisicaoNovaConsulta requisicao) {
		return "consulta/form"; //retonando a pagina do formulario
	}
	
	@PostMapping("novo") //@Valid pedindo pro spring validar os meus campos, no  BindingResult ele me retorna o resultado dessa validação
	public String novaConsulta(@Valid RequisicaoNovaConsulta requisicao, BindingResult result) {
		if(result.hasErrors()) {
			//estamos pergutando se existi algum erro, caso exista vamos retorna o usuário para a pagina do formulário
			return "consulta/form";
		}
		
		Consulta consulta = requisicao.toConsulta();
		consultaRepository.save(consulta);
		return "consulta/form";
	}
	
	
	
	
	
}
