import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		Double[] vect = new Double[n];

		for (int i = 0; i < n; i++) {

			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();

		}
		
		System.out.println("");

		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {

			System.out.print(" " + vect[i]);
		}
		
		System.out.println();

		double soma = 0;

		System.out.print("SOMA = ");
		for (int i = 0; i < n; i++) {

			soma += vect[i];
		}

		System.out.print(" " + soma);

		double media = 0;
		media = soma / n;
		
		System.out.println();
		System.out.println("MEDIA = " + media);

		sc.close();

	}

}
