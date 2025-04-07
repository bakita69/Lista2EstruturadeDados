
package atividade360;
import java.util.Scanner;

public class Atividade360 {

    public static void main(String[] args) {
        int data, dia, mes;
        int[] ultDia = new int[12];
        String[] signo = new String[12];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o signo: ");
            signo[i] = ler.nextLine();

            System.out.print("Digite o último dia do mês para esse signo: ");
            ultDia[i] = ler.nextInt();
            ler.nextLine();
        }  

        System.out.println("Digite data no formato ddmm ou 9999 para terminar:");
        data = ler.nextInt();

        while (data != 9999) {
            dia = data / 100;
            mes = data % 100;
            mes--;

            if (dia > ultDia[mes]) {
                mes = (mes + 1) % 12;
            }

            System.out.println("Signo: " + signo[mes]);

            System.out.println("Digite data no formato ddmm ou 9999 para terminar:");
            data = ler.nextInt();
        }
    }
}
