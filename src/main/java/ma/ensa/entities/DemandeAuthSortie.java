package ma.ensa.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("DemandeAuthSortie")
public class DemandeAuthSortie extends Demande{
	
	@Temporal(TemporalType.DATE)
	private Date  dateSortie;
	@Temporal(TemporalType.TIME)
	private Date  heureSortie;
	@Temporal(TemporalType.TIME)
	private Date  heureReteur;
	@ManyToOne
	private MotifSortie motifSortie; 
	public MotifSortie getMotifSortie() {
		return motifSortie;
	}
	public void setMotifSortie(MotifSortie motifSortie) {
		this.motifSortie = motifSortie;
	}
	public DemandeAuthSortie() {
		super();
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public Date getHeureSortie() {
		return heureSortie;
	}
	public void setHeureSortie(Date heureSortie) {
		this.heureSortie = heureSortie;
	}
	public Date getHeureReteur() {
		return heureReteur;
	}
	public void setHeureReteur(Date heureReteur) {
		this.heureReteur = heureReteur;
	}
}
