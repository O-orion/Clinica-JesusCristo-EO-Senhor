package com.clinica.clinica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String rg;
	private String orgao_emissor;
	private String cpf;
	private String endereco;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone;
	private String celular;
	private String numero_CTPS;
	private String numero_pis;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	

}
