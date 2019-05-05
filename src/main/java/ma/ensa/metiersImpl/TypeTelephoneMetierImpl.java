package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeTelephoneDao;
import ma.ensa.entities.TypeTelephone;
import ma.ensa.metiers.TypeTelephoneMetier;

@Service
public class TypeTelephoneMetierImpl implements TypeTelephoneMetier {
 
	@Autowired
	private TypeTelephoneDao dao;
	@Override
	public TypeTelephone getTypeTelephoneById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeTelephone addTypeTelephone(TypeTelephone typeTele) {
		return this.dao.save(typeTele);
	}

	@Override
	public void updateTypeTelephone(TypeTelephone typeTele) {
		this.dao.save(typeTele);
	}

	@Override
	public List<TypeTelephone> allTypeTelephones() {
		return this.dao.findAll();
	}

	
}
