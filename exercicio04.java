package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
	
		int numFunc, horasTrab;
	    double valorHora, salario;

	   System.out.println("Número do funcionário : ");
	      numFunc = sc.nextInt();
	   
	   System.out.println("Horas trabalhada : ");
	      horasTrab = sc.nextInt();
	      
	   System.out.println("Valor que recebe por horas : ");
          valorHora = sc.nextDouble();
          
	    salario = valorHora * horasTrab;
        
	    System.out.println();
	    System.out.println("NUMBER = " + numFunc);
	    System.out.println();
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
