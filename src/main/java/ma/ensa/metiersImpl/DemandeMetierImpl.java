package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.DemandeDao;
import ma.ensa.entities.Demande;
import ma.ensa.metiers.DemandeMetier;

@Service
public class DemandeMetierImpl implements DemandeMetier {
 
	@Autowired
	private DemandeDao dao;
	@Override
	public Demande getDemandeById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Demande addDemande(Demande grp) {
		return this.dao.save(grp);
	}

	@Override
	public void updateDemande(Demande grp) {
		this.dao.save(grp);
	}

	@Override
	public List<Demande> allDemandes() {
		return this.dao.findAll();
	}

	
}
