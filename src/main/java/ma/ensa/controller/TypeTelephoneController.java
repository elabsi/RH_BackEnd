package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.TypeTelephone;

public interface TypeTelephoneController {
	
	public TypeTelephone addTypeTelephone(TypeTelephone typeTelephone);
	public void updateTypeTelephone(TypeTelephone typeTelephone);
	public TypeTelephone getTypeTelephoneById(Long id);

	 public List<TypeTelephone> allTypeTelephones();

}
