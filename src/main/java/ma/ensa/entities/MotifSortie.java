package ma.ensa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("MotifSortie")
public class MotifSortie extends MotifDemande{
	
	private boolean payee;
	@OneToMany(mappedBy = "motifSortie")
	@JsonIgnore
	private List<DemandeAuthSortie> demandeAuthSorties = new ArrayList<DemandeAuthSortie>();
	public MotifSortie() {
		super();
	}
	public boolean isPayee() {
		return payee;
	}
	public void setPayee(boolean payee) {
		this.payee = payee;
	}
	public List<DemandeAuthSortie> getDemandeAuthSorties() {
		return demandeAuthSorties;
	}
	public void setDemandeAuthSorties(List<DemandeAuthSortie> demandeAuthSorties) {
		this.demandeAuthSorties = demandeAuthSorties;
	}
 
}
