package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.Historique;

public interface HistoriqueMetier {

	public Historique addHistorique(Historique historique);
	public void updateHistorique(Historique historique);
	public Historique getHistoriqueById(Long id);
	public List<Historique> allHistoriques();

}
