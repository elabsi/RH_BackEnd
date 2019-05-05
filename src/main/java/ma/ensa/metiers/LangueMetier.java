package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Langue;

public interface LangueMetier {
	

	public Langue addLangue(Langue langue);
	public void updateLangue(Langue langue);
	public Langue getLangueById(Long id);
	public List<Langue> allLangues();

}
