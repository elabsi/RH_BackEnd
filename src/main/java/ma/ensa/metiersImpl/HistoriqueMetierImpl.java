package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.HistoriqueDao;
import ma.ensa.entities.Historique;
import ma.ensa.metiers.HistoriqueMetier;

@Service
public class HistoriqueMetierImpl implements HistoriqueMetier {
 
	@Autowired
	private HistoriqueDao dao;
	@Override
	public Historique getHistoriqueById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Historique addHistorique(Historique historique) {
		return this.dao.save(historique);
	}

	@Override
	public void updateHistorique(Historique historique) {
		this.dao.save(historique);
	}

	@Override
	public List<Historique> allHistoriques() {
		return this.dao.findAll();
	}

	
}
