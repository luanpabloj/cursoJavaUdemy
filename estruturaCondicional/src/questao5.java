import java.util.Locale;
import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto que você deseja comprar");
		int codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade");
		int quantidade = sc.nextInt();
		
		double total = 0;
		
		if(codigo == 1) {
			total = 4.00 * quantidade;
		}
		
		else if(codigo == 2) {
			total = 4.50 * quantidade;
		}
		
		else if(codigo == 3) {
			total = 5.00 * quantidade;
		}
		
		else if(codigo == 4) {
			total = 2.00 * quantidade;
		}
		
		else if(codigo == 5) {
			total = 1.50 * quantidade;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
