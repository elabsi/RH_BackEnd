package ma.ensa.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AttestationFormation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateObtention;
	private String specialite;
	private String mention;
	private String nomEtablissement;
	private String nomFichier;
	public String getNomFichier() {
		return nomFichier;
	}
	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}
	@ManyToOne
	private Ville ville;
	@ManyToOne
	private TypeAttestation typeAttestation;
	@ManyToOne
	private NiveauScolaireAttestation niveauScolaire;
	@ManyToOne 
	private DelivrePar delivrePar;
	@ManyToOne
	private Domaine domaine;
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	@ManyToOne
	@JsonIgnore
	private Contact contact;
	
	
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	public TypeAttestation getTypeAttestation() {
		return typeAttestation;
	}
	public void setTypeAttestation(TypeAttestation typeAttestation) {
		this.typeAttestation = typeAttestation;
	}
	public NiveauScolaireAttestation getNiveauScolaire() {
		return niveauScolaire;
	}
	public void setNiveauScolaire(NiveauScolaireAttestation niveauScolaire) {
		this.niveauScolaire = niveauScolaire;
	}
	public DelivrePar getDelivrePar() {
		return delivrePar;
	}
	public void setDelivrePar(DelivrePar delivrePar) {
		this.delivrePar = delivrePar;
	}
	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	public AttestationFormation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateObtention() {
		return dateObtention;
	}
	public void setDateObtention(Date dateObtention) {
		this.dateObtention = dateObtention;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getMention() {
		return mention;
	}
	public void setMention(String mention) {
		this.mention = mention;
	}
	public String getNomEtablissement() {
		return nomEtablissement;
	}
	public void setNomEtablissement(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
	}
	
	
}
