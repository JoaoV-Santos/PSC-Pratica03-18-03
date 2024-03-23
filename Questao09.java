/*(Decom/UFOP - Adaptado) A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela:
 * Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral. Entrada: QUAL A IDADE DA PESSOA?: 17
Saída: ELEITOR FACULTATIVO */

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("QUAL A IDADE DA PESSOA?");
        idade = leitor.nextInt();

        if (idade < 16)
            System.out.println("\nNÃO É ELEITOR.");
        else if (idade >= 16 && idade <= 17)
            System.out.println("\nELEITOR FACULTATIVO.");
        if (idade >= 18 && idade <= 65)
            System.out.println("\nELEITOR OBRIGATÓRIO.");
        if (idade > 65)
            System.out.println("\nELEITOR FACULTATIVO.");


        leitor.close();
    }
}
