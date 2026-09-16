package aula4;

import java.util.Scanner;

public class Aula4E6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Leitura dos dados de entrada
        System.out.print("Digite a sua altura (em metros, ex: 1.75): ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o sexo (M para Masculino, F para Feminino): ");
        char sexo = entrada.next().toUpperCase().charAt(0);

        double pesoIdeal = 0.0;

        // Verificação do sexo e cálculo do peso ideal
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
        } else {
            System.out.println("Sexo inválido! Por favor, digite M ou F.");
        }

        entrada.close();
    }
}