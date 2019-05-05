package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Document {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String fichier;
	
	@ManyToOne
	@JsonIgnore
	private Contact contact;
	@ManyToOne
	private TypeDocument documentType;
	
	
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public TypeDocument getDocumentType() {
		return documentType;
	}
	public void setDocumentType(TypeDocument documentType) {
		this.documentType = documentType;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFichier() {
		return fichier;
	}
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}
	
	
}
