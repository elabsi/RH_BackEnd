package ma.ensa.metiersImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeAttestationDao;
import ma.ensa.entities.TypeAttestation;
import ma.ensa.metiers.TypeAttestationMetier;

@Service
public class TypeAttestationMetierImpl implements TypeAttestationMetier {
 
	@Autowired
	private TypeAttestationDao dao;
	@Override
	public TypeAttestation getTypeAttestationById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeAttestation addTypeAttestation(TypeAttestation typeAtt) {
		return this.dao.save(typeAtt);
	}

	@Override
	public void updateTypeAttestation(TypeAttestation typeAtt) {
		this.dao.save(typeAtt);
	}

	@Override
	public List<TypeAttestation> allTypeAttestations() {
		return this.dao.findAll();
	}

	
}
