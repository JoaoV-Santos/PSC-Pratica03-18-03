/*Crie um programa para exibir o menu de um caixa eletrônico. Ele deve possuir as opções: Exibir saldo, Exibir extrato, Realizar depósito, Realizar saque, e Sair.
* Se alguma opção inválida for fornecida, exiba uma mensagem de erro e saia do programa. Observação: Utilize a estrutura de seleção Switch/Case para implementar seu produto. Utilize
* strings para indicar cada opção.*/

import java.util.Random;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        double saldo = gerador.nextDouble(1,1000);
        String operacao;

        System.out.println("\nCAIXA ELETRÔNICO\n");

        System.out.println("Escolha uma das opções abaixo:\n\nExibir saldo\nExibir extrato\nRealizar depósito\nRealizar saque\nSair");
        operacao = input.nextLine();

        switch (operacao){
            case("Exibir saldo"):
                System.out.printf("\nSaldo Atual: R$ %.2f" , saldo);
                break;
            case("Exibir extrato"):
                System.out.printf("\nExtrato: R$ %.2f" , saldo);
                break;
            case("Realizar depósito"):
                System.out.printf("\nSaldo Atual: R$ %.2f" , saldo);
                System.out.print("\nInforme o valor do depósito: ");
                double deposito = input.nextDouble();
                saldo = saldo + deposito;
                System.out.printf("\nSaldo após operação: R$ %.2f" , saldo);
                break;
            case("Realizar saque"):
                System.out.printf("\nSaldo Atual: R$ %.2f" , saldo);
                System.out.print("\nInforme o valor do saque: ");
                double saque = input.nextDouble();
                saldo = saldo - saque;
                System.out.printf("\nSaldo após operação: R$ %.2f" , saldo);
                break;
            case ("Sair"):
                System.out.println("\nSessão encerrada. Volte sempre!");
                break;
            default:
                System.out.println("\nErro. Opção inválida.");
        }

        input.close();
    }
}
