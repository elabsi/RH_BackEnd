package ma.ensa.controller;

import java.util.HashSet ; 
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.dao.RoleRepository;
import ma.ensa.dao.UserRepository;
import ma.ensa.entities.user.Role;
import ma.ensa.entities.user.RoleName;
import ma.ensa.entities.user.Utilisateur;
import ma.ensa.message.reponse.JwtResponse;
import ma.ensa.message.reponse.ResponseMessage;
import ma.ensa.message.request.LoginForm;
import ma.ensa.message.request.SignUpForm;
import ma.ensa.security.jwt.JwtProvider;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class AuthRestAPIs {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtProvider jwtProvider;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = jwtProvider.generateJwtToken(authentication);
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();

		return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getUsername(), userDetails.getAuthorities()));
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpForm signUpRequest) {
		if (userRepository.existsByUsername(signUpRequest.getUsername())) {
			return new ResponseEntity<>(new ResponseMessage("Fail -> Username is already taken!"),
					HttpStatus.BAD_REQUEST);
		}

		if (userRepository.existsByEmail(signUpRequest.getEmail())) {
			return new ResponseEntity<>(new ResponseMessage("Fail -> Email is already in use!"),
					HttpStatus.BAD_REQUEST);
		}

		// Creating user's account
		Utilisateur user = new Utilisateur(signUpRequest.getName(), signUpRequest.getUsername(), signUpRequest.getEmail(),
				encoder.encode(signUpRequest.getPassword()));

		Set<String> strRoles = signUpRequest.getRole();
		Set<Role> roles = new HashSet<>();

		strRoles.forEach(role -> {
			switch (role) {
			case "root":
				Role adminRole = roleRepository.findByName(RoleName.ROLE_ROOT)
						.orElseThrow(() -> new RuntimeException("Fail! -> Cause: ROOT Role not find."));
				roles.add(adminRole);

				break;
			case "administrateur":
				Role pmRole = roleRepository.findByName(RoleName.ROLE_ADMINISTRATEUR)
						.orElseThrow(() -> new RuntimeException("Fail! -> Cause: ADMINISTRATEUR Role not find."));
				roles.add(pmRole);

				break;
			case "chefService":
				Role ServiceRole = roleRepository.findByName(RoleName.ROLE_CHEF_SERVICE)
						.orElseThrow(() -> new RuntimeException("Fail! -> Cause: ADMINISTRATEUR Role not find."));
				roles.add(ServiceRole);

				break;
			case "rh":
				Role rhRole = roleRepository.findByName(RoleName.ROLE_RH)
						.orElseThrow(() -> new RuntimeException("Fail! -> Cause: ADMINISTRATEUR Role not find."));
				roles.add(rhRole);

				break;
			default:
				Role userRole = roleRepository.findByName(RoleName.ROLE_EMPLOYE)
						.orElseThrow(() -> new RuntimeException("Fail! -> Cause: EMPLOYE Role not find."));
				roles.add(userRole);
			}
		});

		user.setRoles(roles);
		userRepository.save(user);

		return new ResponseEntity<>(new ResponseMessage("User registered successfully!"), HttpStatus.OK);
	}
}