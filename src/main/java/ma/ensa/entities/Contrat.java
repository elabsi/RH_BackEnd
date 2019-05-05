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
public class Contrat {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	@Temporal(TemporalType.DATE)
	private Date dateDepart;
	private int periodeEssai1;
	private int periodeEssai2;
	private String qualification;
	private String ancieneteAjoute;
	
	@ManyToOne
	@JsonIgnore
	private Contact contact;
	@ManyToOne
	private Fonction fonction;
	@ManyToOne
	private MotifEntree motifEntree;
	@ManyToOne 
	private TypeContrat typeContrat;
	@ManyToOne
	private MotifDepart motifDepart;
	@ManyToOne
	private TypeActivite typeActivite;
	@ManyToOne 
	private StatusProfessionnel statusProfessionnel;
	@ManyToOne
	private Rumeniration rumeniration;
	
	
	
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Fonction getFonction() {
		return fonction;
	}
	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}
	public MotifEntree getMotifEntree() {
		return motifEntree;
	}
	public void setMotifEntree(MotifEntree motifEntree) {
		this.motifEntree = motifEntree;
	}
	public TypeContrat getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(TypeContrat typeContrat) {
		this.typeContrat = typeContrat;
	}
	public MotifDepart getMotifDepart() {
		return motifDepart;
	}
	public void setMotifDepart(MotifDepart motifDepart) {
		this.motifDepart = motifDepart;
	}
	public TypeActivite getTypeActivite() {
		return typeActivite;
	}
	public void setTypeActivite(TypeActivite typeActivite) {
		this.typeActivite = typeActivite;
	}
	public StatusProfessionnel getStatusProfessionnel() {
		return statusProfessionnel;
	}
	public void setStatusProfessionnel(StatusProfessionnel statusProfessionnel) {
		this.statusProfessionnel = statusProfessionnel;
	}
	public Rumeniration getRumeniration() {
		return rumeniration;
	}
	public void setRumeniration(Rumeniration rumeniration) {
		this.rumeniration = rumeniration;
	}
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public int getPeriodeEssai1() {
		return periodeEssai1;
	}
	public void setPeriodeEssai1(int periodeEssai1) {
		this.periodeEssai1 = periodeEssai1;
	}
	public int getPeriodeEssai2() {
		return periodeEssai2;
	}
	public void setPeriodeEssai2(int periodeEssai2) {
		this.periodeEssai2 = periodeEssai2;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAncieneteAjoute() {
		return ancieneteAjoute;
	}
	public void setAncieneteAjoute(String ancieneteAjoute) {
		this.ancieneteAjoute = ancieneteAjoute;
	}
	
	
	
}
