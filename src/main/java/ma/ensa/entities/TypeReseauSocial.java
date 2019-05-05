package ma.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TypeReseauSocial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String icon;
	private String description;
	
	@OneToMany(mappedBy="typeReseauSocial")
	@JsonIgnore
	private List<ReseauSocial> reseauSocials;
	
	public List<ReseauSocial> getReseauSocials() {
		return reseauSocials;
	}
	public void setReseauSocials(List<ReseauSocial> reseauSocials) {
		this.reseauSocials = reseauSocials;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public TypeReseauSocial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
