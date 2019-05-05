package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.ContactDao;
import ma.ensa.entities.Contact;
import ma.ensa.metiers.ContactMetier;

@Service
public class ContactMetierImpl implements ContactMetier {
 
	@Autowired
	private ContactDao dao;
	@Override
	public Contact getContactById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Contact addContact(Contact contact) {
		return this.dao.save(contact);
	}

	@Override
	public void updateContact(Contact contact) {
		this.dao.save(contact);
	}

	@Override
	public List<Contact> allContacts() {
		return this.dao.findAll();
	}

	
}
