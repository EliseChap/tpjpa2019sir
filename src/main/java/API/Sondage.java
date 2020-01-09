package API;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sondage {

	@Id
	@GeneratedValue
	long id;

	Collection<Date> datesPossibles;
	
	@OneToMany(mappedBy="sondage")
	Collection<DateReponses> datesReponses;
	Date dateValide;

	public Sondage() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<Date> getDatesPossibles() {
		return datesPossibles;
	}

	public void setDatesPossibles(Collection<Date> datesPossibles) {
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
