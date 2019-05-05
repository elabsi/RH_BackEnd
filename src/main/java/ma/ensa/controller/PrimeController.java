package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Prime;

public interface PrimeController {
	public Prime addPrime(Prime prime);
	public void updatePrime(Prime prime);
	public Prime getPrimeById(Long id);
	public List<Prime> allPrimes();
}
