
package atividade370;
import java.util.Scanner;

public class Atividade370 {

    public static void main(String[] args) {
        int nv, i;
        int[] voos = new int[1000];
        String[] nome = new String[1000];
        String id,nvd;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com o numero de voos: ");
        nv = ler.nextInt();
        
        for (i=0;i<nv; i++){
            System.out.println("Entre com a identificacao do vo: "+(i+1)+ ": ");
            nome[i] = ler.nextLine();
            System.out.println("Entre com a quantidade de lugares disponiveis no voo" +nome[i]+ ": ");
            voos[i] = ler.nextInt();             
        }
        System.out.println("Entre com o numero do voo desejado ou @ para terminar: ");
        nvd = ler.nextLine();
        while ("@" != nvd){
            i=0;
            while(nvd != nome[i] && i < (nv-1)){
                i++;
            }
            if(nome[i] == nvd){
                if(voos[i] > 0){
                    voos[i]--;
                    System.out.println("Qual o numero da identidade do cliente? ");
                    id = ler.nextLine();
                    System.out.println("Identidade: " +id+ " Voo: " + nvd);
            }else{
                    System.out.println("~ao existe este voo");
                }
                System.out.println("Entre com o numero do voo desejado ou O para terminar: ");
                nvd = ler.nextLine();
            }              
    }            
    }
    
}
