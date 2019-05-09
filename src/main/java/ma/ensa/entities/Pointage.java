package ma.ensa.entities;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pointage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateReel;
	@Temporal(TemporalType.TIME)
	private Date heureReel;
	private int modeReel;
	@Temporal(TemporalType.DATE)
	private Date dateModifie;
	@Temporal(TemporalType.TIME)
	private Date heureModifier;
	private int modeModifie;
	private int status;
	@ManyToOne
	@JsonIgnore
	private Collaborateur collaborateur;
	@ManyToOne
	private SourcePointage sourcePointage;
	public SourcePointage getSourcePointage() {
		return sourcePointage;
	}
	public void setSourcePointage(SourcePointage sourcePointage) {
		this.sourcePointage = sourcePointage;
	}
	public Collaborateur getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(Collaborateur collaborateur) {
		this.collaborateur = collaborateur;
	}
	public Pointage() {
		super();
	}
	public Pointage(Long id, Date dateReel, Date heureReel, int modeReel, Date dateModifie, Date heureModifier,
			int modeModifie, int status) {
		super();
		this.id = id;
		this.dateReel = dateReel;
		this.heureReel = heureReel;
		this.modeReel = modeReel;
		this.dateModifie = dateModifie;
		this.heureModifier = heureModifier;
		this.modeModifie = modeModifie;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateReel() {
		return dateReel;
	}
	public void setDateReel(Date dateReel) {
		this.dateReel = dateReel;
	}
	public Date getHeureReel() {
		return heureReel;
	}
	public void setHeureReel(Date heureReel) {
		this.heureReel = heureReel;
	}
	public int getModeReel() {
		return modeReel;
	}
	public void setModeReel(int modeReel) {
		this.modeReel = modeReel;
	}
	public Date getDateModifie() {
		return dateModifie;
	}
	public void setDateModifie(Date dateModifie) {
		this.dateModifie = dateModifie;
	}
	public Date getHeureModifier() {
		return heureModifier;
	}
	public void setHeureModifier(Date heureModifier) {
		this.heureModifier = heureModifier;
	}
	public int getModeModifie() {
		return modeModifie;
	}
	public void setModeModifie(int modeModifie) {
		this.modeModifie = modeModifie;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	

}
