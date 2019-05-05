package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Prime;

public interface PrimeMetier {
	public Prime addPrime(Prime prime);
	public void updatePrime(Prime prime);
	public Prime getPrimeById(Long id);
	public List<Prime> allPrimes();
}
