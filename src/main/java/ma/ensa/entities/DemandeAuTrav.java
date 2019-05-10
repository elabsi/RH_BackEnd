package ma.ensa.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("DemandeAuTrav")
public class DemandeAuTrav extends Demande{
	
	@Temporal(TemporalType.DATE)
	private Date dateTravail;
	private int type;
	private int nombreHeures;
	@Temporal(TemporalType.TIME)
	private Date heureDebut;
	@Temporal(TemporalType.TIME)
	private Date heureFin;
	@ManyToOne
	private MotifTravail motifTravail;
	
	public MotifTravail getMotifTravail() {
		return motifTravail;
	}
	public void setMotifTravail(MotifTravail motifTravail) {
		this.motifTravail = motifTravail;
	}
	public DemandeAuTrav() {
		super();
	}
	public Date getDateTravail() {
		return dateTravail;
	}
	public void setDateTravail(Date dateTravail) {
		this.dateTravail = dateTravail;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getNombreHeures() {
		return nombreHeures;
	}
	public void setNombreHeures(int nombreHeures) {
		this.nombreHeures = nombreHeures;
	}
	public Date getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}
	public Date getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}
	

}
