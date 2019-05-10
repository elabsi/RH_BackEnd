package ma.ensa.entities;

import javax.persistence.*;

@Entity
public class ValidationOrdre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private int ordre;
	@ManyToOne
	private CircuitValidation circuitValidation;
	@ManyToOne
	private RoleValidation roleValidation;
	
	public RoleValidation getRoleValidation() {
		return roleValidation;
	}

	public void setRoleValidation(RoleValidation roleValidation) {
		this.roleValidation = roleValidation;
	}

	public CircuitValidation getCircuitValidation() {
		return circuitValidation;
	}

	public void setCircuitValidation(CircuitValidation circuitValidation) {
		this.circuitValidation = circuitValidation;
	}

	public ValidationOrdre() {
		super();
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
}
