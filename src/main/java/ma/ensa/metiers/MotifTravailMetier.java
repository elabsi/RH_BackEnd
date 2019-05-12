package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.MotifTravail;

public interface MotifTravailMetier {

	public MotifTravail addMotifTravail(MotifTravail motifTravail);
	public void updateMotifTravail(MotifTravail motifTravail);
	public MotifTravail getMotifTravailById(Long id);
	public List<MotifTravail> allMotifTravails();

}
