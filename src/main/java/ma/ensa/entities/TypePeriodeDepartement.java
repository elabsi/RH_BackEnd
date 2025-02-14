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
public class TypePeriodeDepartement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	
	@OneToMany(mappedBy="typePeriodeDepartement")
	@JsonIgnore
	private List<PeriodeDepartement> periodeDepartements=new ArrayList<PeriodeDepartement>();
	
	
	
	public List<PeriodeDepartement> getPeriodeDepartements() {
		return periodeDepartements;
	}
	public void setPeriodeDepartements(List<PeriodeDepartement> periodeDepartements) {
		this.periodeDepartements = periodeDepartements;
	}
	public TypePeriodeDepartement() {
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
