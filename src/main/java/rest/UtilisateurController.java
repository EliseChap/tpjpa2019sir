package rest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.UtilisateurDao;
import dao.generic.EntityManagerHelper;
import entites.Utilisateur;
import service.UtilisateurService;

@Path("/users")
public class UtilisateurController {
	
    private UtilisateurDao userDao;
    private UtilisateurService userservice = new UtilisateurService();

    public UtilisateurController(){
    	userDao = new UtilisateurDao();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Utilisateur> getUtilisateurs() {
    	List<Utilisateur> users= userDao.selectAll();
		return users;
	}
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Utilisateur adduser(Utilisateur user) {
        return this.userservice.createParticipant(user);
    }
    
    
}


