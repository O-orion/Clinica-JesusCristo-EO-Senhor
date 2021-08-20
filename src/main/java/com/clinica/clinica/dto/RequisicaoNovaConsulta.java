package com.clinica.clinica.dto;

import javax.validation.constraints.NotBlank;

import com.clinica.clinica.model.Consulta;

public class RequisicaoNovaConsulta {
	@NotBlank //validando os campos, estou dizendo que esse campo não pode ser branco e nem nulo
	private String nomePaciente;
	@NotBlank
	private String nomeMedico;
	@NotBlank
	private String dataAtendimento;
	
	private String descricao;
	
	
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public String getDataAtendimento() {
		return dataAtendimento;
	}
	public void setDataAtendimento(String dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Consulta toConsulta() {
		Consulta consulta = new Consulta();
		consulta.setNome(nomePaciente);
		consulta.setNomeMedico(nomeMedico);
		consulta.setData(dataAtendimento);
		consulta.setDescricao(descricao);
				
		return consulta;
	}
	
	

}
