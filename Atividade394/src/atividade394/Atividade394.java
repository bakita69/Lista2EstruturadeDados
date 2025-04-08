
package atividade394;
import java.util.Scanner;

public class Atividade394 {

    public static void main(String[] args) {
        int l,c,tam,flag,flag1,flag2;
        double[] nota1 = new double[50];
        double[] nota2 = new double[50];
        double[] media = new double[50];
        String[] nome = new String[50];
        String op;
        Scanner ler =new Scanner(System.in);
        
        flag =0;
        flag1 =0;
        flag2 =0;
        
        do{
            System.out.println("\n");
            System.out.println("MENU");
            System.out.println("l - ENTRAR NOMES");
            System.out.println("2 - ENTRAR 1 NOTA");
            System.out.println("2 - ENTRAR 1 NOTA");
            System.out.println("4 - CALCULAR MEDIA");
            System.out.println("5 - LISTAR NO DISPLAY");
            System.out.println("6 - SAIR");
            System.out.println("OPCAO");
            
            op = ler.nextLine();
             
            switch (op) {
                case "1":
                    flag = 1;
                    for (l = 0; l <= 49; l++) {
                        System.out.print("Digite " + (l + 1) + "º nome (com até 30 caracteres e todas as letras miusculas): ");
                        nome[l] = ler.nextLine();
                        while (nome[l].length() > 30) {
                            System.out.print("Nome com até 30 caracteres. Digite novamente: ");
                            nome[l] = ler.nextLine();
                        }
                        while (nome[l].length() < 30) {
                            nome[l] += "b";
                        }
                    }
                    break;

                case "2":
                    if (flag == 0) {
                        System.out.println("Sem nome cadastrado");
                    } else {
                        for (l=0; l<=49; l++) {
                            System.out.print("Digite 1 nota do aluno " + (l + 1) + ": ");
                            nota1[l] = ler.nextDouble();
                        }
                        ler.nextLine();
                        flag1 = 1;
                    }
                    break;

                case "3":
                    if (flag == 0) {
                        System.out.println("Sem nome cadastrado");
                    } else {
                        for (l=0; l<=49; l++) {
                            System.out.print("Digite 2 nota do aluno " + (l + 1) + ": ");
                            nota2[l] = ler.nextDouble();
                        }
                        ler.nextLine(); 
                        flag2 = 1;
                    }
                    break;

                case "4":
                    if (flag == 0 || flag1 == 0 || flag2 == 0) {
                        System.out.println("Nem todos os dados estao cadastrados");
                    } else {
                        for (l=0; l<=49; l++) {
                            media[l] = (3*nota1[l] + 7*nota2[l]) / 10;
                        }
                    }
                    break;

                case "5":
                    if (flag == 0 || flag1 == 0 || flag2 == 0) {
                        System.out.println("Nem todos os dados estao cadastrados");
                    } else {
                        System.out.println("Nome\t\t\t\tNota1\tNota2\tMedia");
                        for (l=0; l<=49; l++) {
                            System.out.println(nome[l] + "\t" + nota1[l] + "\t" + nota2[l] + "\t" + media[l]);
                        }
                    }
                    break;

                case "6":
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção disponivel");
            }

        } while (!op.equals("6"));

        ler.close();
    }
}
