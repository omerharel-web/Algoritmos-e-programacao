import java.util.Scanner;


public class Aula4exemplojogo {
    
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o numero de pontos do jogador 1 na fase 1");
        Double pontos = entrada.nextDouble();

        if (pontos >= 1000){
        System.out.println("Parabens! voce passou para a fase 2");
       }
       System.out.println("Siga a proxima etapa");
        entrada.close();

    

    }
}
