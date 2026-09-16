package aula4;
import java.util.Scanner;
public class Aula4E5 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite  um numero inteiro");
        int numero = entrada.nextInt();

        if (numero >= 50 && numero <= 100){
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Nao pertence ao intervalo");
        }
        entrada.close();
    }
}
