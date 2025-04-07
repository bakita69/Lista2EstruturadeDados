
package pessoanumerada;
import java.util.Scanner;

//351

public class Principal {

    public static void main(String[] args) {
        int L,num;
        String nome[] = new String[5];
        Scanner ler = new Scanner(System.in);
        
        for (L = 0; L <= 4; L++){
            System.out.println("Nome " + (L+1) + ":");
            nome[L] = ler.nextLine();         
        }
        System.out.println("Digite o numero de pessoas: ");
        num = ler.nextInt();
        while (num < 1 || num > 5){
            System.out.println("Numero fora do intervalo");
            System.out.println("Digite um numero de pessoa: ");
            num = ler.nextInt();
        }
        System.out.println(nome[num - 1]);
        
    }
    
}
