package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import API.Utilisateur;

public class JpaTest {

	/**
	 * @param args
	 */
	private EntityManager manager;
	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}


	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			test.createUtilisateur();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		test.listUtilisateurs();

		manager.close();
		System.out.println(".. done");

	}

	private void createUtilisateur() {
		int numOfUtilisateurs = manager.createQuery("Select a From Utilisateur a", Utilisateur.class).getResultList()
				.size();
		if (numOfUtilisateurs == 0) {

			manager.persist(new Utilisateur("Jakab", " Gipsz", "Jakab@mail.fr"));
			manager.persist(new Utilisateur("Captain", "Nemo", "captainnemo@mail.fr"));
			manager.persist(new Utilisateur("Jahoui", " Hajar", "hajar@mail.fr"));
			manager.persist(new Utilisateur("Chapon", "Elise", "elise@mail.fr"));
		}
	}

	private void listUtilisateurs() {
		List<Utilisateur> resultList = manager.createQuery("Select a From Utilisateur a", Utilisateur.class)
				.getResultList();
		System.out.println("num of utilisateurs:" + resultList.size());
		for (Utilisateur next : resultList) {
			System.out.println("next Utilisateur: " + next);
		}
	}

}
