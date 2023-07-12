import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0;
		
		int opcao = sc.nextInt();
		
		
		while(opcao != 4) {
			switch(opcao) {
			
			case 1:
				alcool++;
				break;
			
			case 2:
				gasolina++;
				break;
				
			case 3:
				diesel++;
				break;
				

			
			default:
				System.out.println("Digite um código válido");
				break;
			}
			
			opcao = sc.nextInt();
			
		}
		
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
