package API;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Participants extends Utilisateur {

	String preferenceAlimentaire;
	String allergies;

	@ManyToOne
	Email email;

	public Participants(String nom, String prenom, String mail) {
		super(nom, prenom, mail);
	}

	public String getPreferenceAlimentaire() {
		return preferenceAlimentaire;
	}

	public void setPreferenceAlimentaire(String preferenceAlimentaire) {
		this.preferenceAlimentaire = preferenceAlimentaire;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public Email getEmail() {
		return email;
	}

	public void setMail(Email email) {
		this.email = email;
	}

}
