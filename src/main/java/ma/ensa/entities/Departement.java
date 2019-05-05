package ma.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Departement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	
	@OneToMany(mappedBy="departement")
	@JsonIgnore
	private List<PeriodeDepartement> periodeDepartements;
	@ManyToOne
	@JsonIgnore
	private TypeDepartement type;
	@ManyToOne
	private Departement sousDepartement;
	@OneToMany(mappedBy="sousDepartement")
	private List<Departement> supDepartement;

	public Departement getSousDepartement() {
		return sousDepartement;
	}
	public void setSousDepartement(Departement sousDepartement) {
		this.sousDepartement = sousDepartement;
	}
	public List<Departement> getSupDepartement() {
		return supDepartement;
	}
	public void setSupDepartement(List<Departement> supDepartement) {
		this.supDepartement = supDepartement;
	}
	public TypeDepartement getType() {
		return type;
	}
	public void setType(TypeDepartement type) {
		this.type = type;
	}
	public List<PeriodeDepartement> getPeriodeDepartements() {
		return periodeDepartements;
	}
	public void setPeriodeDepartements(List<PeriodeDepartement> periodeDepartements) {
		this.periodeDepartements = periodeDepartements;
	}
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
	
}
