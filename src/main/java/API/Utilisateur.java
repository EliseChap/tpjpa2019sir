package API;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue
	long id;
	@Column(updatable = false, length = 20)
	String nom;
	@Column(updatable = false, length = 20)
	String prenom;
	@Column(name = "email")
	String mail;
	
	Date date;

	public Utilisateur(String nom, String prenom, String mail) {

		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
	}

	public Utilisateur() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getId() {
		return id;
	}
}
