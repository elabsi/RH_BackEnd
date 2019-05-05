package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.NiveauScolaireContactDao;
import ma.ensa.entities.NiveauScolaireContact;
import ma.ensa.metiers.NiveauScolaireContactMetier;

@Service
public class NiveauScolaireContactMetierImpl implements NiveauScolaireContactMetier {
 
	@Autowired
	private NiveauScolaireContactDao dao;
	@Override
	public NiveauScolaireContact getNiveauScolaireContactById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public NiveauScolaireContact addNiveauScolaireContact(NiveauScolaireContact niveauScolaire) {
		return this.dao.save(niveauScolaire);
	}

	@Override
	public void updateNiveauScolaireContact(NiveauScolaireContact niveauScolaire) {
		this.dao.save(niveauScolaire);
	}

	@Override
	public List<NiveauScolaireContact> allNiveauScolaireContacts() {
		return this.dao.findAll();
	}

	
}
