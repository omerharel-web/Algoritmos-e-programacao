package aula4;
import java.util.Scanner;

public class Aula4E3 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite primeiro numero");
        int numero1 = entrada.nextInt();
        System.out.println("digite segundo numero");
        int numero2 = entrada.nextInt();
        
        if (numero1 == numero2){
            System.out.println("Os numeros sao iguais");
        } else {
            int diferencia;

            if (numero1 > numero2){
                diferencia = numero1 - numero2;
                System.out.println("diferacia do maior pelo menor e: " + diferencia);
            } else {
                diferencia = numero2 - numero1;
                System.out.println("diferacia do maior pelo menor e: " + diferencia);
            }
        }

        entrada.close();
    }
}
