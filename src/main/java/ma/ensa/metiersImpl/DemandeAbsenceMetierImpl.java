package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.DemandeAbsenceDao;
import ma.ensa.dao.UtilisateurDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.DemandeAbsence;
import ma.ensa.metiers.DemandeAbsenceMetier;

@Service
public class DemandeAbsenceMetierImpl implements DemandeAbsenceMetier {
 
	@Autowired
	private UtilisateurDao ud;
	@Autowired
	private DemandeAbsenceDao dao;
	@Override
	public DemandeAbsence getDemandeAbsenceById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public DemandeAbsence addDemandeAbsence(DemandeAbsence grp) {
		return this.dao.save(grp);
	}

	@Override
	public void updateDemandeAbsence(DemandeAbsence grp) {
		this.dao.save(grp);
	}

	@Override
	public List<DemandeAbsence> allDemandeAbsences() {
		return this.dao.findAll();
	}
	@Override
	public List<DemandeAbsence> allDemandeAbsences(String username) {
		Collaborateur c = (Collaborateur) this.ud.findByUsername(username).get().getContact();
		
		return this.dao.findByCollaborateur(c);
	}

		
}
