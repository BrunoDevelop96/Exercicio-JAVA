package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int cod1 , qnt1 , cod2 , qnt2;
		double valor1, valor2 , calculoTotal;
		
		System.out.println("Código do primeiro produto : ");
		    cod1=sc.nextInt();
		    
		System.out.println("Quantidade do primeiro produto: ");
		    qnt1=sc.nextInt();
		    
		System.out.println("Preço por unidade do primeiro produto : ");
		    valor1=sc.nextDouble();
		    
		    System.out.println("Código do segundo produto : ");
		    cod2=sc.nextInt();
		    
		System.out.println("Quantidade do segundo produto: ");
		    qnt2=sc.nextInt();
		    
		System.out.println("Preço por unidade do segundo produto : ");
		    valor2=sc.nextDouble();
		
		calculoTotal = qnt1*valor1 + qnt2*valor2;
		
       System.out.printf("Valor Total a pagar : R$ %.2f%n " ,calculoTotal);
		
		
		
		sc.close();

	}

}
