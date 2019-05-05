package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.ProcheDao;
import ma.ensa.entities.Proche;
import ma.ensa.metiers.ProcheMetier;

@Service
public class ProcheMetierImpl implements ProcheMetier {
 
	@Autowired
	private ProcheDao dao;
	@Override
	public Proche getProcheById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Proche addProche(Proche proche) {
		return this.dao.save(proche);
	}

	@Override
	public void updateProche(Proche proche) {
		this.dao.save(proche);
	}

	@Override
	public List<Proche> allProches() {
		return this.dao.findAll();
	}

	
}
