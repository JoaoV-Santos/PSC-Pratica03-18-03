/*Escreva um programa em Java para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
- Se quantidade <= 5, o desconto será de 2%
- Se quantidade > 5 e quantidade <=10, o desconto será de 3%
- Se quantidade > 10 e quantidade <30, o desconto será de 5%
- Se quantidade >= 30 o desconto será de 10%
*/
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String produto;
        int quantidade;
        double preco = 0, desconto = 0, total = 0, descontoPorcent = 0;

        System.out.print("Informe o nome do produto: ");
        produto = input.nextLine();
        System.out.print("\nInforme a quantidade adquirida deste produto: ");
        quantidade = input.nextInt();
        System.out.print("\nInforme o preço unitário do produto: ");
        preco = input.nextDouble();

        if (quantidade <= 5)
            desconto = 0.98;
        else if (quantidade > 5 && quantidade <= 10)
            desconto = 0.97;
        else if (quantidade > 10 && quantidade < 30)
            desconto = 0.95;
        else if (quantidade >=30)
            desconto = 0.90;

        total = quantidade * preco;

        System.out.printf("\nValor total: R$ %.2f" , total);
        descontoPorcent = (1 - desconto) * 100;
        System.out.printf("\nDesconto: %.0f" , descontoPorcent);
        System.out.print("%");
        System.out.printf("\nTotal a pagar: R$ %.2f" , (total * desconto));


        input.close();
    }
}
