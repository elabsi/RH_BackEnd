package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.DelivrePar;

public interface DelivreParController{
	
	public DelivrePar addDelivrePar(DelivrePar delivrePar);
	public void updateDelivrePar(DelivrePar delivrePar);
	public DelivrePar getDelivreParById(Long id);
	public List<DelivrePar> allDelivrePars();
}
