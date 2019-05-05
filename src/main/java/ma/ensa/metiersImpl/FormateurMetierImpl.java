package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.FormateurDao;
import ma.ensa.entities.Formateur;
import ma.ensa.metiers.FormateurMetier;

@Service
public class FormateurMetierImpl implements FormateurMetier {
 
	@Autowired
	private FormateurDao dao;
	@Override
	public Formateur getFormateurById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Formateur addFormateur(Formateur formateur) {
		return this.dao.save(formateur);
	}

	@Override
	public void updateFormateur(Formateur formateur) {
		this.dao.save(formateur);
	}

	@Override
	public List<Formateur> allFormateurs() {
		return this.dao.findAll();
	}

	
}
