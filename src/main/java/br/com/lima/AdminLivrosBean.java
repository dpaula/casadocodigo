package br.com.lima;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AdminLivrosBean {

	private Livro livro = new Livro();
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public void salvar() {
		System.out.println("Livro Cadastrado: "+this.livro.toString());
	}
}
