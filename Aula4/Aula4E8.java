package aula4;
import java.util.Scanner;
public class Aula4E8 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = entrada.nextLine();

        if (senha.equals("R10p5")){
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }  
        entrada.close();     
    }
}
