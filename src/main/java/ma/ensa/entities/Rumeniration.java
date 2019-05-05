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
public class Rumeniration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private double salaireNet;
	private double salaireBase;
	private double salaireBrut;
	
	@OneToMany(mappedBy="rumeniration")
	@JsonIgnore
	private List<Contrat> contrats;
	@ManyToOne
	private Prime prime;
	@ManyToOne
	private TypeSalaire typeSalaire;
	
	
	
	public List<Contrat> getContrats() {
		return contrats;
	}
	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}
	public Prime getPrime() {
		return prime;
	}
	public void setPrime(Prime prime) {
		this.prime = prime;
	}
	public TypeSalaire getTypeSalaire() {
		return typeSalaire;
	}
	public void setTypeSalaire(TypeSalaire typeSalaire) {
		this.typeSalaire = typeSalaire;
	}
	public Rumeniration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getSalaireNet() {
		return salaireNet;
	}
	public void setSalaireNet(double salaireNet) {
		this.salaireNet = salaireNet;
	}
	public double getSalaireBase() {
		return salaireBase;
	}
	public void setSalaireBase(double salaireBase) {
		this.salaireBase = salaireBase;
	}
	public double getSalaireBrut() {
		return salaireBrut;
	}
	public void setSalaireBrut(double salaireBrut) {
		this.salaireBrut = salaireBrut;
	}
	
	

}
