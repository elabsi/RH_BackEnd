package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Utilisateur;

public interface UtilisateurMetier {
	public Utilisateur addUtilisateur(Utilisateur utilisateur);
	public void updateUtilisateur(Utilisateur utilisateur);
	public Utilisateur getUtilisateurById(Long id);

	public List<Utilisateur> allUtilisateurs();

}
