import java.util.Locale;
import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {
		/*A empresa ABC resolveu conceder um aumento de salários a seus funcionários 
		  de acordo com a tabela abaixo:
		    Salário	Percentual de Reajuste
			0 - 400.00 - 15%
			400.01 - 800.00 - 12%
			800.01 - 1200.00 - 10%
			1200.01 - 2000.00 - 7%
			Acima de 2000.00 - 4%

		Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor 
		de reajuste ganho e o índice reajustado, em percentual.
		 */
		
		  Locale.setDefault(Locale.US);
		  Scanner insere = new Scanner(System.in);
			   
			    //reajustes: 15% (0-400,00) / 12% (400,01 - 800,00)
			    //10% (800,01 - 1200,00) / 7% (1200,01 - 2000,00)
			    // 4% (acima de 2000,00) 
			  
				double salario = insere.nextDouble();
				
				double salFinal1 = salario + (salario*0.15);
				double salFinal2 = salario + (salario*0.12);
				double salFinal3 = salario + (salario*0.10);
				double salFinal4 = salario + (salario*0.07);
				double salFinal5 = salario + (salario*0.04);
				
			    double reajuste1 = (salario*0.15);
			    double reajuste2 = (salario*0.12);
			    double reajuste3 = (salario*0.10);
			    double reajuste4 = (salario*0.07);
			    double reajuste5 = (salario*0.04);

			
				if (salario >= 0 && salario <= 400.00) {
				    System.out.printf("Novo salario: "+"%.2f%n",salFinal1);
			    	System.out.printf("Reajuste ganho: "+"%.2f%n",reajuste1);
			    	System.out.println("Em percentual: 15 %");	
			      	
			    }else if (salario >= 400.01 && salario <= 800.00){
			    	System.out.printf("Novo salario: "+"%.2f%n",salFinal2);
				    System.out.printf("Reajuste ganho: "+"%.2f%n",reajuste2);
				    System.out.println("Em percentual: 12 %");
			    	
			    }else if (salario >=800.01 && salario <= 1200.00){
			    	System.out.printf("Novo salario: "+"%.2f%n",salFinal3);
				    System.out.printf("Reajuste ganho: "+"%.2f%n",reajuste3);
				    System.out.println("Em percentual: 10 %");
			    	    
			    }else if (salario >= 1200.01 && salario <= 2000.00){
			    	System.out.printf("Novo salario: "+"%.2f%n",salFinal4);
				    System.out.printf("Reajuste ganho: "+"%.2f%n",reajuste4);
				    System.out.println("Em percentual: 7 %");
			    	
			    }else if (salario >=2000.00) {
			    	System.out.printf("Novo salario: "+"%.2f%n",salFinal5);
				    System.out.printf("Reajuste ganho: "+"%.2f%n",reajuste5);
				    System.out.println("Em percentual: 4 %");
		
	}

  }
}