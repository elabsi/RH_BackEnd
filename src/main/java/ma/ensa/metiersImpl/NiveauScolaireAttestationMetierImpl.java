package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.NiveauScolaireAttestationDao;
import ma.ensa.entities.NiveauScolaireAttestation;
import ma.ensa.metiers.NiveauScolaireAttestationMetier;

@Service
public class NiveauScolaireAttestationMetierImpl implements NiveauScolaireAttestationMetier {
 
	@Autowired
	private NiveauScolaireAttestationDao dao;
	@Override
	public NiveauScolaireAttestation getNiveauScolaireAttestationById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public NiveauScolaireAttestation addNiveauScolaireAttestation(NiveauScolaireAttestation niveauScoAtt) {
		return this.dao.save(niveauScoAtt);
	}

	@Override
	public void updateNiveauScolaireAttestation(NiveauScolaireAttestation niveauScoAtt) {
		this.dao.save(niveauScoAtt);
	}

	@Override
	public List<NiveauScolaireAttestation> allNiveauScolaireAttestations() {
		return this.dao.findAll();
	}

	
}
