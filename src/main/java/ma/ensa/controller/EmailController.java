package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Email;

public interface EmailController {


	public Email addEmail(Email email, Long id);
	public void updateEmail(Email email);
	public Email getEmailById(Long id);
	public List<Email> allEmails();
}
