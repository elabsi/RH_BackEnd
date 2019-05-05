package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeEmailDao;
import ma.ensa.entities.TypeEmail;
import ma.ensa.metiers.TypeEmailMetier;

@Service
public class TypeEmailMetierImpl implements TypeEmailMetier {
 
	@Autowired
	private TypeEmailDao dao;
	@Override
	public TypeEmail getTypeEmailById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeEmail addTypeEmail(TypeEmail typeEmail) {
		return this.dao.save(typeEmail);
	}

	@Override
	public void updateTypeEmail(TypeEmail typeEmail) {
		this.dao.save(typeEmail);
	}

	@Override
	public List<TypeEmail> allTypeEmails() {
		return this.dao.findAll();
	}

	
}
