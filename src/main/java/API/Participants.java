package API;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Participants extends Utilisateur {

	String preferenceAlimentaire;
	String allergies;

	
	@Transient@ManyToOne
	Email email;
	
	@ManyToMany(mappedBy="participants")
	Reunion reunion;

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
