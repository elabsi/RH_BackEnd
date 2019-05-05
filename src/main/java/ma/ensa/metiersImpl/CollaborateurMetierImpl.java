package ma.ensa.metiersImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.metiers.CollaborateurMetier;

@Service
public class CollaborateurMetierImpl implements CollaborateurMetier {
 
	@Autowired
	private CollaborateurDao dao;
	@Override
	public Collaborateur getCollaborateurById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Collaborateur addCollaborateur(Collaborateur collaborateur) {
		return this.dao.save(collaborateur);
	}

	@Override
	public void updateCollaborateur(Collaborateur collaborateur) {
		this.dao.save(collaborateur);
	}

	@Override
	public List<Collaborateur> allCollaborateurs() {
		return this.dao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Collaborateur> search(String q, int page, int size) {
		return this.dao.findByNomContainingOrPrenomContaining(q, q, new PageRequest(page, size));
	}

	@Override
	public int countCollaborateur(String q) {
		return this.dao.findByNomContainingOrPrenomContaining(q, q).size();
	}

	
}
