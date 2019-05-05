package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.MotifDepart;

public interface MotifDepartMetier {


	public MotifDepart addMotifDepart(MotifDepart motifDepart);
	public void updateMotifDepart(MotifDepart motifDepart);
	public MotifDepart getMotifDepartById(Long id);
	public List<MotifDepart> allMotifDeparts();
}
