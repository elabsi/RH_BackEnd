package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeDepartementDao;
import ma.ensa.entities.TypeDepartement;
import ma.ensa.metiers.TypeDepartementMetier;

@Service
public class TypeDepartementMetierImpl implements TypeDepartementMetier {
 
	@Autowired
	private TypeDepartementDao dao;
	@Override
	public TypeDepartement getTypeDepartementById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeDepartement addTypeDepartement(TypeDepartement typeDep) {
		return this.dao.save(typeDep);
	}

	@Override
	public void updateTypeDepartement(TypeDepartement typeDep) {
		this.dao.save(typeDep);
	}

	@Override
	public List<TypeDepartement> allTypeDepartements() {
		return this.dao.findAll();
	}

	
}
