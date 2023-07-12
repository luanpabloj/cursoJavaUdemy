import java.util.Scanner;

public class questao7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			
			int quadrado = i*i;
			int cubo = i*i*i;
			
			System.out.println(i + " " + quadrado + " " + cubo);
			
		}
		
		
		sc.close();

	}

}
