package API;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Email {

	@Id
	@GeneratedValue
	long id;

	@Transient
	String contenu;

	int clearCode; 			// code du batiment
	String lienWeb;			// lien unique pour que les participants donnent leurs allergies et pref alimentaire
	String lienSondage;		// lien du sondage
	String lienPad;			// lien du pad
	
	@ManyToOne
	Administrateur administrateur;
	
	@OneToMany(mappedBy="email")
	Collection<Participants> participants;
	
	@OneToMany(mappedBy="email")
	Collection<Utilisateur> utilisateurs;

	public Email() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public int getClearCode() {
		return clearCode;
	}

	public void setClearCode(int clearCode) {
		this.clearCode = clearCode;
	}

	public String getLienWeb() {
		return lienWeb;
	}

	public void setLienWeb(String lienWeb) {
		this.lienWeb = lienWeb;
	}

	public String getLienSondage() {
		return lienSondage;
	}

	public void setLienSondage(String lienSondage) {
		this.lienSondage = lienSondage;
	}

	public String getLienPad() {
		return lienPad;
	}

	public void setLienPad(String lienPad) {
		this.lienPad = lienPad;
	}

	public Collection<Participants> getParticipants() {
		return participants;
	}

	public void setParticipants(Collection<Participants> participants) {
		this.participants = participants;
	}

	public Collection<Utilisateur> getUtilisateur() {
		return utilisateurs;
	}

	public void setUtilisateur(Collection<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
