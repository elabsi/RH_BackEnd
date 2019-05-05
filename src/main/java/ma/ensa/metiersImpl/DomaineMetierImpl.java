package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.DomaineDao;
import ma.ensa.entities.Domaine;
import ma.ensa.metiers.DomaineMetier;

@Service
public class DomaineMetierImpl implements DomaineMetier {
 
	@Autowired
	private DomaineDao dao;
	@Override
	public Domaine getDomaineById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Domaine addDomaine(Domaine domaine) {
		return this.dao.save(domaine);
	}

	@Override
	public void updateDomaine(Domaine domaine) {
		this.dao.save(domaine);
	}

	@Override
	public List<Domaine> allDomaines() {
		return this.dao.findAll();
	}

	
}
