package aula4;

import java.util.Scanner;

public class Aula4E12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário da pessoa: R$ ");
        double salario = entrada.nextDouble();

        double desconto = 0.0;

        if (salario <= 600.00) {
            System.out.println("Isento de desconto do INSS.");
        } else if (salario <= 1200.00) {
            desconto = salario * 0.20;
            System.out.printf("Desconto do INSS (20%%): R$ %.2f%n", desconto);
        } else if (salario <= 2000.00) {
            desconto = salario * 0.25;
            System.out.printf("Desconto do INSS (25%%): R$ %.2f%n", desconto);
        } else {
            desconto = salario * 0.30;
            System.out.printf("Desconto do INSS (30%%): R$ %.2f%n", desconto);
        }

        entrada.close();
    }
}
