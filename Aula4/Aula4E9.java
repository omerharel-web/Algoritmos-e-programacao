package aula4;
import java.util.Scanner;

public class Aula4E9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = entrada.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = entrada.nextDouble();

        double limiteMaximo = salarioBruto * 0.30;

        if (valorPrestacao <= limiteMaximo) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        entrada.close();
    }
}