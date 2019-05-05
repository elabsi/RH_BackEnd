package ma.ensa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TypeTelephone {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	
	@OneToMany(mappedBy="typeTelephone")
	@JsonIgnore
	private List<Telephone> telephones = new ArrayList<Telephone>();
	
	
	public List<Telephone> getTelephones() {
		return telephones;
	}
	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public TypeTelephone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
