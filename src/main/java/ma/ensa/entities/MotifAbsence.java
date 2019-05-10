package ma.ensa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("MotifAbsence")
public class MotifAbsence extends MotifDemande{
	
	private boolean payee;
	@OneToMany(mappedBy = "motifAbsence")
	@JsonIgnore
	private List<DemandeAbsence> demandeAbsences = new ArrayList<DemandeAbsence>();
	public List<DemandeAbsence> getDemandeAbsences() {
		return demandeAbsences;
	}

	public void setDemandeAbsences(List<DemandeAbsence> demandeAbsences) {
		this.demandeAbsences = demandeAbsences;
	}

	public MotifAbsence() {
		super();
	}

	public boolean isPayee() {
		return payee;
	}

	public void setPayee(boolean payee) {
		this.payee = payee;
	}
	

}
