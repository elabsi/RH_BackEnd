package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Categorie;

public interface CategorieMetier {

	public Categorie addCategorie(Categorie categorie);
	public void updateCategorie(Categorie categorie);
	public Categorie getCategorieById(Long id);
	public List<Categorie> allCategories();
}
