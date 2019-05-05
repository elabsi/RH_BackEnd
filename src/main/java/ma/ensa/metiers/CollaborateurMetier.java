package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Collaborateur;

public interface CollaborateurMetier{

	public Collaborateur addCollaborateur(Collaborateur collaborateur);
	public void updateCollaborateur(Collaborateur collaborateur);
	public Collaborateur getCollaborateurById(Long id);
	public List<Collaborateur> allCollaborateurs();
	public List<Collaborateur> search(String q, int page, int size);
	public int countCollaborateur(String q);
	
}
