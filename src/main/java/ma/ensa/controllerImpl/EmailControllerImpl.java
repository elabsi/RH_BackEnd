package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.EmailController;
import ma.ensa.entities.Email;
import ma.ensa.metiers.EmailMetier;

@RestController
@RequestMapping("/email")
public class EmailControllerImpl implements EmailController {
 
	@Autowired
	private EmailMetier emailMetier;
	@Override
	@PostMapping("/getEmailById")
	public Email getEmailById(@RequestBody Long id) {
		return emailMetier.getEmailById(id);
	}

	@Override
	@PostMapping("/addEmail/{id}")
	public Email addEmail(@RequestBody Email email, @PathVariable Long id ) {
		return emailMetier.addEmail(email, id);
	}

	@Override
	@PostMapping("/updateEmail")
	public void updateEmail(@RequestBody Email email) {
		emailMetier.updateEmail(email);
	}

	@Override
	@GetMapping("/allEmails")
	public List<Email> allEmails() {
		return emailMetier.allEmails();
	}
	
}
