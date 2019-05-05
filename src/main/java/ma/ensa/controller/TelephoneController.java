package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Telephone;

public interface TelephoneController {
	public Telephone addTelephone(Telephone telephone, Long id);
	public void updateTelephone(Telephone telephone);
	public Telephone getTelephoneById(Long id);
	public List<Telephone> allTelephones();
}
