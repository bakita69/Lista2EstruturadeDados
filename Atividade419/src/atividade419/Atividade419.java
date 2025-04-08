
package atividade419;
import java.util.Scanner;

public class Atividade419 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] a = new int[5][5];
        int[][] b = new int[5][5];
        int[][] dif = new int[5][5];

        // Leitura da matriz A
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("Digite o elemento de A[" + (l + 1) + "][" + (c + 1) + "]:");
                a[l][c] = ler.nextInt();
            }
        }

        // Leitura da matriz B e cálculo da matriz DIF
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("Digite o elemento de B[" + (l + 1) + "][" + (c + 1) + "]:");
                b[l][c] = ler.nextInt();
                dif[l][c] = a[l][c] - b[l][c];
            }
        }

        // Exibição da matriz diferença
        System.out.println("\nMATRIZ DIFERENÇA:");
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("dif[" + (l + 1) + "][" + (c + 1) + "] = " + dif[l][c]);
            }
        }

        ler.close();
    }
}

