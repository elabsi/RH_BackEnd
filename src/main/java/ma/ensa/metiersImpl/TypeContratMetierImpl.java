package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeContratDao;
import ma.ensa.entities.TypeContrat;
import ma.ensa.metiers.TypeContratMetier;

@Service
public class TypeContratMetierImpl implements TypeContratMetier {
 
	@Autowired
	private TypeContratDao dao;
	@Override
	public TypeContrat getTypeContratById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeContrat addTypeContrat(TypeContrat typeContrat) {
		return this.dao.save(typeContrat);
	}

	@Override
	public void updateTypeContrat(TypeContrat typeContrat) {
		this.dao.save(typeContrat);
	}

	@Override
	public List<TypeContrat> allTypeContrats() {
		return this.dao.findAll();
	}

	
}
