package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String type;
	private String ligne1;
	private String ligne2;
	private String ville;
	private String pays;
	private int codePostal;
	
	@ManyToOne
	@JsonIgnore
	private Contact contact;
	@ManyToOne
	private TypeAdresse adresseType;
	
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public TypeAdresse getAdresseType() {
		return adresseType;
	}
	public void setAdresseType(TypeAdresse adresseType) {
		this.adresseType = adresseType;
	}
	public Adresse() {
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
	public String getLigne1() {
		return ligne1;
	}
	public void setLigne1(String ligne1) {
		this.ligne1 = ligne1;
	}
	public String getLigne2() {
		return ligne2;
	}
	public void setLigne2(String ligne2) {
		this.ligne2 = ligne2;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	
	
}
