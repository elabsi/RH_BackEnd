package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Demande;

public interface DemandeMetier {

	public Demande addDemande(Demande departement);
	public void updateDemande(Demande departement);
	public Demande getDemandeById(Long id);
	public List<Demande> allDemandes();

}
