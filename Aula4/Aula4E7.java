package aula4;
import java.util.Scanner;
public class Aula4E7 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salario do funcionario: R$");
        double salario = entrada.nextDouble();

        System.out.println("Digite a quantidade de anos na empresa: ");
        int anos = entrada.nextInt();

        double bonus;
        
        if (anos >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }
        System.out.printf("O bonus do funcionario e: R$ %.2f%n  ", bonus);
        entrada.close();
        }
}
