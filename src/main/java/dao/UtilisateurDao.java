package dao;

import java.util.List;

import dao.generic.EntityManagerHelper;
import dao.generic.GenericDaoImpl;
import entites.Utilisateur;

public class UtilisateurDao extends GenericDaoImpl<Utilisateur>{

	public List<Utilisateur> findByName(String name) {
		return EntityManagerHelper.getEntityManager()
				.createQuery("select u from Utilisateur as u where u.name = :name", Utilisateur.class)
				.setParameter("name", name).getResultList();
	}

	public List<Utilisateur> findByFirstname(String nom) {
		return EntityManagerHelper.getEntityManager().createNamedQuery("tousLesUtilisteursParNom", Utilisateur.class)
				.setParameter("nom", nom).getResultList();

	}
}
