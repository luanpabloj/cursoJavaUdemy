import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		System.out.print("");
		
		double[] vect = new double[n];
		
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			System.out.print("");
		}
		
		
		ordenar(vect, n);
		
		sc.close();

	}
	
	public static void ordenar(double[] vect, int n) {
		
		double aux = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(vect[i] > vect[j]) {
					aux = vect[i];
					vect[i] = vect[j];
					vect[j] = aux;
				}
			}
		}
		System.out.println("");
		System.out.printf("MAIOR VALOR: %.2f%n", vect[0]);
		System.out.println("POSICAO DO MAIOR VALOR = 0 (posição que o maior número está armazenado no vetor)");
		
		
		
	}

}
