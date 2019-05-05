package ma.ensa.entities;



import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("collaborateur")
public class Collaborateur extends Contact {
	
	private String matricule;
	private String numCNSS;
	private String numCIMR;
	private String numMutuelle;
	private boolean permisConduire;
	private boolean compteActive;
	private String motDePass;
	private String photo;
	
	@OneToMany(mappedBy="collaborateur")
	private List<LigneGroupe> ligneGroupes;
	
	@ManyToOne 
	private Categorie categorie;
	
	
	
	
	
	public Collaborateur(String matricule, String numCNSS, String numCIMR, String numMutuelle, boolean permisConduire,
			boolean compteActive, String motDePass, String photo) {
		super();
		this.matricule = matricule;
		this.numCNSS = numCNSS;
		this.numCIMR = numCIMR;
		this.numMutuelle = numMutuelle;
		this.permisConduire = permisConduire;
		this.compteActive = compteActive;
		this.motDePass = motDePass;
		this.photo = photo;
	}
	public List<LigneGroupe> getLigneGroupes() {
		return ligneGroupes;
	}
	public void setLigneGroupes(List<LigneGroupe> ligneGroupes) {
		this.ligneGroupes = ligneGroupes;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNumCNSS() {
		return numCNSS;
	}
	public void setNumCNSS(String numCNSS) {
		this.numCNSS = numCNSS;
	}
	public String getNumCIMR() {
		return numCIMR;
	}
	public void setNumCIMR(String numCIMR) {
		this.numCIMR = numCIMR;
	}
	public String getNumMutuelle() {
		return numMutuelle;
	}
	public void setNumMutuelle(String numMutuelle) {
		this.numMutuelle = numMutuelle;
	}
	public boolean isPermisConduire() {
		return permisConduire;
	}
	public void setPermisConduire(boolean permisConduire) {
		this.permisConduire = permisConduire;
	}
	public boolean isCompteActive() {
		return compteActive;
	}
	public void setCompteActive(boolean compteActive) {
		this.compteActive = compteActive;
	}
	public String getMotDePass() {
		return motDePass;
	}
	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Collaborateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
