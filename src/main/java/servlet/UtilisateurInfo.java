package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import API.Utilisateur;
import jpa.DaoUtilisateurs;

@WebServlet(name = "UtilisateurInfo", urlPatterns = { "/UtilisateurInfo" })
public class UtilisateurInfo extends HttpServlet {
	
	private DaoUtilisateurs dao;


	public UtilisateurInfo() {
		dao = new DaoUtilisateurs();
		
		
	
	
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			 throws ServletException, IOException {
			response.setContentType("text/html");

			PrintWriter out = response.getWriter();

			
			out.println(
	
				"<HTML>\n<HEAD>\n"+	
				"<style type='text/css'>\n"+
				"table,\n" +
				" td {\n" +
			    "border: 1px solid #333;}\n"+
			
				"thead,\n"+
				"tfoot {\n"+
				    "background-color: #333;\n"+
				    "color: #fff;}\n"+
				    "</style>\n</head>"
						
				+"n<BODY>\n" +

					"<H1>Recapitulatif des informations</H1>\n" +
					"<UL>\n" +			
					
					" <LI>Nom: "
					+ request.getParameter("nom") + "\n" +
					" <LI>Prenom: "
					+ request.getParameter("prenom") + "\n" +
					" <LI>Email: "
					+ request.getParameter("mail") + "\n" +
					"</UL>\n" +	
						
						
				"<H1>Tous les utilisateurs</H1>\n" +
				"<UL>\n" +
				
				"<TABLE>\n<THEAD>\n<tr>" +
				"<th colspan=\"1\">Nom</th>\r\n" + 
				"<th colspan=\"1\">Prenom</th>\r\n" + 
				"<th colspan=\"1\">Adresse Email</th>\r\n" + 
				"</tr>"+
				"</thead>\r\n" + 
				"<tbody>\r\n" + 
				"<tr>\r\n" 
				);
			
	}
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException {
		PrintWriter p = new PrintWriter(resp.getOutputStream());
		p.println(

			"<HTML>\n<HEAD>\n"+	
			"<style type='text/css'>\n"+
			"table,\n" +
			" td {\n" +
		    "border: 1px solid #333;}\n"+
		
			"thead,\n"+
			"tfoot {\n"+
			    "background-color: #333;\n"+
			    "color: #fff;}\n"+
			    "</style>\n</head>"
					
			+"n<BODY>\n" );
		
			p.println("<H1>Tous les utilisateurs</H1>\n" +
					"<UL>\n" +
					
					"<TABLE>\n<THEAD>\n<tr>" +
					"<th colspan=\"1\">Nom</th>\r\n" + 
					"<th colspan=\"1\">Prenom</th>\r\n" + 
					"<th colspan=\"1\">Adresse Email</th>\r\n" + 
					"</tr>"+
					"</thead>\r\n" + 
					"<tbody>\r\n" 
					 
					);
		
			List<Utilisateur> users = dao.findAll();
		
					for ( Utilisateur u: users) {
						
						p.println(
						"<tr>\r\n" +
						"<td>" + u.getNom() +
						"</td>\r\n" + 
						"<td>" + u.getPrenom() +
						"</td>\r\n" + 
						"<td>"+ u.getMail() +
						"</td>\r\n" +
						"</tr>\r\n" 

						);
					}
				
					p.println(
				
				"</tr>\r\n" + 
				
				"</tbody>\r\n" + 
				"</table>"+
				
				"</BODY></HTML>"
				
					);
					p.flush();
					p.close();

		}
}
