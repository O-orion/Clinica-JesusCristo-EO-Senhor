package com.clinica.clinica.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.clinica.clinica.DAO.funcionarioRepository;
import com.clinica.clinica.dto.RequisicaoNovoFuncionario;
import com.clinica.clinica.model.Funcionario;

@Controller
@RequestMapping("funcionario")
public class FuncionarioController {
	
	@Autowired
	private funcionarioRepository funcionarioRepo;
	
	@GetMapping("")
	public String moduloFuncionario(Model model) {
		List<Funcionario> funcionarios = funcionarioRepo.findAll();
		model.addAttribute("funcionarios", funcionarios);
		return "funcionario/funcionario";
	}
	
	@GetMapping("/formFun")
	public String formFuncionario(RequisicaoNovoFuncionario requisicao) {
		return "funcionario/formFun";
	}
	
	@PostMapping("novoFun")
	public String novoFuncionario(@Valid RequisicaoNovoFuncionario requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "funcionario/formFun";
		}
		
		Funcionario funcionario = requisicao.toFuncionario();
		funcionarioRepo.save(funcionario);
		
		return "funcionario/formFun";
	}
}
