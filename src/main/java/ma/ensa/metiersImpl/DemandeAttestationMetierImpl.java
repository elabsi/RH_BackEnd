package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.DemandeAttestationDao;
import ma.ensa.dao.UtilisateurDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.DemandeAttestation;
import ma.ensa.metiers.DemandeAttestationMetier;

@Service
public class DemandeAttestationMetierImpl implements DemandeAttestationMetier {
 
	@Autowired
	private UtilisateurDao ud;
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
	@Override
	public List<DemandeAttestation> allDemandeAttestations(String username) {
		Collaborateur c = (Collaborateur) this.ud.findByUsername(username).get().getContact();
		
		return this.dao.findByCollaborateur(c);
	}

	
}
