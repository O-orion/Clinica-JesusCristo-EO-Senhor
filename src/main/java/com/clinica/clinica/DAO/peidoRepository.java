package com.clinica.clinica.DAO;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinica.clinica.model.Consulta;

@Repository //pedindo para spring gerenciar meu repositorio
public interface peidoRepository extends JpaRepository<Consulta, Long> {
	
	 /*//Se comunicando com o banco de dados
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Consulta> listaConsultar() {
		Query query = entityManager.createQuery("select c from Consulta c", Consulta.class);
		return query.getResultList(); 
	} */

}
