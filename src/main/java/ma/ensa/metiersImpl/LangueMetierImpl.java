package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.LangueDao;
import ma.ensa.entities.Langue;
import ma.ensa.metiers.LangueMetier;

@Service
public class LangueMetierImpl implements LangueMetier {
 
	@Autowired
	private LangueDao dao;
	@Override
	public Langue getLangueById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Langue addLangue(Langue langue) {
		return this.dao.save(langue);
	}

	@Override
	public void updateLangue(Langue langue) {
		this.dao.save(langue);
	}

	@Override
	public List<Langue> allLangues() {
		return this.dao.findAll();
	}

	
}
