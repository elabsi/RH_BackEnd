package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Departement;

public interface DepartementController {
	
	public Departement addDepartement(Departement departement);
	public void updateDepartement(Departement departement);
	public Departement getDepartementById(Long id);
	public List<Departement> allDepartements();
}
