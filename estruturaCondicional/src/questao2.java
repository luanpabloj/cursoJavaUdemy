import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um número");
		int num = sc.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.println("número digitado é par");
		}
		
		else {
			System.out.println("número digitado é impar");
		}
		
		
		
		sc.close();

	}

}
