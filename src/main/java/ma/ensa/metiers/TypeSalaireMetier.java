package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.TypeSalaire;

public interface TypeSalaireMetier {
	
	public TypeSalaire addTypeSalaire(TypeSalaire typeSalaire);
	public void updateTypeSalaire(TypeSalaire typeSalaire);
	public TypeSalaire getTypeSalaireById(Long id);
    public List<TypeSalaire> allTypeSalaires();

}
