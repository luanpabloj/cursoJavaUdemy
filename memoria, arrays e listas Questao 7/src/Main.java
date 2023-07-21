import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double soma = 0;
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			soma+= vect[i];
			
		}
		
		System.out.println("");
		System.out.println("MEDIA DO VETOR = " + (soma/n));
		
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < n; i++) {
			if(vect[i] < (soma/n)) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();

	}

}
