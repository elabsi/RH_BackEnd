package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.NiveauScolaireContact;

public interface NiveauScolaireContactMetier {

	public NiveauScolaireContact addNiveauScolaireContact(NiveauScolaireContact niveauScolaireContact);
	public void updateNiveauScolaireContact(NiveauScolaireContact niveauScolaireContact);
	public NiveauScolaireContact getNiveauScolaireContactById(Long id);
	public List<NiveauScolaireContact> allNiveauScolaireContacts();
}
