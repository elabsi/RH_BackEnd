package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.SpecialiteDao;
import ma.ensa.entities.Specialite;
import ma.ensa.metiers.SpecialiteMetier;

@Service
public class SpecialiteMetierImpl implements SpecialiteMetier {
 
	@Autowired
	private SpecialiteDao dao;
	@Override
	public Specialite getSpecialiteById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Specialite addSpecialite(Specialite specialite) {
		return this.dao.save(specialite);
	}

	@Override
	public void updateSpecialite(Specialite specialite) {
		this.dao.save(specialite);
	}

	@Override
	public List<Specialite> allSpecialites() {
		return this.dao.findAll();
	}

	
}
