
package atividade400;
import java.util.Scanner;

public class Atividade400 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] leitos = new int[50];
        int[] nd = new int[50];

        double[] precos = new double[50];
        double[] despesas = new double[50];

        String[] sit = new String[50];
        String[] din = new String[50];
        String[] dout = new String[50];
        String[] nome = new String[50];
        String[] tel = new String[50];

        int op, quarto, i;
        String resp, nomep;
        boolean chave = false;

        for (i = 0; i < 50; i++) {
            sit[i] = "l";
            leitos[i] = 5;
            precos[i] = 30.0;
            nd[i] = 0;
            despesas[i] = 0.0;
            din[i] = "XXXX";
            dout[i] = "XXXX";
            nome[i] = "";
            tel[i] = "";
        }

        do {
            System.out.println("\nHotel Fazenda Sucesso");
            System.out.println("1. Cadastrar quartos");
            System.out.println("2. Listar todos os quartos");
            System.out.println("3. Listar quartos ocupados");
            System.out.println("4. Aluguel/Reserva quarto");
            System.out.println("5. Inserir despesas extras");
            System.out.println("6. Calcular despesa do quarto");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            op = ler.nextInt();
            ler.nextLine();

            switch (op) {
                case 1:
                    if (chave) {
                        System.out.println("Atenção. Dados já cadastrados.");
                    } else {
                        for (i = 0; i < 50; i++) {
                            System.out.print("Quantidade de leitos para o quarto " + (i + 1) + ": ");
                            leitos[i] = ler.nextInt();
                            System.out.print("Preço do quarto " + (i + 1) + ": ");
                            precos[i] = ler.nextDouble();
                            sit[i] = "l";
                            nd[i] = 0;
                            despesas[i] = 0.0;
                            din[i] = "XXXX";
                            dout[i] = "XXXX";
                            nome[i] = "";
                            tel[i] = "";
                        }
                        chave = true;
                    }
                    break;

                case 2:
                    if (!chave) {
                        System.out.println("Escolha a opção 1 para cadastrar os quartos.");
                    } else {
                        for (i = 0; i < 50; i++) {
                            System.out.println("\nNúmero do quarto: " + (i + 1));
                            System.out.println("Situação: " + sit[i]);
                            System.out.println("Nome: " + (nome[i].isEmpty() ? "Não reservado" : nome[i]));
                            System.out.println("Telefone: " + (tel[i].isEmpty() ? "Não reservado" : tel[i]));
                            System.out.println("Quantidade de leitos: " + leitos[i]);
                            System.out.println("Preço: R$ " + precos[i]);
                            System.out.println("Despesas extras: R$ " + despesas[i]);
                            System.out.println("Data de entrada: " + din[i]);
                            System.out.println("Data de saída: " + dout[i]);
                            System.out.println("Número de diárias: " + nd[i]);
                        }
                    }
                    break;

                case 3:
                    if (!chave) {
                        System.out.println("Escolha a opção 1 para cadastrar os quartos.");
                    } else {
                        for (i = 0; i < 50; i++) {
                            if (sit[i].equals("A")) {
                                System.out.println("\nNúmero do quarto: " + (i + 1));
                                System.out.println("Nome: " + nome[i]);
                                System.out.println("Telefone: " + tel[i]);
                                System.out.println("Despesas: R$ " + despesas[i]);
                                System.out.println("Data de entrada: " + din[i]);
                                System.out.println("Data de saída: " + dout[i]);
                                System.out.println("Número de diárias: " + nd[i]);
                            }
                        }
                    }
                    break;

                case 4:
                    if (!chave) {
                        System.out.println("Escolha a opção 1 para cadastrar os quartos.");
                    } else {
                        System.out.print("Digite 'A' para aluguel ou 'R' para reserva: ");
                        resp = ler.nextLine().toUpperCase();

                        while (!resp.equals("A") && !resp.equals("R")) {
                            System.out.print("Resposta inválida. Digite 'A' ou 'R': ");
                            resp = ler.nextLine().toUpperCase();
                        }

                        if (resp.equals("A")) {
                            System.out.print("Digite o nome do cliente para aluguel: ");
                            nomep = ler.nextLine();
                            i = 0;
                            while (i < 50 && !nome[i].equals(nomep)) {
                                i++;
                            }
                            if (i < 50) {
                                quarto = i;
                                sit[quarto] = "A";
                                despesas[quarto] = 0.0;
                                System.out.print("Data de entrada (dd/mm/yyyy): ");
                                din[quarto] = ler.nextLine();
                                System.out.print("Data de saída (dd/mm/yyyy): ");
                                dout[quarto] = ler.nextLine();
                                System.out.print("Número de diárias: ");
                                nd[quarto] = ler.nextInt();
                                ler.nextLine();
                            } else {
                                System.out.println("Reserva não encontrada.");
                            }
                        } else {
                            System.out.print("Número do quarto para reserva: ");
                            quarto = ler.nextInt();
                            ler.nextLine();
                            while (quarto < 1 || quarto > 50 || sit[quarto - 1].equals("A")) {
                                System.out.print("Quarto ocupado ou inválido. Digite novamente: ");
                                quarto = ler.nextInt();
                                ler.nextLine();
                            }
                            sit[quarto - 1] = "R";
                            System.out.print("Nome do cliente: ");
                            nome[quarto - 1] = ler.nextLine();
                            System.out.print("Telefone: ");
                            tel[quarto - 1] = ler.nextLine();
                            System.out.print("Data de entrada (dd/mm/yyyy): ");
                            din[quarto - 1] = ler.nextLine();
                            System.out.print("Data de saída (dd/mm/yyyy): ");
                            dout[quarto - 1] = ler.nextLine();
                            System.out.print("Número de diárias: ");
                            nd[quarto - 1] = ler.nextInt();
                            ler.nextLine();
                        }
                    }
                    break;

                case 5:
                    if (!chave) {
                        System.out.println("Escolha a opção 1 para cadastrar os quartos.");
                    } else {
                        System.out.print("Número do quarto para inserir despesas extras: ");
                        quarto = ler.nextInt();
                        while (quarto < 1 || quarto > 50) {
                            System.out.print("Quarto inválido. Digite novamente: ");
                            quarto = ler.nextInt();
                        }
                        System.out.print("Digite o valor da despesa: ");
                        double valor = ler.nextDouble();
                        despesas[quarto - 1] += valor;
                        ler.nextLine();
                    }
                    break;

                case 6:
                    if (!chave) {
                        System.out.println("Escolha a opção 1 para cadastrar os quartos.");
                    } else {
                        System.out.print("Número do quarto para calcular a despesa: ");
                        quarto = ler.nextInt();
                        while (quarto < 1 || quarto > 50) {
                            System.out.print("Quarto inválido. Digite novamente: ");
                            quarto = ler.nextInt();
                        }
                        double total = precos[quarto - 1] * nd[quarto - 1] + despesas[quarto - 1];
                        System.out.println("Total de despesas do quarto " + quarto + ": R$ " + total);
                        sit[quarto - 1] = "l";
                        despesas[quarto - 1] = 0.0;
                        din[quarto - 1] = "XXXX";
                        dout[quarto - 1] = "XXXX";
                        nome[quarto - 1] = "";
                        tel[quarto - 1] = "";
                        nd[quarto - 1] = 0;
                        ler.nextLine();
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 7);

        ler.close();
    }
}

