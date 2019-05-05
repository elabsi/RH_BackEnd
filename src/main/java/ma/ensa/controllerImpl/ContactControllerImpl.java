package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.ContactController;
import ma.ensa.entities.Contact;
import ma.ensa.metiers.ContactMetier;

@RestController
@RequestMapping("/contact")
public class ContactControllerImpl implements ContactController{
	@Autowired
	private ContactMetier contactMetier;
	@Override
	@PostMapping("/getContactById")
	public Contact getContactById(@RequestBody Long id) {
		return contactMetier.getContactById(id);
	}

	@Override
	@PostMapping("/addContact")
	public Contact addContact(@RequestBody Contact contact) {
		return contactMetier.addContact(contact);
	}

	@Override
	@PostMapping("/updateContact")
	public void updateContact(@RequestBody Contact contact) {
		contactMetier.updateContact(contact);
	}

	@Override
	@GetMapping("/allContact")
	public List<Contact> allContacts() {
		return contactMetier.allContacts();
	}
}
