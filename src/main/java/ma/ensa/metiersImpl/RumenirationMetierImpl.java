package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.RumenirationDao;
import ma.ensa.entities.Rumeniration;
import ma.ensa.metiers.RumenirationMetier;

@Service
public class RumenirationMetierImpl implements RumenirationMetier {
 
	@Autowired
	private RumenirationDao dao;
	@Override
	public Rumeniration getRumenirationById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Rumeniration addRumeniration(Rumeniration rumeniration) {
		return this.dao.save(rumeniration);
	}

	@Override
	public void updateRumeniration(Rumeniration rumeniration) {
		this.dao.save(rumeniration);
	}

	@Override
	public List<Rumeniration> allRumenirations() {
		return this.dao.findAll();
	}

	
}
