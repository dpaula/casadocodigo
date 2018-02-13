package br.com.lima.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.lima.daos.LivroDao;
import br.com.lima.models.Livro;

@Model
public class AdminListaLivrosBean {
	
	@Inject
	private LivroDao dao;

	private List<Livro> livros = new ArrayList<>();

	/**
	 * @return the livros
	 */
	public List<Livro> getLivros() {
		this.livros = dao.listar();
		return livros;
	}

	/**
	 * @param livros
	 *            the livros to set
	 */
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

}
