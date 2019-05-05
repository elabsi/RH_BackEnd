package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Proche;

public interface ProcheController {
	public Proche addProche(Proche proche);
	public void updateProche(Proche proche);
	public Proche getProcheById(Long id);
	public List<Proche> allProches();
}
