package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ma.ensa.dao.CollaborateurDao;
import ma.ensa.dao.LanguesDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.Langues;
import ma.ensa.metiers.LanguesMetier;

@Service
public class LanguesMetierImpl implements LanguesMetier {
 
	@Autowired
	private CollaborateurDao collaborateurDao;
	@Autowired
	private LanguesDao dao;
	@Override
	public Langues getLanguesById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Langues addLangues(Langues langues, Long id) {
		Collaborateur c = this.collaborateurDao.findById(id).get();
		langues.setContact(c);
		return this.dao.save(langues);
	}

	@Override
	public void updateLangues(Langues langues) {
		this.dao.save(langues);
	}

	@Override
	public List<Langues> allLangues() {
		return this.dao.findAll();
	}

	
}
