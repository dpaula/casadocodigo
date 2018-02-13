package br.com.lima.beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.lima.models.Autor;

public class AutorDao {
	
	@PersistenceContext
	private EntityManager manager;

	public List<Autor> listar() {
		
		return manager.createQuery("select a from Autor a", Autor.class).getResultList();
	}
	

}
