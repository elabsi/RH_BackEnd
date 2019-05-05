package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Adresse;

public interface AdresseController {

	public Adresse addAdresse(Adresse adresse, Long id);
	public void updateAdresse(Adresse adresse);
	public Adresse getAdresseById(Long id);
	public List<Adresse> allAdresses();
}
