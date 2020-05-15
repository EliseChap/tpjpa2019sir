package service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.generic.EntityManagerHelper;
import entites.Utilisateur;

@Path("api")
public class UseCaseImpl implements UseCase {

	  
	public List<Utilisateur> getUtilisateurs() {
		return EntityManagerHelper.getEntityManager()
				.createQuery("select u from Utilisateur as u " ,Utilisateur.class).getResultList();
	}
	
	@GET
	@Path("/utilisateurs/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Utilisateur> getUtilisateurs(@PathParam("id") long id) {
		//return this.getUtilisateurs();
		return EntityManagerHelper.getEntityManager()
				.createQuery("select u from Utilisateur as u " ,Utilisateur.class).getResultList();
	}

}
