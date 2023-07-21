import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int soma = 0;
		int cont = 0;
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				soma+= vect[i];
				cont++;
			}
		}
		
		if(soma == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		else {
			System.out.println("MEDIA DOS PARES = " + (soma/cont));
		}
		
		
		
		
		
		sc.close();

	}

}
