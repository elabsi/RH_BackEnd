package ma.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Prime {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private double montant;
	
	@OneToMany(mappedBy="prime")
	private List<Rumeniration> rumenirations;
	

	public List<Rumeniration> getRumenirations() {
		return rumenirations;
	}
	public void setRumenirations(List<Rumeniration> rumenirations) {
		this.rumenirations = rumenirations;
	}
	public Prime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	
}
