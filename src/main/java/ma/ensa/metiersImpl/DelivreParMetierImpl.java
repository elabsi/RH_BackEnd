package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.DelivreParDao;
import ma.ensa.entities.DelivrePar;
import ma.ensa.metiers.DelivreParMetier;

@Service
public class DelivreParMetierImpl implements DelivreParMetier {
 
	@Autowired
	private DelivreParDao dao;
	@Override
	public DelivrePar getDelivreParById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public DelivrePar addDelivrePar(DelivrePar delivre) {
		return this.dao.save(delivre);
	}

	@Override
	public void updateDelivrePar(DelivrePar delivre) {
		this.dao.save(delivre);
	}

	@Override
	public List<DelivrePar> allDelivrePars() {
		return this.dao.findAll();
	}

	
}
