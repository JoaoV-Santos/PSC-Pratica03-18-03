/*Escreva um programa que peça ao usuário que insira um número de 1 a 4, correspondendo a cada estação do ano (1 para Primavera, 2 para Verão, 3 para Outono, e 4 para Inverno) para identificar a estação escolhida e imprimir uma mensagem característica daquela estação.
 */

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int estacao;

        System.out.println("Escolha uma estação do ano:\n\n1.Primavera\n2.Verão\n3.Outono\n4.Inverno");
        estacao = leitor.nextInt();

        switch (estacao){
            case(1):
                System.out.println("\nAs flores estão vibrantes!");
                break;
            case(2):
                System.out.println("\nO sol está escaldante!");
                break;
            case(3):
                System.out.println("\nAs folhas estão caindo!");
                break;
            case(4):
                System.out.println("\nTire os agasalhos do armário!");
                break;
            default:
                System.out.println("\nEscolha uma opção de 1 a 4.");
        }


        leitor.close();
    }
}
