package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeReseauSocialDao;
import ma.ensa.entities.TypeReseauSocial;
import ma.ensa.metiers.TypeReseauSocialMetier;

@Service
public class TypeReseauSocialMetierImpl implements TypeReseauSocialMetier {
 
	@Autowired
	private TypeReseauSocialDao dao;
	@Override
	public TypeReseauSocial getTypeReseauSocialById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeReseauSocial addTypeReseauSocial(TypeReseauSocial typeRes) {
		return this.dao.save(typeRes);
	}

	@Override
	public void updateTypeReseauSocial(TypeReseauSocial typeRes) {
		this.dao.save(typeRes);
	}

	@Override
	public List<TypeReseauSocial> allTypeReseauSocials() {
		return this.dao.findAll();
	}

	
}
