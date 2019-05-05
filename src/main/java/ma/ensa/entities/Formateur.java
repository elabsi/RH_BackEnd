package ma.ensa.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("formateur")
@Entity
public class Formateur extends Contact{

}
