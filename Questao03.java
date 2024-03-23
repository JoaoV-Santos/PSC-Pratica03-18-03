/*Escreva um programa em Java para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
 */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double total, branco, nulo, valido;

        System.out.print("Informe o número total de eleitores: ");
        total = leitor.nextDouble();
        System.out.print("\nInforme o número total de votos brancos: ");
        branco = leitor.nextDouble();
        System.out.print("\nInforme o número total de votos nulos: ");
        nulo = leitor.nextDouble();
        System.out.print("\nInforme o número total de votos válidos: ");
        valido = leitor.nextDouble();

        //branco = (branco * 100 / total)

        System.out.println("\nNúmero total de votos: " + total);
        System.out.println("\nPorcentagem de votos brancos: " + (branco * 100 / total) + " %");
        System.out.println("\nPorcentagem de votos nulos: " + (nulo * 100 / total) + " %");
        System.out.println("\nPorcentagem de votos válidos: " + (valido * 100 / total) + " %");

        leitor.close();
    }
}
