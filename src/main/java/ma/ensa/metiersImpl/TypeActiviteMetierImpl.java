package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeActiviteDao;
import ma.ensa.entities.TypeActivite;
import ma.ensa.metiers.TypeActiviteMetier;

@Service
public class TypeActiviteMetierImpl implements TypeActiviteMetier {
 
	@Autowired
	private TypeActiviteDao dao;
	@Override
	public TypeActivite getTypeActiviteById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeActivite addTypeActivite(TypeActivite typeAct) {
		return this.dao.save(typeAct);
	}

	@Override
	public void updateTypeActivite(TypeActivite typeAct) {
		this.dao.save(typeAct);
	}

	@Override
	public List<TypeActivite> allTypeActivites() {
		return this.dao.findAll();
	}

	
}
