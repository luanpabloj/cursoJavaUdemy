package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno");
		aluno.nome = sc.nextLine();
		
		System.out.println("Digite as três notas do aluno");
		
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		
		if(aluno.soma() >= 60) {
			aluno.Pass();
		}
		else {
			aluno.Failed();
		}
		
		sc.close();	
	}

}
