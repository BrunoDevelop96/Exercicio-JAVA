package estrutura_sequencial;

import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int A ,B, soma;
		
		System.out.println("Digite o primeiro n�mero: ");
		  A = sc.nextInt();
		  
		 System.out.println("Digite o Segundo n�mero: ");
		  B = sc.nextInt();
		
		soma = A + B ;
		
		 System.out.println("A soma dos n�meros digitados s�o : " + soma);
		
		
		
		
		 sc.close();
	}

}
