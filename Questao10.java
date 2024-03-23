/*(Decom/UFOP) Na lojinha do Sr. Aboo, encontramos produtos de informática com preços especiais. Mas o Sr. Aboo segue uma receita de seus antepassados para acrescentar uma porcentagem sobre o valor de custo do produto, garantindo assim, a estabilidade financeira das futuras gerações de sua família. A tabela abaixo, feita pelo avô do Sr. Aboo, descreve o valor do lucro de um produto, considerando o valor de compra do mesmo.*/

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double valorCompra;
        int lucro = 0;

        System.out.println("\nLojinha do Sr. Aboo\n");

        System.out.print("Informe o valor de compra com o fornecedor: ");
        valorCompra = input.nextDouble();

        if (valorCompra < 10) {
            valorCompra *= 1.7;
            lucro = 70;
        }
        else if (valorCompra >= 10 && valorCompra < 30) {
            valorCompra *= 1.5;
            lucro = 50;
        }
        else if (valorCompra >= 30 && valorCompra < 50) {
            valorCompra *= 1.4;
            lucro = 40;
        }
        else if (valorCompra >= 50) {
            valorCompra *= 1.3;
            lucro = 30;
        }

        System.out.println("\nPorcentagem de lucro: " + lucro + "%");
        System.out.printf("Valor de venda do item: R$ %.2f" , valorCompra);


        input.close();
    }
}
