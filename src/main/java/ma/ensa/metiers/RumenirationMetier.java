package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Rumeniration;

public interface RumenirationMetier {
	public Rumeniration addRumeniration(Rumeniration rumeniration);
	public void updateRumeniration(Rumeniration rumeniration);
	public Rumeniration getRumenirationById(Long id);
	public List<Rumeniration> allRumenirations();
}
