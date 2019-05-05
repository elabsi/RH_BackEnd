package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Banque;

public interface BanqueController{
	
	public Banque addBanque(Banque banque);
	public void updateBanque(Banque banque);
	public Banque getBanqueById(Long id);
	public List<Banque> allBanques();
}
