import java.util.Scanner;

public class Exercicio7 {
    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero inteiro de 0 a 12: ");
        int numero = entrada.nextInt();

        if (numero < 0 || numero > 12) {
            System.out.println("Digite um numero entre 0 e 12.");
        } else {
            System.out.println("Fatorial de " + numero + " = " + calcularFatorial(numero));
        }

        entrada.close();
    }
}
