package aula4;

import java.util.Scanner;

public class Aula4E10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = entrada.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("os números são iguais");
        } else {
            int maior = num1;

            if (num2 > maior) {
                maior = num2;
            }

            if (num3 > maior) {
                maior = num3;
            }

            System.out.println("O maior número é: " + maior);
        }

        entrada.close();
    }
}
    

