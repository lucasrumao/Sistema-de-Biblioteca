import java.util.List;
import java.util.Scanner;

import Entidades.Livro;
import Entidades.Usuario;
import Gerenciamento.GerenciarEmprestimo;
import Gerenciamento.GerenciarFuncionario;
import Gerenciamento.GerenciarLivro;
import Gerenciamento.GerenciarMulta;
import Gerenciamento.GerenciarUsuario;
import Gerenciamento.Validador;
public class Main {
	public static void menu() {
		System.out.println("\n\nPROJETO POO - SIST. DE BIBLIOTECA");
		System.out.println(" ----- OPÇÕES DISPONÍVEIS: ----- ");
		System.out.println(" ---- 1. Gerenciar Livros ------ ");
		System.out.println(" ---- 2. Gerenciar Usuários ---- ");
		System.out.println(" ---- 3. Gerenciar Funcionários - ");
		System.out.println(" ---- 4. Gerenciar Empréstimos - ");
		System.out.println(" ---- 5. Gerenciar Multas ------ ");
	}
	public static void main(String[] args) {
		GerenciarLivro       gerenciarLivro       = new GerenciarLivro();
		GerenciarUsuario     gerenciarUsuario     = new GerenciarUsuario();
		GerenciarFuncionario gerenciarFuncionario = new GerenciarFuncionario();
		GerenciarEmprestimo  gerenciarEmprestimo  = new GerenciarEmprestimo();
		GerenciarMulta       gerenciarMulta       = new GerenciarMulta();
		Validador validador = new Validador();

		while (true) {
			menu();
			Scanner input = new Scanner(System.in);
			int op;
			do {
				System.out.print("Escolha sua opção (1 a 5): ");
				op = input.nextInt();
				switch (op) {
					case 1:
						gerenciarLivro.menu();
						break;
					case 2:
						gerenciarUsuario.menu();
						break;
					case 3:
						gerenciarFuncionario.menu();
						break;
					case 4:
						List<Usuario> usuarios = gerenciarUsuario.getUsuarios();
						List<Livro> livros = gerenciarLivro.getLivros();
						gerenciarEmprestimo.menu(usuarios, livros);
						break;
					case 5:
						gerenciarMulta.menu();
						break;
					default:
						System.out.println("Opção inválida! Tente novamente.");
				}
			} while (op < 1 || op > 5);
		}
	}
}
