package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.dao.ContratDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.Contrat;
import ma.ensa.metiers.ContratMetier;

@Service
public class ContratMetierImpl implements ContratMetier {
 
	@Autowired
	private ContratDao dao;
	@Autowired
	private CollaborateurDao collaborateurDao;
	@Override
	public Contrat getContratById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Contrat addContrat(Contrat contrat, Long id) {
		Collaborateur c = this.collaborateurDao.findById(id).get();
		contrat.setContact(c);
		return this.dao.save(contrat);
	}

	@Override
	public void updateContrat(Contrat contrat) {
		this.dao.save(contrat);
	}

	@Override
	public List<Contrat> allContrats() {
		return this.dao.findAll();
	}

	
}
