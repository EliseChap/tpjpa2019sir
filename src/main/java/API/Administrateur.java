package API;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Administrateur extends Utilisateur {
	
	@OneToMany(mappedBy="administrateur")
	Collection<Email> emails;

	public Administrateur(long id, String nom, String prenom, String mail) {
		super(id, nom, prenom, mail);
	}

	public Collection<Email> getEmails() {
		return emails;
	}

	public void setEmails(Collection<Email> emails) {
		this.emails = emails;
	}

}
