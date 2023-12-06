package Gerenciamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Emprestimo;
import Entidades.Livro;
import Entidades.Usuario;

public class GerenciarEmprestimo {

	private List<Emprestimo> emprestimos;  // Armazena a lista de empréstimos
	Validador validador = new Validador();
	public GerenciarEmprestimo() {
		emprestimos = new ArrayList<>();
	}
	public void menu(List<Usuario> usuarios, List<Livro> livros) {
		Scanner input = new Scanner(System.in);
		int op;
		do {
			System.out.println("\n\n --- GERENCIAMENTO DE EMPRÉSTIMOS --- ");
			System.out.println(" ----- OPÇÕES DISPONÍVEIS: -------- ");
			System.out.println(" ---- 1. Adicionar Empréstimo ----- ");
			System.out.println(" ---- 2. Finalizar Empréstimo ----- ");
			System.out.println(" ---- 3. Listar Empréstimos ------- ");
			System.out.println(" ---- 4. Ir ao Menu Principal ----- ");
			System.out.print("Escolha sua opção (1 a 4): ");
			op = input.nextInt();
			switch (op) {
				case 1:
					adicionarEmprestimo(usuarios, livros);
					break;
				case 2:
					finalizarEmprestimo();
					break;
				case 3:
					listarEmprestimos();
					break;
				case 4:
					System.out.println("Retornando ao Menu Principal....");
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
		} while (op != 4);
	}

	public void adicionarEmprestimo(List<Usuario> usuarios, List<Livro> livros) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n--- CADASTRO DE NOVO EMPRÉSTIMO --- ");
		System.out.print("Digite o ID do Empréstimo: ");
		int id_emprestimo = input.nextInt();
		System.out.print("Digite o ID do Usuário: ");
		int id_usuario = input.nextInt();
		System.out.print("Digite o ID do Livro: ");
		int id_livro = input.nextInt(); input.nextLine();
		System.out.print("Digite a Data de Empréstimo: ");
		String data_emprestimo = input.nextLine();
		System.out.print("Digite a Data de Devolução: ");
		String data_devolucao = input.nextLine();
		if(validador.validarUsuario(usuarios, id_usuario)== true && validador.validarLivro(livros, id_livro)== true) {
			Emprestimo emprestimo = new Emprestimo(id_emprestimo, id_usuario, id_livro, data_emprestimo, data_devolucao);
			emprestimos.add(emprestimo);
			System.out.println("Empréstimo realizado com sucesso!");
		}else {
			System.out.println("Dados incorretos!");
		}

	}
	public void finalizarEmprestimo() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n--- FINALIZAR EMPRÉSTIMO ---");
		System.out.print("Digite o ID do empréstimo que deseja finalizar: ");
		int id_emprestimo = input.nextInt();
		Emprestimo emprestimoParaFinalizar = null;
		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimo.getId_emprestimo() == id_emprestimo) {
				emprestimoParaFinalizar = emprestimo;
				break;
			}
		}
		if (emprestimoParaFinalizar != null) {
			emprestimos.remove(emprestimoParaFinalizar);
			System.out.println("Empréstimo finalizado com sucesso!");
		} else {
			System.out.println("Empréstimo com ID " + id_emprestimo + " não encontrado.");
		}
	}
	public void listarEmprestimos() {
		for (Emprestimo emprestimo : emprestimos) {
			System.out.println(emprestimo);
		}
	}
}
