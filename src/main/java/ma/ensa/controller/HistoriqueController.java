package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Historique;

public interface HistoriqueController {

	public Historique addHistorique(Historique historique);
	public void updateHistorique(Historique historique);
	public Historique getHistoriqueById(Long id);
	public List<Historique> allHistoriques();

}
