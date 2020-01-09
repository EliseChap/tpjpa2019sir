package API;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class DateReponses {

	@Transient
	Utilisateur utilisateur;

	// Id de l'utilisateur afin de savoir à qui sont les réponses
	@Id
	long id = utilisateur.getId();

	Collection<Date> ReponsesDate;

	public DateReponses(long id) {
		this.id = id;
	}

	public DateReponses() {
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Collection<Date> getReponsesDate() {
		return ReponsesDate;
	}

	public void setReponsesDate(Collection<Date> reponsesDate) {
		ReponsesDate = reponsesDate;
	}

	
}
