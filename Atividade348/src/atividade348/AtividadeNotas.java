
package atividade348;
import java.util.Scanner;

public class AtividadeNotas {

    public static void main(String[] args) {
        int L;
        String nomes[] = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] media = new double[5];
        Scanner ler = new Scanner(System.in);
        
        for (L = 0;L <= 4; L++){
            System.out.print("\nDigite o nome do aluno " + (L + 1) + ": ");
            nomes[L] = ler.nextLine();

            System.out.print("Digite a 1 nota: ");
            pr1[L] = ler.nextDouble();

            System.out.print("Digite a 2 nota: ");
            pr2[L] = ler.nextDouble();

            media[L] = (pr1[L] + pr2[L]) / 2;
            ler.nextLine();
        }
        System.out.println("RELAÇÃO FINAL");
        for(L=0; L<=4; L++){
            System.out.println(L+1 + "- " + nomes[L]);
            System.out.print( pr1[L] + "\t" + pr2[L] + "\t" + media[L]);
        }
        
        
    }
    
}
