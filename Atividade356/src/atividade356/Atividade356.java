
package atividade356;
import java.util.Scanner;

public class Atividade356 {


    public static void main(String[] args) {
        int l, c, t;
        String[] nomes = new String[15];
        String[] sit = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        double[] media = new double[15];
        Scanner ler = new Scanner(System.in);
        
        for (l = 0; l <= 14; l++){
            System.out.println();
            System.out.println("Digite o nome do aluno " + (l + 1) + ": ");
            nomes[l] = ler.nextLine();
            
            while (nomes[l].length() > 30){
                System.out.println();
                System.out.println("Nome com mais de 30 caracteres ");
                System.out.println("Digite " +(l+1) + " nome:");
                nomes[l] = ler.nextLine();
            }
            
            t = 30 - nomes[l].length();
            for (c = 1; c <= t; c++){
                nomes[l] = nomes[l] + " ";
            }
            
            System.out.println("Digite a 1 nota: ");
            pr1[l] = ler.nextDouble();

            System.out.println("Digite a 2 nota: ");
            pr2[l] = ler.nextDouble();

            media[l] = (pr1[l] + pr2[l]) / 2.0;

            if (media[l] >= 5){
                sit[l] = "AP";
            } else {
                sit[l] = "RP";
            }

            ler.nextLine();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\tRELACAO FINAL");

        for (l = 0; l <= 14; l++){
            System.out.println();
            System.out.println((l + 1) + "- " + nomes[l] + "\t" + pr1[l] + "\t" + pr2[l] + "\t" + media[l] + "\t" + sit[l]);
        }

        System.out.println();
    }
}
