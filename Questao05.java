/*Escreva um programa em Java para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida pela equação: IMC = pesoaltura2. A situação do peso é determinada pela tabela abaixo:
 */
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.print("Informe seu peso em Kg: ");
        peso = input.nextDouble();
        System.out.print("Informe sua altura em metros: ");
        altura = input.nextDouble();

        imc = peso / Math.pow(altura, 2);

        System.out.printf("\nIMC: %.2f\n\n" , imc);

        if (imc < 20)
            System.out.println("Você está abaixo do peso. Procure um nutricionista.");
        else if (imc >= 20  && imc < 25)
            System.out.println("Você está no peso normal.");
        else if (imc >= 25  && imc < 30)
            System.out.println("Você está com sobrepeso. Procure um nutricionista.");
        else if (imc >= 30  && imc < 40)
            System.out.println("Você está com obesidade. Procure um nutricionista.");
        else if (imc >= 40)
            System.out.println("Você está com obesidade mórbida. Procure um nutricionista.");

        input.close();
    }
}
