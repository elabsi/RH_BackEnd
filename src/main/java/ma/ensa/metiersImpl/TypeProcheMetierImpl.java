package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeProcheDao;
import ma.ensa.entities.TypeProche;
import ma.ensa.metiers.TypeProcheMetier;

@Service
public class TypeProcheMetierImpl implements TypeProcheMetier {
 
	@Autowired
	private TypeProcheDao dao;
	@Override
	public TypeProche getTypeProcheById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeProche addTypeProche(TypeProche typeProche) {
		return this.dao.save(typeProche);
	}

	@Override
	public void updateTypeProche(TypeProche typeProche) {
		this.dao.save(typeProche);
	}

	@Override
	public List<TypeProche> allTypeProches() {
		return this.dao.findAll();
	}

	
}
