package API;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sondage {
	
	@Id
	@GeneratedValue
	long id;
	
	@Column(name="resultat")
	int resultat;
	Collection<Date> dates;
	
	public Sondage() {
		
	}
	
	public int getResultat() {
		return resultat;
	}
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	public Collection<Date> getDates() {
		return dates;
	}
	public void setDates(Collection<Date> dates) {
		this.dates = dates;
	}

}
