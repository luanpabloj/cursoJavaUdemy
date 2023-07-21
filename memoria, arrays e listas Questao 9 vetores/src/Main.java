import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] vectNome = new String[n];
		int[] vectIdade = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + " pessoa");
			System.out.print("Nome: ");
			vectNome[i] = sc.next();
			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
			
		}
		
		ordenar(n, vectNome, vectIdade);
				
		sc.close();

	}
	
	public static void ordenar(int n, String[] vectNome, int[] vectIdade) {
		
		int auxiIdade = 0;
		String auxiNome = "";
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(vectIdade[i] > vectIdade[j]) {
					auxiIdade = vectIdade[i];
					vectIdade[i] = vectIdade[j];
					vectIdade[j] = auxiIdade;
					
					auxiNome = vectNome[i];
					vectNome[i] = vectNome[j];
					vectNome[j] = auxiNome;
				}
			}
		}
		
			
			System.out.println("PESSOA MAIS VELHA: " + vectNome[0]);
		
	}
}
