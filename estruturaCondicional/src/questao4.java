import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o horário que o jogo começou");
		int numA = sc.nextInt();
		
		System.out.println("Digite o horário que o jogo terminou");
		int numB = sc.nextInt();
		
		int duracao;
		
		
		if(numA > numB || numA == numB) {
			duracao = 24 - numA + numB;
		}
		
		
		else {
			duracao = numB - numA;
		}
		
		
		System.out.println("Duração da partida: " + duracao);
		
		
		
		sc.close();

	}

}
