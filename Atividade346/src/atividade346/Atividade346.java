
package atividade346;
import java.util.Scanner;

public class Atividade346 {

    public static void main(String[] args) {
        String frase;
        int x, tam;
        int op =0;
        
        while(op != 4){
        System.out.println("Menu");
        System.out.println(" 1-Imprime o comprimento da frase ");
        System.out.println(" 2-Imprime os dois primeiros e os dois ultimos caracters");        
        System.out.println(" 3-Imprime a frase espalhada");
        System.out.println(" 4-Termina o algoritimo");
        Scanner ler = new Scanner(System.in);
        op = ler.nextInt();
        switch(op){
            case 1: {
                ler.nextLine();
                System.out.println("Digite uma frase: ");
                frase = ler.nextLine();
                System.out.println("Numero de caracters da frase: " + frase.length());            
            
                break;   
                }
            case 2: {
                ler.nextLine();
                System.out.println("Digite uma frase: ");
                frase = ler.nextLine();
                System.out.println("Os dois primeiros caracteres: "+ frase.substring(0,2));
                tam = frase.length() -2;
                System.out.println("Os dois ultimos caracters: " + frase.substring(tam));
                
                break;
                }
            case 3: {
                ler.nextLine(); 
                System.out.println("Digite uma frase: ");
                frase = ler.nextLine();
                for (x = frase.length() -1; x >= 0; x--) {
                    System.out.println(frase.charAt(x));
                }
                
                break;
                }       
        }      
        }                                             
    }
    
}
