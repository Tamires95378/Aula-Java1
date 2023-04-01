import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade10{
    public static void main(String[]args) {
        
        Scanner leia =new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double mediaAritmetica, mediaHarmonica, mediaGeometrica, mediaGeometricaFinal, numero1, numero2, numero3;
        
        //entrada
        System.out.print("Informe o primeiro número: ");
        numero1=leia.nextDouble();
        
        System.out.print("Informe o segundo número: ");
        numero2=leia.nextDouble();
        
        System.out.print("Informe o terceiro número: ");
        numero3=leia.nextDouble();

        //calculos
        mediaAritmetica=(numero1+ numero2 + numero3)/3;
        mediaHarmonica= 3/(numero1/1 + numero2/1 + numero3/1);
        mediaGeometrica= numero1* numero2* numero3;
        mediaGeometricaFinal= Math.pow(mediaGeometrica, 1.0/3.0);

        //saida

        System.out.println("***Resultados***");
        System.out.println("A Média Aritmética é: " + df.format(mediaAritmetica)); 
        System.out.println("A Média Harmônica é: " + df.format(mediaHarmonica));
        System.out.println("A Média Geométrica é: " + df.format(mediaGeometricaFinal)); 
        leia.close();

    }
}