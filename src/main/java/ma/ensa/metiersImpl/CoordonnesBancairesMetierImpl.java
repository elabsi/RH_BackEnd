package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.dao.CoordonnesBancairesDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.CoordonnesBancaires;
import ma.ensa.metiers.CoordonnesBancairesMetier;

@Service
public class CoordonnesBancairesMetierImpl implements CoordonnesBancairesMetier {
 
	@Autowired
	private CollaborateurDao collaborateurDao;
	@Autowired
	private CoordonnesBancairesDao dao;
	@Override
	public CoordonnesBancaires getCoordonnesBancairesById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public CoordonnesBancaires addCoordonnesBancaires(CoordonnesBancaires coordonnesBan, Long id) {
		Collaborateur c = this.collaborateurDao.findById(id).get();
		coordonnesBan.setContact(c);
		return this.dao.save(coordonnesBan);
	}

	@Override
	public void updateCoordonnesBancaires(CoordonnesBancaires coordonnesBan) {
		this.dao.save(coordonnesBan);
	}

	@Override
	public List<CoordonnesBancaires> allCoordonnesBancaires() {
		return this.dao.findAll();
	}
}
