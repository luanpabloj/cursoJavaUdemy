import java.util.Locale;
import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double taxa;
		
		
		System.out.println("Digite o salário");
		double salario = sc.nextDouble();
		
		
		if(salario > 0 && salario <= 2000) {
			System.out.println("Isento");
		}
		
		if(salario > 2000 && salario <= 3000) {
			taxa = (salario - 2000.0) * 0.08;
			System.out.printf("R$ %.2f%n", taxa);
		}
		
		if(salario > 3000 && salario <= 4500) {
			taxa = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", taxa);
		}
		
		if(salario > 4500) {
			taxa = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", taxa);
		} 
		
		sc.close();
	}

}
