package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.ReseauSocial;

public interface ReseauSocialController {

	public ReseauSocial addReseauSocial(ReseauSocial reseauSocial, Long id);
	public void updateReseauSocial(ReseauSocial reseauSocial);
	public ReseauSocial getReseauSocialById(Long id);
	public List<ReseauSocial> allReseauSocials();
}
