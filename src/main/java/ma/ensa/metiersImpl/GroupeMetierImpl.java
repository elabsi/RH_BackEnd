package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.GroupeDao;
import ma.ensa.entities.Groupe;
import ma.ensa.metiers.GroupeMetier;

@Service
public class GroupeMetierImpl implements GroupeMetier {
 
	@Autowired
	private GroupeDao dao;
	@Override
	public Groupe getGroupeById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Groupe addGroupe(Groupe grp) {
		return this.dao.save(grp);
	}

	@Override
	public void updateGroupe(Groupe grp) {
		this.dao.save(grp);
	}

	@Override
	public List<Groupe> allGroupes() {
		return this.dao.findAll();
	}

	
}
