package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Dados[] vect = new Dados[n];
		
		for(int i = 0; i < n; i++) {
			
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + " aluno: ");
			String name = sc.nextLine();
			Double nota1 = sc.nextDouble();
			Double nota2 = sc.nextDouble();
			
			
			vect[i] = new Dados(name, nota1, nota2);
		}
		
		double media = 0;
		int aprovado = 6;
		
		System.out.println("Alunos aprovados");
		for(int i = 0; i < n; i++) {
			
			media = (vect[i].getNota1() + vect[i].getNota2()) / 2;
			
			if(media >= aprovado) {
				System.out.println(vect[i].getName());
			}
		}
		
		
		
		sc.close();

	}

}
