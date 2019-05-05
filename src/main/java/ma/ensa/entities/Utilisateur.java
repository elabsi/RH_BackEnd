package ma.ensa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String password;
	private String username;
	private String actif;
	private String description;
	
	@OneToMany(mappedBy="utilisateur")
	private List<Roles> roles;
	
	@OneToMany(mappedBy="utilisateur")
	private List<Historique> historiques;
	
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	public List<Historique> getHistoriques() {
		return historiques;
	}
	public void setHistoriques(List<Historique> historiques) {
		this.historiques = historiques;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getActif() {
		return actif;
	}
	public void setActif(String actif) {
		this.actif = actif;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
