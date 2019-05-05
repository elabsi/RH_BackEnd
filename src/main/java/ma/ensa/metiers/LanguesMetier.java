package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Langues;

public interface LanguesMetier {


	public Langues addLangues(Langues langues, Long id);
	public void updateLangues(Langues langues);
	public Langues getLanguesById(Long id);
	public List<Langues> allLangues();
}
