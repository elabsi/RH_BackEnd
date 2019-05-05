package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Domaine;

public interface DomaineController {


	public Domaine addDomaine(Domaine domaine);
	public void updateDomaine(Domaine domaine);
	public Domaine getDomaineById(Long id);
	public List<Domaine> allDomaines();
}
