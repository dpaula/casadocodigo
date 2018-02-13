package br.com.lima.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.lima.daos.LivroDao;
import br.com.lima.models.Autor;
import br.com.lima.models.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {

	private Livro livro = new Livro();

	@Inject
	private LivroDao dao;

	@Inject
	private AutorDao autorDao;
	
	@Inject
	private FacesContext context;
	
	private List<Integer> autoresId = new ArrayList<>();


	/**
	 * @return the autoresId
	 */
	public List<Integer> getAutoresId() {
		return autoresId;
	}

	/**
	 * @param autoresId
	 *            the autoresId to set
	 */
	public void setAutoresId(List<Integer> autoresId) {
		this.autoresId = autoresId;
	}

	public List<Autor> getAutores() {
		return this.autorDao.listar();
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Transactional
	public String salvar() {
		
		for (Integer integer : autoresId) {
			livro.getAutores().add(new Autor(integer));
		}
		
		dao.salvar(livro);
		
		this.livro = new Livro();
		this.autoresId = new ArrayList<>();
//		System.out.println("Livro Cadastrado: " + this.livro.toString());
//		System.out.println("autor: "+this.autoresId);
		
		context.getExternalContext().getFlash().setKeepMessages(true);
		context.addMessage(null, new FacesMessage("Livro cadastrado com sucesso!"));
		
		return "/livros/lista?faces-redirect=true";
	}
}
