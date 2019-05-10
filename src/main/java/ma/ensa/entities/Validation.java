package ma.ensa.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Validation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private boolean valide ;
	@Temporal(TemporalType.DATE)
	private Date dateValidation;
	@ManyToOne
	private RoleValidation roleValidation;
	@ManyToOne
	private Demande demande;
	public Demande getDemande() {
		return demande;
	}
	public void setDemande(Demande demande) {
		this.demande = demande;
	}
	public RoleValidation getRoleValidation() {
		return roleValidation;
	}
	public void setRoleValidation(RoleValidation roleValidation) {
		this.roleValidation = roleValidation;
	}
	private int ordre;
	public Validation() {
		super();
	}
	public boolean isValide() {
		return valide;
	}
	public void setValide(boolean valide) {
		this.valide = valide;
	}
	public Date getDateValidation() {
		return dateValidation;
	}
	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}
	public int getOrdre() {
		return ordre;
	}
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
}
