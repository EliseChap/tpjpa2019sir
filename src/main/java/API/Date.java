package API;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Date {
	
	@Temporal(TemporalType.DATE)
	Date date;

	public Date(Date date) {
	}

	public Date getD() {
		return date;
	}

	public void setD(Date date) {
		this.date = date;
	}

}
