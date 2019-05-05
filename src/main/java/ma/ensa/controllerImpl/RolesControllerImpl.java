package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.RolesController;
import ma.ensa.entities.Roles;
import ma.ensa.metiers.RolesMetier;

@RestController
@RequestMapping("/roles")
public class RolesControllerImpl implements RolesController {
 
	@Autowired
	private RolesMetier rolesMetier;
	@Override
	@PostMapping("/getRolesById")
	public Roles getRolesById(@RequestBody Long id) {
		return rolesMetier.getRolesById(id);
	}

	@Override
	@PostMapping("/addRoles")
	public Roles addRoles(@RequestBody Roles roles) {
		return rolesMetier.addRoles(roles);
	}

	@Override
	@PostMapping("/updateRoles")
	public void updateRoles(@RequestBody Roles roles) {
		rolesMetier.updateRoles(roles);
	}

	@Override
	@GetMapping("/allRoles")
	public List<Roles> allRoles() {
		return rolesMetier.allRoles();
	}
	
}
