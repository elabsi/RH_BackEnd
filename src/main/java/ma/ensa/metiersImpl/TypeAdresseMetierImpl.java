package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeAdresseDao;
import ma.ensa.entities.TypeAdresse;
import ma.ensa.metiers.TypeAdresseMetier;

@Service
public class TypeAdresseMetierImpl implements TypeAdresseMetier {
 
	@Autowired
	private TypeAdresseDao dao;
	@Override
	public TypeAdresse getTypeAdresseById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeAdresse addTypeAdresse(TypeAdresse typeAdresse) {
		return this.dao.save(typeAdresse);
	}

	@Override
	public void updateTypeAdresse(TypeAdresse typeAdresse) {
		this.dao.save(typeAdresse);
	}

	@Override
	public List<TypeAdresse> allTypeAdresses() {
		return this.dao.findAll();
	}

	
}
