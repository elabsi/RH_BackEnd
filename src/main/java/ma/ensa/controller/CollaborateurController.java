package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Collaborateur;

public interface CollaborateurController{

	public Collaborateur addCollaborateur(Collaborateur collaborateur);
	public void updateCollaborateur(Collaborateur collaborateur);
	public Collaborateur getCollaborateurById(Long id);
	public List<Collaborateur> allCollaborateurs();
	public List<Collaborateur> search(String q, int page, int size);
	public int countCollaborateur(String q);
	public void switchCompteActive(Long id);
	
}
