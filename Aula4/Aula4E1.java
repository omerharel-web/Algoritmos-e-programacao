package aula4;

import java.util.Scanner;

public class Aula4E1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite sua nota");
        Double nota = entrada.nextDouble();
        Double nota2 = nota/2; 

        if (nota>20.0){
            System.out.print("A metade da nota é: " + (nota2));

        
        }
        entrada.close();
     }
}

