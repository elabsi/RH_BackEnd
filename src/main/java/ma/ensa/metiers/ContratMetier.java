package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Contrat;

public interface ContratMetier {

	public Contrat addContrat(Contrat contrat, Long id);
	public void updateContrat(Contrat contrat);
	public Contrat getContratById(Long id);
	public List<Contrat> allContrats();
}
