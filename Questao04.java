/*Avalie o código abaixo e determine se suas saídas estão corretas. Primeiro, tente identificar a falha sem executar o programa; Em seguida, implemente e veja se acertou. Se houver erros, aponte-os e proponha e implemente as correções.
 */

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args){
        double salario = 0;
        Scanner entrada = new Scanner(System.in);
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        System.out.println();
        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = entrada.nextDouble();

        if (salario <= 1000)
            salario *= taxaAumento3;
        else if (salario >= 1000 && salario <= 2000)
            salario *= taxaAumento2;
        else if (salario >= 2000 && salario <= 3000)
            salario *= taxaAumento1;
        else if (salario >= 3000 && salario <= 4000)
            salario = (salario * taxaAumento1) + 200;


        System.out.println();
        System.out.printf("Novo Salário: %.2f\n\n" , salario);
    }
}
