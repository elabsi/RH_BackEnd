package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.user.Utilisateur;


public interface UtilisateurMetier {
	public Utilisateur addUser(Utilisateur utilisateur);
	public void updateUser(Utilisateur utilisateur);
	public Utilisateur getUserById(Long id);
	public Utilisateur getCurrentUser();
	public Utilisateur getUser(String username);
	public List<Utilisateur> allUsers();

}
