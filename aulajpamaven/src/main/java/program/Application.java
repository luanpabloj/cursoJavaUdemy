package program;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Application {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
				
		List<Pessoa> list = new ArrayList<>();
		
		for(int i = 1; i < 5; i++) {
		Pessoa p = em.find(Pessoa.class, i);
		list.add(p);
		}
		
		for(Pessoa p : list) {
		System.out.println(p);
		}
		


	}

}
