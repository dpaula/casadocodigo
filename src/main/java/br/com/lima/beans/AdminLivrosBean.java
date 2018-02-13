package br.com.lima.beans;

import java.io.IOException;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;
import javax.transaction.Transactional;

import br.com.lima.daos.LivroDao;
import br.com.lima.infra.FileSaver;
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
	
	private Part capaLivro;
	
	
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
	public String salvar() throws IOException {
		
		dao.salvar(livro);
		
		
		FileSaver fileSaver = new FileSaver();
		livro.setCapaPath(fileSaver.write(capaLivro, "livros"));
		
		this.livro = new Livro();
		
		context.getExternalContext().getFlash().setKeepMessages(true);
		context.addMessage(null, new FacesMessage("Livro cadastrado com sucesso!"));
		
		return "/livros/lista?faces-redirect=true";
	}

	/**
	 * @return the capaLivro
	 */
	public Part getCapaLivro() {
		return capaLivro;
	}

	/**
	 * @param capaLivro the capaLivro to set
	 */
	public void setCapaLivro(Part capaLivro) {
		this.capaLivro = capaLivro;
	}
}
