import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um número");
		int num = sc.nextInt();
		
		
		if(num < 0) {
			System.out.println("número digitado é negativo");
		}
		
		else {
			System.out.println("número digitado é positivo");
		}
		
		
		
		
		
		sc.close();

	}

}
