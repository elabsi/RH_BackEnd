package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.dao.EmailDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.Email;
import ma.ensa.metiers.EmailMetier;

@Service
public class EmailMetierImpl implements EmailMetier {
 
	@Autowired
	private CollaborateurDao collaborateurDao;
	@Autowired
	private EmailDao dao;
	@Override
	public Email getEmailById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Email addEmail(Email email, Long id) {
		Collaborateur c = this.collaborateurDao.findById(id).get();
		email.setContact(c);
		return this.dao.save(email);
	}

	@Override
	public void updateEmail(Email email) {
		this.dao.save(email);
	}

	@Override
	public List<Email> allEmails() {
		return this.dao.findAll();
	}

	
}
