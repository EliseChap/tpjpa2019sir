package service;

import java.util.List;
import API.Utilisateur;
import jpa.EntityManagerHelper;


public class UseCaseImpl implements UseCase {

	//@Override       doit on le mettre??
	public List<Utilisateur> getUtilisateur() {
		return EntityManagerHelper.getEntityManager()
				.createQuery("select u from Utilisateur as u " ,Utilisateur.class).getResultList();
	}

}
