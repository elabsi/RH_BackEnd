package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.dao.ReseauSocialDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.ReseauSocial;
import ma.ensa.metiers.ReseauSocialMetier;

@Service
public class ReseauSocialMetierImpl implements ReseauSocialMetier {
 
	@Autowired
	private CollaborateurDao collaborateurDao;
	@Autowired
	private ReseauSocialDao dao;
	@Override
	public ReseauSocial getReseauSocialById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public ReseauSocial addReseauSocial(ReseauSocial reseauSo, Long id) {
		Collaborateur c = this.collaborateurDao.findById(id).get();
		reseauSo.setContact(c);
		return this.dao.save(reseauSo);
	}

	@Override
	public void updateReseauSocial(ReseauSocial reseauSo) {
		this.dao.save(reseauSo);
	}

	@Override
	public List<ReseauSocial> allReseauSocials() {
		return this.dao.findAll();
	}

	
}
