package Model.bean;

public class Livro {
	
	private int idLivro;
	private String t�tulo;
	private String autor;
	private String editora;
	private int edi��o;
	private int ano;
	private double valor;
	private boolean estoque;
	
	
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public String getT�tulo() {
		return t�tulo;
	}
	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getEdi��o() {
		return edi��o;
	}
	public void setEdi��o(int edi��o) {
		this.edi��o = edi��o;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isEstoque() {
		return estoque;
	}
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}
}