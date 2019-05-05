package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Contact;

public interface ContactController {

	public Contact addContact(Contact contact);
	public void updateContact(Contact contact);
	public Contact getContactById(Long id);
	public List<Contact> allContacts();
}
