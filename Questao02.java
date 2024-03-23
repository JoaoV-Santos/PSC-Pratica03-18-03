/*Escreva um programa em Java para ler as notas da 1ª, 2ª e  3ª avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que média igual ou maior que 7 o aluno é aprovado). Escrever também a média calculada.
 */

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInforme a primeira nota do aluno: ");
        double primeiraNota = leitor.nextDouble();
        System.out.print("\nInforme a segunda nota do aluno: ");
        double segundaNota = leitor.nextDouble();
        System.out.print("\nInforme a terceira nota do aluno: ");
        double terceiraNota = leitor.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (media >= 7)
            System.out.println("\nAluno Aprovado!");
        else
            System.out.println("\nAluno Reprovado!");

        System.out.printf("\nMédia do Aluno: %.2f" , media);

        leitor.close();
    }
}
