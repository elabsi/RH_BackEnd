package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.PrimeController;
import ma.ensa.entities.Prime;
import ma.ensa.metiers.PrimeMetier;

@RestController
@RequestMapping("/prime")
public class PrimeControllerImpl implements PrimeController {
	@Autowired
	private PrimeMetier primeMetier;
	@Override
	@PostMapping("/getPrimeById")
	public Prime getPrimeById(@RequestBody Long id) {
		return primeMetier.getPrimeById(id);
	}

	@Override
	@PostMapping("/addPrime")
	public Prime addPrime(@RequestBody Prime prime) {
		return primeMetier.addPrime(prime);
	}

	@Override
	@PostMapping("/updatePrime")
	public void updatePrime(@RequestBody Prime prime) {
		primeMetier.updatePrime(prime);
	}

	@Override
	@GetMapping("/allPrime")
	public List<Prime> allPrimes() {
		return primeMetier.allPrimes();
	}
}
