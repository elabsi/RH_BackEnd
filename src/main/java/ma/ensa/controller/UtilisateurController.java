package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.user.Utilisateur;
import ma.ensa.message.request.LoginForm;

public interface UtilisateurController {

	public void updateUser(Utilisateur utilisateur);
	public Utilisateur getUserById(Long id);
	public Utilisateur getCurrentUser();
	public Utilisateur getUser(String username);
	public List<Utilisateur> allUsers();
	public boolean updateMdp(LoginForm lf);	
	public Utilisateur getUserByCollabId(Long id);
	public boolean addRole(String role, Long CollabId);

}
