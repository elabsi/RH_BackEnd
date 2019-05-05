package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.TypeDepartement;

public interface TypeDepartementMetier{
	public TypeDepartement addTypeDepartement(TypeDepartement type);
	public void updateTypeDepartement(TypeDepartement type);
	public TypeDepartement getTypeDepartementById(Long id);
	public List<TypeDepartement> allTypeDepartements();

}
