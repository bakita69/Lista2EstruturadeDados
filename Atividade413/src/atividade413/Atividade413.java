
package atividade413;
import java.util.Scanner;

public class Atividade413 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[][] n = new int[5][5];
        int soma = 0;
        
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Digite o elemento n[" + l + "][" + c + "]: ");
                int valor = ler.nextInt();
                n[l][c] = valor;
            }
        }

        System.out.println("\nToda a matriz:");
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(n[l][c] + "\t");
            }
            System.out.println();
        }

        for (int l = 1; l < 5; l++) {
            for (int c = 0; c < l; c++) {
                if (n[l][c] % 2 == 1) {
                    int quadrado = n[l][c] * n[l][c];
                    soma += quadrado;
                }
            }
        }

        double raizQuadrada = Math.sqrt(soma);
        System.out.println("\nRaiz quadrada da soma dos quadrados dos números ímpares: " + raizQuadrada);

        ler.close();
    }
}

