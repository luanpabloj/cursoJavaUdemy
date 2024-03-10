package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Students> set = new HashSet<>();
		
		System.out.println("How many students for course A? ");
		int many = sc.nextInt();
		for(int i = 0; i < many; i++) {
			int aux = sc.nextInt();
			set.add(new Students(aux));
		}
		
		System.out.println("How many students for course B? ");
		many = sc.nextInt();
		for(int i = 0; i < many; i++) {
			int aux = sc.nextInt();
			set.add(new Students(aux));
		}
		
		System.out.println("How many students for course C? ");
		many = sc.nextInt();
		for(int i = 0; i < many; i++) {
			int aux = sc.nextInt();
			set.add(new Students(aux));
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
