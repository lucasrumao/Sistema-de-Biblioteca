package Entidades;

public class Emprestimo {

	private int id_emprestimo;
	private int id_usuario;
	private int id_livro;
	private String data_emprestimo;
	private String data_devolucao;

	public Emprestimo() {}

	public Emprestimo(int id_emprestimo, int id_usuario, int id_livro, String data_emprestimo, String data_devolucao) {
		this.id_emprestimo = id_emprestimo;
		this.id_usuario = id_usuario;
		this.id_livro = id_livro;
		this.data_emprestimo = data_emprestimo;
		this.data_devolucao = data_devolucao;
	}

	public int getId_emprestimo() {
		return id_emprestimo;
	}

	public void setId_emprestimo(int id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}

	public int getId_cliente() {
		return id_usuario;
	}

	public void setId_cliente(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getId_livro() {
		return id_livro;
	}

	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}

	public String getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(String data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

	public String getData_devolucao() {
		return data_devolucao;
	}

	public void setData_devolucao(String data_devolucao) {
		this.data_devolucao = data_devolucao;
	}

	public String toString() {
		return "Entidades.Emprestimo{" +
				"id_emprestimo=" + id_emprestimo +
				", id_usuario=" + id_usuario +
				", id_livro='" + id_livro + '\'' +
				", data_emprestimo=" + data_emprestimo +
				", data_devolucao=" + data_devolucao +
				'}';
	}
}