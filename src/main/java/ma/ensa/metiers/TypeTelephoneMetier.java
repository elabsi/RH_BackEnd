package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.TypeTelephone;

public interface TypeTelephoneMetier {
	
	public TypeTelephone addTypeTelephone(TypeTelephone typeTelephone);
	public void updateTypeTelephone(TypeTelephone typeTelephone);
	public TypeTelephone getTypeTelephoneById(Long id);

	 public List<TypeTelephone> allTypeTelephones();

}
