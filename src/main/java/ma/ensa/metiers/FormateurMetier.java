package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Formateur;

public interface FormateurMetier {


	public Formateur addFormateur(Formateur formateur);
	public void updateFormateur(Formateur formateur);
	public Formateur getFormateurById(Long id);
	public List<Formateur> allFormateurs();
}
