import java.util.Scanner;

public class Exercicio6 {
    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static double calcularMediaExtremos(int[] numeros) {
        return ((double) encontrarMaior(numeros) + encontrarMenor(numeros)) / 2;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos numeros deseja digitar? ");
        int tamanho = entrada.nextInt();

        if (tamanho <= 0) {
            System.out.println("O vetor precisa ter pelo menos um elemento.");
            entrada.close();
            return;
        }

        int[] numeros = new int[tamanho];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Maior valor: " + encontrarMaior(numeros));
        System.out.println("Menor valor: " + encontrarMenor(numeros));
        System.out.println("(Maior + menor) / 2: " + calcularMediaExtremos(numeros));
        entrada.close();
    }
}
