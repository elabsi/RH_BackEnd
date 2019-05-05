package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.TypeSalaire;

public interface TypeSalaireController {
	
	public TypeSalaire addTypeSalaire(TypeSalaire typeSalaire);
	public void updateTypeSalaire(TypeSalaire typeSalaire);
	public TypeSalaire getTypeSalaireById(Long id);
    public List<TypeSalaire> allTypeSalaires();

}
