/*Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. O algoritmo deverá seguir todas as regras da divisão de números reais.
 */

import java.util.Scanner;

 class Questao01 {
     public static void main(String[]args){
         Scanner input = new Scanner(System.in);

         System.out.print("Informe o primeiro número: ");
         double num1 = input.nextDouble();
         System.out.print("Informe o segundo número: ");
         double num2 = input.nextDouble();

         if (num2 == 0)
             System.out.println("\nNão é possível dividir um número por zero");
         else
             System.out.println(num1 + " / " + num2 + " = " + num1/num2);

         input.close();
     }
}
