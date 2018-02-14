package br.com.lima.beans;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.lima.daos.LivroDao;
import br.com.lima.models.Livro;

@Model
public class LivroDetalheBean {

	@Inject
	private LivroDao dao;

	private Livro livro;

	private Integer id;

	public void carregaDetalhe() {
		this.setLivro(dao.buscarPorId(id));
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the livro
	 */
	public Livro getLivro() {
		return livro;
	}

	/**
	 * @param livro
	 *            the livro to set
	 */
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
