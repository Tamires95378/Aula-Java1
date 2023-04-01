import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numero1, numero2, soma;
        
        System.out.println("Escreva um numero:");
        numero1 = leia.nextDouble();
        System.out.println("Escreve outro numero:");
        numero2 = leia.nextDouble();
        soma = ((numero1 + numero2));
        System.out.println("A soma dos dois números é " + soma);
        leia.close();
    }
}