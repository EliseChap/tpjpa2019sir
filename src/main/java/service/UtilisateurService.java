package service;

import dao.UtilisateurDao;
import entites.Utilisateur;

public class UtilisateurService {
	
	 private UtilisateurDao dao = new UtilisateurDao();

	 public Utilisateur createParticipant(Utilisateur user) {
	        return this.dao.save(user);
	    }
}
