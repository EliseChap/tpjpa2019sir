package jpa;

import java.util.List;

import dao.generic.EntityManagerHelper;
import entites.Utilisateur;

public class DaoUtilisateurs {
	public Utilisateur findById(String id) {
		return EntityManagerHelper.getEntityManager().find(Utilisateur.class, id);

	}

	public List<Utilisateur> findByName(String name) {
		return EntityManagerHelper.getEntityManager()
				.createQuery("select u from Utilisateur as u where u.name = :name", Utilisateur.class)
				.setParameter("name", name).getResultList();

	}

	public List<Utilisateur> findByFirstname(String nom) {
		return EntityManagerHelper.getEntityManager().createNamedQuery("tousLesUtilisteursParNom", Utilisateur.class)
				.setParameter("nom", nom).getResultList();

	}

	public Utilisateur save(Utilisateur u) {
		EntityManagerHelper.beginTransaction();
		if (u.getMail() != null) {
			EntityManagerHelper.getEntityManager().merge(u);

		} else {
			EntityManagerHelper.getEntityManager().persist(u);

		}
		EntityManagerHelper.commit();
		return u;

	}

	public void delete(String id) {
		EntityManagerHelper.beginTransaction();
		EntityManagerHelper.getEntityManager().remove(this.findById(id));
		EntityManagerHelper.commit();
	}

	public List<Utilisateur> findAll() {
		return EntityManagerHelper.getEntityManager().createQuery("select u from Utilisateur as u", Utilisateur.class)
				.getResultList();
	}
}
