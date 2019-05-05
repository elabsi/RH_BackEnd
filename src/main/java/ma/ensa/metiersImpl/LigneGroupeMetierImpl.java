package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.dao.LigneGroupeDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.LigneGroupe;
import ma.ensa.metiers.LigneGroupeMetier;

@Service
public class LigneGroupeMetierImpl implements LigneGroupeMetier {
 
	@Autowired
	private CollaborateurDao collaborateurDao;
	@Autowired
	private LigneGroupeDao dao;
	@Override
	public LigneGroupe getLigneGroupeById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public LigneGroupe addLigneGroupe(LigneGroupe ligneGrp, Long id) {
		Collaborateur c = this.collaborateurDao.findById(id).get();
		ligneGrp.setCollaborateur(c);
		return this.dao.save(ligneGrp);
	}

	@Override
	public void updateLigneGroupe(LigneGroupe ligneGrp) {
		this.dao.save(ligneGrp);
	}

	@Override
	public List<LigneGroupe> allLigneGroupes() {
		return this.dao.findAll();
	}

	
}
