package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.DemandeAuTrav;

public interface DemandeAuTravController {

	public DemandeAuTrav addDemandeAuTrav(DemandeAuTrav departement);
	public void updateDemandeAuTrav(DemandeAuTrav departement);
	public DemandeAuTrav getDemandeAuTravById(Long id);
	public List<DemandeAuTrav> allDemandeAuTravs();
	public List<DemandeAuTrav> allDemandeAuTravs(String username);

}
