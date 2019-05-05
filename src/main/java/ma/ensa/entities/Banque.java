package ma.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Banque {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	@OneToMany(mappedBy="banque")
	@JsonIgnore
	private List<CoordonnesBancaires> coordonnesBancaires;
	
	
	public List<CoordonnesBancaires> getCoordonnesBancaires() {
		return coordonnesBancaires;
	}
	public void setCoordonnesBancaires(List<CoordonnesBancaires> coordonnesBancaires) {
		this.coordonnesBancaires = coordonnesBancaires;
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
	public Banque() {
		super();
	}
	
}
