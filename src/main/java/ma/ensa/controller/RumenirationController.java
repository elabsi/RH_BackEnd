package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Rumeniration;

public interface RumenirationController {
	public Rumeniration addRumeniration(Rumeniration rumeniration);
	public void updateRumeniration(Rumeniration rumeniration);
	public Rumeniration getRumenirationById(Long id);
	public List<Rumeniration> allRumenirations();
}
