package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.DemandeSortieDao;
import ma.ensa.entities.DemandeAuthSortie;
import ma.ensa.metiers.DemandeAuthSortieMetier;

@Service
public class DemandeAuthSortieMetierImpl implements DemandeAuthSortieMetier {
 
	@Autowired
	private DemandeSortieDao dao;
	@Override
	public DemandeAuthSortie getDemandeAuthSortieById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public DemandeAuthSortie addDemandeAuthSortie(DemandeAuthSortie grp) {
		return this.dao.save(grp);
	}

	@Override
	public void updateDemandeAuthSortie(DemandeAuthSortie grp) {
		this.dao.save(grp);
	}

	@Override
	public List<DemandeAuthSortie> allDemandeAuthSorties() {
		return this.dao.findAll();
	}

	
}
