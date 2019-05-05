package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.DepartementDao;
import ma.ensa.entities.Departement;
import ma.ensa.metiers.DepartementMetier;

@Service
public class DepartementMetierImpl implements DepartementMetier {
 
	@Autowired
	private DepartementDao dao;
	@Override
	public Departement getDepartementById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Departement addDepartement(Departement departement) {
		return this.dao.save(departement);
	}

	@Override
	public void updateDepartement(Departement departement) {
		this.dao.save(departement);
	}

	@Override
	public List<Departement> allDepartements() {
		return this.dao.findAll();
	}

	
}
