
package atividade358;
import java.util.Scanner;

public class Atividade358 {

    public static void main(String[] args) {
         double[] compra = new double[100];
        double[] venda = new double[100];
        double lucro;
        int totlucromenor10 = 0;
        int totlucromenor20 = 0;
        int totlucromaior20 = 0;
        int a;
        Scanner ler = new Scanner(System.in);

        for (a = 0; a < 100; a++) {
            System.out.println();
            System.out.println("Compra: ");
            compra[a] = ler.nextDouble();

            System.out.println("Venda: ");
            venda[a] = ler.nextDouble();
        }

        for (a = 0; a < 100; a++) {
            lucro = venda[a] - compra[a];

            if (lucro < 10.0) {
                totlucromenor10++;
            } else {
                if (lucro <= 20.0) {
                    totlucromenor20++;
                } else {
                    totlucromaior20++;
                }
            }
        }

        System.out.println();
        System.out.println("Total de mercadorias com lucro < 10%: " + totlucromenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totlucromenor20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totlucromaior20);
        System.out.println();
    }
}    
