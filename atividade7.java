import java.util.Scanner;

public class atividade7{
	public static void main(String[] args) {
	    Scanner leia=new Scanner(System.in);
	    
	    double salarioFixo, totalVendas, comissao;
	    
	    System.out.print("Por favor, informe o seu salário fixo:");
	    salarioFixo = leia.nextDouble();
	    
	    System.out.println ("Por favor, o total de vendas no mês em dinheiro");
	    totalVendas = leia.nextDouble();
	    
	    comissao = totalVendas * 0.15;
	    
	    System.out.print ("Salário fixo: R$" + salarioFixo);
	    System.out.print ("Comissão: R$" + comissao);
	    System.out.print ("Salário completo: R$" + (salarioFixo + comissao));
        leia.close();
	}
}