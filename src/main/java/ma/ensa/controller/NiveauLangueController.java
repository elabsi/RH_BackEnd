package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.NiveauLangue;

public interface NiveauLangueController {

	public NiveauLangue addNiveauLangue(NiveauLangue niveauLangue);
	public void updateNiveauLangue(NiveauLangue niveauLangue);
	public NiveauLangue getNiveauLangueById(Long id);
	public List<NiveauLangue> allNiveauLangues();
}
