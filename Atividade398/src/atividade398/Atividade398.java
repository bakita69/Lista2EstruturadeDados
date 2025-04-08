package atividade398;
import java.util.Scanner;

public class Atividade398 {

    public static void main(String[] args) {
        int k, codi, codigo, quantidade, i, aux;
        int[] cod = new int[50];
        int[] quant = new int[50];
        double[] preco = new double[50];
        double venda, geral, auxp;
        Scanner ler = new Scanner(System.in);

        k = 0;
        geral = 0;

        System.out.println("Cadastro de produtos:");
        System.out.println("Digite o codigo do produto ou 0 para acabar:");
        codi = ler.nextInt();

        while(k < 50 && codi != 0){
            cod[k] = codi;
            System.out.println("Digite a quantidade do produto:");
            quant[k] = ler.nextInt();
            System.out.println("Digite o preco do produto:");
            preco[k] = ler.nextDouble();
            k++;
            System.out.println("Digite o codigo do produto ou 0 para acabar:");
            codi = ler.nextInt();
        }

        System.out.println("Iniciando vendas:");
        System.out.println("Digite o codigo do produto a ser vendido ou 0 para terminar:");
        codigo = ler.nextInt();

        while(codigo != 0){
            i = 0;
            while(i < k && cod[i] != codigo){
                i++;
            }
            if(i == k){
                System.out.println("Produto nao-cadastrado");
            } else {
                System.out.println("Digite a quantidade do produto:");
                quantidade = ler.nextInt();
                if(quantidade <= quant[i]){
                    venda = quantidade * preco[i];
                    geral += venda;
                    quant[i] -= quantidade;
                    System.out.println("Venda realizada: R$ " + venda);
                } else {
                    System.out.println("Estoque insuficiente");
                }
            }
            System.out.println("Digite o codigo do produto a ser vendido ou 0 para terminar:");
            codigo = ler.nextInt();
        }

        System.out.println("Total vendido no dia: R$ " + geral);

        for(i = 0; i < k - 1; i++){
            for(int j = i + 1; j < k; j++){
                if(quant[i] < quant[j]){
                    auxp = preco[i];
                    preco[i] = preco[j];
                    preco[j] = auxp;

                    aux = cod[i];
                    cod[i] = cod[j];
                    cod[j] = aux;

                    aux = quant[i];
                    quant[i] = quant[j];
                    quant[j] = aux;
                }
            }
        }

        System.out.println("Estoque final:");
        for(i = 0; i < k; i++){
            System.out.println("Codigo: " + cod[i] + " | Quantidade: " + quant[i] + " | Preco: R$ " + preco[i]);
        }
    }
}
