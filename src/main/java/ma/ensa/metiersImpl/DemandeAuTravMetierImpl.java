package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.DemandeTravailDao;
import ma.ensa.entities.DemandeAuTrav;
import ma.ensa.metiers.DemandeAuTravMetier;


@Service
public class DemandeAuTravMetierImpl implements DemandeAuTravMetier {
 
	@Autowired
	private DemandeTravailDao dao;
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

	
}
