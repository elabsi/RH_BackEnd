package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.DemandeAuthSortie;

public interface DemandeAuthSortieController {

	public DemandeAuthSortie addDemandeAuthSortie(DemandeAuthSortie departement);
	public void updateDemandeAuthSortie(DemandeAuthSortie departement);
	public DemandeAuthSortie getDemandeAuthSortieById(Long id);
	public List<DemandeAuthSortie> allDemandeAuthSorties();

}
