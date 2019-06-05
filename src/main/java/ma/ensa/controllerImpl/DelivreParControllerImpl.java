package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.DelivreParController;
import ma.ensa.entities.DelivrePar;
import ma.ensa.metiers.DelivreParMetier;

@RestController
@RequestMapping("/parametres/delivrePar")
public class DelivreParControllerImpl implements DelivreParController{
 
	@Autowired
	private DelivreParMetier delivreParMetier;
	@Override
	@PostMapping("/getDelivreParById")
	public DelivrePar getDelivreParById(@RequestBody Long id) {
		return delivreParMetier.getDelivreParById(id);
	}

	@Override
	@PostMapping("/addDelivrePar")
	public DelivrePar addDelivrePar(@RequestBody DelivrePar delivrePar) {
		return delivreParMetier.addDelivrePar(delivrePar);
	}

	@Override
	@PostMapping("/updateDelivrePar")
	public void updateDelivrePar(@RequestBody DelivrePar delivrePar) {
		delivreParMetier.updateDelivrePar(delivrePar);
	}

	@Override
	@GetMapping("/allDelivrePars")
	public List<DelivrePar> allDelivrePars() {
		return delivreParMetier.allDelivrePars();
	}
	
}
