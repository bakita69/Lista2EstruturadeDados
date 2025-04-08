
package atividade362;
import java.util.Scanner;

public class Atividade362 {

    public static void main(String[] args) {
        int i, j, num1, num2, contadorComuns, jaExiste;
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[20];
        int[] elementosComuns = new int[10];
        Scanner ler = new Scanner(System.in);

        contadorComuns = 0;

        System.out.println("Entrada de dados do vetor 1 (10 elementos):");
        for(i = 0; i < 10; i++){
            System.out.println("Digite o elemento " + (i + 1) + ":");
            vetor1[i] = ler.nextInt();
        }

        System.out.println("Entrada de dados do vetor 2 (20 elementos):");
        for(i = 0; i < 20; i++){
            System.out.println("Digite o elemento " + (i + 1) + ":");
            vetor2[i] = ler.nextInt();
        }

        for(i = 0; i < 10; i++){
            num1 = vetor1[i];
            for(j = 0; j < 20; j++){
                num2 = vetor2[j];
                if(num1 == num2){
                    jaExiste = 0;
                    for(int k = 0; k < contadorComuns; k++){
                        if(elementosComuns[k] == num1){
                            jaExiste = 1;
                        }
                    }
                    if(jaExiste == 0){
                        elementosComuns[contadorComuns] = num1;
                        contadorComuns++;
                    }
                }
            }
        }

        if(contadorComuns == 0){
            System.out.println("Nao existem elementos comuns.");
        } else {
            System.out.println("Elementos comuns:");
            for(i = 0; i < contadorComuns; i++){
                System.out.println(elementosComuns[i]);
            }
        }
    }
}