package Entidades;

public class Livro extends Biblioteca {
	private int id;
	private String titulo;
	private String autor;
	private String edicao;
	private int ano;
	private int numPaginas;
	private String disponibilidade;

	public Livro(int id, String titulo, String autor, String edicao, int ano, int numPaginas, String disponibilidade) {
		super(titulo);
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.edicao = edicao;
		this.ano = ano;
		this.numPaginas = numPaginas;
		this.disponibilidade = disponibilidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String toString() {
		return "Livro{" +
				"id=" + id +
				", titulo='" + titulo + '\'' +
				", autor='" + autor + '\'' +
				", edicao='" + edicao + '\'' +
				", ano=" + ano +
				", numPaginas=" + numPaginas +
				", disponibilidade='" + disponibilidade + '\'' +
				'}';
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Livro: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Número de Páginas: " + numPaginas);
	}
}