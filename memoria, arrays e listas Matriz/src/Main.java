import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Digite a quantidade de colunas");
		int n = sc.nextInt();
		System.out.println("Digite a quantidade de linhas");
		int m = sc.nextInt();
		
		int[][] matriz = new int[n][m];
		
		System.out.println("Digite números para preencher a matriz");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite um número que foi registrado anteriormente na matriz");
		int num = sc.nextInt();
		
		mat(n, m, matriz, num);
		
		sc.close();
	}
	
	
	public static void mat(int n, int m, int[][] matriz, int num) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matriz[i][j] == num) {
					
					System.out.println("Position: " + i + "," + j);
					if(j > 0) {
					System.out.println("Left: " + matriz[i][j-1]);
					}
					if(j < matriz[i].length - 1) {
					System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i > 0) {
					System.out.println("Up: " + matriz[i-1][j]);
					}
					if(i < matriz.length-1) {
					System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		
	}
	
	

}
