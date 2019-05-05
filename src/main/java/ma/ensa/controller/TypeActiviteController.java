package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.TypeActivite;

public interface TypeActiviteController {
	public TypeActivite addTypeActivite(TypeActivite typeActivite);
	public void updateTypeActivite(TypeActivite typeActivite);
	public TypeActivite getTypeActiviteById(Long id);
	public List<TypeActivite> allTypeActivites();
}
