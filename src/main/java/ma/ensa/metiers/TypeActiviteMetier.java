package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.TypeActivite;

public interface TypeActiviteMetier {
	public TypeActivite addTypeActivite(TypeActivite typeActivite);
	public void updateTypeActivite(TypeActivite typeActivite);
	public TypeActivite getTypeActiviteById(Long id);
	public List<TypeActivite> allTypeActivites();
}
