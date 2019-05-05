package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.MotifEntree;

public interface MotifEntreeMetier {

	public MotifEntree addMotifEntree(MotifEntree motifEntree);
	public void updateMotifEntree(MotifEntree motifEntree);
	public MotifEntree getMotifEntreeById(Long id);
	public List<MotifEntree> allMotifEntrees();
}
