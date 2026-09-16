package aula4;
import java.util.Scanner;

public class Aula4E2 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite sua idade");
        int idade = entrada.nextInt();
        if (idade >= 18){
            System.out.println("Voce e maior de idade");
        } 
        else {
            System.out.println("Voce nao e maior de idade");
        }
            entrada.close();
   
    }

}
