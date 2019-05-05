package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Visiteur;

public interface VisiteurMetier {
	public Visiteur addVisiteur(Visiteur visiteur);
	public void updateVisiteur(Visiteur visiteur);
	public Visiteur getVisiteurById(Long id);
	public List<Visiteur> allVisiteurs();

}
