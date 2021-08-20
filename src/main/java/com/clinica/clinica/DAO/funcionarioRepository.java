package com.clinica.clinica.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.clinica.model.Funcionario;

public interface funcionarioRepository extends JpaRepository<Funcionario, Long> {

}
