package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ReseauSocial {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String url;
	private String username;
	private String description;
	
	@ManyToOne
	@JsonIgnore
	private Contact contact;
	@ManyToOne
	private TypeReseauSocial typeReseauSocial;
	
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public TypeReseauSocial getTypeReseauSocial() {
		return typeReseauSocial;
	}
	public void setTypeReseauSocial(TypeReseauSocial typeReseauSocial) {
		this.typeReseauSocial = typeReseauSocial;
	}
	public ReseauSocial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
