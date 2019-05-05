package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.NiveauLangueDao;
import ma.ensa.entities.NiveauLangue;
import ma.ensa.metiers.NiveauLangueMetier;

@Service
public class NiveauLangueMetierImpl implements NiveauLangueMetier {
 
	@Autowired
	private NiveauLangueDao dao;
	@Override
	public NiveauLangue getNiveauLangueById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public NiveauLangue addNiveauLangue(NiveauLangue niveauLangue) {
		return this.dao.save(niveauLangue);
	}

	@Override
	public void updateNiveauLangue(NiveauLangue niveauLangue) {
		this.dao.save(niveauLangue);
	}

	@Override
	public List<NiveauLangue> allNiveauLangues() {
		return this.dao.findAll();
	}

	
}
