package ma.ensa.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Historique {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Temporal(TemporalType.TIME)
	private Date heur;
	private String objetModifie;
	private String operation;
	private String ancienValeur;
	private String nouvelleValeur;
	
	@ManyToOne
	private Utilisateur utilisateur;
	public Historique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getHeur() {
		return heur;
	}
	public void setHeur(Date heur) {
		this.heur = heur;
	}
	public String getObjetModifie() {
		return objetModifie;
	}
	public void setObjetModifie(String objetModifie) {
		this.objetModifie = objetModifie;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getAncienValeur() {
		return ancienValeur;
	}
	public void setAncienValeur(String ancienValeur) {
		this.ancienValeur = ancienValeur;
	}
	public String getNouvelleValeur() {
		return nouvelleValeur;
	}
	public void setNouvelleValeur(String nouvelleValeur) {
		this.nouvelleValeur = nouvelleValeur;
	}
	
	
	

}
