package com.clinica.clinica.dto;

import javax.validation.constraints.NotBlank;

import com.clinica.clinica.model.Funcionario;

public class RequisicaoNovoFuncionario {
	@NotBlank
	private String nome;
	@NotBlank
	private String rg;
	@NotBlank
	private String orgao_emissor;
	@NotBlank
	private String cpf;
	@NotBlank
	private String endereco;
	@NotBlank
	private String complemento;
	@NotBlank
	private String bairro;
	@NotBlank
	private String cidade;
	@NotBlank
	private String estado;
	@NotBlank
	private String telefone;
	@NotBlank
	private String celular;
	@NotBlank
	private String numero_CTPS;
	@NotBlank
	private String numero_pis;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getOrgao_emissor() {
		return orgao_emissor;
	}
	public void setOrgao_emissor(String orgao_emissor) {
		this.orgao_emissor = orgao_emissor;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getNumero_CTPS() {
		return numero_CTPS;
	}
	public void setNumero_CTPS(String numero_CTPS) {
		this.numero_CTPS = numero_CTPS;
	}
	public String getNumero_pis() {
		return numero_pis;
	}
	public void setNumero_pis(String numero_pis) {
		this.numero_pis = numero_pis;
	}
	
	public Funcionario toFuncionario() {
		Funcionario fun = new Funcionario();
		fun.setNome(nome);
		fun.setNumero_CTPS(numero_CTPS);
		fun.setBairro(bairro);
		fun.setCelular(celular);
		fun.setCidade(cidade);
		fun.setEstado(estado);
		fun.setOrgao_emissor(orgao_emissor);
		fun.setComplemento(complemento);
		fun.setCpf(cpf);
		fun.setEndereco(endereco);
		fun.setRg(rg);
		fun.setTelefone(telefone);
		fun.setNumero_pis(numero_pis);

		return fun;
	}

}
