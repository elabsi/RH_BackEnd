package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypePeriodeDepartementDao;
import ma.ensa.entities.TypePeriodeDepartement;
import ma.ensa.metiers.TypePeriodeDepartementMetier;

@Service
public class TypePeriodeDepartementMetierImpl implements TypePeriodeDepartementMetier {
 
	@Autowired
	private TypePeriodeDepartementDao dao;
	@Override
	public TypePeriodeDepartement getTypePeriodeDepartementById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypePeriodeDepartement addTypePeriodeDepartement(TypePeriodeDepartement typePeriodeDep) {
		return this.dao.save(typePeriodeDep);
	}

	@Override
	public void updateTypePeriodeDepartement(TypePeriodeDepartement typePeriodeDep) {
		this.dao.save(typePeriodeDep);
	}

	@Override
	public List<TypePeriodeDepartement> allTypePeriodeDepartements() {
		return this.dao.findAll();
	}

	
}
