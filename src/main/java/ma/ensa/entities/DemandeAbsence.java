package ma.ensa.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("DemandeAbsence")
public class DemandeAbsence  extends Demande{
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private Long exercice;
	private double jourOuvrable;
	private double repos;
	private double feries;

	public DemandeAbsence(Long id, Date dateDemande, String observation, int status, String motifRefus,
			Collaborateur collaborateur, Date dateDebut, Date dateFin, Long exercice, double jourOuvrable, double repos,
			double feries, MotifAbsence motifAbsence) {
		super(id, dateDemande, observation, status, motifRefus, collaborateur);
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.exercice = exercice;
		this.jourOuvrable = jourOuvrable;
		this.repos = repos;
		this.feries = feries;
		this.motifAbsence = motifAbsence;
	}
	@ManyToOne
	private MotifAbsence motifAbsence; 
	public MotifAbsence getMotifAbsence() {
		return motifAbsence;
	}
	public void setMotifAbsence(MotifAbsence motifAbsence) {
		this.motifAbsence = motifAbsence;
	}
	public DemandeAbsence() {
		super();
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
	public Long getExercice() {
		return exercice;
	}
	public void setExercice(Long exercice) {
		this.exercice = exercice;
	}
	public double getJourOuvrable() {
		return jourOuvrable;
	}
	public void setJourOuvrable(double jourOuvrable) {
		this.jourOuvrable = jourOuvrable;
	}
	public double getRepos() {
		return repos;
	}
	public void setRepos(double repos) {
		this.repos = repos;
	}
	public double getFeries() {
		return feries;
	}
	public void setFeries(double feries) {
		this.feries = feries;
	}
	

}
