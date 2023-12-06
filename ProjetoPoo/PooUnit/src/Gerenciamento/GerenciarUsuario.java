package Gerenciamento;
import Entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarUsuario {
    private static List<Usuario>usuarios;
    public void menu() {
        Scanner input = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n\n --- GERENCIAMENTO DE USUÁRIOS --- ");
            System.out.println(" ----- OPÇÕES DISPONÍVEIS: ----- ");
            System.out.println(" ---- 1. Adicionar Usuário ------- ");
            System.out.println(" ---- 2. Remover Usuário --------- ");
            System.out.println(" ---- 3. Buscar Usuário ---------- ");
            System.out.println(" ---- 4. Listar Usuários --------- ");
            System.out.println(" ---- 5. Ir ao Menu Principal -- ");
            System.out.print("Escolha sua opção (1 a 5): ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    removerUsuario();
                    break;
                case 3:
                    buscarUsuarioporId();
                    break;
                case 4:
                    listarUsuarios();
                    break;
                case 5:
                    System.out.println("Retornando....");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 5);
    }

public GerenciarUsuario() {usuarios = new ArrayList<>();}

    public static void cadastrarUsuario() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n--- CADASTRO DE USUÁRIO --- ");
        System.out.print("Digite o ID do Usuário: ");
        int id = input.nextInt(); input.nextLine();
        System.out.print("Digite o Nome do Usuário: ");
        String nome = input.nextLine();
        System.out.print("Digite o Email do Usuário: ");
        String email = input.nextLine();
        System.out.print("Digite o Endereço do Usuário: ");
        String endereco = input.nextLine();
        System.out.print("Digite o Telefone do Usuário: ");
        String telefone = input.nextLine();
       // System.out.print("Digite o Cargo do Usuário: ");
      //  String cargo = input.nextLine();
      //  System.out.print("Digite o Salário do Usuário: ");
      //  double salario = input.nextDouble();
        boolean bloqueado = false;
        Usuario usuario = new Usuario(id, nome, email, endereco, telefone, bloqueado);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }
    public void removerUsuario() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n--- GERENCIAMENTO DE USUÁRIOS --- ");
        System.out.println("-------- REMOVER USUÁRIO ---------");
        System.out.print("Digite o ID do usuário que deseja remover: ");
        int usuarioId = input.nextInt();
        Usuario usuarioParaRemover = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == usuarioId) {
                usuarioParaRemover = usuario;
                break;
            }
        }
        if (usuarioParaRemover != null) {
            usuarios.remove(usuarioParaRemover);
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("Usuário com ID " + usuarioId + " não encontrado.");
        }
    }
    public void buscarUsuarioporId() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n--- GERENCIAMENTO DE USUÁRIOS --- ");
        System.out.println("----- BUSCAR USUÁRIO ----- ");
        System.out.print("Digite o ID do Usuário que deseja buscar: ");
        int usuarioId = input.nextInt();
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == usuarioId) {
                usuarioEncontrado = usuario;
                break;
            }
        }
        if (usuarioEncontrado != null) {
            System.out.println("Usuário encontrado: " + usuarioEncontrado);
        } else {
            System.out.println("Usuário com ID " + usuarioId + " não encontrado.");
        }
    }
    public void listarUsuarios() {
        System.out.println("Lista de usuários cadastrados na Biblioteca");
        for (Usuario usuario : usuarios) {
        	System.out.println(" ID: "+ usuario.getId()+
        			" Usuario: " + usuario.getNome() +
        			 " Email: " + usuario.getEmail() +
        			 "  Telefone: " + usuario.getTelefone()+
        			 " Endereço: "+ usuario.getEndereco()+
        					   "");
        	}
    }
    
    public List<Usuario> getUsuarios(){
    	return usuarios;
    }
}
