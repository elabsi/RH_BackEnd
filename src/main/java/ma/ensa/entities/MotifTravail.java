package ma.ensa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("MotifTravail")
public class MotifTravail extends MotifDemande{

	public MotifTravail() {
		super();
	}
	@OneToMany(mappedBy = "motifTravail")
	private List<DemandeAuTrav> demandeAuTravs = new ArrayList<DemandeAuTrav>();
	public List<DemandeAuTrav> getDemandeAuTravs() {
		return demandeAuTravs;
	}
	public void setDemandeAuTravs(List<DemandeAuTrav> demandeAuTravs) {
		this.demandeAuTravs = demandeAuTravs;
	}

	
}
