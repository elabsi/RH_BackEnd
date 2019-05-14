package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.DemandeAttestationDao;
import ma.ensa.entities.DemandeAttestation;
import ma.ensa.metiers.DemandeAttestationMetier;

@Service
public class DemandeAttestationMetierImpl implements DemandeAttestationMetier {
 
	@Autowired
	private DemandeAttestationDao dao;
	@Override
	public DemandeAttestation getDemandeAttestationById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public DemandeAttestation addDemandeAttestation(DemandeAttestation grp) {
		return this.dao.save(grp);
	}

	@Override
	public void updateDemandeAttestation(DemandeAttestation grp) {
		this.dao.save(grp);
	}

	@Override
	public List<DemandeAttestation> allDemandeAttestations() {
		return this.dao.findAll();
	}

	
}
