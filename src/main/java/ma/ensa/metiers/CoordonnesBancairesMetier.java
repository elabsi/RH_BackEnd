package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.CoordonnesBancaires;

public interface CoordonnesBancairesMetier {

	public CoordonnesBancaires addCoordonnesBancaires(CoordonnesBancaires coordonnesBancaires, Long id);
	public void updateCoordonnesBancaires(CoordonnesBancaires coordonnesBancaires);
	public CoordonnesBancaires getCoordonnesBancairesById(Long id);
	public List<CoordonnesBancaires> allCoordonnesBancaires();
}
