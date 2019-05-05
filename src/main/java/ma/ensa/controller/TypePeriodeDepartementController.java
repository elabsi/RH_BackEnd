package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.TypePeriodeDepartement;

public interface TypePeriodeDepartementController {

	public TypePeriodeDepartement addTypePeriodeDepartement(TypePeriodeDepartement typePeriodeDepartement);
	public void updateTypePeriodeDepartement(TypePeriodeDepartement typePeriodeDepartement);
	public TypePeriodeDepartement getTypePeriodeDepartementById(Long id);
	public List<TypePeriodeDepartement> allTypePeriodeDepartements();
}

