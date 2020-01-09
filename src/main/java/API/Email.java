package API;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Email {

	@Id
	@GeneratedValue
	long id;
	
	@Transient
	String contenu;
	
	ClearCode clearCode;
	LienPauseDejeuner lienUnique;

	public Email() {
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

	
	
}
