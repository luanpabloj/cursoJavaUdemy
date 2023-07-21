import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		System.out.print("");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			System.out.print("");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("");
		
		System.out.print("NUMEROS PARES: ");
		for(int i = 0; i < n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(" " + vect[i]);
				System.out.print("");
				
				cont++;
			}
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("Quantidade de números pares: " + cont);
		
		
		
		
		
		sc.close();
		
	}

}
