package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.MotifEntree;

public interface MotifEntreeController {

	public MotifEntree addMotifEntree(MotifEntree motifEntree);
	public void updateMotifEntree(MotifEntree motifEntree);
	public MotifEntree getMotifEntreeById(Long id);
	public List<MotifEntree> allMotifEntrees();
}
