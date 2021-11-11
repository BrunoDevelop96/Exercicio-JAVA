package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int A,B,C,D , diferenca;
		
		System.out.println("Digite os 2 primeiros números : ");
			A = sc.nextInt();
			B = sc.nextInt();
			
		System.out.println("Digite os 2 ultimos  números : ");
			C = sc.nextInt();
			D = sc.nextInt();
		
		diferenca = A*B - C*D;
		
		System.out.println("A diferença entre os números são : " + diferenca);
		
		
		
		
		
		
		
		sc.close();

	}

}
