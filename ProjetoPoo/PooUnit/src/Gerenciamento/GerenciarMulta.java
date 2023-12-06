package Gerenciamento;

import Entidades.Multa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GerenciarMulta {
    private static List<Multa> multas;

    public void menu() {
        System.out.println("\n\n --- GERENCIAMENTO DE MULTAS --- ");
        System.out.println(" ----- OPÇÕES DISPONÍVEIS: ----- ");
        System.out.println(" ---- 1. Adicionar Multa ------- ");
        System.out.println(" ---- 2. Remover Multa --------- ");
        System.out.println(" ---- 3. Buscar Multa ---------- ");
        System.out.println(" ---- 4. Listar Multas --------- ");
        System.out.println(" ---- 5. Ir ao Menu Principal -- ");

        int op;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Escolha sua opção (1 a 5): ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    adicionarMulta();
                    break;
                case 2:
                    removerMulta();
                    break;
                case 3:
                    buscarMultaPorId();
                    break;
                case 4:
                    listarMultas();
                    break;
                case 5:
                    System.out.println("Retornando....");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 5);
    }

    public GerenciarMulta() {multas = new ArrayList<>();}

    public static void adicionarMulta() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n--- CADASTRO DE NOVA MULTA  --- ");
        System.out.print("Digite o ID da Multa: ");
        int id = input.nextInt(); input.nextLine();
        System.out.print("Digite o Valor da Multa: ");
        double valor = input.nextDouble(); input.nextLine();
        System.out.print("Digite o Motivo da Multa: ");
        String motivo = input.nextLine();
        System.out.print("Digite a Data de Aplicação da Multa (dd/mm/aaaa): ");
        String dataAplicacaoStr = input.nextLine();
        Date dataAplicacao = converterStringParaData(dataAplicacaoStr);
        System.out.print("Digite a Data de Vencimento da Multa (dd/mm/aaaa): ");
        String dataVencimentoStr = input.nextLine();
        Date dataVencimento = converterStringParaData(dataVencimentoStr);

        Multa multa = new Multa(id, valor, motivo, dataAplicacao, dataVencimento);
        multas.add(multa);
        System.out.println("Multa cadastrada com sucesso!");
    }

    public static void removerMulta() {
        System.out.print("Digite o ID da Multa a ser removida: ");
        Scanner input = new Scanner(System.in);
        int multaId = input.nextInt();
        Multa multaParaRemover = null;
        for (Multa multa : multas) {
            if (multa.getId() == multaId) {
                multaParaRemover = multa;
                break;
            }
        }
        if (multaParaRemover != null) {
            multas.remove(multaParaRemover);
            System.out.println("Multa removida com sucesso.");
        } else {
            System.out.println("Multa não encontrada com o ID fornecido.");
        }
    }

    public static void buscarMultaPorId() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ID da Multa a ser buscada: ");
        int multaId = input.nextInt();
        for (Multa multa : multas) {
            if (multa.getId() == multaId) {
                System.out.println("Multa encontrada:");
                exibirDetalhesMulta(multa);
                return;
            }
        }
        System.out.println("Multa não encontrada com o ID fornecido.");
    }

    public static void listarMultas() {
        for (Multa multa : multas) {
            exibirDetalhesMulta(multa);
        }
    }

    private static void exibirDetalhesMulta(Multa multa) {
        System.out.println("Detalhes da Multa:");
        System.out.println("ID: " + multa.getId());
        System.out.println("Valor: " + multa.getValor());
        System.out.println("Motivo: " + multa.getMotivo());
        System.out.println("Data de Aplicação: " + multa.getDataAplicacao());
        System.out.println("Data de Vencimento: " + multa.getDataVencimento());
        System.out.println();
    }

    private static Date converterStringParaData(String dataStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = dateFormat.parse(dataStr);
            return data;
        } catch (Exception e) {
            System.out.println("Formato de data inválido. Use o formato 'dd/MM/yyyy'.");
            return null;
        }
    }
}
