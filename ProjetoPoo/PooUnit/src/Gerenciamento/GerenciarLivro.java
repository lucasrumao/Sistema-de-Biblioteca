package Gerenciamento;

import Entidades.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarLivro {
	private List<Livro> livros;

	public void menu() {
		Scanner input = new Scanner(System.in);
		int op;
		do {
			System.out.println("\n\n --- GERENCIAMENTO DE LIVROS --- ");
			System.out.println(" ----- OPÇÕES DISPONÍVEIS: ----- ");
			System.out.println(" ---- 1. Adicionar Livro ------- ");
			System.out.println(" ---- 2. Remover Livro --------- ");
			System.out.println(" ---- 3. Buscar Livro ---------- ");
			System.out.println(" ---- 4. Listar Livros --------- ");
			System.out.println(" ---- 5. Ir ao Menu Principal -- ");
			System.out.print("Escolha sua opção (1 a 5): ");
			op = input.nextInt();
			switch (op) {
				case 1:
					adicionarLivro();
					break;
				case 2:
					removerLivro();
					break;
				case 3:
					buscarLivroPorId();
					break;
				case 4:
					listarLivros();
					break;
				case 5:
					System.out.println("Retornando....");
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
		} while (op != 5);
	}

	public GerenciarLivro() {
		livros = new ArrayList<>();
	}

	public void adicionarLivro() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n--- CADASTRO DE NOVO LIVRO  --- ");
		System.out.print("Digite o ID do Livro: ");
		int id = input.nextInt(); input.nextLine();
		System.out.print("Digite o Título do Livro: ");
		String titulo = input.nextLine();
		System.out.print("Digite o Autor do Livro: ");
		String autor = input.nextLine();
		System.out.print("Digite a Edição do Livro: ");
		String edicao = input.nextLine();
		System.out.print("Digite o Ano do Livro: ");
		int ano = input.nextInt(); input.nextLine();
		System.out.print("Digite o Número de páginas do Livro: ");
		int numPaginas = input.nextInt(); input.nextLine();
		System.out.print("Digite a Disponibilidade do Livro: ");
		String disponibilidade = input.nextLine();
		Livro livro = new Livro(id, titulo, autor, edicao, ano, numPaginas, disponibilidade);
		livros.add(livro);
		System.out.println("Livro cadastrado com sucesso!");
	}

	public void removerLivro() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n--- GERENCIAMENTO DE LIVROS --- ");
		System.out.println("-------- REMOVER LIVRO ---------");
		System.out.print("Digite o ID do livro que deseja remover: ");
		int livroId = input.nextInt();
		Livro livroParaRemover = null;
		for (Livro livro : livros) {
			if (livro.getId() == livroId) {
				livroParaRemover = livro;
				break;
			}
		}
		if (livroParaRemover != null) {
			livros.remove(livroParaRemover);
			System.out.println("Livro removido com sucesso!");
		} else {
			System.out.println("Livro com ID " + livroId + " não encontrado.");
		}
	}

	public void buscarLivroPorId() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n--- GERENCIAMENTO DE LIVROS --- ");
		System.out.println("----- BUSCAR LIVRO POR ID ----- ");
		System.out.print("Digite o ID do livro que deseja buscar: ");
		int livroId = input.nextInt();
		Livro livroEncontrado = null;
		for (Livro livro : livros) {
			if (livro.getId() == livroId) {
				livroEncontrado = livro;
				break;
			}
		}
		if (livroEncontrado != null) {
			System.out.println("Livro encontrado: " + livroEncontrado);
		} else {
			System.out.println("Livro com ID " + livroId + " não encontrado.");
		}
	}

	public void listarLivros() {
		System.out.println("Lista de livros cadastrados na Biblioteca");
		for (Livro livro : livros) {System.out.println(livro);}
	}
	
	public List<Livro> getLivros(){
		return livros;
	}
}