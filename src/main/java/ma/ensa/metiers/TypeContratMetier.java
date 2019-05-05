package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.TypeContrat;

public interface TypeContratMetier {
	public TypeContrat addTypeContrat(TypeContrat typeContrat);
	public void updateTypeContrat(TypeContrat typeContrat);
	public TypeContrat getTypeContratById(Long id);
	public List<TypeContrat> allTypeContrats();

}
