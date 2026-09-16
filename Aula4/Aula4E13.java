package aula4;

import java.util.Scanner;

public class Aula4E13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada dos números e da operação
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = entrada.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        // Estrutura condicional para verificar a operação
        if (operacao == '+') {
            resultado = num1 + num2;
        } else if (operacao == '-') {
            resultado = num1 - num2;
        } else if (operacao == '*') {
            resultado = num1 * num2;
        } else if (operacao == '/') {
            // Verificação de divisão por zero ou valor inválido
            if (num2 <= 0) {
                System.out.println("Impossível dividir!");
                operacaoValida = false;
            } else {
                resultado = num1 / num2;
            }
        } else {
            System.out.println("Sinal Inválido");
            operacaoValida = false;
        }

        // Impressão do resultado se a operação for válida
        if (operacaoValida) {
            System.out.printf("Resultado: %.2f%n", resultado);
        }

        entrada.close();
    }
}