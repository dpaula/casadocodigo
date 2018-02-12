package br.com.lima;

public class Livro {
	
	private String titulo;
	private String desc;
	private double preco;
	private Integer nPaginas;
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	/**
	 * @return the nPaginas
	 */
	public Integer getnPaginas() {
		return nPaginas;
	}
	/**
	 * @param nPaginas the nPaginas to set
	 */
	public void setnPaginas(Integer nPaginas) {
		this.nPaginas = nPaginas;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", desc=" + desc + ", preco=" + preco + ", nPaginas=" + nPaginas + "]";
	}
	
	
	

}
