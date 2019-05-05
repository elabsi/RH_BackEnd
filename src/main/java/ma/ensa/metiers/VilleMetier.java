package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Ville;

public interface VilleMetier {
	public Ville addVille(Ville ville);
	public void updateVille(Ville ville);
	public Ville getVilleById(Long id);
	public List<Ville> allVilles();

}
