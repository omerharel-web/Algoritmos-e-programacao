package aula4;

import java.util.Scanner;

public class Aula4Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua nacionalidade (digite 1 para Brasileira ou 2 para Outra): ");
        int nacionalidade = entrada.nextInt();

        if (nacionalidade != 1) {
            System.out.println("Apenas cidadãos brasileiros podem votar no Brasil.");
        } else {
            System.out.print("Digite a sua idade: ");
            int idade = entrada.nextInt();

            if (idade < 16) {
                System.out.println("Você não está apto(a) a votar (idade mínima é 16 anos).");
            } else if ((idade >= 16 && idade < 18) || idade >= 70) {
                System.out.println("Você está apto(a) a votar! O seu voto é FACULTATIVO.");
            } else {
                System.out.println("Você está apto(a) a votar! O seu voto é OBRIGATÓRIO.");
            }
        }

        entrada.close();
    }
}