package ma.ensa.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("demandeAttestation")
public class DemandeAttestation extends Demande{
	
	@ManyToOne
	private TypeAttestation typeAttestation ;
}
