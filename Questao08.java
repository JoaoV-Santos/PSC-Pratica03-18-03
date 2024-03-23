/*Você está trabalhando em uma startup voltada para educação, e ficou responsável por criar a lógica de uma das atividades. Seu programa deve
* receber o valor dos três lados de um triângulo, e informar se ele é equilátero, isósceles ou escaleno. Restrição: Em um triângulo, o
* comprimento de um lado é sempre menor do que a soma dos outros dois!*/

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double a = 0, b = 0, c = 0;

        System.out.print("Informe a medida do primeiro lado do triângulo: ");
        a = leitor.nextDouble();
        System.out.print("\nInforme a medida do segundo lado do triângulo: ");
        b = leitor.nextDouble();
        System.out.print("\nInforme a medida do terceiro lado do triângulo: ");
        c = leitor.nextDouble();
        
        if(a == 0 || b == 0 || c == 0)
            System.out.println("\nIsto não é um triângulo. Nenhum dos lados pode ser igual a zero!");

        if (a < (b + c) || b < (a + c) || c < (a + b)){
            if (a == b && b == c)
                System.out.println("\nEste é um triângulo equilátero!");
            else if (a != b && a != c && b != c)
                System.out.println("\nEste é um triângulo escaleno!");
            else
                System.out.println("\nEste é um triângulo isósceles!");
        }
        else
            System.out.println("\nIsto não é um triângulo. O comprimento de um lado é sempre menor do que a soma dos outros dois!");

        leitor.close();
    }
}
