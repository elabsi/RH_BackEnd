package ma.ensa.metiersImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeAttestationEntrepriseDao;
import ma.ensa.entities.TypeAttestationEntreprise;	
import ma.ensa.metiers.TypeAttestationEntrepriseMetier;
@Service
public class TypeAttestationEntrepriseMetierImpl implements TypeAttestationEntrepriseMetier {
 
	@Autowired
	private TypeAttestationEntrepriseDao dao;
	@Override
	public TypeAttestationEntreprise getTypeAttestationEntrepriseById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeAttestationEntreprise addTypeAttestationEntreprise(TypeAttestationEntreprise typeAtt) {
		return this.dao.save(typeAtt);
	}

	@Override
	public void updateTypeAttestationEntreprise(TypeAttestationEntreprise typeAtt) {
		this.dao.save(typeAtt);
	}

	@Override
	public List<TypeAttestationEntreprise> allTypeAttestationEntreprises() {
		return this.dao.findAll();
	}

	
}
