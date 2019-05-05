package ma.ensa.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_contact") 
public abstract class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String sexe;
	private String civilite;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String cin;
	private String situationFamiliale;
	
	@OneToMany(mappedBy="contact")
	private List<Adresse> adresses;
	@OneToMany(mappedBy="contact")
	private List<Email> emails;
	@OneToMany(mappedBy="contact")
	private List<Document> documents;
	@OneToMany(mappedBy="contact")
    private List<Telephone> telephones;
	@OneToMany(mappedBy="contact")
    private List<CoordonnesBancaires> coordonnesBancaires;
	@OneToMany(mappedBy="contact")
    private List<AttestationFormation> attestationFormations;
	@OneToMany(mappedBy="contact")
    private List<Contrat> contrats;
	@OneToMany(mappedBy="contact")
    private List<Langues> langues;
	@OneToMany(mappedBy="contact")
    private List<ReseauSocial> reseauSocials;
	@OneToMany(mappedBy="contact")
    private List<PeriodeDepartement> periodeDepartements;
	@ManyToOne
	private NiveauScolaireContact niveauScolaire1;
	
	
	
	
	public Contact(Long id, String nom, String prenom, String sexe, String civilite, Date dateNaissance, String cin,
			String situationFamiliale) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.civilite = civilite;
		this.dateNaissance = dateNaissance;
		this.cin = cin;
		this.situationFamiliale = situationFamiliale;
	}
	public List<Adresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	public List<Telephone> getTelephones() {
		return telephones;
	}
	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}
	public List<CoordonnesBancaires> getCoordonnesBancaires() {
		return coordonnesBancaires;
	}
	public void setCoordonnesBancaires(List<CoordonnesBancaires> coordonnesBancaires) {
		this.coordonnesBancaires = coordonnesBancaires;
	}
	public List<AttestationFormation> getAttestationFormations() {
		return attestationFormations;
	}
	public void setAttestationFormations(List<AttestationFormation> attestationFormations) {
		this.attestationFormations = attestationFormations;
	}
	public List<Contrat> getContrats() {
		return contrats;
	}
	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}
	public List<Langues> getLangues() {
		return langues;
	}
	public void setLangues(List<Langues> langues) {
		this.langues = langues;
	}
	public List<ReseauSocial> getReseauSocials() {
		return reseauSocials;
	}
	public void setReseauSocials(List<ReseauSocial> reseauSocials) {
		this.reseauSocials = reseauSocials;
	}
	public List<PeriodeDepartement> getPeriodeDepartements() {
		return periodeDepartements;
	}
	public void setPeriodeDepartements(List<PeriodeDepartement> periodeDepartements) {
		this.periodeDepartements = periodeDepartements;
	}
	public NiveauScolaireContact getNiveauScolaire1() {
		return niveauScolaire1;
	}
	public void setNiveauScolaire1(NiveauScolaireContact niveauScolaire1) {
		this.niveauScolaire1 = niveauScolaire1;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getSituationFamiliale() {
		return situationFamiliale;
	}
	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}
	

}
