package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Categorie;

public interface CategorieController {

	public Categorie addCategorie(Categorie categorie);
	public void updateCategorie(Categorie categorie);
	public Categorie getCategorieById(Long id);
	public List<Categorie> allCategories();
}
