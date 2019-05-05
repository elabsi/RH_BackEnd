package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.dao.TelephoneDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.Telephone;
import ma.ensa.metiers.TelephoneMetier;

@Service
public class TelephoneMetierImpl implements TelephoneMetier {
 
	@Autowired
	private CollaborateurDao cd;
	@Autowired
	private TelephoneDao dao;
	@Override
	public Telephone getTelephoneById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Telephone addTelephone(Telephone tele, Long id) {
		Collaborateur c = this.cd.findById(id).get();
		tele.setContact(c);
		return this.dao.save(tele);
	}

	@Override
	public void updateTelephone(Telephone tele) {
		this.dao.save(tele);
	}

	@Override
	public List<Telephone> allTelephones() {
		return this.dao.findAll();
	}

	
}
