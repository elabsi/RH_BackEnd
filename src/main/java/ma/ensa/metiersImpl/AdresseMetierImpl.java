package ma.ensa.metiersImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.AdresseDao;
import ma.ensa.dao.CollaborateurDao;
import ma.ensa.entities.Adresse;
import ma.ensa.entities.Collaborateur;
import ma.ensa.metiers.AdresseMetier;


@Service
public class AdresseMetierImpl implements AdresseMetier {
 
	@Autowired
	private CollaborateurDao collaborateurDao;
	@Autowired
	private AdresseDao dao;
	@Override
	public Adresse getAdresseById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Adresse addAdresse(Adresse adresse, Long id) {
		Collaborateur c = this.collaborateurDao.findById(id).get();
		adresse.setContact(c);
		return this.dao.save(adresse);
	}

	@Override
	public void updateAdresse(Adresse adresse) {
		this.dao.save(adresse);
	}

	@Override
	public List<Adresse> allAdresses() {
		return this.dao.findAll();
	}

	
}
