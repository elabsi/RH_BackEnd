package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.TypeAttestationEntreprise;

public interface TypeAttestationEntrepriseMetier {

	public TypeAttestationEntreprise addTypeAttestationEntreprise(TypeAttestationEntreprise typeAttestationEntreprise);
	public void updateTypeAttestationEntreprise(TypeAttestationEntreprise typeAttestationEntreprise);
	public TypeAttestationEntreprise getTypeAttestationEntrepriseById(Long id);
	public List<TypeAttestationEntreprise> allTypeAttestationEntreprises();

}
