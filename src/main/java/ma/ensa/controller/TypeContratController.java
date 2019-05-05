package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.TypeContrat;

public interface TypeContratController {
	public TypeContrat addTypeContrat(TypeContrat typeContrat);
	public void updateTypeContrat(TypeContrat typeContrat);
	public TypeContrat getTypeContratById(Long id);
	public List<TypeContrat> allTypeContrats();

}
