package entities;

public class Aluno {
	
	public double nota1;
	public double nota2;
	public double nota3;
	public String nome;
	
	
	public double soma() {
		return nota1 + nota2 + nota3;
	}
	
	public void Pass() {
		System.out.println("FINAL GRADE = " + soma());
		System.out.println("PASS");
	}
	
	public void Failed() {
		System.out.println("FINAL GRADE = " + soma());
		System.out.println("FAILED");
		System.out.println("MISSING " + (60 - soma()) + " POINTS");
	}

	
}
