package ma.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proche {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

}
