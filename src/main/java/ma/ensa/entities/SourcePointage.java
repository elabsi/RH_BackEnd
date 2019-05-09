package ma.ensa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_pointage") 
public abstract class SourcePointage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	@OneToMany(mappedBy = "sourcePointage")
	private List<Pointage> pointages = new ArrayList<Pointage>();
	public List<Pointage> getPointages() {
		return pointages;
	}
	public void setPointages(List<Pointage> pointages) {
		this.pointages = pointages;
	}
	public SourcePointage() {
		super();
	}
	public SourcePointage(Long id, String nom, String description) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
