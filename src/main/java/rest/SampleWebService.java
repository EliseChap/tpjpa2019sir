package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entites.Utilisateur;

@Path("/hello")
public class SampleWebService {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello, how are you?";
    }
    
    // EN CAS DE BESOIN DE CE BOUT DE CODE, SE REFERER AU TP4 QUESTION 6-7
    
    /*
    @GET
    @Path("/utilisateur")
    @Produces(MediaType.APPLICATION_JSON)
    public Utilisateur getUtilisateur() {
    	Utilisateur u = new Utilisateur();
    	u.setNom("toto");
        Heater h1 = new Heater();
        h1.setPower("500w");
        Heater h2 = new Heater();
        h2.setPower("600w");
        h.addDevice(h1);
        h.addDevice(h2);
        return h;
    }
*/
}
