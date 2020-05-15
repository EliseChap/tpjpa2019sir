package API;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DateReponses {

	@Id
	@GeneratedValue
	long id;

	@ManyToOne
	Sondage sondage;
	@ManyToOne
	Utilisateur utilisateur;

	@Temporal(TemporalType.DATE)
	Date dateReponse;

	public DateReponses() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Sondage getSondage() {
		return sondage;
	}

	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}

}
