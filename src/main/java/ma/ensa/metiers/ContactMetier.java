package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Contact;

public interface ContactMetier {

	public Contact addContact(Contact contact);
	public void updateContact(Contact contact);
	public Contact getContactById(Long id);
	public List<Contact> allContacts();
}
