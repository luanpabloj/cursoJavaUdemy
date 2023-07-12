import java.util.Scanner;

public class questao6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			
			if(6 % i == 0) {
				System.out.println(i);
			}
			
		}
		
		
		
		sc.close();
	}

}
