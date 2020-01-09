package API;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LienPauseDejeuner {

	@Id
	@GeneratedValue
	long id;

	String preferenceAlimentaire;
	String allergies;
	String lienPad;

	public LienPauseDejeuner() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

}
