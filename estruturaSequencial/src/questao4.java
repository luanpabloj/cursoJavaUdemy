import java.util.Locale;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double horas = sc.nextDouble();
		double valorHora = sc.nextDouble();
		
		
		double salario = valorHora * horas;
		
		System.out.println("NUMBER: " + num);
		System.out.printf("SALARY: U$ %.2f%n", salario);
		
		
		
		sc.close();

	}

}
