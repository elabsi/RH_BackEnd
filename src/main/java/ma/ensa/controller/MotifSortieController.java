package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.MotifSortie;

public interface MotifSortieController {

	public MotifSortie addMotifSortie(MotifSortie motifSortie);
	public void updateMotifSortie(MotifSortie motifSortie);
	public MotifSortie getMotifSortieById(Long id);
	public List<MotifSortie> allMotifSorties();

}
