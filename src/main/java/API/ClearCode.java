package API;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClearCode {

	@Id
	@GeneratedValue
	long id;

	int codeBatiment;
	String lienPad;

	public ClearCode() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCodeBatiment() {
		return codeBatiment;
	}

	public void setCodeBatiment(int codeBatiment) {
		this.codeBatiment = codeBatiment;
	}

	public String getLienPad() {
		return lienPad;
	}

	public void setLienPad(String lienPad) {
		this.lienPad = lienPad;
	}

}
