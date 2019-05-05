package ma.ensa.metiersImpl;

import java.util.List ;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.dao.PeriodeDepartementDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.PeriodeDepartement;
import ma.ensa.metiers.PeriodeDepartementMetier;

@Service
@Transactional
public class PeriodeDepartementMetierImpl implements PeriodeDepartementMetier {
 
	@Autowired
	private CollaborateurDao collaborateurDao;
	@Autowired
	private PeriodeDepartementDao dao;
	@Override
	public PeriodeDepartement getPeriodeDepartementById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public PeriodeDepartement addPeriodeDepartement(PeriodeDepartement periodeDep, Long id) {

		Collaborateur c = this.collaborateurDao.findById(id).get();
		c.getPeriodeDepartements().forEach(p -> {
			if(p.getDateFin() == null) {
				p.setDateFin(periodeDep.getDateDebut());
			}
		});
		periodeDep.setContact(c);
		return this.dao.save(periodeDep);
	}

	@Override
	public void updatePeriodeDepartement(PeriodeDepartement periodeDep) {
		this.dao.save(periodeDep);
	}

	@Override
	public List<PeriodeDepartement> allPeriodeDepartements() {
		return this.dao.findAll();
	}

	
}
