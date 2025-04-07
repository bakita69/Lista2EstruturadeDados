
package atividade354;
import java.util.Scanner;

public class Atividade354 {

    public static void main(String[] args) {
        int l;
        int[] num = new int[15];
        Scanner ler = new Scanner(System.in);        
        for(l=0; l<=14; l++){
            System.out.println("Digite " + (l+1) + " numero: ");
            num[l] = ler.nextInt();
        }
        System.out.println("Relação dos numeros");
        for(l=0; l<=14; l++) {
        System.out.println((l+1) + "- " + num[l]);
        if(num[l] %2==0){
            System.out.println("E par");
            } else {
                System.out.println("e impar");    
            }
                    
        }
    }           
}
