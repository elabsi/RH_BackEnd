package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Telephone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String type;
	private String numero;
	private String observation;
	
	public TypeTelephone getTypeTelephone() {
		return typeTelephone;
	}
	public void setTypeTelephone(TypeTelephone typeTelephone) {
		this.typeTelephone = typeTelephone;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	@ManyToOne
	private TypeTelephone typeTelephone;
	@ManyToOne
	@JsonIgnore
	private Contact contact;
	
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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public Telephone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
