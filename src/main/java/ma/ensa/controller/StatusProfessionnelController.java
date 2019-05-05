package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.StatusProfessionnel;

public interface StatusProfessionnelController {

	public StatusProfessionnel addStatusProfessionnel(StatusProfessionnel statusPro);
	public void updateStatusProfessionnel(StatusProfessionnel statusPro);
	public StatusProfessionnel getStatusProfessionnelById(Long id);
	public List<StatusProfessionnel> allStatusProfessionnels();
}
