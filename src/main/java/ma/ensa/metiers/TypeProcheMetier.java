package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.TypeProche;

public interface TypeProcheMetier  {

	public TypeProche addTypeProche(TypeProche typeProche);
	public void updateTypeProche(TypeProche typeProche);
	public TypeProche getTypeProcheById(Long id);
	public List<TypeProche> allTypeProches();
}
