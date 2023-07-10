import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números");
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		
		if(numA % numB == 0 || numB % numA == 0) {
			System.out.println("Os números digitados são multiplos");
		}
		else {
			System.out.println("Os números digitados não são multiplos");
		}
		
		
		sc.close();

	}

}
