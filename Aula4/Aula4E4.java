package aula4;
import java.util.Scanner;

public class Aula4E4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite primeiro numero");
        float numero1 = entrada.nextFloat();
        System.out.println("digite segundo numero");
        float numero2 = entrada.nextFloat();

        if (numero1 == numero2) {
            System.out.println("Numeros iguais: " + numero1);
        } else if (numero1 > numero2) {
            System.out.println("Ordem decrescente: " + numero1 + ", " + numero2);
        } else {
            System.out.println("Ordem decrescente: " + numero2 + ", " + numero1);
        }
        entrada.close();
    }
}
