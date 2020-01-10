package API;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sondage {

	@Id
	@GeneratedValue
	long id;

	@OneToMany(mappedBy = "sondage")
	Collection<DatesPossibles> datesPossibles;

	@OneToMany(mappedBy = "sondage")
	Collection<DateReponses> datesReponses;

	@Temporal(TemporalType.DATE)
	Date dateValide;

	public Sondage() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<DatesPossibles> getDatesPossibles() {
		return datesPossibles;
	}

	public void setDatesPossibles(Collection<DatesPossibles> datesPossibles) {
		this.datesPossibles = datesPossibles;
	}

	public Collection<DateReponses> getDatesReponses() {
		return datesReponses;
	}

	public void setDatesReponses(Collection<DateReponses> datesReponses) {
		this.datesReponses = datesReponses;
	}

	public Date getDateValide() {
		return dateValide;
	}

	public void setDateValide(Date dateValide) {
		this.dateValide = dateValide;
	}

}
