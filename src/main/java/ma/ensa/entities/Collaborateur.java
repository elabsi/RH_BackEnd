package ma.ensa.entities;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("collaborateur")
public class Collaborateur extends Contact {
	
	private String matricule;
	private String numCNSS;
	private String numCIMR;
	private String numMutuelle;
	private boolean permisConduire;
	private boolean compteActive;
	private String photo;
	@OneToMany(mappedBy = "collaborateur")
	@JsonIgnore
	private List<Demande> demandes = new ArrayList<Demande>();
	public List<Demande> getDemandes() {
		return demandes;
	}
	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}
	@ManyToOne
 	private ProfilValidationDemande profilValidationDemande;
	public ProfilValidationDemande getProfilValidationDemande() {
		return profilValidationDemande;
	}
	public void setProfilValidationDemande(ProfilValidationDemande profilValidationDemande) {
		this.profilValidationDemande = profilValidationDemande;
	}
	@OneToMany(mappedBy="collaborateur")
	private List<Pointage> pointages = new ArrayList<Pointage>();
	public List<Pointage> getPointages() {
		return pointages;
	}
	public void setPointages(List<Pointage> pointages) {
		this.pointages = pointages;
	}
	@OneToMany(mappedBy="collaborateur")
	private List<LigneGroupe> ligneGroupes;
	
	@ManyToOne 
	private Categorie categorie;
	
	
	
	
	
	public Collaborateur(String matricule, String numCNSS, String numCIMR, String numMutuelle, boolean permisConduire,
			boolean compteActive, String photo) {
		super();
		this.matricule = matricule;
		this.numCNSS = numCNSS;
		this.numCIMR = numCIMR;
		this.numMutuelle = numMutuelle;
		this.permisConduire = permisConduire;
		this.compteActive = compteActive;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Collaborateur() {
		super();
	}
	
	
}
