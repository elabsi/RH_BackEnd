package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.user.Utilisateur;

public interface UtilisateurController {

	public void updateUser(Utilisateur utilisateur);
	public Utilisateur getUserById(Long id);
	public Utilisateur getCurrentUser();
	public Utilisateur getUser(String username);
	public List<Utilisateur> allUsers();
	
}
