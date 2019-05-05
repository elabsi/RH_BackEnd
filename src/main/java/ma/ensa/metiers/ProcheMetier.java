package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Proche;

public interface ProcheMetier {
	public Proche addProche(Proche proche);
	public void updateProche(Proche proche);
	public Proche getProcheById(Long id);
	public List<Proche> allProches();
}
