import java.text.DecimalFormat;
import java.util.Scanner;
public class atividade2 {
    public static void main(String[]args){
        Scanner leia=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");

        double preco, acresido, corrigido;

       System.out.print("Digite o valor do produto: ");
       preco=leia.nextDouble();

       acresido= preco*10/100;
       corrigido=acresido+preco;

       System.out.print("O novo preço do produto corrigido a 10% é de R$ " + df.format(corrigido));
       leia.close();
    }
}

