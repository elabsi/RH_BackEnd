package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Email {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String type;
	private String adresseMail;
	private String observation;
	
	@ManyToOne
	private TypeEmail emailType;
	@ManyToOne
	@JsonIgnore
	private Contact contact;
	
	
	public TypeEmail getEmailType() {
		return emailType;
	}
	public void setEmailType(TypeEmail emailType) {
		this.emailType = emailType;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAdresseMail() {
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	
}
