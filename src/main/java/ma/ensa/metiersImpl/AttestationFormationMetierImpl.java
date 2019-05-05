package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.AttestationFormationDao;
import ma.ensa.dao.CollaborateurDao;
import ma.ensa.entities.AttestationFormation;
import ma.ensa.entities.Collaborateur;
import ma.ensa.metiers.AttestationFormationMetier;

@Service
public class AttestationFormationMetierImpl implements AttestationFormationMetier {
 
	@Autowired
	private CollaborateurDao collaborateurDao;
	@Autowired
	private AttestationFormationDao dao;
	@Override
	public AttestationFormation getAttestationFormationById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public AttestationFormation addAttestationFormation(AttestationFormation att, Long id) {
		Collaborateur c = this.collaborateurDao.findById(id).get();
		att.setContact(c);
		return this.dao.save(att);
	}

	@Override
	public void updateAttestationFormation(AttestationFormation att) {
		this.dao.save(att);
	}

	@Override
	public List<AttestationFormation> allAttestationFormations() {
		return this.dao.findAll();
	}

	
}
