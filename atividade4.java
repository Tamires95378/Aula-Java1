import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class atividade4{
    public static void main (String[]args) {

        Scanner leia=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double capital,montante,taxaJ,prazoA;

        System.out.print("Qual valor do seu capital:");
        capital=leia.nextDouble();

        System.out.print("Qual é a  a taxa de Juros: ");
        taxaJ=leia.nextDouble()/100;

        System.out.print("Quantos meses deseja  fazer essa aplicação: ");
        prazoA=leia.nextDouble();
        montante = capital* Math.pow(1 + taxaJ, prazoA);

        System.out.print(" O Montante a ser recebido é de: R$" + df.format(montante));
        leia.close();
    }
}