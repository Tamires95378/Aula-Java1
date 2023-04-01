import java.util.Scanner;

public class atividade8 {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    // ENTRADA
    System.out.println("**Algoritmo de calculo**");
    System.out.print("Quanto o total de veiculos ? ");
    int totalVeiculos = leia.nextInt();
    System.out.print("Quanto o total de rodas ? ");
    int totalRodas = leia.nextInt();
    // PROCESSAMENTO
    int paresRoda = totalRodas / 2;
    int motos = paresRoda - totalVeiculos;
    totalRodas = totalRodas - motos * 2;
    int carros = totalRodas / 4;
    // SAIDA
    System.out.println("Há " + carros + " carros e " + motos + " motos no estacionamento.");
    leia.close();
  }
}