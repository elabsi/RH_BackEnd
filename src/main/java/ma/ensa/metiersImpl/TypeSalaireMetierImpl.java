package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeSalaireDao;
import ma.ensa.entities.TypeSalaire;
import ma.ensa.metiers.TypeSalaireMetier;

@Service
public class TypeSalaireMetierImpl implements TypeSalaireMetier {
 
	@Autowired
	private TypeSalaireDao dao;
	@Override
	public TypeSalaire getTypeSalaireById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeSalaire addTypeSalaire(TypeSalaire typeSal) {
		return this.dao.save(typeSal);
	}

	@Override
	public void updateTypeSalaire(TypeSalaire typeSal) {
		this.dao.save(typeSal);
	}

	@Override
	public List<TypeSalaire> allTypeSalaires() {
		return this.dao.findAll();
	}

	
}
