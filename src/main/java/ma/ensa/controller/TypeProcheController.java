package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.TypeProche;

public interface TypeProcheController  {

	public TypeProche addTypeProche(TypeProche typeProche);
	public void updateTypeProche(TypeProche typeProche);
	public TypeProche getTypeProcheById(Long id);
	public List<TypeProche> allTypeProches();
}
