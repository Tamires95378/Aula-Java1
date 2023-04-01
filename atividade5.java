import java.text.DecimalFormat;
import java.util.Scanner;
public class atividade5 {
    public  static void main (String[]args){

    Scanner leia=new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");

    double salarioBruto, quantidadeFilhos, horasTrabalhadas, salarioFamilia, valorHora; 

    //entrada
    System.out.print("Informe o número de horas trabalhadas? ");
    horasTrabalhadas=leia.nextDouble();

    System.out.print("Qual será o valor recebido por hora trabalhada? ");
    valorHora=leia.nextDouble();

    System.out.print("Qual o valor do salário família? ");
    salarioFamilia=leia.nextDouble();

    System.out.print("Qual é a quantidade de filhos o funcionário menor que 14 anos? ");
    quantidadeFilhos=leia.nextDouble();
    
    //processamento
    salarioBruto= ( horasTrabalhadas* valorHora ) + ( quantidadeFilhos * salarioFamilia);

    //saida
    System.out.print("O valor do salário do funcionário é R$" + df.format(salarioBruto));


    leia.close();
    }
}
