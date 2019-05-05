package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.PrimeDao;
import ma.ensa.entities.Prime;
import ma.ensa.metiers.PrimeMetier;

@Service
public class PrimeMetierImpl implements PrimeMetier {
 
	@Autowired
	private PrimeDao dao;
	@Override
	public Prime getPrimeById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Prime addPrime(Prime prime) {
		return this.dao.save(prime);
	}

	@Override
	public void updatePrime(Prime prime) {
		this.dao.save(prime);
	}

	@Override
	public List<Prime> allPrimes() {
		return this.dao.findAll();
	}

	
}
