import java.util.Scanner;

public class Exercicio4 {
    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int continuar = 1;

        while (continuar == 1) {
            System.out.print("Digite um numero inteiro: ");
            int numero = entrada.nextInt();

            if (isPar(numero)) {
                System.out.println("Numero par");
            } else {
                System.out.println("Numero impar");
            }

            System.out.print("Continuar? (1 = sim, 0 = nao): ");
            continuar = entrada.nextInt();
        }

        entrada.close();
    }
}
