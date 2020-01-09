package API;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Reunion {

	@Id
	@GeneratedValue
	long id;

	@Column(length = 100)
	String intitule;
	@Transient
	String resume;

	@ManyToMany(mappedBy = "participants")
	Collection<Participants> participants;

	public Reunion() {
	}

	public Collection<Participants> getParticipants() {
		return participants;
	}

	public void setParticipants(Collection<Participants> participants) {
		this.participants = participants;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
