import java.util.Locale;
import java.util.Scanner;

public class SalarioBonus {

	public static void main(String[] args) {
		/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
		 * efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão 
		 * sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas 
		 * decimais.
		 */
		
		Locale.setDefault(Locale.US); // impressao com ponto no lugar de virgula
		 Scanner insere = new Scanner(System.in);
		    
		    String nome = insere.nextLine();
		    double sal = insere.nextDouble();
		    double vendas = insere.nextDouble();
		    double salFinal;
		    
		    //calculo sera total de vendas - 15% = comissao + salario = salario final
		    
		     salFinal = (vendas*0.15) + sal;
		     
		     System.out.printf("TOTAL = R$ "+"%.2f%n",salFinal);

	}

}
