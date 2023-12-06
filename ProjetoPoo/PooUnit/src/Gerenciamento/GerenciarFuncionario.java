package Gerenciamento;

import Entidades.Funcionario;
import Entidades.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionario {
    private static List<Funcionario> funcionarios;

    public void menu() {
        Scanner input = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n\n --- GERENCIAMENTO DE FUNCIONÁRIOS --- ");
            System.out.println(" ----- OPÇÕES DISPONÍVEIS: ----- ");
            System.out.println(" ---- 1. Adicionar Funcionário ----- ");
            System.out.println(" ---- 2. Remover Funcionários -------- ");
            System.out.println(" ---- 3. Buscar Funcionário  ------- ");
            System.out.println(" ---- 4. Listar Funcionário ------- ");
            System.out.println(" ---- 5. Ir ao Menu Principal ------- ");
            System.out.print("Escolha sua opção (1 a 4): ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    buscarFuncionarioPorId();
                    break;
                case 4:
                    listarFuncionarios();
                    break;
                case 5:
                    System.out.println("Retornando ao Menu Principal....");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 5);
    }
    public GerenciarFuncionario() {
        funcionarios = new ArrayList<>();
    }

    public static void cadastrarFuncionario() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n--- CADASTRO DE FUNCIONÁRIO --- ");
        System.out.print("Digite o ID do Funcionário: ");
        int id = input.nextInt(); input.nextLine();
        System.out.print("Digite o Nome do Funcionário: ");
        String nome = input.nextLine();
        System.out.print("Digite o Email do Funcionário: ");
        String email = input.nextLine();
        System.out.print("Digite o Endereço do Funcionário: ");
        String endereco = input.nextLine();
        System.out.print("Digite o Telefone do Funcionário: ");
        String telefone = input.nextLine();
        System.out.print("Digite o Cargo do Funcionário: ");
        String cargo = input.nextLine();
        System.out.print("Digite o Salário do Funcionário: ");
        double salario = input.nextDouble();
        Funcionario funcionario = new Funcionario(id, nome, email, endereco, telefone, cargo, salario);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }
    public static void removerFuncionario(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n--- GERENCIAMENTO DE FUNCIONÁRIOS --- ");
        System.out.println("-------- REMOVER FUNCIONÁRIO ---------");
        System.out.print("Digite o ID do funcionário que deseja remover: ");
        int funcionarioId = input.nextInt();
        Funcionario funcionarioParaRemover = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == funcionarioId) {
                funcionarioParaRemover = funcionario;
                break;
            }
        }
        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("Usuário com ID " + funcionarioId + " não encontrado.");
        }
    }
    public static void buscarFuncionarioPorId() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n--- BUSCAR FUNCIONÁRIO POR ID --- ");
        System.out.print("Digite o ID do funcionário que deseja buscar: ");
        int funcionarioId = input.nextInt();
        Funcionario funcionarioEncontrado = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == funcionarioId) {
                funcionarioEncontrado = funcionario;
                break;
            }
        }
        if (funcionarioEncontrado != null) {
            System.out.println("Funcionário encontrado: " + funcionarioEncontrado);
        } else {
            System.out.println("Funcionário com ID " + funcionarioId + " não encontrado.");
        }
    }
    public static void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println (" ID: "+ funcionario.getId()+
        			" Usuario: " + funcionario.getNome() +
       			 " Email: " + funcionario.getEmail() +
       			 "  Telefone: " + funcionario.getTelefone()+
       			 " Endereço: "+ funcionario.getEndereco()+
       			 " Cargo: "+ funcionario.getSalario()+
       			 " Salario: "+ funcionario.getSalario()+
       					   "");;
        }
    }
}

