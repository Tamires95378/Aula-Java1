import java.util.Scanner;

public class atividade9 {
    public static void main( String[]args) {
    Scanner leia=new Scanner (System.in);

    double horas, minutos, segundos;

    //entrada
    System.out.print(" Informe quantos Segundos: ");
    segundos=leia.nextDouble();

    //calculo

    minutos= segundos/60;
    horas= segundos/3600;

    //saida
    System.out.println(" A quntidade de " + segundos + " segundos equivale a " + minutos + " minutos" );
    System.out.println("  A quntidade de " + segundos + " segundos equivale a " + horas + " horas" );

    leia.close();

    }
}
