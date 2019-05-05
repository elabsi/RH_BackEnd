package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Langues {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Langue langue;
	@ManyToOne
	private NiveauLangue niveauLangue;
    @ManyToOne
    @JsonIgnore
    private Contact contact;
	
	
	public Langue getLangue() {
		return langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	public NiveauLangue getNiveauLangue() {
		return niveauLangue;
	}

	public void setNiveauLangue(NiveauLangue niveauLangue) {
		this.niveauLangue = niveauLangue;
	}

	public Langues() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
