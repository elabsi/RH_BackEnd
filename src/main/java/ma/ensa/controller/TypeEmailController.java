package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.TypeEmail;

public interface TypeEmailController {

	public TypeEmail addTypeEmail(TypeEmail typeEmail);
	public void updateTypeEmail(TypeEmail typeEmail);
	public TypeEmail getTypeEmailById(Long id);
	public List<TypeEmail> allTypeEmails();
	
}
