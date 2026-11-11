import java.util.Scanner;

public class Exercicio5 {
    public static String exibirDiaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terca-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sabado";
            default:
                return "Dia da semana inválido";
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero do dia (1 a 7): ");
        int dia = entrada.nextInt();
        System.out.println(exibirDiaSemana(dia));
        entrada.close();
    }
}
