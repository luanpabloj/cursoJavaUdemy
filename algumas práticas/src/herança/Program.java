package herança;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do animal: ");
		String nome = sc.next();
		
		Cachorro animal = new Cachorro(nome);
		
		System.out.println(animal.emitirSom());
		
	}

}
