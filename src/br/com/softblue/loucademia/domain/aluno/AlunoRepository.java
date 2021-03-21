package br.com.softblue.loucademia.domain.aluno;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AlunoRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public void store(Aluno aluno) {
		em.persist(aluno);
	}
	
	public void update(Aluno aluno) {
		em.merge(aluno);
	}
	
	public Aluno findByMatricula(String matricula) {
		return em.find(Aluno.class, matricula);
	}
	
	public void delete(String matricula) {
	 	Aluno aluno = findByMatricula(matricula);
	 	
	 	if (aluno != null) {
	 		em.remove(aluno);
	 	}
	}
}
