package API;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Email {

	@Id
	@GeneratedValue
	long id;

	@Transient
	String contenu;

	@ManyToOne
	ClearCode clearCode;
	
	@OneToOne
	LienPauseDejeuner lienUnique;

	public Email() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public ClearCode getClearCode() {
		return clearCode;
	}

	public void setClearCode(ClearCode clearCode) {
		this.clearCode = clearCode;
	}

	public LienPauseDejeuner getLienUnique() {
		return lienUnique;
	}

	public void setLienUnique(LienPauseDejeuner lienUnique) {
		this.lienUnique = lienUnique;
	}

}
