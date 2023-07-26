import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		/*Escreva um programa que leia o número de um funcionário, 
		 * seu número de horas trabalhadas, o valor que recebe por 
		 * hora e calcula o salário desse funcionário. A seguir, 
		 * mostre o número e o salário do funcionário, com duas 
		 * casas decimais.
		 */
		
		Locale.setDefault(Locale.US); // impressao com ponto no lugar de virgula
	    Scanner insere = new Scanner (System.in);
	    
	    int nFun = insere.nextInt();
	    int horas = insere.nextInt();
	    double valorHora = insere.nextDouble();
	    
	    double contaSalario = (horas * valorHora);
	    
	 
	        System.out.println("NUMBER = " + nFun);
	        System.out.printf("SALARY = U$ " + "%.2f%n", contaSalario);

	}

}
