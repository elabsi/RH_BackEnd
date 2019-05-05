package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.StatusProfessionnelDao;
import ma.ensa.entities.StatusProfessionnel;
import ma.ensa.metiers.StatusProfessionnelMetier;

@Service
public class StatusProfessionnelMetierImpl implements StatusProfessionnelMetier {
 
	@Autowired
	private StatusProfessionnelDao dao;
	@Override
	public StatusProfessionnel getStatusProfessionnelById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public StatusProfessionnel addStatusProfessionnel(StatusProfessionnel statusPro) {
		return this.dao.save(statusPro);
	}

	@Override
	public void updateStatusProfessionnel(StatusProfessionnel statusPro) {
		this.dao.save(statusPro);
	}

	@Override
	public List<StatusProfessionnel> allStatusProfessionnels() {
		return this.dao.findAll();
	}

	
}
