package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.DemandeTravailDao;
import ma.ensa.dao.UtilisateurDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.DemandeAuTrav;
import ma.ensa.metiers.DemandeAuTravMetier;


@Service
public class DemandeAuTravMetierImpl implements DemandeAuTravMetier {
 
	@Autowired
	private DemandeTravailDao dao;
	@Autowired
	private UtilisateurDao ud;
	@Override
	public DemandeAuTrav getDemandeAuTravById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public DemandeAuTrav addDemandeAuTrav(DemandeAuTrav grp) {
		return this.dao.save(grp);
	}

	@Override
	public void updateDemandeAuTrav(DemandeAuTrav grp) {
		this.dao.save(grp);
	}

	@Override
	public List<DemandeAuTrav> allDemandeAuTravs() {
		return this.dao.findAll();
	}
	@Override
	public List<DemandeAuTrav> allDemandeAuTravs(String username) {
		Collaborateur c = (Collaborateur) this.ud.findByUsername(username).get().getContact();
		
		return this.dao.findByCollaborateur(c);
	}

	
}
