import java.util.Scanner;

public class Exercicio3 {
    public static int encontrarMax(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = entrada.nextInt();

        System.out.println("Maior numero: " + encontrarMax(n1, n2));
        entrada.close();
    }
}
