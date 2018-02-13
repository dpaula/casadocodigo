package br.com.lima.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String titulo;
	private String descri;
	private BigDecimal preco;
	private Integer nPaginas;

	@ManyToMany
	private List<Autor> autores = new ArrayList<>();

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
	 * @return the autores
	 */
	public List<Autor> getAutores() {
		return autores;
	}

	/**
	 * @param autores
	 *            the autores to set
	 */
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the desc
	 */
	public String getDescri() {
		return descri;
	}

	/**
	 * @param desc
	 *            the desc to set
	 */
	public void setDescri(String descri) {
		this.descri = descri;
	}

	/**
	 * @return the preco
	 */
	public BigDecimal getPreco() {
		return preco;
	}

	/**
	 * @param preco
	 *            the preco to set
	 */
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	/**
	 * @return the nPaginas
	 */
	public Integer getnPaginas() {
		return nPaginas;
	}

	/**
	 * @param nPaginas
	 *            the nPaginas to set
	 */
	public void setnPaginas(Integer nPaginas) {
		this.nPaginas = nPaginas;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", descri=" + descri + ", preco=" + preco + ", nPaginas="
				+ nPaginas + ", autores=" + autores + "]";
	}

}
