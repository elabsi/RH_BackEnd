package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.BanqueDao;
import ma.ensa.entities.Banque;
import ma.ensa.metiers.BanqueMetier;

@Service
public class BanqueMetierImpl implements BanqueMetier {
 
	@Autowired
	private BanqueDao dao;
	@Override
	public Banque getBanqueById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Banque addBanque(Banque banque) {
		return this.dao.save(banque);
	}

	@Override
	public void updateBanque(Banque banque) {
		this.dao.save(banque);
	}

	@Override
	public List<Banque> allBanques() {
		return this.dao.findAll();
	}

	
}
